package com.codefarm.codefarmer.entity.notice;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNoticeFile is a Querydsl query type for NoticeFile
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNoticeFile extends EntityPathBase<NoticeFile> {

    private static final long serialVersionUID = 2006316863L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNoticeFile noticeFile = new QNoticeFile("noticeFile");

    public final com.codefarm.codefarmer.entity.period.QPeriod _super = new com.codefarm.codefarmer.entity.period.QPeriod(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final NumberPath<Long> fileId = createNumber("fileId", Long.class);

    public final BooleanPath fileImageCheck = createBoolean("fileImageCheck");

    public final StringPath fileName = createString("fileName");

    public final NumberPath<Long> fileSize = createNumber("fileSize", Long.class);

    public final StringPath fileUploadPath = createString("fileUploadPath");

    public final StringPath fileUuid = createString("fileUuid");

    public final QNotice notice;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QNoticeFile(String variable) {
        this(NoticeFile.class, forVariable(variable), INITS);
    }

    public QNoticeFile(Path<? extends NoticeFile> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNoticeFile(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNoticeFile(PathMetadata metadata, PathInits inits) {
        this(NoticeFile.class, metadata, inits);
    }

    public QNoticeFile(Class<? extends NoticeFile> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.notice = inits.isInitialized("notice") ? new QNotice(forProperty("notice")) : null;
    }

}

