package dio.cursojava;

import java.sql.Struct;

public class Pilhas {

    private No referenciaNoEntradaPilha;

    public Pilhas(){

        this.referenciaNoEntradaPilha = null;
    }
    public void push (No novoNo){
        No referenciaAuxiliar = referenciaNoEntradaPilha;
        referenciaNoEntradaPilha = novoNo;
        referenciaNoEntradaPilha.setReferenciaNo(referenciaAuxiliar);

    }

    public No pop (){
       if (!this.isEmpty()){
           No noPoped = referenciaNoEntradaPilha;
           referenciaNoEntradaPilha= referenciaNoEntradaPilha.getReferenciaNo();
           return noPoped;

       }
       return null;
    }
    public No top(){
        return referenciaNoEntradaPilha;
    }

    public boolean isEmpty(){

        return referenciaNoEntradaPilha == null ? true : false;


    }

    @Override
    public String toString(){

                String stringRetorno = "----------\n";
                stringRetorno +=      "Pilhas\n";
                stringRetorno += "----------\n";

                No noAuxiliar = referenciaNoEntradaPilha;

                while (true){
                    if (noAuxiliar != null){
                        stringRetorno += "[No{dado=" + noAuxiliar.getDado() +"}]\n";
                        noAuxiliar= noAuxiliar.getReferenciaNo();

                    }else{
                        break;
                    }
                }
                stringRetorno += "----------\n";
                return stringRetorno;
     }

}


