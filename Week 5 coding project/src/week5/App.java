package week5;

public class App {

  public static void main(String[] args) {
    
    Logger asteriskLogger = new AsteriskLogger();

  
    Logger spacedLogger = new SpacedLogger();

   
    System.out.println("AsteriskLogger log:");
    
    asteriskLogger.log("Star");

    System.out.println("\nAsteriskLogger error:");
  
    asteriskLogger.error("Star");

    
    System.out.println("\nSpacedLogger log:");
  
    spacedLogger.log("Star");

   
    System.out.println("\nSpacedLogger error:");
  
    spacedLogger.error("Star");
  }
} 


// Logger Interface
interface Logger {
    void log(String message);
    void error(String message);
}

// AsteriskLogger class
class AsteriskLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("***" + message + "***");
    }

    @Override
    public void error(String message) {
        String errorMessage = "***Error: " + message + "***";
        String border = "".repeat(errorMessage.length());
        for (int i = 0; i < errorMessage.length(); i++) {
            border += "*";
        }
        System.out.println(border);
        System.out.println(errorMessage);
        System.out.println(border);
    }
}

// SpacedLogger class
class SpacedLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println(addSpaces(message));
    }

    @Override
    public void error(String message) {
        System.out.println("ERROR: " + addSpaces(message));
    }

    private String addSpaces(String text) {
        StringBuilder spaced = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            spaced.append(text.charAt(i)).append(" ");
        }
        return spaced.toString().trim();
    }
}
