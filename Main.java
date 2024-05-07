import java.io.*;
import java.util.regex.Pattern;
class Program {

    public static void main(String[] args) throws Exception {
        String inputFilePath = "D:\\RRR.txt";
        File inputFile = new File(inputFilePath);
        FileReader fileReader = new FileReader(inputFile);

        String outputFilePath = "D:\\code.txt";
        File outputFile = new File(outputFilePath);
        FileWriter fileWriter = new FileWriter(outputFile);

        rewriteInNewFile(fileReader, fileWriter);
    }

    public static void rewriteInNewFile(FileReader fileReader, FileWriter fileWriter) {
        try{
            BufferedReader br = new BufferedReader(fileReader);

            String data = null;

            StringBuilder string = new StringBuilder();

            Pattern comment = Pattern.compile("(//.*)|(/\\*[\\s\\S]*\\*/)");

            while ((data = br.readLine()) != null) {
                string.append(data + "\n");//vgjvfjgjgj
            }

            data = string.toString().replaceAll(comment.pattern(), "");

            fileWriter.write(data);/*jhvjh*hjgvjhg*  */
        }
        catch (IOException exception){
            System.out.println("ошибка" + exception.getMessage());
        }
        finally {
            try{
                fileReader.close();
                fileWriter.close();
            }
            catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}