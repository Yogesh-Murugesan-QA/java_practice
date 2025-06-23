package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
        {
            String input= "YOGESH";
            String reversed= "";
            for (int i=input.length()-1;i>=0;i--){
                reversed += input.charAt(i);
            }
            System.out.println(reversed);
        }
    }
