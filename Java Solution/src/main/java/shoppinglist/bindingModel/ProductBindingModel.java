package shoppinglist.bindingModel;

public class ProductBindingModel {
    
    
    private int Priority;
    private String Name;
    private int Quantity;
    private String Status;
    
    

    public ProductBindingModel() {
    }

    public ProductBindingModel(int Priority, String Name, int Quantity, String Status) {
        this.Priority = Priority;
        this.Name = Name;
        this.Quantity = Quantity;
        this.Status = Status;
    }
    
    

    public int getPriority() {
        return Priority;
    }

    public void setPriority(int Priority) {
        this.Priority = Priority;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
	
    
}
