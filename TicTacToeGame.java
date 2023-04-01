import java.util.*;


public class TicTacToeGame {
    
    public static int checkForWin(char[][] structure){
     if(structure[1][2]=='X' && structure[1][6]=='X' && structure[1][10]=='X')
     return 2;
     if(structure[2][2]=='X' && structure[2][6]=='X' && structure[2][10]=='X')
     return 2;
     if(structure[3][2]=='X' && structure[3][6]=='X' && structure[3][10]=='X')
     return 2;
     if(structure[1][2]=='X' && structure[2][2]=='X' && structure[3][2]=='X')
     return 2;
     if(structure[1][6]=='X' && structure[2][6]=='X' && structure[3][6]=='X')
     return 2;
     if(structure[1][10]=='X' && structure[2][10]=='X' && structure[3][10]=='X')
     return 2;
     if(structure[1][2]=='X' && structure[2][6]=='X' && structure[3][10]=='X')
     return 2;
     if(structure[1][10]=='X' && structure[2][6]=='X' && structure[3][2]=='X')
     return 2;
     

     if(structure[1][2]=='O' && structure[1][6]=='O' && structure[1][10]=='O')
     return 1;
     if(structure[2][2]=='O' && structure[2][6]=='O' && structure[2][10]=='O')
     return 1;
     if(structure[3][2]=='O' && structure[3][6]=='O' && structure[3][10]=='O')
     return 1;
     if(structure[1][2]=='O' && structure[2][2]=='O' && structure[3][2]=='O')
     return 1;
     if(structure[1][6]=='O' && structure[2][6]=='O' && structure[3][6]=='O')
     return 1;
     if(structure[1][10]=='O' && structure[2][10]=='O' && structure[3][10]=='O')
     return 1;
     if(structure[1][2]=='O' && structure[2][6]=='O' && structure[3][10]=='O')
     return 1;
     if(structure[1][10]=='O' && structure[2][6]=='O' && structure[3][2]=='O')
     return 1;

     return 0;
    }
    public static void printStructure(char[][] structure){
        for(int i=0;i<4;i++){
                for(int j=0;j<13;j++){
                    System.out.print(structure[i][j]);
                }
                System.out.println("");
               }
            return;
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
      char[][] structure = new char[4][13];
      for(int i=0;i<4;i++){
        for(int j=0;j<13;j++){
            if(i!=0){
                if(j==0 || j==4 || j==8 || j==12 )
                    structure[i][j]='|';
                else
                    structure[i][j]='_';
               
            }
            else{
                if(j==0 || j==4 || j==8 || j==12 )
                structure[i][j]=' ';
                else
                    structure[i][j]='_';
            }
            
        }
      }
      for(int i=0;i<4;i++){
        for(int j=0;j<13;j++){
            System.out.print(structure[i][j]);
        }
        System.out.println("");
       }
        int counter=9;
      while(counter!=0){
        int a=0;
        char sign=' ';
          if(counter%2!=0){
            System.out.print("Please Enter the Position (Player 1):");
            a=sc.nextInt();
             sign='O';
          }
          else{
            System.out.print("Please Enter the Position (Player 2):");
            a=sc.nextInt();
            sign='X';
          }
        switch(a)
        {
            case 1: if(structure[1][2]=='_')
                      structure[1][2]=sign;
                    else{
                        counter+=1;
                        System.out.println("Please enter unfilled position");
                    }  
                    break;
            case 2: if(structure[1][6]=='_')
                       structure[1][6]=sign;
                    else{
                        counter+=1;
                         System.out.println("Please enter unfilled position");
                        } 
                    break;
            case 3: if(structure[1][10]=='_')
                     structure[1][10]=sign;
                    else{
                      counter+=1;
                      System.out.println("Please enter unfilled position");
                    } 
                    break;   
            case 4: if(structure[2][2]=='_')
                      structure[2][2]=sign;
                    else{
                        counter+=1;
                        System.out.println("Please enter unfilled position");
                    }  
                    break;  
            case 5: if(structure[2][6]=='_')
                      structure[2][6]=sign;
                    else{
                        counter+=1;
                        System.out.println("Please enter unfilled position");
                    }  
                    break;
            case 6: if(structure[2][10]=='_')
                      structure[2][10]=sign;
                    else{
                        counter+=1;
                        System.out.println("Please enter unfilled position");
                    }  
                    break;
            case 7: if(structure[3][2]=='_')
                      structure[3][2]=sign;
                    else{
                        counter+=1;
                        System.out.println("Please enter unfilled position");
                    }  
                    break;
            case 8: if(structure[3][6]=='_')
                      structure[3][6]=sign;
                    else{
                        counter+=1;
                        System.out.println("Please enter unfilled position");
                    }  
                    break;  
            case 9: if(structure[3][10]=='_')
                      structure[3][10]=sign;
                    else{
                        counter+=1;
                        System.out.println("Please enter unfilled position");
                    }  
                    break; 
            default: counter+=1;
                      System.out.println("Please enter correct position");
                             
        }  
            printStructure(structure);
            if(counter>1 && counter<6) {
                int n=checkForWin(structure);
                if(n==1){
                    System.out.println("Player 1 has win the game");
                    break;
                }
                if(n==2){
                    System.out.println("Player 2 has win the game");
                    break;
                }
            }
            if(counter==1){
                int n=checkForWin(structure);
                if(n==1){
                    System.out.println("Player 1 has win the game");
                    break;
                }
                if(n==2){
                    System.out.println("Player 2 has win the game");
                    break;
                }
                else{
                    System.out.println("Player 1 and Player 2 has draw the game");
                    break;
                }
            }
            counter--;                      
        }
        sc.close();
      }
    
}
