import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVReader {
    public static void main(String[] args) throws FileNotFoundException {
        CSVReader csvReader = new CSVReader();
        csvReader.readCSV();
    }

    public List<List<String>> readCSV() throws FileNotFoundException {
        List<List<String>> csvList = new ArrayList<List<String>>();
        String csvfile = "C:/Users/lhh13/OneDrive/바탕 화면/programing/SPKim/whereisit/Converter/src/resources/csv/Dongjak-gu_Seoul_clothes collection box_20210902.csv";
        FileInputStream csv = new FileInputStream(csvfile);
        BufferedReader br = null;
        String line = "";
        try{
            br = new BufferedReader(new InputStreamReader(csv, "UTF8"));
            while ((line = br.readLine()) != null) { //readLine()은 파일에서 개행된 한 줄의 데이터를 읽어온다.
                List<String> aLine = new ArrayList<String>();
                String[] lineArr = line.split(","); //파일의 한 줄을 , 로 나누어 배열에 저장 후 리스트로 변환한다.
                aLine = Arrays.asList(lineArr);
                System.out.println(aLine);
                csvList.add(aLine);
                System.out.println(csvList);
                System.out.println("한글아나와");
            }
        }catch(FileNotFoundException e ){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch(IOException e) {
                e.printStackTrace();
            }
            
        }return csvList;
    }

    

}
