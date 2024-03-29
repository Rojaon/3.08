package com.w3.lab308.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String district;
    @OneToOne
    @JoinColumn(name = "president_id")
    private Member president;
    @OneToMany(mappedBy = "chapter")
    private List<Member> memberList;

    public Chapter() {
    }

    public Chapter(String name, String district, Member president, List<Member> memberList) {
        this.name = name;
        this.district = district;
        this.president = president;
        this.memberList = memberList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }
}
