package com.codefarm.codefarmer.entity.admin;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBanner is a Querydsl query type for Banner
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBanner extends EntityPathBase<Banner> {

    private static final long serialVersionUID = 398950358L;

    public static final QBanner banner = new QBanner("banner");

    public final com.codefarm.codefarmer.entity.period.QPeriod _super = new com.codefarm.codefarmer.entity.period.QPeriod(this);

    public final DateTimePath<java.time.LocalDateTime> bannerEndDate = createDateTime("bannerEndDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> bannerId = createNumber("bannerId", Long.class);

    public final StringPath bannerInfo = createString("bannerInfo");

    public final StringPath bannerRealname = createString("bannerRealname");

    public final DateTimePath<java.time.LocalDateTime> bannerStartDate = createDateTime("bannerStartDate", java.time.LocalDateTime.class);

    public final EnumPath<com.codefarm.codefarmer.type.BannerStatus> bannerStatus = createEnum("bannerStatus", com.codefarm.codefarmer.type.BannerStatus.class);

    public final StringPath bannerTitle = createString("bannerTitle");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QBanner(String variable) {
        super(Banner.class, forVariable(variable));
    }

    public QBanner(Path<? extends Banner> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBanner(PathMetadata metadata) {
        super(Banner.class, metadata);
    }

}

