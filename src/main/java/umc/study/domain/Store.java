package umc.study.domain;

import lombok.*;
import umc.study.domain.common.BaseEntity;

import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Store extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    private Region region;

    @Column(columnDefinition = "VARCHAR(20)")
    private String name;

    @Column(columnDefinition = "VARCHAR(20)")
    private String address;

    @Column(columnDefinition = "VARCHAR(20)")
    private String operatingHour;

    private Float rating;
}