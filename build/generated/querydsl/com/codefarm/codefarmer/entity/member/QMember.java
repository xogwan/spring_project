package com.codefarm.codefarmer.entity.member;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = -2050524957L;

    public static final QMember member = new QMember("member1");

    public final com.codefarm.codefarmer.entity.period.QPeriod _super = new com.codefarm.codefarmer.entity.period.QPeriod(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final StringPath memberBirth = createString("memberBirth");

    public final StringPath memberEmail = createString("memberEmail");

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final StringPath memberLocation = createString("memberLocation");

    public final StringPath memberName = createString("memberName");

    public final StringPath memberNickname = createString("memberNickname");

    public final StringPath memberOauthId = createString("memberOauthId");

    public final StringPath memberPhone = createString("memberPhone");

    public final EnumPath<com.codefarm.codefarmer.type.MemberType> memberType = createEnum("memberType", com.codefarm.codefarmer.type.MemberType.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}

