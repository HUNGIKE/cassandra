// $ANTLR 3.5.2 /home/kasm-user/Downloads/cassandra/src/antlr/Cql.g 2023-08-16 17:39:15

    package org.apache.cassandra.cql3;

    import java.util.Collections;
    import java.util.EnumSet;
    import java.util.HashSet;
    import java.util.LinkedHashMap;
    import java.util.List;
    import java.util.Map;
    import java.util.Set;

    import org.apache.cassandra.auth.*;
    import org.apache.cassandra.cql3.conditions.*;
    import org.apache.cassandra.cql3.functions.*;
    import org.apache.cassandra.cql3.restrictions.CustomIndexExpression;
    import org.apache.cassandra.cql3.selection.*;
    import org.apache.cassandra.cql3.statements.*;
    import org.apache.cassandra.cql3.statements.schema.*;
    import org.apache.cassandra.exceptions.ConfigurationException;
    import org.apache.cassandra.exceptions.InvalidRequestException;
    import org.apache.cassandra.exceptions.SyntaxException;
    import org.apache.cassandra.schema.ColumnMetadata;
    import org.apache.cassandra.utils.Pair;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "B", "BOOLEAN", "C", "COMMENT", 
		"D", "DIGIT", "DURATION", "DURATION_ISO_8601_PERIOD_DESIGNATORS", "DURATION_ISO_8601_TIME_DESIGNATORS", 
		"DURATION_ISO_8601_WEEK_PERIOD_DESIGNATOR", "DURATION_UNIT", "E", "EMPTY_QUOTED_NAME", 
		"EXPONENT", "F", "FLOAT", "G", "H", "HEX", "HEXNUMBER", "I", "IDENT", 
		"INTEGER", "J", "K", "K_ACCESS", "K_ADD", "K_AGGREGATE", "K_AGGREGATES", 
		"K_ALL", "K_ALLOW", "K_ALTER", "K_AND", "K_APPLY", "K_AS", "K_ASC", "K_ASCII", 
		"K_AUTHORIZE", "K_BATCH", "K_BEGIN", "K_BIGINT", "K_BLOB", "K_BOOLEAN", 
		"K_BY", "K_CALLED", "K_CAST", "K_CLUSTER", "K_CLUSTERING", "K_COLUMNFAMILY", 
		"K_COMPACT", "K_CONTAINS", "K_COUNT", "K_COUNTER", "K_CREATE", "K_CUSTOM", 
		"K_DATACENTERS", "K_DATE", "K_DECIMAL", "K_DEFAULT", "K_DELETE", "K_DESC", 
		"K_DESCRIBE", "K_DISTINCT", "K_DOUBLE", "K_DROP", "K_DURATION", "K_ENTRIES", 
		"K_EXECUTE", "K_EXISTS", "K_FILTERING", "K_FINALFUNC", "K_FLOAT", "K_FROM", 
		"K_FROZEN", "K_FULL", "K_FUNCTION", "K_FUNCTIONS", "K_GRANT", "K_GROUP", 
		"K_IF", "K_IN", "K_INDEX", "K_INET", "K_INITCOND", "K_INPUT", "K_INSERT", 
		"K_INT", "K_INTERNALS", "K_INTO", "K_IS", "K_JSON", "K_KEY", "K_KEYS", 
		"K_KEYSPACE", "K_KEYSPACES", "K_LANGUAGE", "K_LIKE", "K_LIMIT", "K_LIST", 
		"K_LOGIN", "K_MAP", "K_MATERIALIZED", "K_MBEAN", "K_MBEANS", "K_MODIFY", 
		"K_NEGATIVE_INFINITY", "K_NEGATIVE_NAN", "K_NOLOGIN", "K_NORECURSIVE", 
		"K_NOSUPERUSER", "K_NOT", "K_NULL", "K_OF", "K_ON", "K_ONLY", "K_OPTIONS", 
		"K_OR", "K_ORDER", "K_PARTITION", "K_PASSWORD", "K_PER", "K_PERMISSION", 
		"K_PERMISSIONS", "K_POSITIVE_INFINITY", "K_POSITIVE_NAN", "K_PRIMARY", 
		"K_RENAME", "K_REPLACE", "K_RETURNS", "K_REVOKE", "K_ROLE", "K_ROLES", 
		"K_SCHEMA", "K_SELECT", "K_SET", "K_SFUNC", "K_SMALLINT", "K_STATIC", 
		"K_STORAGE", "K_STYPE", "K_SUPERUSER", "K_TABLES", "K_TEXT", "K_TIME", 
		"K_TIMESTAMP", "K_TIMEUUID", "K_TINYINT", "K_TO", "K_TOKEN", "K_TRIGGER", 
		"K_TRUNCATE", "K_TTL", "K_TUPLE", "K_TYPE", "K_TYPES", "K_UNLOGGED", "K_UNSET", 
		"K_UPDATE", "K_USE", "K_USER", "K_USERS", "K_USING", "K_UUID", "K_VALUES", 
		"K_VARCHAR", "K_VARINT", "K_VIEW", "K_WHERE", "K_WITH", "K_WRITETIME", 
		"L", "LETTER", "M", "MULTILINE_COMMENT", "N", "O", "P", "Q", "QMARK", 
		"QUOTED_NAME", "R", "RANGE", "S", "STRING_LITERAL", "T", "U", "UUID", 
		"V", "W", "WS", "X", "Y", "Z", "'!='", "'%'", "'('", "')'", "'+'", "'+='", 
		"','", "'-'", "'-='", "'.'", "'/'", "':'", "';'", "'<'", "'<='", "'='", 
		"'>'", "'>='", "'['", "'\\*'", "']'", "'expr('", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__198=198;
	public static final int T__199=199;
	public static final int T__200=200;
	public static final int T__201=201;
	public static final int T__202=202;
	public static final int T__203=203;
	public static final int T__204=204;
	public static final int T__205=205;
	public static final int T__206=206;
	public static final int T__207=207;
	public static final int T__208=208;
	public static final int T__209=209;
	public static final int T__210=210;
	public static final int T__211=211;
	public static final int T__212=212;
	public static final int T__213=213;
	public static final int T__214=214;
	public static final int T__215=215;
	public static final int T__216=216;
	public static final int T__217=217;
	public static final int T__218=218;
	public static final int T__219=219;
	public static final int T__220=220;
	public static final int T__221=221;
	public static final int A=4;
	public static final int B=5;
	public static final int BOOLEAN=6;
	public static final int C=7;
	public static final int COMMENT=8;
	public static final int D=9;
	public static final int DIGIT=10;
	public static final int DURATION=11;
	public static final int DURATION_ISO_8601_PERIOD_DESIGNATORS=12;
	public static final int DURATION_ISO_8601_TIME_DESIGNATORS=13;
	public static final int DURATION_ISO_8601_WEEK_PERIOD_DESIGNATOR=14;
	public static final int DURATION_UNIT=15;
	public static final int E=16;
	public static final int EMPTY_QUOTED_NAME=17;
	public static final int EXPONENT=18;
	public static final int F=19;
	public static final int FLOAT=20;
	public static final int G=21;
	public static final int H=22;
	public static final int HEX=23;
	public static final int HEXNUMBER=24;
	public static final int I=25;
	public static final int IDENT=26;
	public static final int INTEGER=27;
	public static final int J=28;
	public static final int K=29;
	public static final int K_ACCESS=30;
	public static final int K_ADD=31;
	public static final int K_AGGREGATE=32;
	public static final int K_AGGREGATES=33;
	public static final int K_ALL=34;
	public static final int K_ALLOW=35;
	public static final int K_ALTER=36;
	public static final int K_AND=37;
	public static final int K_APPLY=38;
	public static final int K_AS=39;
	public static final int K_ASC=40;
	public static final int K_ASCII=41;
	public static final int K_AUTHORIZE=42;
	public static final int K_BATCH=43;
	public static final int K_BEGIN=44;
	public static final int K_BIGINT=45;
	public static final int K_BLOB=46;
	public static final int K_BOOLEAN=47;
	public static final int K_BY=48;
	public static final int K_CALLED=49;
	public static final int K_CAST=50;
	public static final int K_CLUSTER=51;
	public static final int K_CLUSTERING=52;
	public static final int K_COLUMNFAMILY=53;
	public static final int K_COMPACT=54;
	public static final int K_CONTAINS=55;
	public static final int K_COUNT=56;
	public static final int K_COUNTER=57;
	public static final int K_CREATE=58;
	public static final int K_CUSTOM=59;
	public static final int K_DATACENTERS=60;
	public static final int K_DATE=61;
	public static final int K_DECIMAL=62;
	public static final int K_DEFAULT=63;
	public static final int K_DELETE=64;
	public static final int K_DESC=65;
	public static final int K_DESCRIBE=66;
	public static final int K_DISTINCT=67;
	public static final int K_DOUBLE=68;
	public static final int K_DROP=69;
	public static final int K_DURATION=70;
	public static final int K_ENTRIES=71;
	public static final int K_EXECUTE=72;
	public static final int K_EXISTS=73;
	public static final int K_FILTERING=74;
	public static final int K_FINALFUNC=75;
	public static final int K_FLOAT=76;
	public static final int K_FROM=77;
	public static final int K_FROZEN=78;
	public static final int K_FULL=79;
	public static final int K_FUNCTION=80;
	public static final int K_FUNCTIONS=81;
	public static final int K_GRANT=82;
	public static final int K_GROUP=83;
	public static final int K_IF=84;
	public static final int K_IN=85;
	public static final int K_INDEX=86;
	public static final int K_INET=87;
	public static final int K_INITCOND=88;
	public static final int K_INPUT=89;
	public static final int K_INSERT=90;
	public static final int K_INT=91;
	public static final int K_INTERNALS=92;
	public static final int K_INTO=93;
	public static final int K_IS=94;
	public static final int K_JSON=95;
	public static final int K_KEY=96;
	public static final int K_KEYS=97;
	public static final int K_KEYSPACE=98;
	public static final int K_KEYSPACES=99;
	public static final int K_LANGUAGE=100;
	public static final int K_LIKE=101;
	public static final int K_LIMIT=102;
	public static final int K_LIST=103;
	public static final int K_LOGIN=104;
	public static final int K_MAP=105;
	public static final int K_MATERIALIZED=106;
	public static final int K_MBEAN=107;
	public static final int K_MBEANS=108;
	public static final int K_MODIFY=109;
	public static final int K_NEGATIVE_INFINITY=110;
	public static final int K_NEGATIVE_NAN=111;
	public static final int K_NOLOGIN=112;
	public static final int K_NORECURSIVE=113;
	public static final int K_NOSUPERUSER=114;
	public static final int K_NOT=115;
	public static final int K_NULL=116;
	public static final int K_OF=117;
	public static final int K_ON=118;
	public static final int K_ONLY=119;
	public static final int K_OPTIONS=120;
	public static final int K_OR=121;
	public static final int K_ORDER=122;
	public static final int K_PARTITION=123;
	public static final int K_PASSWORD=124;
	public static final int K_PER=125;
	public static final int K_PERMISSION=126;
	public static final int K_PERMISSIONS=127;
	public static final int K_POSITIVE_INFINITY=128;
	public static final int K_POSITIVE_NAN=129;
	public static final int K_PRIMARY=130;
	public static final int K_RENAME=131;
	public static final int K_REPLACE=132;
	public static final int K_RETURNS=133;
	public static final int K_REVOKE=134;
	public static final int K_ROLE=135;
	public static final int K_ROLES=136;
	public static final int K_SCHEMA=137;
	public static final int K_SELECT=138;
	public static final int K_SET=139;
	public static final int K_SFUNC=140;
	public static final int K_SMALLINT=141;
	public static final int K_STATIC=142;
	public static final int K_STORAGE=143;
	public static final int K_STYPE=144;
	public static final int K_SUPERUSER=145;
	public static final int K_TABLES=146;
	public static final int K_TEXT=147;
	public static final int K_TIME=148;
	public static final int K_TIMESTAMP=149;
	public static final int K_TIMEUUID=150;
	public static final int K_TINYINT=151;
	public static final int K_TO=152;
	public static final int K_TOKEN=153;
	public static final int K_TRIGGER=154;
	public static final int K_TRUNCATE=155;
	public static final int K_TTL=156;
	public static final int K_TUPLE=157;
	public static final int K_TYPE=158;
	public static final int K_TYPES=159;
	public static final int K_UNLOGGED=160;
	public static final int K_UNSET=161;
	public static final int K_UPDATE=162;
	public static final int K_USE=163;
	public static final int K_USER=164;
	public static final int K_USERS=165;
	public static final int K_USING=166;
	public static final int K_UUID=167;
	public static final int K_VALUES=168;
	public static final int K_VARCHAR=169;
	public static final int K_VARINT=170;
	public static final int K_VIEW=171;
	public static final int K_WHERE=172;
	public static final int K_WITH=173;
	public static final int K_WRITETIME=174;
	public static final int L=175;
	public static final int LETTER=176;
	public static final int M=177;
	public static final int MULTILINE_COMMENT=178;
	public static final int N=179;
	public static final int O=180;
	public static final int P=181;
	public static final int Q=182;
	public static final int QMARK=183;
	public static final int QUOTED_NAME=184;
	public static final int R=185;
	public static final int RANGE=186;
	public static final int S=187;
	public static final int STRING_LITERAL=188;
	public static final int T=189;
	public static final int U=190;
	public static final int UUID=191;
	public static final int V=192;
	public static final int W=193;
	public static final int WS=194;
	public static final int X=195;
	public static final int Y=196;
	public static final int Z=197;

	// delegates
	public Cql_Parser gParser;
	public Parser[] getDelegates() {
		return new Parser[] {gParser};
	}

	// delegators


	public CqlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public CqlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		gParser = new Cql_Parser(input, state, this);
	}

	@Override public String[] getTokenNames() { return CqlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/kasm-user/Downloads/cassandra/src/antlr/Cql.g"; }


	    public void addErrorListener(ErrorListener listener)
	    {
	        gParser.addErrorListener(listener);
	    }

	    public void removeErrorListener(ErrorListener listener)
	    {
	        gParser.removeErrorListener(listener);
	    }

	    public void displayRecognitionError(String[] tokenNames, RecognitionException e)
	    {
	        gParser.displayRecognitionError(tokenNames, e);
	    }

	    protected void addRecognitionError(String msg)
	    {
	        gParser.addRecognitionError(msg);
	    }

	    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    // Recovery methods are overridden to avoid wasting work on recovering from errors when the result will be
	    // ignored anyway.
	    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	    @Override
	    protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException
	    {
	        throw new MismatchedTokenException(ttype, input);
	    }

	    @Override
	    public void recover(IntStream input, RecognitionException re)
	    {
	        // Do nothing.
	    }



	// $ANTLR start "query"
	// /home/kasm-user/Downloads/cassandra/src/antlr/Cql.g:132:1: query returns [CQLStatement.Raw stmnt] : st= cqlStatement ( ';' )* EOF ;
	public final CQLStatement.Raw query() throws RecognitionException {
		CQLStatement.Raw stmnt = null;


		CQLStatement.Raw st =null;

		try {
			// /home/kasm-user/Downloads/cassandra/src/antlr/Cql.g:133:5: (st= cqlStatement ( ';' )* EOF )
			// /home/kasm-user/Downloads/cassandra/src/antlr/Cql.g:133:7: st= cqlStatement ( ';' )* EOF
			{
			pushFollow(FOLLOW_cqlStatement_in_query77);
			st=cqlStatement();
			state._fsp--;

			// /home/kasm-user/Downloads/cassandra/src/antlr/Cql.g:133:23: ( ';' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==210) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/kasm-user/Downloads/cassandra/src/antlr/Cql.g:133:24: ';'
					{
					match(input,210,FOLLOW_210_in_query80); 
					}
					break;

				default :
					break loop1;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_query84); 
			 stmnt = st; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmnt;
	}
	// $ANTLR end "query"

	// Delegated rules
	public void dcPermission(DCPermissions.Builder builder) throws RecognitionException { gParser.dcPermission(builder); }

	public DropFunctionStatement.Raw dropFunctionStatement() throws RecognitionException { return gParser.dropFunctionStatement(); }

	public void tableColumns(CreateTableStatement.Raw stmt) throws RecognitionException { gParser.tableColumns(stmt); }

	public Term.Raw setOrMapLiteral(Term.Raw t) throws RecognitionException { return gParser.setOrMapLiteral(t); }

	public void ksName(QualifiedName name) throws RecognitionException { gParser.ksName(name); }

	public Selectable.Raw selectionTypeHint() throws RecognitionException { return gParser.selectionTypeHint(); }

	public void viewClusteringOrder(CreateViewStatement.Raw stmt) throws RecognitionException { gParser.viewClusteringOrder(stmt); }

	public Selectable.Raw selectionAddition() throws RecognitionException { return gParser.selectionAddition(); }

	public JMXResource jmxResource() throws RecognitionException { return gParser.jmxResource(); }

	public UTName userTypeName() throws RecognitionException { return gParser.userTypeName(); }

	public CreateRoleStatement createRoleStatement() throws RecognitionException { return gParser.createRoleStatement(); }

	public BatchStatement.Parsed batchStatement() throws RecognitionException { return gParser.batchStatement(); }

	public CreateTriggerStatement.Raw createTriggerStatement() throws RecognitionException { return gParser.createTriggerStatement(); }

	public Constants.Literal constant() throws RecognitionException { return gParser.constant(); }

	public RawSelector selector() throws RecognitionException { return gParser.selector(); }

	public Selectable.Raw selectionMap(Selectable.Raw k1) throws RecognitionException { return gParser.selectionMap(k1); }

	public Selectable.Raw selectionMultiplication() throws RecognitionException { return gParser.selectionMultiplication(); }

	public void cfName(QualifiedName name) throws RecognitionException { gParser.cfName(name); }

	public CreateIndexStatement.Raw createIndexStatement() throws RecognitionException { return gParser.createIndexStatement(); }

	public Tuples.Literal tupleLiteral() throws RecognitionException { return gParser.tupleLiteral(); }

	public Selectable.Raw selectionGroupWithoutField() throws RecognitionException { return gParser.selectionGroupWithoutField(); }

	public void tablePartitionKey(CreateTableStatement.Raw stmt) throws RecognitionException { gParser.tablePartitionKey(stmt); }

	public ColumnIdentifier cident() throws RecognitionException { return gParser.cident(); }

	public void collectionColumnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key, Term.Raw k) throws RecognitionException { gParser.collectionColumnOperation(operations, key, k); }

	public Term.Raw function() throws RecognitionException { return gParser.function(); }

	public Selectable.Raw simpleUnaliasedSelector() throws RecognitionException { return gParser.simpleUnaliasedSelector(); }

	public String basic_unreserved_keyword() throws RecognitionException { return gParser.basic_unreserved_keyword(); }

	public CQL3Type.Raw collection_type() throws RecognitionException { return gParser.collection_type(); }

	public Selectable.Raw selectionTupleOrNestedSelector() throws RecognitionException { return gParser.selectionTupleOrNestedSelector(); }

	public void tableProperty(CreateTableStatement.Raw stmt) throws RecognitionException { gParser.tableProperty(stmt); }

	public Term.Raw selectionLiteral() throws RecognitionException { return gParser.selectionLiteral(); }

	public List<RawSelector> selectors() throws RecognitionException { return gParser.selectors(); }

	public CreateKeyspaceStatement.Raw createKeyspaceStatement() throws RecognitionException { return gParser.createKeyspaceStatement(); }

	public void indexIdent(List<IndexTarget.Raw> targets) throws RecognitionException { gParser.indexIdent(targets); }

	public List<Term.Raw> singleColumnInValues() throws RecognitionException { return gParser.singleColumnInValues(); }

	public DropRoleStatement dropRoleStatement() throws RecognitionException { return gParser.dropRoleStatement(); }

	public Term.Raw termMultiplication() throws RecognitionException { return gParser.termMultiplication(); }

	public Cql_Parser.mbean_return mbean() throws RecognitionException { return gParser.mbean(); }

	public List<Selectable.Raw> selectionFunctionArgs() throws RecognitionException { return gParser.selectionFunctionArgs(); }

	public DropTableStatement.Raw dropTableStatement() throws RecognitionException { return gParser.dropTableStatement(); }

	public RoleName userOrRoleName() throws RecognitionException { return gParser.userOrRoleName(); }

	public GrantRoleStatement grantRoleStatement() throws RecognitionException { return gParser.grantRoleStatement(); }

	public DescribeStatement describeStatement() throws RecognitionException { return gParser.describeStatement(); }

	public void columnOperationDifferentiator(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key) throws RecognitionException { gParser.columnOperationDifferentiator(operations, key); }

	public RevokeRoleStatement revokeRoleStatement() throws RecognitionException { return gParser.revokeRoleStatement(); }

	public CQLStatement.Raw cqlStatement() throws RecognitionException { return gParser.cqlStatement(); }

	public Selectable.Raw unaliasedSelector() throws RecognitionException { return gParser.unaliasedSelector(); }

	public AlterTypeStatement.Raw alterTypeStatement() throws RecognitionException { return gParser.alterTypeStatement(); }

	public DropRoleStatement dropUserStatement() throws RecognitionException { return gParser.dropUserStatement(); }

	public Term.Raw intValue() throws RecognitionException { return gParser.intValue(); }

	public Selectable.Raw selectionMapOrSet() throws RecognitionException { return gParser.selectionMapOrSet(); }

	public RevokePermissionsStatement revokePermissionsStatement() throws RecognitionException { return gParser.revokePermissionsStatement(); }

	public void roleOption(RoleOptions opts, DCPermissions.Builder dcperms) throws RecognitionException { gParser.roleOption(opts, dcperms); }

	public IResource resource() throws RecognitionException { return gParser.resource(); }

	public void udtColumnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key, FieldIdentifier field) throws RecognitionException { gParser.udtColumnOperation(operations, key, field); }

	public FunctionResource functionResource() throws RecognitionException { return gParser.functionResource(); }

	public Operator relationType() throws RecognitionException { return gParser.relationType(); }

	public String unreserved_function_keyword() throws RecognitionException { return gParser.unreserved_function_keyword(); }

	public SelectStatement.RawStatement selectStatement() throws RecognitionException { return gParser.selectStatement(); }

	public TruncateStatement truncateStatement() throws RecognitionException { return gParser.truncateStatement(); }

	public void relationOrExpression(WhereClause.Builder clause) throws RecognitionException { gParser.relationOrExpression(clause); }

	public CreateViewStatement.Raw createMaterializedViewStatement() throws RecognitionException { return gParser.createMaterializedViewStatement(); }

	public AlterRoleStatement alterUserStatement() throws RecognitionException { return gParser.alterUserStatement(); }

	public QualifiedName columnFamilyName() throws RecognitionException { return gParser.columnFamilyName(); }

	public List<Operation.RawDeletion> deleteSelection() throws RecognitionException { return gParser.deleteSelection(); }

	public void roleOptions(RoleOptions opts, DCPermissions.Builder dcperms) throws RecognitionException { gParser.roleOptions(opts, dcperms); }

	public Tuples.INRaw inMarkerForTuple() throws RecognitionException { return gParser.inMarkerForTuple(); }

	public void typeColumns(CreateTypeStatement.Raw stmt) throws RecognitionException { gParser.typeColumns(stmt); }

	public UseStatement useStatement() throws RecognitionException { return gParser.useStatement(); }

	public AlterTableStatement.Raw alterTableStatement() throws RecognitionException { return gParser.alterTableStatement(); }

	public void userPassword(RoleOptions opts) throws RecognitionException { gParser.userPassword(opts); }

	public Tuples.Raw markerForTuple() throws RecognitionException { return gParser.markerForTuple(); }

	public FunctionName functionName() throws RecognitionException { return gParser.functionName(); }

	public CreateTableStatement.Raw createTableStatement() throws RecognitionException { return gParser.createTableStatement(); }

	public ListRolesStatement listUsersStatement() throws RecognitionException { return gParser.listUsersStatement(); }

	public void properties(PropertyDefinitions props) throws RecognitionException { gParser.properties(props); }

	public UpdateStatement.ParsedInsertJson jsonInsertStatement(QualifiedName qn) throws RecognitionException { return gParser.jsonInsertStatement(qn); }

	public void property(PropertyDefinitions props) throws RecognitionException { gParser.property(props); }

	public void tableClusteringOrder(CreateTableStatement.Raw stmt) throws RecognitionException { gParser.tableClusteringOrder(stmt); }

	public Term.Raw term() throws RecognitionException { return gParser.term(); }

	public ListRolesStatement listRolesStatement() throws RecognitionException { return gParser.listRolesStatement(); }

	public AlterKeyspaceStatement.Raw alterKeyspaceStatement() throws RecognitionException { return gParser.alterKeyspaceStatement(); }

	public String allowedFunctionName() throws RecognitionException { return gParser.allowedFunctionName(); }

	public void usingClauseObjective(Attributes.Raw attrs) throws RecognitionException { gParser.usingClauseObjective(attrs); }

	public DropKeyspaceStatement.Raw dropKeyspaceStatement() throws RecognitionException { return gParser.dropKeyspaceStatement(); }

	public AlterRoleStatement alterRoleStatement() throws RecognitionException { return gParser.alterRoleStatement(); }

	public AbstractMarker.INRaw inMarker() throws RecognitionException { return gParser.inMarker(); }

	public Term.Raw termGroup() throws RecognitionException { return gParser.termGroup(); }

	public Term.Raw mapLiteral(Term.Raw k) throws RecognitionException { return gParser.mapLiteral(k); }

	public UserTypes.Literal usertypeLiteral() throws RecognitionException { return gParser.usertypeLiteral(); }

	public Selectable.Raw selectionList() throws RecognitionException { return gParser.selectionList(); }

	public List<Term.Raw> functionArgs() throws RecognitionException { return gParser.functionArgs(); }

	public QualifiedName indexName() throws RecognitionException { return gParser.indexName(); }

	public DropTriggerStatement.Raw dropTriggerStatement() throws RecognitionException { return gParser.dropTriggerStatement(); }

	public ColumnIdentifier non_type_ident() throws RecognitionException { return gParser.non_type_ident(); }

	public AlterViewStatement.Raw alterMaterializedViewStatement() throws RecognitionException { return gParser.alterMaterializedViewStatement(); }

	public String propertyValue() throws RecognitionException { return gParser.propertyValue(); }

	public void relation(WhereClause.Builder clauses) throws RecognitionException { gParser.relation(clauses); }

	public void normalColumnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key) throws RecognitionException { gParser.normalColumnOperation(operations, key); }

	public DataResource dataResource() throws RecognitionException { return gParser.dataResource(); }

	public Term.Raw setLiteral(Term.Raw t) throws RecognitionException { return gParser.setLiteral(t); }

	public FieldIdentifier fident() throws RecognitionException { return gParser.fident(); }

	public String keyspaceName() throws RecognitionException { return gParser.keyspaceName(); }

	public void viewPrimaryKey(CreateViewStatement.Raw stmt) throws RecognitionException { gParser.viewPrimaryKey(stmt); }

	public Selectable.Raw selectionGroup() throws RecognitionException { return gParser.selectionGroup(); }

	public DropIndexStatement.Raw dropIndexStatement() throws RecognitionException { return gParser.dropIndexStatement(); }

	public ModificationStatement.Parsed batchStatementObjective() throws RecognitionException { return gParser.batchStatementObjective(); }

	public Selectable.Raw selectionSet(Selectable.Raw t1) throws RecognitionException { return gParser.selectionSet(t1); }

	public CreateTypeStatement.Raw createTypeStatement() throws RecognitionException { return gParser.createTypeStatement(); }

	public ModificationStatement.Parsed insertStatement() throws RecognitionException { return gParser.insertStatement(); }

	public DropViewStatement.Raw dropMaterializedViewStatement() throws RecognitionException { return gParser.dropMaterializedViewStatement(); }

	public void tableDefinition(CreateTableStatement.Raw stmt) throws RecognitionException { gParser.tableDefinition(stmt); }

	public CQL3Type native_type() throws RecognitionException { return gParser.native_type(); }

	public CQL3Type.Raw tuple_type() throws RecognitionException { return gParser.tuple_type(); }

	public CreateAggregateStatement.Raw createAggregateStatement() throws RecognitionException { return gParser.createAggregateStatement(); }

	public Cql_Parser.selectClause_return selectClause() throws RecognitionException { return gParser.selectClause(); }

	public void idxName(QualifiedName name) throws RecognitionException { gParser.idxName(name); }

	public void columnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations) throws RecognitionException { gParser.columnOperation(operations); }

	public Cql_Parser.username_return username() throws RecognitionException { return gParser.username(); }

	public void orderByClause(Map<ColumnIdentifier, Boolean> orderings) throws RecognitionException { gParser.orderByClause(orderings); }

	public Selectable.Raw fieldSelectorModifier(Selectable.Raw receiver) throws RecognitionException { return gParser.fieldSelectorModifier(receiver); }

	public Term.Raw simpleTerm() throws RecognitionException { return gParser.simpleTerm(); }

	public Term.Raw collectionLiteral() throws RecognitionException { return gParser.collectionLiteral(); }

	public Json.Raw jsonValue() throws RecognitionException { return gParser.jsonValue(); }

	public Maps.Literal fullMapLiteral() throws RecognitionException { return gParser.fullMapLiteral(); }

	public GrantPermissionsStatement grantPermissionsStatement() throws RecognitionException { return gParser.grantPermissionsStatement(); }

	public RoleResource roleResource() throws RecognitionException { return gParser.roleResource(); }

	public ColumnIdentifier ident() throws RecognitionException { return gParser.ident(); }

	public DropTypeStatement.Raw dropTypeStatement() throws RecognitionException { return gParser.dropTypeStatement(); }

	public Set<Permission> permissionOrAll() throws RecognitionException { return gParser.permissionOrAll(); }

	public CQL3Type.Raw comparatorType() throws RecognitionException { return gParser.comparatorType(); }

	public void viewProperty(CreateViewStatement.Raw stmt) throws RecognitionException { gParser.viewProperty(stmt); }

	public ColumnIdentifier noncol_ident() throws RecognitionException { return gParser.noncol_ident(); }

	public Term.Raw value() throws RecognitionException { return gParser.value(); }

	public UpdateStatement.ParsedUpdate updateStatement() throws RecognitionException { return gParser.updateStatement(); }

	public void shorthandColumnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key) throws RecognitionException { gParser.shorthandColumnOperation(operations, key); }

	public Term.Raw listLiteral() throws RecognitionException { return gParser.listLiteral(); }

	public Selectable.Raw collectionSubSelection(Selectable.Raw receiver) throws RecognitionException { return gParser.collectionSubSelection(receiver); }

	public Selectable.RawIdentifier sident() throws RecognitionException { return gParser.sident(); }

	public List<ColumnIdentifier> tupleOfIdentifiers() throws RecognitionException { return gParser.tupleOfIdentifiers(); }

	public List<Tuples.Literal> tupleOfTupleLiterals() throws RecognitionException { return gParser.tupleOfTupleLiterals(); }

	public Permission permission() throws RecognitionException { return gParser.permission(); }

	public Selectable.Raw selectionGroupWithField() throws RecognitionException { return gParser.selectionGroupWithField(); }

	public List<Tuples.Raw> tupleOfMarkersForTuples() throws RecognitionException { return gParser.tupleOfMarkersForTuples(); }

	public CreateRoleStatement createUserStatement() throws RecognitionException { return gParser.createUserStatement(); }

	public Term.Raw termAddition() throws RecognitionException { return gParser.termAddition(); }

	public DeleteStatement.Parsed deleteStatement() throws RecognitionException { return gParser.deleteStatement(); }

	public void roleName(RoleName name) throws RecognitionException { gParser.roleName(name); }

	public CreateFunctionStatement.Raw createFunctionStatement() throws RecognitionException { return gParser.createFunctionStatement(); }

	public void groupByClause(List<ColumnIdentifier> groups) throws RecognitionException { gParser.groupByClause(groups); }

	public UpdateStatement.ParsedInsert normalInsertStatement(QualifiedName qn) throws RecognitionException { return gParser.normalInsertStatement(qn); }

	public WhereClause.Builder whereClause() throws RecognitionException { return gParser.whereClause(); }

	public boolean isStaticColumn() throws RecognitionException { return gParser.isStaticColumn(); }

	public void columnCondition(List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions) throws RecognitionException { gParser.columnCondition(conditions); }

	public Selectable.Raw selectionFunction() throws RecognitionException { return gParser.selectionFunction(); }

	public Operator containsOperator() throws RecognitionException { return gParser.containsOperator(); }

	public void usingClause(Attributes.Raw attrs) throws RecognitionException { gParser.usingClause(attrs); }

	public DropAggregateStatement.Raw dropAggregateStatement() throws RecognitionException { return gParser.dropAggregateStatement(); }

	public Operation.RawDeletion deleteOp() throws RecognitionException { return gParser.deleteOp(); }

	public ListPermissionsStatement listPermissionsStatement() throws RecognitionException { return gParser.listPermissionsStatement(); }

	public String unreserved_keyword() throws RecognitionException { return gParser.unreserved_keyword(); }

	public void usingClauseDelete(Attributes.Raw attrs) throws RecognitionException { gParser.usingClauseDelete(attrs); }

	public void viewPartitionKey(CreateViewStatement.Raw stmt) throws RecognitionException { gParser.viewPartitionKey(stmt); }

	public Selectable.Raw selectorModifier(Selectable.Raw receiver) throws RecognitionException { return gParser.selectorModifier(receiver); }

	public void customIndexExpression(WhereClause.Builder clause) throws RecognitionException { gParser.customIndexExpression(clause); }

	public List<Pair<ColumnIdentifier, ColumnCondition.Raw>> updateConditions() throws RecognitionException { return gParser.updateConditions(); }



	public static final BitSet FOLLOW_cqlStatement_in_query77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_210_in_query80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_EOF_in_query84 = new BitSet(new long[]{0x0000000000000002L});
}
