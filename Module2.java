
public class Module2 {

    public void Cse(){
        System.out.println("");
        String cse[]={"Java","C++","DBMS","Operating System","Learn C","Principle of Programming Language,","Data Structure "
        		,"Artifiicial Intelligence","Colud Computing","Distributed System","Cyber Security"};


        System.out.println("The books available in Computer Science department are as follow:");
        for (int i=0; i< cse.length;i++){

            System.out.println(cse[i]);

        }


    }
    public void EE(){
        System.out.println("");
        String ee[]={"Basic of Electrical Engineering","Discrete Signal","Microprocessr","Digital Logic System,"
        		,"Power Supply","Circit Theory","Analog Circuit","Electrical Machine","Power System","Control System"};


        System.out.println("The books available in Electrical Engineering department are as follow:");
        for (int i=0; i< ee.length;i++){

            System.out.println(ee[i]);

        }


    }

    public void ME(){
        System.out.println("");
        String me[]={"Theory of Machines","Machine Design","Fluid Mechanics","Basic & Applied Thermodynamics"
        		,"Design of Machine Elements","Fundamentals of Thermodynamics","Mechanical Engineering Design"};


        System.out.println("The books available in Mechanical Engineering department are as follow:");
        for (int i=0; i< me.length;i++){

            System.out.println(me[i]);

        }


    }


    public void physics(){
        System.out.println("");
        String phy[]={"Mechanics","Dynamics","Solid State Physics","Astro Physics","Electromagnetism"};

        System.out.println("The books available in Physics department are as follow:");

        for(int j=0; j<phy.length;j++){

            System.out.println(phy[j]);
        }

    }



    public void biology(){

        System.out.println("");
        String bio[]={"Zoology","Botany","Medical Science"};

        for (int k=0;k< bio.length;k++){

            System.out.println(bio[k]);
        }

    }



}
