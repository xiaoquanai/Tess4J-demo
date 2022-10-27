package fun.quan.xiao;


import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class testfor {
    public static void main(String[] args) {

        try {
            File file = new File("D:\\workspace/1.png");

            Tesseract tesseract = new Tesseract();
            tesseract.setDatapath("D:\\workspace\\tessdata");
            tesseract.setLanguage("chi_sim");
            String s = tesseract.doOCR(file);
            s = s.replaceAll("\\r|\\n","-").replaceAll(" ","-");
            System.out.println("识别的内容为：" + s);
        } catch (TesseractException e) {
            e.printStackTrace();
        }
    }
}
