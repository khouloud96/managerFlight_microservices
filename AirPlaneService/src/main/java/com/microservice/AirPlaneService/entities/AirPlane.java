/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microservice.AirPlaneService.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 *
 * @author DELL
 */

@Data
@NoArgsConstructor
@Entity
public class AirPlane {
    @Id
    private String PlaneCode;
    
    private String CompanyName;
    
    private Integer capacite;
    
}

