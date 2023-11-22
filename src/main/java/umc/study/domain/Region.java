package umc.study.domain;

import lombok.*;
import umc.study.domain.common.BaseEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Region extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(20)")
    private String name;

    @OneToMany(mappedBy = "region", cascade = CascadeType.ALL)
    private List<Store> storeList = new ArrayList<>();

}