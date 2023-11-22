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
public class Inquiry extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(columnDefinition = "VARCHAR(100)")
    private String title;

    @Column(columnDefinition = "VARCHAR(2000)")
    private String content;

    @Column(columnDefinition = "VARCHAR(2000)")
    private String reply;

    @OneToMany(mappedBy = "inquiry", cascade = CascadeType.ALL)
    private List<InquiryImage> inquiryImageList = new ArrayList<>();

}
