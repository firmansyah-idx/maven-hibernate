/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fn14.mvn.hibernate.Entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author FN14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClassForIdClass implements Serializable {
    
    private Integer years;
    private String classId;
}
