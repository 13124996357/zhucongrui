package cn.edu.gdmec.android.mobileguard.m2theftguard.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Utils {
    /*
    * md5加密算法
    * @param text
    * return
    * */
    public static String encode(String text){
        try{
            MessageDigest digest = MessageDigest.getInstance("md5");
            byte[] result = digest.digest(text.getBytes());
            StringBuilder sb = new StringBuilder();
            for(byte b:result){
                int number = b&0xff;
                String hex = Integer.toHexString(number);
                if(hex.length()==1){
                    sb.append("0"+hex);
                }else{
                    sb.append(hex);
                }
            }
            return sb.toString();

        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
            return "";
        }
    }

    public static String getFilesMd5(String apkpath) {
        try {
            MessageDigest digest = MessageDigest.getInstance("md5");
            File file = new File(File.pathSeparator);
            FileInputStream fis = new FileInputStream(file);
            byte[] buffer = new byte[1024];
            int len = -1;
            while((len = fis.read(buffer))!= -1){
                digest.update(buffer,0,len);
            }
            byte [] result = digest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b:result){
                int number = b & 0xff;
                String hex = Integer.toHexString(number);
                if (hex.length()==1){
                    sb.append("0"+hex);

                }else {
                    sb.append(hex);
                }
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}