public class loginProxy {
    login o;

    public loginProxy(login o) {
        this.o = o;
    }
    
    public void novoIDseguro(String idnew){
        if (idnew != "789"){
            o.mudarID(idnew);
        }
        else{
            System.out.println("ID 789 detectado | Vulnerabilidade!!!");
        }
    }
}
