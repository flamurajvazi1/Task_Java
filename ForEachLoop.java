public class ForEachLoop {
    public static void main(String[] args) {
        String[] arr = {"Audi", "Mercedes", "BMW", "Wolksvagen"};

        for (String elm : arr){
            if(elm.length() >=5) {
                break;
            }
            System.out.println(elm);
            }
        }
    }

