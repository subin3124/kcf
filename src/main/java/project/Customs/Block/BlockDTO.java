package project.Customs.Block;

import javax.persistence.*;

@Table(name = "Block")
@Entity
public class BlockDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "block_id")
    private long id;

    @Column(name = "block_name")
    private String name;
    @Column(name = "block_ignore")
    private String ignore;
    @Column(name = "block_ignore_amount")
    private int amount;
    @Column(name = "block_company")
    private long company;
    @Column
    private String image;
    @Column
    private float positionX;
    @Column
    private float positionY;
    @Column
    private float width;
    @Column
    private float height;
    @Column
    private int greenpara;
    @Column(name = "Sche_id")
    private long scheid;
    @Column(name = "order_id")
    private long orderid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIgnore() {
        return ignore;
    }

    public void setIgnore(String ignore) {
        this.ignore = ignore;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public long getCompany() {
        return company;
    }

    public void setCompany(long company) {
        this.company = company;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getPositionX() {
        return positionX;
    }

    public void setPositionX(float positionX) {
        this.positionX = positionX;
    }

    public float getPositionY() {
        return positionY;
    }

    public void setPositionY(float positionY) {
        this.positionY = positionY;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getGreenpara() {
        return greenpara;
    }

    public void setGreenpara(int greenpara) {
        this.greenpara = greenpara;
    }

    public long getScheid() {
        return scheid;
    }

    public void setScheid(long scheid) {
        this.scheid = scheid;
    }

    public long getOrderid() {
        return orderid;
    }

    public void setOrderid(long orderid) {
        this.orderid = orderid;
    }
}
