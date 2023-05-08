package HRMSCODE;

import HRMS.Apartment;
import HRMS.Property;
import HRMS.PropertyCode;

import static HRMS.PropertyCode.APA;

public class CodeGenerator {
        private static int apaCount = 1;
        private static int conCount = 1;
        private static int houCount = 1;

        public static String propertyCode(PropertyCode propertyCode) {
            String codePrefix = "";

            switch (propertyCode) {
                case APA: {
                    codePrefix = "APA" + String.format("%03d", apaCount++);
                }
                break;
                case CON: {
                    codePrefix = "CON" + String.format("%03d", conCount++);
                }
                break;
                case HOU: {
                    codePrefix = "HOU" + String.format("%03d", houCount++);
                }
                break;
                default:
            }
            return codePrefix;
        }


    public static void main(String[] args) {
        Property apartment1 =new Apartment("", "Ketu",4,5,3000,false,2);

        String code1 = CodeGenerator.propertyCode(APA);

        System.out.println("Code for apartment2: " + code1);
    }
    }


