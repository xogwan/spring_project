package com.codefarm.codefarmer.entity.admin;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCrop is a Querydsl query type for Crop
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCrop extends EntityPathBase<Crop> {

    private static final long serialVersionUID = -231940678L;

    public static final QCrop crop = new QCrop("crop");

    public final com.codefarm.codefarmer.entity.period.QPeriod _super = new com.codefarm.codefarmer.entity.period.QPeriod(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final StringPath cropContent = createString("cropContent");

    public final NumberPath<Long> cropId = createNumber("cropId", Long.class);

    public final StringPath cropImage = createString("cropImage");

    public final StringPath cropKeyword = createString("cropKeyword");

    public final StringPath cropTitle = createString("cropTitle");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QCrop(String variable) {
        super(Crop.class, forVariable(variable));
    }

    public QCrop(Path<? extends Crop> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCrop(PathMetadata metadata) {
        super(Crop.class, metadata);
    }

}

