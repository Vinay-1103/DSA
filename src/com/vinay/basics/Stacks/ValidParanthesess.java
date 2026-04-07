package com.vinay.basics.Stacks;

import java.util.Stack;

public class ValidParanthesess {

        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            for (char ch : s.toCharArray()) {

                // opening brackets
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                }
                // closing brackets
                else {
                    if (stack.isEmpty()) {
                        return false;
                    }

                    char top = stack.pop();

                    if ((ch == ')' && top != '(') ||
                            (ch == '}' && top != '{') ||
                            (ch == ']' && top != '[')) {
                        return false;
                    }
                }
            }

            return stack.isEmpty();
        }

    public static void main(String[] args) {
        String exp = "{()}";
        boolean result = isValid(exp);
        System.out.println(result);
    }
    }

