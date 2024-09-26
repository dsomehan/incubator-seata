/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.seata.rm.datasource.sql.handler.oscar;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.seata.common.loader.LoadLevel;
import org.apache.seata.common.util.StringUtils;
import org.apache.seata.sqlparser.EscapeHandler;
import org.apache.seata.sqlparser.struct.ColumnMeta;
import org.apache.seata.sqlparser.struct.TableMeta;
import org.apache.seata.sqlparser.util.JdbcConstants;

/**
 * The type OSCAR keyword checker.
 *
 * @author hsh
 */
@LoadLevel(name = JdbcConstants.OSCAR)
public class OscarEscapeHandler implements EscapeHandler {

    protected Set<String> keywordSet = Arrays.stream(OscarKeyword.values()).map(OscarKeyword::name).collect(Collectors.toSet());

    /**
     * OSCAR keyword
     */
    private enum OscarKeyword {
        ABORT("ABORT"),
        ABSOLUTE("ABSOLUTE"),
        ACCESS("ACCESS"),
        ACCESSED("ACCESSED"),
        ACTION("ACTION"),
        ADD("ADD"),
        ADMIN("ADMIN"),
        ADVISOR("ADVISOR"),
        AFTER("AFTER"),
        AGGREGATE("AGGREGATE"),
        ALTER("ALTER"),
        ALWAYS("ALWAYS"),
        ANALYSE("ANALYSE"),
        ANALYZE("ANALYZE"),
        ANALYZER("ANALYZER"),
        APP("APP"),
        ARCHIVE("ARCHIVE"),
        ARCHIVELOG("ARCHIVELOG"),
        ARE("ARE"),
        ARRAY("ARRAY"),
        ASC("ASC"),
        ASSERTION("ASSERTION"),
        ASSIGNMENT("ASSIGNMENT"),
        AST("AST"),
        ASYNC("ASYNC"),
        ATTRIBUTES("ATTRIBUTES"),
        AUDIT("AUDIT"),
        AUDITFILE("AUDITFILE"),
        AUTHID("AUTHID"),
        AUTHORIZATION("AUTHORIZATION"),
        AUTO("AUTO"),
        AUTO_INCREMENT("AUTO_INCREMENT"),
        AUTOEXTEND("AUTOEXTEND"),
        BACKUP("BACKUP"),
        BACKWARD("BACKWARD"),
        BASICANALYZER("BASICANALYZER"),
        BATCHSIZE("BATCHSIZE"),
        BEFORE("BEFORE"),
        BEGIN("BEGIN"),
        BETWEEN("BETWEEN"),
        BIGINT("BIGINT"),
        BINARY("BINARY"),
        BINLOG("BINLOG"),
        BIT("BIT"),
        BITMAP("BITMAP"),
        BLOCK("BLOCK"),
        BODY("BODY"),
        BOOLEAN("BOOLEAN"),
        BOTH("BOTH"),
        BPCHAR("BPCHAR"),
        BUFFER("BUFFER"),
        BUFFER_CACHE("BUFFER_CACHE"),
        BUFFER_POOL("BUFFER_POOL"),
        BUILD("BUILD"),
        BULK("BULK"),
        BY("BY"),
        BYTE("BYTE"),
        CACHE("CACHE"),
        CALL("CALL"),
        CALLED("CALLED"),
        CANCEL("CANCEL"),
        CASCADED("CASCADED"),
        CDC("CDC"),
        CHAIN("CHAIN"),
        CHANGE("CHANGE"),
        CHARACTERISTICS("CHARACTERISTICS"),
        CHARACTERSET("CHARACTERSET"),
        CHEAT("CHEAT"),
        CHECKPOINT("CHECKPOINT"),
        CHINESEANALYZER("CHINESEANALYZER"),
        CHUNK("CHUNK"),
        CJKANALYZER("CJKANALYZER"),
        CLASS("CLASS"),
        CLEAN("CLEAN"),
        CLOSE("CLOSE"),
        CLUSTER("CLUSTER"),
        COLUMNS("COLUMNS"),
        COMMENT("COMMENT"),
        COMMENTS("COMMENTS"),
        COMMIT("COMMIT"),
        COMMITTED("COMMITTED"),
        COMPILE("COMPILE"),
        COMPLETE("COMPLETE"),
        COMPRESS("COMPRESS"),
        CONCAT("CONCAT"),
        CONFIGURATION("CONFIGURATION"),
        CONNECT("CONNECT"),
        CONNECT_BY_ISCYCLE("CONNECT_BY_ISCYCLE"),
        CONNECT_BY_ISLEAF("CONNECT_BY_ISLEAF"),
        CONNECT_BY_ROOT("CONNECT_BY_ROOT"),
        CONSTRAINTS("CONSTRAINTS"),
        CONTENT("CONTENT"),
        CONTEXT("CONTEXT"),
        CONTINUE("CONTINUE"),
        CONTROLFILE("CONTROLFILE"),
        CONVERSION("CONVERSION"),
        COPY("COPY"),
        CROSS("CROSS"),
        CSV("CSV"),
        CUBE("CUBE"),
        CURRENT("CURRENT"),
        CURRENT_USER("CURRENT_USER"),
        CURSOR("CURSOR"),
        CYCLE("CYCLE"),
        DATA("DATA"),
        DATABASE("DATABASE"),
        DATABASELINK("DATABASELINK"),
        DATAFILE("DATAFILE"),
        DATAFILETYPE("DATAFILETYPE"),
        DATE("DATE"),
        DATE_ADD("DATE_ADD"),
        DATE_SUB("DATE_SUB"),
        DATEFORMAT("DATEFORMAT"),
        DATETIME("DATETIME"),
        DAY("DAY"),
        DBA("DBA"),
        DEALLOCATE("DEALLOCATE"),
        DEBUG("DEBUG"),
        DEC("DEC"),
        DECLARE("DECLARE"),
        DECODE("DECODE"),
        DECRYPT("DECRYPT"),
        DEFERRABLE("DEFERRABLE"),
        DEFERRED("DEFERRED"),
        DEFINER("DEFINER"),
        DELETE("DELETE"),
        DELIMITED("DELIMITED"),
        DELIMITER("DELIMITER"),
        DELIMITERS("DELIMITERS"),
        DEMAND("DEMAND"),
        DENSE_RANK("DENSE_RANK"),
        DESC("DESC"),
        DESCRIPTION("DESCRIPTION"),
        DETERMINISTIC("DETERMINISTIC"),
        DIRECTORY("DIRECTORY"),
        DISABLE("DISABLE"),
        DOCUMENT("DOCUMENT"),
        DOMAIN("DOMAIN"),
        DOUBLE("DOUBLE"),
        DUMP("DUMP"),
        EACH("EACH"),
        ELOG("ELOG"),
        ELT("ELT"),
        EMPTY("EMPTY"),
        ENABLE("ENABLE"),
        ENCODING("ENCODING"),
        ENCRYPT("ENCRYPT"),
        ENCRYPTED("ENCRYPTED"),
        ENCRYPTION("ENCRYPTION"),
        END("END"),
        ERROR("ERROR"),
        ERRORS("ERRORS"),
        ESCALATION("ESCALATION"),
        ESCAPE("ESCAPE"),
        EVENTS("EVENTS"),
        EXCHANGE("EXCHANGE"),
        EXCLUDING("EXCLUDING"),
        EXCLUSIVE("EXCLUSIVE"),
        EXEC("EXEC"),
        EXECUTE("EXECUTE"),
        EXPLAIN("EXPLAIN"),
        EXPORT("EXPORT"),
        EXTEND("EXTEND"),
        EXTERNALLY("EXTERNALLY"),
        FAILOVER("FAILOVER"),
        FALSE("FALSE"),
        FAR("FAR"),
        FAST("FAST"),
        FAULT("FAULT"),
        FETCH("FETCH"),
        FIELD("FIELD"),
        FIELDS("FIELDS"),
        FIELDTERMINATOR("FIELDTERMINATOR"),
        FILE("FILE"),
        FILESIZE("FILESIZE"),
        FILL("FILL"),
        FILTER("FILTER"),
        FIRE_TRIGGERS("FIRE_TRIGGERS"),
        FIRST("FIRST"),
        FIRSTROW("FIRSTROW"),
        FLUSH("FLUSH"),
        FOLLOWING("FOLLOWING"),
        FORCE("FORCE"),
        FOREIGNKEY_CONSTRAINTS("FOREIGNKEY_CONSTRAINTS"),
        FOREVER("FOREVER"),
        FORMATFILE("FORMATFILE"),
        FORWARD("FORWARD"),
        FREELISTS("FREELISTS"),
        FREEPOOLS("FREEPOOLS"),
        FULL("FULL"),
        FULLTEXT("FULLTEXT"),
        FUNCTION("FUNCTION"),
        G("G"),
        GB("GB"),
        GBK("GBK"),
        GCOV("GCOV"),
        GENERATED("GENERATED"),
        GEOGRAPHY("GEOGRAPHY"),
        GEOMETRY("GEOMETRY"),
        GET("GET"),
        GETCLOBVAL("GETCLOBVAL"),
        GETSTRINGVAL("GETSTRINGVAL"),
        GLOBAL("GLOBAL"),
        GLOBAL_NAME("GLOBAL_NAME"),
        GLOBALLY("GLOBALLY"),
        GREATEST("GREATEST"),
        GROUPING("GROUPING"),
        GROUPING_ID("GROUPING_ID"),
        GUARANTEE("GUARANTEE"),
        HANDLER("HANDLER"),
        HASH("HASH"),
        HEADER("HEADER"),
        HEAP("HEAP"),
        HOLD("HOLD"),
        HOUR("HOUR"),
        IDENTIFIED("IDENTIFIED"),
        IDENTITY("IDENTITY"),
        IF("IF"),
        IGNORE("IGNORE"),
        ILIKE("ILIKE"),
        IMMEDIATE("IMMEDIATE"),
        IMMUTABLE("IMMUTABLE"),
        IMPLICIT("IMPLICIT"),
        IMPORT("IMPORT"),
        IMPORT_POLCOL("IMPORT_POLCOL"),
        INCREMENT("INCREMENT"),
        INDEX("INDEX"),
        INDEXES("INDEXES"),
        INHERITS("INHERITS"),
        INIT("INIT"),
        INITIAL("INITIAL"),
        INITIALIZED("INITIALIZED"),
        INITIALLY("INITIALLY"),
        INITRANS("INITRANS"),
        INNER("INNER"),
        INOUT("INOUT"),
        INPUT("INPUT"),
        INSENSITIVE("INSENSITIVE"),
        INSERT("INSERT"),
        INSTEAD("INSTEAD"),
        INTERVAL("INTERVAL"),
        INVALIDATE("INVALIDATE"),
        INVISIBLE("INVISIBLE"),
        INVOKER("INVOKER"),
        IP("IP"),
        IS("IS"),
        ISNULL("ISNULL"),
        ISOLATION("ISOLATION"),
        JOIN("JOIN"),
        JSON("JSON"),
        JSON_TABLE("JSON_TABLE"),
        JSON_VALUE("JSON_VALUE"),
        K("K"),
        KB("KB"),
        KEEP("KEEP"),
        KEEPIDENTITY("KEEPIDENTITY"),
        KEEPNULLS("KEEPNULLS"),
        KEY("KEY"),
        KEYSTORE("KEYSTORE"),
        KILL("KILL"),
        KILOBYTES_PER_BATCH("KILOBYTES_PER_BATCH"),
        KSTORE("KSTORE"),
        LABEL("LABEL"),
        LANCOMPILER("LANCOMPILER"),
        LANGUAGE("LANGUAGE"),
        LAST("LAST"),
        LASTROW("LASTROW"),
        LC_COLLATE("LC_COLLATE"),
        LC_CTYPE("LC_CTYPE"),
        LDRTRIM("LDRTRIM"),
        LEADING("LEADING"),
        LEAK("LEAK"),
        LEAST("LEAST"),
        LEFT("LEFT"),
        LESS("LESS"),
        LIFETIME("LIFETIME"),
        LIKE("LIKE"),
        LIMIT("LIMIT"),
        LIST("LIST"),
        LISTEN("LISTEN"),
        LOAD("LOAD"),
        LOB("LOB"),
        LOCAL("LOCAL"),
        LOCATION("LOCATION"),
        LOCK("LOCK"),
        LOCKED("LOCKED"),
        LOG("LOG"),
        LOGFILE("LOGFILE"),
        LOGGING("LOGGING"),
        LOGICAL("LOGICAL"),
        LONG("LONG"),
        LOOP("LOOP"),
        LRTRIM("LRTRIM"),
        LSN("LSN"),
        LTRIM("LTRIM"),
        M("M"),
        MAINTAIN_INDEX("MAINTAIN_INDEX"),
        MAINTENANCE("MAINTENANCE"),
        MANUAL("MANUAL"),
        MASKING("MASKING"),
        MATCH("MATCH"),
        MATCHED("MATCHED"),
        MATERIALIZED("MATERIALIZED"),
        MAX("MAX"),
        MAXERRORS("MAXERRORS"),
        MAXEXTENDS("MAXEXTENDS"),
        MAXEXTENTS("MAXEXTENTS"),
        MAXSIZE("MAXSIZE"),
        MAXTRANS("MAXTRANS"),
        MAXVALUE("MAXVALUE"),
        MB("MB"),
        MEMBER("MEMBER"),
        MEMORY("MEMORY"),
        MERGE("MERGE"),
        MIN("MIN"),
        MINEXTENDS("MINEXTENDS"),
        MINEXTENTS("MINEXTENTS"),
        MINSIZE("MINSIZE"),
        MINUS("MINUS"),
        MINUTE("MINUTE"),
        MINVALUE("MINVALUE"),
        MISSING("MISSING"),
        MOD("MOD"),
        MODE("MODE"),
        MODIFY("MODIFY"),
        MONEY("MONEY"),
        MONTH("MONTH"),
        MOUNT("MOUNT"),
        MOVE("MOVE"),
        MOVEMENT("MOVEMENT"),
        MULTICOLUMN("MULTICOLUMN"),
        MULTIPLE("MULTIPLE"),
        NAME("NAME"),
        NAMES("NAMES"),
        NATURAL("NATURAL"),
        NCHAR("NCHAR"),
        NEVER("NEVER"),
        NEWLINE("NEWLINE"),
        NEXT("NEXT"),
        NEXTVAL("NEXTVAL"),
        NO("NO"),
        NOARCHIVELOG("NOARCHIVELOG"),
        NOAUDIT("NOAUDIT"),
        NOCACHE("NOCACHE"),
        NOCOMPRESS("NOCOMPRESS"),
        NOCOPY("NOCOPY"),
        NOCYCLE("NOCYCLE"),
        NODE("NODE"),
        NOGUARANTEE("NOGUARANTEE"),
        NOLOGGING("NOLOGGING"),
        NOMAXVALUE("NOMAXVALUE"),
        NOMINVALUE("NOMINVALUE"),
        NOMOUNT("NOMOUNT"),
        NORMAL("NORMAL"),
        NOTHING("NOTHING"),
        NOTIFY("NOTIFY"),
        NOTNULL("NOTNULL"),
        NOTRIM("NOTRIM"),
        NOVALIDATE("NOVALIDATE"),
        NOWAIT("NOWAIT"),
        NVARCHAR2("NVARCHAR2"),
        NVL("NVL"),
        NVL2("NVL2"),
        OBJECT("OBJECT"),
        OF("OF"),
        OFF("OFF"),
        OFFLINE("OFFLINE"),
        OFFSET("OFFSET"),
        OIDS("OIDS"),
        ONLINE("ONLINE"),
        OPEN("OPEN"),
        OPERATOR("OPERATOR"),
        OPTIMIZE("OPTIMIZE"),
        OPTIMIZE_KSCACHE("OPTIMIZE_KSCACHE"),
        OPTION("OPTION"),
        ORACLE("ORACLE"),
        ORDINALITY("ORDINALITY"),
        ORGANIZATION("ORGANIZATION"),
        OSCAR("OSCAR"),
        OUT("OUT"),
        OUTER("OUTER"),
        OUTLINE("OUTLINE"),
        OVER("OVER"),
        OVERFLOW("OVERFLOW"),
        OVERLAPS("OVERLAPS"),
        OVERLAY("OVERLAY"),
        OWNER("OWNER"),
        PACKAGE("PACKAGE"),
        PAGESIZE("PAGESIZE"),
        PARALLEL("PARALLEL"),
        PARAMETER("PARAMETER"),
        PARAMINFO("PARAMINFO"),
        PARTIAL("PARTIAL"),
        PARTITION("PARTITION"),
        PARTITIONS("PARTITIONS"),
        PASSING("PASSING"),
        PASSWORD("PASSWORD"),
        PATH("PATH"),
        PCTFREE("PCTFREE"),
        PCTINCREASE("PCTINCREASE"),
        PCTTHRESHOLD("PCTTHRESHOLD"),
        PCTUSED("PCTUSED"),
        PCTVERSION("PCTVERSION"),
        PENDANT("PENDANT"),
        PETENTION("PETENTION"),
        PFILE("PFILE"),
        PIPELINED("PIPELINED"),
        PIVOT("PIVOT"),
        PLACING("PLACING"),
        PLS_INTEGER("PLS_INTEGER"),
        POLICY("POLICY"),
        PORT("PORT"),
        POSITION("POSITION"),
        PRECEDING("PRECEDING"),
        PRECISION("PRECISION"),
        PREPARE("PREPARE"),
        PRESERVE("PRESERVE"),
        PREVAL("PREVAL"),
        PRIMARY("PRIMARY"),
        PRIOR("PRIOR"),
        PRIORITY("PRIORITY"),
        PRIVILEGES("PRIVILEGES"),
        PROCEDURAL("PROCEDURAL"),
        PROCEDURE("PROCEDURE"),
        PUBLIC("PUBLIC"),
        PURGE("PURGE"),
        QU("QU"),
        QUERY("QUERY"),
        QUICK("QUICK"),
        QUOTE("QUOTE"),
        RAC("RAC"),
        RANGE("RANGE"),
        RATIO_TO_REPORT("RATIO_TO_REPORT"),
        RAW("RAW"),
        READ("READ"),
        READABLE("READABLE"),
        READS("READS"),
        READSIZE("READSIZE"),
        REBUILD("REBUILD"),
        RECHECK("RECHECK"),
        RECORDS("RECORDS"),
        RECOVERY("RECOVERY"),
        RECREATE("RECREATE"),
        RECURSIVE("RECURSIVE"),
        RECYCLE("RECYCLE"),
        REFRESH("REFRESH"),
        REGEXP("REGEXP"),
        REGION("REGION"),
        REJECT("REJECT"),
        RELATIVE("RELATIVE"),
        REMOVE("REMOVE"),
        RENAME("RENAME"),
        REPEATABLE("REPEATABLE"),
        REPLACE("REPLACE"),
        RESET("RESET"),
        RESIZE("RESIZE"),
        RESOURCE("RESOURCE"),
        RESTART("RESTART"),
        RESTORE("RESTORE"),
        RESTRICT("RESTRICT"),
        RESULT("RESULT"),
        RESUME("RESUME"),
        RETENTION("RETENTION"),
        RETURN("RETURN"),
        RETURN_GENERATED_KEYS("RETURN_GENERATED_KEYS"),
        RETURNING("RETURNING"),
        RETURNS("RETURNS"),
        REUSE("REUSE"),
        REVERSE("REVERSE"),
        REVOKE("REVOKE"),
        REWRITE("REWRITE"),
        RIGHT("RIGHT"),
        ROLE("ROLE"),
        ROLLBACK("ROLLBACK"),
        ROLLUP("ROLLUP"),
        ROW("ROW"),
        ROWDESCRIPTION("ROWDESCRIPTION"),
        ROWID("ROWID"),
        ROWS("ROWS"),
        ROWS_PER_BATCH("ROWS_PER_BATCH"),
        ROWTERMINATOR("ROWTERMINATOR"),
        ROWTYPE("ROWTYPE"),
        RTRIM("RTRIM"),
        RULE("RULE"),
        SAMPLE("SAMPLE"),
        SAVEPOINT("SAVEPOINT"),
        SCAN("SCAN"),
        SCHEMA("SCHEMA"),
        SCN("SCN"),
        SCROLL("SCROLL"),
        SECOND("SECOND"),
        SECURITY("SECURITY"),
        SEGMENT("SEGMENT"),
        SEPARATOR("SEPARATOR"),
        SEQUENCE("SEQUENCE"),
        SERIALIZABLE("SERIALIZABLE"),
        SESSION("SESSION"),
        SETS("SETS"),
        SHARE("SHARE"),
        SHOW("SHOW"),
        SHRINK("SHRINK"),
        SHRINKLOG("SHRINKLOG"),
        SHUTDOWN("SHUTDOWN"),
        SIBLINGS("SIBLINGS"),
        SIGNED("SIGNED"),
        SILENTLY("SILENTLY"),
        SIMILAR("SIMILAR"),
        SIMPLE("SIMPLE"),
        SINGLE("SINGLE"),
        SINGLEROW("SINGLEROW"),
        SIZE("SIZE"),
        SKIP("SKIP"),
        SMALLINT("SMALLINT"),
        SPACE("SPACE"),
        SPLIT("SPLIT"),
        STABLE("STABLE"),
        STANDALONE("STANDALONE"),
        STANDARDANALYZER("STANDARDANALYZER"),
        START("START"),
        STARTFILE("STARTFILE"),
        STARTPOS("STARTPOS"),
        STARTTIME("STARTTIME"),
        STARTUP("STARTUP"),
        STATEMENT("STATEMENT"),
        STATIC("STATIC"),
        STATISTICS("STATISTICS"),
        STDIN("STDIN"),
        STDOUT("STDOUT"),
        STOP("STOP"),
        STOPFILE("STOPFILE"),
        STOPPOS("STOPPOS"),
        STOPTIME("STOPTIME"),
        STOPWORDS("STOPWORDS"),
        STORAGE("STORAGE"),
        STORE("STORE"),
        STORED("STORED"),
        STRICT("STRICT"),
        SUBPARTITION("SUBPARTITION"),
        SUBPARTITIONS("SUBPARTITIONS"),
        SUBSTRING("SUBSTRING"),
        SUCCESSFUL("SUCCESSFUL"),
        SUSPEND("SUSPEND"),
        SWITCHOVER("SWITCHOVER"),
        SYNC("SYNC"),
        SYSAUX("SYSAUX"),
        SYSID("SYSID"),
        SYSTEM("SYSTEM"),
        T("T"),
        TABLESPACE("TABLESPACE"),
        TB("TB"),
        TEMP("TEMP"),
        TEMPFILE("TEMPFILE"),
        TEMPLATE("TEMPLATE"),
        TEMPORARY("TEMPORARY"),
        TERMINATED("TERMINATED"),
        THAN("THAN"),
        TIMES("TIMES"),
        TIMEZONE("TIMEZONE"),
        TINYINT("TINYINT"),
        TOAST("TOAST"),
        TRACE("TRACE"),
        TRACKING("TRACKING"),
        TRAIL("TRAIL"),
        TRAILING("TRAILING"),
        TRANSACTION("TRANSACTION"),
        TRANSACTIONAL("TRANSACTIONAL"),
        TRANSFORMS("TRANSFORMS"),
        TREAT("TREAT"),
        TRIAL("TRIAL"),
        TRIGGER("TRIGGER"),
        TRIGGERS("TRIGGERS"),
        TRIM("TRIM"),
        TRUE("TRUE"),
        TRUNCATE("TRUNCATE"),
        TRUSTED("TRUSTED"),
        TUPLE("TUPLE"),
        TYPE("TYPE"),
        UNBOUNDED("UNBOUNDED"),
        UNCOMMITTED("UNCOMMITTED"),
        UNDO("UNDO"),
        UNENCRYPTED("UNENCRYPTED"),
        UNKNOWN("UNKNOWN"),
        UNLIMITED("UNLIMITED"),
        UNLISTEN("UNLISTEN"),
        UNLOCK("UNLOCK"),
        UNMAINTENANCE("UNMAINTENANCE"),
        UNPIVOT("UNPIVOT"),
        UNSIGNED("UNSIGNED"),
        UNTIL("UNTIL"),
        UNUSABLE("UNUSABLE"),
        UP("UP"),
        UPDATE("UPDATE"),
        UPDATELABEL("UPDATELABEL"),
        UPDATEXML("UPDATEXML"),
        USAGE("USAGE"),
        USE("USE"),
        USER("USER"),
        UTF8("UTF8"),
        UTF8MB4("UTF8MB4"),
        VACUUM("VACUUM"),
        VALID("VALID"),
        VALIDATE("VALIDATE"),
        VALIDATION("VALIDATION"),
        VALIDATOR("VALIDATOR"),
        VALUE("VALUE"),
        VALUES("VALUES"),
        VARBINARY("VARBINARY"),
        VARBIT("VARBIT"),
        VARCHAR("VARCHAR"),
        VARCHAR2("VARCHAR2"),
        VARYING("VARYING"),
        VERBOSE("VERBOSE"),
        VERSION("VERSION"),
        VERSIONS("VERSIONS"),
        VIEW("VIEW"),
        VIRTUAL("VIRTUAL"),
        VISIBLE("VISIBLE"),
        VOLATILE("VOLATILE"),
        VOTEDISK("VOTEDISK"),
        WAIT("WAIT"),
        WALLET("WALLET"),
        WEIGHT("WEIGHT"),
        WHEN("WHEN"),
        WHENEVER("WHENEVER"),
        WINDOW("WINDOW"),
        WORK("WORK"),
        XML("XML"),
        XMLATTRIBUTES("XMLATTRIBUTES"),
        XMLCONCAT("XMLCONCAT"),
        XMLELEMENT("XMLELEMENT"),
        XMLFOREST("XMLFOREST"),
        XMLPARSE("XMLPARSE"),
        XMLPI("XMLPI"),
        XMLROOT("XMLROOT"),
        XMLSERIALIZE("XMLSERIALIZE"),
        XMLTABLE("XMLTABLE"),
        YEAR("YEAR"),
        YES("YES"),
        ZONE("ZONE");
        /**
         * The Name.
         */
        public final String name;
        OscarKeyword(String name) {
            this.name = name;
        }
    }


    @Override
    public boolean checkIfKeyWords(String fieldOrTableName) {
        if (keywordSet.contains(fieldOrTableName)) {
            return true;
        }
        if (fieldOrTableName != null) {
            fieldOrTableName = fieldOrTableName.toUpperCase();
        }
        return keywordSet.contains(fieldOrTableName);

    }

    @Override
    public boolean checkIfNeedEscape(String columnName, TableMeta tableMeta) {
        if (StringUtils.isBlank(columnName)) {
            return false;
        }
        columnName = columnName.trim();
        if (containsEscape(columnName)) {
            return false;
        }
        boolean isKeyWord = checkIfKeyWords(columnName);
        if (isKeyWord) {
            return true;
        }
        // oscar
        // we are recommend table name and column name must uppercase.
        // if exists full uppercase, the table name or column name doesn't bundle escape symbol.
        //create\read    table TABLE "table" "TABLE"
        if (null != tableMeta) {
            ColumnMeta columnMeta = tableMeta.getColumnMeta(columnName);
            if (null != columnMeta) {
                return columnMeta.isCaseSensitive();
            }
        } else if (isUppercase(columnName)) {
            return false;
        }
        return true;
    }

    private static boolean isUppercase(String fieldOrTableName) {
        if (fieldOrTableName == null) {
            return false;
        }
        char[] chars = fieldOrTableName.toCharArray();
        for (char ch : chars) {
            if (ch >= 'a' && ch <= 'z') {
                return false;
            }
        }
        return true;
    }
}
