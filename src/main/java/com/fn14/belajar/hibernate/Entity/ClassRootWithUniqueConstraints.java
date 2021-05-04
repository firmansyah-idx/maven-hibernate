/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fn14.belajar.hibernate.Entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.Data;

/**
 *
 * @author FN14
 */
@Data
@Entity
@Table(
        name = "tb_kelasconstraint",
        uniqueConstraints = {
            @UniqueConstraint(
                    name = "un_kelas",
                    columnNames = {"name","th_angkatan"}
            )
        }
        
)
public class ClassRootWithUniqueConstraints {
    @Id
    private String id;
    private String name;
    
    @Column(name = "th_angkatan", length = 4)
    private Integer year;
    
    @Column(name = "create_by")
    private String createBy;
    
    @Column(name = "create_date", nullable = false)
    private LocalDateTime createDate;

    @Column(name = "update_by")
    private String updateBy;
    
    @Column(name=  "update_date")
    private LocalDateTime updateDate;
}
