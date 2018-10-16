package shoppinglist.entity;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private int Priority;
    private String Name;
    private int Quantity;
    private String Status;

    public Product() {
    }
    
    

    public Product(int Priority, String Name, int Quantity, String Status) {
        this.Priority = Priority;
        this.Name = Name;
        this.Quantity = Quantity;
        this.Status = Status;
    }
    
    
    @Column (nullable = false)
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    @Column (nullable = false)
    public int getPriority() {
        return Priority;
    }

    public void setPriority(int Priority) {
        this.Priority = Priority;
    }
    @Column (nullable = false)
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    @Column (nullable = false)
    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    @Column (nullable = false)
    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    
}
