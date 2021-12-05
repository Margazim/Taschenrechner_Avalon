public class TaschenrechnerModel {

    private int ersterOperand;
    private int zweiterOperand;
    private String operator;

    public int getErgebnis(){
        if(operator==null){
            return zweiterOperand;
        }
        switch(operator){
            case "+":
                return ersterOperand+zweiterOperand;
            case "-":
                return ersterOperand-zweiterOperand;
            case "/":
                return ersterOperand/zweiterOperand;
            case "*":
                return ersterOperand*zweiterOperand;
            default:
                return zweiterOperand;
        }

    }
    public void zuruecksetzen(){
        operator = null;
    }
    public void  setErsterOperand(int opd){
        this.zweiterOperand = opd;
    }
    public void  setZweiterOperand(int opd){
        this.ersterOperand = opd;
    }
    public void setOperator(String operator){
        this.operator = operator;
    }



}
