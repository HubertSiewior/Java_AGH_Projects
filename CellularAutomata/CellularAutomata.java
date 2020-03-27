package sample;

import java.util.Arrays;

public class CellularAutomata {
    int [][] output_pattern;
    int [] arr;
    int N;
    int size;
    String ifPeriodic;
    int[] fisrtGeneration;
    int[][] grid ;
    public CellularAutomata(int[] arr,int N,int size,String ifPeriodic){
        this.output_pattern = new int[8][3];
        this.arr=arr;
        this.setOutput_pattern();
        this.N=N;
        this.size=size;
        this.ifPeriodic=ifPeriodic;
        this.setFisrtGeneration();
        this.grid=new int[this.N][this.size];
    }
    public void setFisrtGeneration() {
        String bin="0".repeat(size);
        char[] chars = bin.toCharArray();
        this.fisrtGeneration = new int[this.size];
        if (this.size%2==0) {
            chars[(bin.length() / 2)] = '1';
        }
        else{
            chars[(bin.length()/2+1)]='1';
        }
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='0')  this.fisrtGeneration[i]=0;
            else this.fisrtGeneration[i]=1;
        }

    }
    public int[][] getGrid(){
        int [] currentGeneration= this.fisrtGeneration;
        for(int i=0;i<this.N;i++){
            for(int j=0;j<this.size;j++){
                grid[i][j]=currentGeneration[j];
            }
            currentGeneration=getNewGenerations(currentGeneration);
        }
        return grid;
    }


    public int[] getNewGenerations(int[] tab){
        int [] secondGenereation=new int[this.size];
        if(ifPeriodic.equals("no")){
            for(int i=0;i<this.size;i++){
                if(i==0) secondGenereation[i]=  rules(0,tab[i],tab[i+1]);
                else if(i==this.size-1) secondGenereation[i]=  rules(tab[i-1],tab[i],0);
                else  secondGenereation[i] = rules(tab[i - 1], tab[i], tab[i + 1]);
             }
        }else {
            for(int i=0;i<this.size;i++){
                if(i==0) secondGenereation[i]=  rules(tab[size-1],tab[i],tab[i+1]);
                else if(i==this.size-1) secondGenereation[i]=  rules(tab[i-1],tab[i],tab[0]);
                else  secondGenereation[i] = rules(tab[i - 1], tab[i], tab[i + 1]);
            }
        }
          return secondGenereation;
    }




    public char rules(int start,int mid,int end){
      int []tmp=new int[]{start,mid,end};
        for(int i=0;i<8;i++){
            if(Arrays.toString(tmp).equals(Arrays.toString(this.output_pattern[i]))) return (char) arr[i];
        }
        return 0;
    }

    public void setOutput_pattern(){
        for(int i=0;i<8;i++){
            String row = Integer.toBinaryString(7-i);
            row="0".repeat(3-row.length())+row;
            char[] chars = row.toCharArray();
            for(int j=0;j<3;j++){
                if(chars[j]=='0') output_pattern[i][j]= 0;
                else  output_pattern[i][j]=1;
            }
        }
    }



}
