package com.codefarm.codefarmer.entity.mentor;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMentorFile is a Querydsl query type for MentorFile
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMentorFile extends EntityPathBase<MentorFile> {

    private static final long serialVersionUID = -1348509921L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMentorFile mentorFile = new QMentorFile("mentorFile");

    public final com.codefarm.codefarmer.entity.period.QPeriod _super = new com.codefarm.codefarmer.entity.period.QPeriod(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final NumberPath<Long> fileId = createNumber("fileId", Long.class);

    public final BooleanPath fileImageCheck = createBoolean("fileImageCheck");

    public final StringPath fileName = createString("fileName");

    public final NumberPath<Long> fileSize = createNumber("fileSize", Long.class);

    public final StringPath fileUploadPath = createString("fileUploadPath");

    public final StringPath fileUuid = createString("fileUuid");

    public final QMentorBoard mentorBoard;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QMentorFile(String variable) {
        this(MentorFile.class, forVariable(variable), INITS);
    }

    public QMentorFile(Path<? extends MentorFile> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMentorFile(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMentorFile(PathMetadata metadata, PathInits inits) {
        this(MentorFile.class, metadata, inits);
    }

    public QMentorFile(Class<? extends MentorFile> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.mentorBoard = inits.isInitialized("mentorBoard") ? new QMentorBoard(forProperty("mentorBoard"), inits.get("mentorBoard")) : null;
    }

}

