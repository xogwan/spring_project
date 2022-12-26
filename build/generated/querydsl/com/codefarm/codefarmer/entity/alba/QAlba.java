package com.codefarm.codefarmer.entity.alba;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAlba is a Querydsl query type for Alba
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAlba extends EntityPathBase<Alba> {

    private static final long serialVersionUID = -1518419357L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAlba alba = new QAlba("alba");

    public final com.codefarm.codefarmer.entity.period.QPeriod _super = new com.codefarm.codefarmer.entity.period.QPeriod(this);

    public final StringPath albaAddress = createString("albaAddress");

    public final NumberPath<Integer> albaApplyCount = createNumber("albaApplyCount", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> albaApplyEndDate = createDateTime("albaApplyEndDate", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> albaApplyStartDate = createDateTime("albaApplyStartDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> albaApplyTotalCount = createNumber("albaApplyTotalCount", Integer.class);

    public final StringPath albaBannerOne = createString("albaBannerOne");

    public final StringPath albaBannerTitle = createString("albaBannerTitle");

    public final NumberPath<Long> albaId = createNumber("albaId", Long.class);

    public final StringPath albaImage = createString("albaImage");

    public final StringPath albaMainContent = createString("albaMainContent");

    public final StringPath albaMainTitle = createString("albaMainTitle");

    public final NumberPath<Integer> albaPrice = createNumber("albaPrice", Integer.class);

    public final StringPath albaProfileContent1 = createString("albaProfileContent1");

    public final StringPath albaProfileContent2 = createString("albaProfileContent2");

    public final StringPath albaProfileTitle1 = createString("albaProfileTitle1");

    public final StringPath albaProfileTitle2 = createString("albaProfileTitle2");

    public final StringPath albaStrongContent1 = createString("albaStrongContent1");

    public final StringPath albaStrongContent2 = createString("albaStrongContent2");

    public final StringPath albaStrongContent3 = createString("albaStrongContent3");

    public final StringPath albaStrongTitle1 = createString("albaStrongTitle1");

    public final StringPath albaStrongTitle2 = createString("albaStrongTitle2");

    public final StringPath albaStrongTitle3 = createString("albaStrongTitle3");

    public final StringPath albaText = createString("albaText");

    public final StringPath albaTextTitle = createString("albaTextTitle");

    public final StringPath albaTitle = createString("albaTitle");

    public final StringPath albaTitleOne = createString("albaTitleOne");

    public final DateTimePath<java.time.LocalDateTime> albaWorkDate = createDateTime("albaWorkDate", java.time.LocalDateTime.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final com.codefarm.codefarmer.entity.member.QMember member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QAlba(String variable) {
        this(Alba.class, forVariable(variable), INITS);
    }

    public QAlba(Path<? extends Alba> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAlba(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAlba(PathMetadata metadata, PathInits inits) {
        this(Alba.class, metadata, inits);
    }

    public QAlba(Class<? extends Alba> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.codefarm.codefarmer.entity.member.QMember(forProperty("member")) : null;
    }

}

