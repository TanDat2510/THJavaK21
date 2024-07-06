/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ltd.demohibernate;

import com.ltd.pojo.Product;
import com.ltd.repository.impl.CategoryRepositoryImpl;
import com.ltd.repository.impl.ProductRepositoryImpl;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class DemoHibernate {

    public static void main(String[] args) {
//        CategoryRepositoryImpl c = new CategoryRepositoryImpl();
//        c.getCates().forEach( i -> System.out.println(i.getName()));
        Map<String, String> params = new HashMap<>();
        params.put("q", "iPhone");
        params.put("fromPrice", "28000000");
        //params.put("page", "2");
        ProductRepositoryImpl s = new ProductRepositoryImpl();
        s.getProducts(params).forEach(p -> System.out.printf("%d - %s - %.0f\n", p.getId(),p.getName(),p.getPrice()));
    }
}
