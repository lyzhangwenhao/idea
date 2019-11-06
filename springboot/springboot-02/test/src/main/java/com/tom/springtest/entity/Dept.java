package com.tom.springtest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * ClassName: Dept
 * Description:
 *
 * @date 2019/11/1 19:32
 * @author: Mi_dad
 */
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors
public class Dept implements Serializable {
    private Integer deptno;
    private String dname;
    private String loc;
    private Integer dstatus;
}
