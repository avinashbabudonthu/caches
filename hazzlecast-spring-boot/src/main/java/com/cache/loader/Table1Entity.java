package com.cache.loader;

import javax.persistence.*;

@Entity
@Table(name="t_table_1")
public class Table1Entity {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @Column(name="col1")
    private String col1;

    @Column(name="col2")
    private String col2;

    @Column(name="col3")
    private String col3;

    @Column(name="col4")
    private String col4;

    @Column(name="col5")
    private String col5;

    @Column(name="col6")
    private String col6;

    @Column(name="col7")
    private String col7;

    @Column(name="col8")
    private String col8;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCol1() {
        return col1;
    }

    public void setCol1(String col1) {
        this.col1 = col1;
    }

    public String getCol2() {
        return col2;
    }

    public void setCol2(String col2) {
        this.col2 = col2;
    }

    public String getCol3() {
        return col3;
    }

    public void setCol3(String col3) {
        this.col3 = col3;
    }

    public String getCol4() {
        return col4;
    }

    public void setCol4(String col4) {
        this.col4 = col4;
    }

    public String getCol5() {
        return col5;
    }

    public void setCol5(String col5) {
        this.col5 = col5;
    }

    public String getCol6() {
        return col6;
    }

    public void setCol6(String col6) {
        this.col6 = col6;
    }

    public String getCol7() {
        return col7;
    }

    public void setCol7(String col7) {
        this.col7 = col7;
    }

    public String getCol8() {
        return col8;
    }

    public void setCol8(String col8) {
        this.col8 = col8;
    }

}
