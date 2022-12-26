package com.codefarm.codefarmer.entity.alba;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberAlba is a Querydsl query type for MemberAlba
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberAlba extends EntityPathBase<MemberAlba> {

    private static final long serialVersionUID = -1059932835L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberAlba memberAlba = new QMemberAlba("memberAlba");

    public final com.codefarm.codefarmer.entity.period.QPeriod _super = new com.codefarm.codefarmer.entity.period.QPeriod(this);

    public final QAlba alba;

    public final NumberPath<Long> albaApplyId = createNumber("albaApplyId", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final com.codefarm.codefarmer.entity.member.QMember member;

    public final EnumPath<com.codefarm.codefarmer.type.Status> memberStatus = createEnum("memberStatus", com.codefarm.codefarmer.type.Status.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QMemberAlba(String variable) {
        this(MemberAlba.class, forVariable(variable), INITS);
    }

    public QMemberAlba(Path<? extends MemberAlba> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberAlba(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberAlba(PathMetadata metadata, PathInits inits) {
        this(MemberAlba.class, metadata, inits);
    }

    public QMemberAlba(Class<? extends MemberAlba> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.alba = inits.isInitialized("alba") ? new QAlba(forProperty("alba"), inits.get("alba")) : null;
        this.member = inits.isInitialized("member") ? new com.codefarm.codefarmer.entity.member.QMember(forProperty("member")) : null;
    }

}

