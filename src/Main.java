import controllers.Logger;

/**
 * Created by Destion on 31-8-2015.
 */
public class Main {

    public static void main(String[] args) {
        int months = 0;

        Logger logger = new Logger();



        while (months <= 4800){

            //TODO step






            //End of month, logging occurs
            logger.log("monthly");

            if ((months != 0) && (months % 12 == 0 )){
                //Yearly logging occurs at the end of every year
                logger.log("yearly");
            }

            months += 1;
        }
    }
}
