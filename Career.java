/**
 * Project: Career Exploration program
 * 
 * Description: An exploration app for aspiring Computer Scientists
 * Source: ComputerScience.org - "Careers in Computer Science"
 * (https://www.computerscience.org/careers/)
 * @author: Kamil Lopez, Abdullah Zahir, Rijuan Khan, Irfan Cetinkaya
 * @version: 10/15/2025
 */
 
import java.util.Scanner;
import java.util.Arrays;

public class Career {
    
    
    static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
    
        String [] careers = {"1. Design", "2. Data", "3. Systems", "4. Software"};
        String playAgain;
        
        /* https://www.w3schools.com/java/java_while_loop_do.asp */
        do{
            System.out.println( "Pathways in Computer Science - Introductory Message\n" +
            "Welcome all students of Computer Science...\n" + 
            "Are you ready to go past 0s and 1s? If so, let's proceed... (Y/N)");
            
            
            String userInput = input.nextLine();
            if (userInput.equalsIgnoreCase("Y")){
                clearSpace();
                System.out.println ("It is now time to explore the beauty of technological, let's get started!");
                System.out.println ("On a broad scope, which of the listed field speak to you the most?");
                System.out.println (Arrays.toString(careers)); // https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
                
                userInput = input.nextLine();
            }
            /* https://www.w3schools.com/java/java_switch.asp */
            switch (userInput){
                case "1":
                    System.out.println ("Design it is!");
                    design();
                    break;
                case "2":
                    System.out.println ("Data it is!");
                    data();
                    break;
                case "3":
                    System.out.println ("Systems it is!");
                    systems();
                    break;
                case "4":
                    System.out.println ("Software it is!");
                    software();
                    break;
            }
            
            
            System.out.println("Would you like to explore a new path? (Y/N)");
            playAgain = input.nextLine();

        } while (playAgain.equalsIgnoreCase("Y"));
        
        input.close(); // Prevent Resource leak
        
        System.out.println ("We hope that now you have a glimpse of WHAT you'd like to do in the tech force! Take care & as always keep coding!");
    
        
    }
    public static void clearSpace (){
        for (int i = 0; i<3;i++)
        System.out.println ();
    }
    
    public static void design (){
        clearSpace();
        System.out.println ("=== THE DESIGN WAY ===");
        System.out.println ("Welcome to Design, the field of appearance and operation!");
        System.out.println ("In this path, you're expected to takeaway the contributions engineers of the Design taskforce contribute to the tech life!\n");
        
        
        System.out.println ("What intrigues you the most?");
        System.out.println ("1. Visuals (How things look) (V)");
        System.out.println ("2. Interaction (How things work (I)");
        
        String choice = input.nextLine();

        if (choice.equals ("1") || choice.equalsIgnoreCase ("V")){
            System.out.println ("\n--- RECOMMENDED: UI Designer ---");
            System.out.println ("You design the look of digital products using color theory and typography.");
            System.out.println ("Do you prefer Mobile Apps (M) or Websites (W)?");
            String uiPref = input.nextLine();
            if (uiPref.equalsIgnoreCase("M")){
                System.out.println ("Focus on iOS Human Interface Guidelines and Material Design.");
            }
            else if (uiPref.equalsIgnoreCase("W")){
                System.out.println ("Focus on Responsive Web Design and CSS Grids.");
            }
            else {
                System.out.println ("Must've been a misinput!");
            }
            
            System.out.println ("Tools: FIgma. Adobe series, Sketch");
        }
        else if (choice.equals ("2") || choice.equalsIgnoreCase ("I")){
            System.out.println ("\n--- RECOMMENDED: UX Designer ---");
            System.out.println ("You focus on the user journey, logic, and experience.");
            System.out.println ("Tools: Wireframing, User Research, Prototyping.");
        }
    }
    
    
    public static void data (){
        clearSpace();
        System.out.println ("=== THE DATA WAY ===");
        System.out.println ("Welecome to Data, the components that float all around the modern world, in the purest forms.");
        System.out.println ("In this path, you turn raw numbers, into things with meaning such as stories, predictions, and decisions.\n");
        
        
        System.out.println ("What intrigues you the most?");
        System.out.println ("1. Analyzing trends (T)");
        System.out.println ("2. Building AI Models (M)");
        System.out.println ("3. Managing databases (D)");
        
        String choice = input.nextLine();

        if (choice.equals ("1") || choice.equalsIgnoreCase ("T")){
            System.out.println ("\n--- RECOMMENDED: Data Analyst");
            System.out.println ("You interpret data to help companies make better decisions.");
            System.out.println ("Skills: SQL, EXCEL, Tableau, Statistics.");
        }
        else if (choice.equals ("2") || choice.equalsIgnoreCase ("M")){
            System.out.println ("\n--- RECOMMENDED: Data Scientist ---");
            System.out.println ("You use machine learning and math to predict future trends.");
            System.out.println ("Do you prefer working with Images (I) or Text/Language (L)?");
            String aiPref = input.nextLine();
            
            if (aiPref.equalsIgnoreCase("I")){
                System.out.println ("Look into Computer Vision (OpenCV).");
            }
            else if (aiPref.equalsIgnoreCase ("L")){
                System.out.println ("Look into Natural Language Processing (NLP).");
            }
            else {
                System.out.println ("Must've been a misinput!");
            }
            
            System.out.println ("Skills: Python, ML, TensorFlow");
        }
        else if (choice.equals ("3") || choice.equalsIgnoreCase ("D")){
            System.out.println ("\n--- RECOMMENDED: Database Engineer ---");
            System.out.println ("You design the systems that store and secure data.");
            System.out.println ("Skills: SQL, NoSQL, ETL Pipelines.");
        }
    }
    
    public static void systems(){
        clearSpace();
        System.out.println ("=== THE SYSTEM WAY ===");
        System.out.println ("Welcome to Systems, the engines and roads of the tech world!");
        System.out.println ("In this path, you construct the hidden infrastructure that keeps the internet running.\n");
        
        
        System.out.println ("What intrigues you the most?");
        System.out.println ("1. Low-level / Hardware (H)");
        System.out.println ("2. Cloud Infrastructure (I)");
        System.out.println ("3. Cybersecurity (C)");
        
        String choice = input.nextLine();

        if (choice.equals ("1") || choice.equalsIgnoreCase ("H")){
            System.out.println ("\n--- RECOMMENDED: Systems Programmer ---");
            System.out.println ("You write code close to the hardware (OS, embedded systems).");
            System.out.println ("Skills: C, Rust, Assembly, Linux Kernel.");
        }
        else if (choice.equals ("2") || choice.equalsIgnoreCase ("I")){
            System.out.println ("\n--- RECOMMENDED: DevOps Engineer ---");
            System.out.println ("You manage the cloud servers where apps live.");
            System.out.println ("Skills: AWS, Docker, Kubernetes.");
        }
        else if (choice.equals ("3") || choice.equalsIgnoreCase ("C")){
            System.out.println ("\n--- RECOMMENDED: Cybersecurity Analyst ---");
            System.out.println ("You protect systems from hackers and breaches.");
            System.out.println ("Do you prefer Attacking/Testing (A) or Defending? (D)?");
            String secPref = input.nextLine();
            if (secPref.equalsIgnoreCase("A")){
                System.out.println ("Focus on Penetration Testing and Kali Linux.");
            }
            else if (secPref.equalsIgnoreCase ("D")){
                System.out.println ("Focus on Security Operations and Threat Analysis.");
            }
            else {
                System.out.println ("Must've been a misinput!");
            }
            
            System.out.println ("Skills: Network Security, Firewalls, Cryptography.");
        }
    }
    
    public static void software (){
        clearSpace();
        System.out.println ("=== THE SOFTWARE WAY ===");
        System.out.println ("Welcome to Software, where algorithms, data, and programs are born.");
        System.out.println ("In this path, you write the instructions (src code) and tell the computer what, how, and when.\n");
        
        
        System.out.println ("What intrigues you the most?");
        System.out.println ("1. Mobile/Desktop Apps (A)");
        System.out.println ("2. Websites (W)");
        System.out.println ("3. Video Games (G)");
        
        String choice = input.nextLine();

        if (choice.equals ("1") || choice.equalsIgnoreCase ("A")){
            System.out.println ("\n--- RECOMMENDED: Software Engineer ---");
            System.out.println ("You design and build the logic for computer programs.");
            System.out.println ("Skills: Java, Python, C++, System Design.");
        }
        else if (choice.equals ("2") || choice.equalsIgnoreCase ("W")){
            System.out.println ("\n--- RECOMMENDED: Web Developer ---");
            System.out.println ("You build the Frontend (visuals) or Backend (logic) of websites.");
            System.out.println ("With this in mind, do you prefer Frontend (F) or Backend (B) ?");
            String webPref = input.nextLine();
            if (webPref.equalsIgnoreCase ("F")){
                System.out.println ("Focus on React, CSS and HTML.");
            }
            else if (webPref.equalsIgnoreCase ("B")){
                System.out.println ("Focus on Node.js, Python and Databases.");
            }
            else {
                System.out.println ("Must've been a misinput!");
            }
            System.out.println ("General Skills: HTML/CSS, Javascript, React, Node.js.");
        }
        else if (choice.equals ("3") || choice.equalsIgnoreCase ("G")){
            System.out.println ("\n--- RECOMMENDED: Game Developer ---");
            System.out.println ("You write code and scripts to build interactive video games.");
            System.out.println ("Skills: C#, C++, Unity, Unreal Engine.");
        }
    }
    

}
