package com.codefarm.codefarmer.entity.notice;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNotice is a Querydsl query type for Notice
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNotice extends EntityPathBase<Notice> {

    private static final long serialVersionUID = 348837667L;

    public static final QNotice notice = new QNotice("notice");

    public final com.codefarm.codefarmer.entity.period.QPeriod _super = new com.codefarm.codefarmer.entity.period.QPeriod(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final StringPath noticeContent = createString("noticeContent");

    public final ListPath<NoticeFile, QNoticeFile> noticeFiles = this.<NoticeFile, QNoticeFile>createList("noticeFiles", NoticeFile.class, QNoticeFile.class, PathInits.DIRECT2);

    public final NumberPath<Long> noticeId = createNumber("noticeId", Long.class);

    public final StringPath noticeTitle = createString("noticeTitle");

    public final NumberPath<Integer> noticeViewCount = createNumber("noticeViewCount", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QNotice(String variable) {
        super(Notice.class, forVariable(variable));
    }

    public QNotice(Path<? extends Notice> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNotice(PathMetadata metadata) {
        super(Notice.class, metadata);
    }

}

