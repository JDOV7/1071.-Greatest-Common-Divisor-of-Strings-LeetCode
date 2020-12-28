package leetcode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Daniel Ochoa
 */
public class GreatestCommonDivisorofStrings1071 {

    public void GreatestCommonDivisorofStrings1071() {
        String str1 = "ABCABC";
        String str2 = "ABC";
        StringBuilder sDivisorSub = new StringBuilder();
        StringBuilder sResultDivisor = new StringBuilder();
        int iMinSize = Math.min(str1.length(), str2.length());
        for (int i = 0; i < iMinSize; i++) {
            StringBuilder sTemp1 = new StringBuilder(str1);
            StringBuilder sTemp2 = new StringBuilder(str2);
            sDivisorSub.append(sTemp2.charAt(i));
            for (int j = 0; j < sTemp1.length(); j++) {
                if (sTemp1.toString().startsWith(sDivisorSub.toString())) {
                    sTemp1.delete(0, sDivisorSub.length());
                    j = -1;
                } else {
                    break;
                }
            }
            for (int j = 0; j < sTemp2.length(); j++) {
                if (sTemp2.toString().startsWith(sDivisorSub.toString())) {
                    sTemp2.delete(0, sDivisorSub.length());
                    j = -1;
                } else {
                    break;
                }
            }
            if (sTemp2.length() == 0 && sTemp1.length() == 0 && sDivisorSub.length() > sResultDivisor.length()) {
                sResultDivisor = new StringBuilder(sDivisorSub.toString());
            }
        }
        System.out.println(sResultDivisor.toString());
    }
}
