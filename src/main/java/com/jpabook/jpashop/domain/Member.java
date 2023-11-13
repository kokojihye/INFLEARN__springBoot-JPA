package com.jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name ="member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member") //Order클래스의 @ManyToOne 달린 member(변수명)
    private List<Order> orders = new ArrayList<>();
}
