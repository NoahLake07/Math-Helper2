package com.mathhelper.operations;

import com.mathhelper.data.Radical;

import java.util.ArrayList;

import static com.mathhelper.operations.Factor.findPrimeFactors;

public class RadicalSimplify {

    public static String simplifyRadicals(String expression) {
        String simplified = "";
        ArrayList<String> terms = new ArrayList<String>();

        // Split the input expression into individual terms
        int i = 0;
        while (i < expression.length()) {
            if (expression.charAt(i) == '+' || expression.charAt(i) == '-') {
                // Found a plus or minus sign, add the current term to the list
                terms.add(expression.substring(0, i));
                expression = expression.substring(i);
                i = 0;
            } else {
                i++;
            }
        }
        terms.add(expression); // Add the last term to the list

        // Simplify each term in the list
        for (String term : terms) {
            String[] factors = term.split("\\*|/");
            ArrayList<String> simplifiedFactors = new ArrayList<String>();
            for (String factor : factors) {
                if (factor.contains("sqrt")) {
                    // Found a square root factor, simplify it using the findPrimeFactors method
                    String inside = factor.substring(factor.indexOf("(") + 1, factor.indexOf(")"));
                    int number = Integer.parseInt(inside);
                    ArrayList<Integer> factorsList = findPrimeFactors(number);

                    // Reconstruct the factor as a simplified string
                    int outside = 1;
                    for (int factorNum : factorsList) {
                        if (factorNum == 2) {
                            outside *= 2;
                        } else {
                            simplifiedFactors.add("sqrt(" + factorNum + ")");
                        }
                    }
                    if (outside > 1) {
                        simplifiedFactors.add(String.valueOf(outside));
                    }
                } else {
                    // Not a square root factor, add it as is to the simplifiedFactors list
                    simplifiedFactors.add(factor);
                }
            }
            // Combine the simplified factors back into a single term string
            String simplifiedTerm = String.join("*", simplifiedFactors);
            simplified += simplifiedTerm;
        }

        return simplified;
    }
}
