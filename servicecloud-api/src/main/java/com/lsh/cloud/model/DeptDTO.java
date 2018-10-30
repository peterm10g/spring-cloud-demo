package com.lsh.cloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Project Name: servicecloud
 *
 * @author peter
 * @date 18/9/15
 * 北京链商电子商务有限公司
 * Package
 * desc:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class DeptDTO implements Serializable {

    private static final long serialVersionUID = 5079301750433960095L;

    private Long userId;
    private String name;

}
