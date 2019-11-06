package com.tom.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * ClassName: User
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/18 16:52
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Component
public class User implements Serializable {
    private Integer userId;
    private String userName;
    private Integer userAge;
}
