// $ANTLR 3.5.2 Parser.g 2023-08-16 17:39:16

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
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class Cql_Parser extends Parser {
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators
	public CqlParser gCql;
	public CqlParser gParent;


	public Cql_Parser(TokenStream input, CqlParser gCql) {
		this(input, new RecognizerSharedState(), gCql);
	}
	public Cql_Parser(TokenStream input, RecognizerSharedState state, CqlParser gCql) {
		super(input, state);
		this.gCql = gCql;
		gParent = gCql;
	}

	@Override public String[] getTokenNames() { return CqlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Parser.g"; }


	    private final List<ErrorListener> listeners = new ArrayList<ErrorListener>();
	    protected final List<ColumnIdentifier> bindVariables = new ArrayList<ColumnIdentifier>();

	    public static final Set<String> reservedTypeNames = new HashSet<String>()
	    {{
	        add("byte");
	        add("complex");
	        add("enum");
	        add("date");
	        add("interval");
	        add("macaddr");
	        add("bitstring");
	    }};

	    public AbstractMarker.Raw newBindVariables(ColumnIdentifier name)
	    {
	        AbstractMarker.Raw marker = new AbstractMarker.Raw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public AbstractMarker.INRaw newINBindVariables(ColumnIdentifier name)
	    {
	        AbstractMarker.INRaw marker = new AbstractMarker.INRaw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public Tuples.Raw newTupleBindVariables(ColumnIdentifier name)
	    {
	        Tuples.Raw marker = new Tuples.Raw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public Tuples.INRaw newTupleINBindVariables(ColumnIdentifier name)
	    {
	        Tuples.INRaw marker = new Tuples.INRaw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public Json.Marker newJsonBindVariables(ColumnIdentifier name)
	    {
	        Json.Marker marker = new Json.Marker(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public void addErrorListener(ErrorListener listener)
	    {
	        this.listeners.add(listener);
	    }

	    public void removeErrorListener(ErrorListener listener)
	    {
	        this.listeners.remove(listener);
	    }

	    public void displayRecognitionError(String[] tokenNames, RecognitionException e)
	    {
	        for (int i = 0, m = listeners.size(); i < m; i++)
	            listeners.get(i).syntaxError(this, tokenNames, e);
	    }

	    protected void addRecognitionError(String msg)
	    {
	        for (int i = 0, m = listeners.size(); i < m; i++)
	            listeners.get(i).syntaxError(this, msg);
	    }

	    public Map<String, String> convertPropertyMap(Maps.Literal map)
	    {
	        if (map == null || map.entries == null || map.entries.isEmpty())
	            return Collections.<String, String>emptyMap();

	        Map<String, String> res = new HashMap<>(map.entries.size());

	        for (Pair<Term.Raw, Term.Raw> entry : map.entries)
	        {
	            // Because the parser tries to be smart and recover on error (to
	            // allow displaying more than one error I suppose), we have null
	            // entries in there. Just skip those, a proper error will be thrown in the end.
	            if (entry.left == null || entry.right == null)
	                break;

	            if (!(entry.left instanceof Constants.Literal))
	            {
	                String msg = "Invalid property name: " + entry.left;
	                if (entry.left instanceof AbstractMarker.Raw)
	                    msg += " (bind variables are not supported in DDL queries)";
	                addRecognitionError(msg);
	                break;
	            }
	            if (!(entry.right instanceof Constants.Literal))
	            {
	                String msg = "Invalid property value: " + entry.right + " for property: " + entry.left;
	                if (entry.right instanceof AbstractMarker.Raw)
	                    msg += " (bind variables are not supported in DDL queries)";
	                addRecognitionError(msg);
	                break;
	            }

	            if (res.put(((Constants.Literal)entry.left).getRawText(), ((Constants.Literal)entry.right).getRawText()) != null)
	            {
	                addRecognitionError(String.format("Multiple definition for property " + ((Constants.Literal)entry.left).getRawText()));
	            }
	        }

	        return res;
	    }

	    public void addRawUpdate(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key, Operation.RawUpdate update)
	    {
	        for (Pair<ColumnIdentifier, Operation.RawUpdate> p : operations)
	        {
	            if (p.left.equals(key) && !p.right.isCompatibleWith(update))
	                addRecognitionError("Multiple incompatible setting of column " + key);
	        }
	        operations.add(Pair.create(key, update));
	    }

	    public Set<Permission> filterPermissions(Set<Permission> permissions, IResource resource)
	    {
	        if (resource == null)
	            return Collections.emptySet();
	        Set<Permission> filtered = new HashSet<>(permissions);
	        filtered.retainAll(resource.applicablePermissions());
	        if (filtered.isEmpty())
	            addRecognitionError("Resource type " + resource.getClass().getSimpleName() +
	                                    " does not support any of the requested permissions");

	        return filtered;
	    }

	    public String canonicalizeObjectName(String s, boolean enforcePattern)
	    {
	        // these two conditions are here because technically they are valid
	        // ObjectNames, but we want to restrict their use without adding unnecessary
	        // work to JMXResource construction as that also happens on hotter code paths
	        if ("".equals(s))
	            addRecognitionError("Empty JMX object name supplied");

	        if ("*:*".equals(s))
	            addRecognitionError("Please use ALL MBEANS instead of wildcard pattern");

	        try
	        {
	            javax.management.ObjectName objectName = javax.management.ObjectName.getInstance(s);
	            if (enforcePattern && !objectName.isPattern())
	                addRecognitionError("Plural form used, but non-pattern JMX object name specified (" + s + ")");
	            return objectName.getCanonicalName();
	        }
	        catch (javax.management.MalformedObjectNameException e)
	        {
	          addRecognitionError(s + " is not a valid JMX object name");
	          return s;
	        }
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



	// $ANTLR start "cqlStatement"
	// Parser.g:207:1: cqlStatement returns [CQLStatement.Raw stmt] : (st1= selectStatement |st2= insertStatement |st3= updateStatement |st4= batchStatement |st5= deleteStatement |st6= useStatement |st7= truncateStatement |st8= createKeyspaceStatement |st9= createTableStatement |st10= createIndexStatement |st11= dropKeyspaceStatement |st12= dropTableStatement |st13= dropIndexStatement |st14= alterTableStatement |st15= alterKeyspaceStatement |st16= grantPermissionsStatement |st17= revokePermissionsStatement |st18= listPermissionsStatement |st19= createUserStatement |st20= alterUserStatement |st21= dropUserStatement |st22= listUsersStatement |st23= createTriggerStatement |st24= dropTriggerStatement |st25= createTypeStatement |st26= alterTypeStatement |st27= dropTypeStatement |st28= createFunctionStatement |st29= dropFunctionStatement |st30= createAggregateStatement |st31= dropAggregateStatement |st32= createRoleStatement |st33= alterRoleStatement |st34= dropRoleStatement |st35= listRolesStatement |st36= grantRoleStatement |st37= revokeRoleStatement |st38= createMaterializedViewStatement |st39= dropMaterializedViewStatement |st40= alterMaterializedViewStatement |st41= describeStatement );
	public final CQLStatement.Raw cqlStatement() throws RecognitionException {
		CQLStatement.Raw stmt = null;


		SelectStatement.RawStatement st1 =null;
		ModificationStatement.Parsed st2 =null;
		UpdateStatement.ParsedUpdate st3 =null;
		BatchStatement.Parsed st4 =null;
		DeleteStatement.Parsed st5 =null;
		UseStatement st6 =null;
		TruncateStatement st7 =null;
		CreateKeyspaceStatement.Raw st8 =null;
		CreateTableStatement.Raw st9 =null;
		CreateIndexStatement.Raw st10 =null;
		DropKeyspaceStatement.Raw st11 =null;
		DropTableStatement.Raw st12 =null;
		DropIndexStatement.Raw st13 =null;
		AlterTableStatement.Raw st14 =null;
		AlterKeyspaceStatement.Raw st15 =null;
		GrantPermissionsStatement st16 =null;
		RevokePermissionsStatement st17 =null;
		ListPermissionsStatement st18 =null;
		CreateRoleStatement st19 =null;
		AlterRoleStatement st20 =null;
		DropRoleStatement st21 =null;
		ListRolesStatement st22 =null;
		CreateTriggerStatement.Raw st23 =null;
		DropTriggerStatement.Raw st24 =null;
		CreateTypeStatement.Raw st25 =null;
		AlterTypeStatement.Raw st26 =null;
		DropTypeStatement.Raw st27 =null;
		CreateFunctionStatement.Raw st28 =null;
		DropFunctionStatement.Raw st29 =null;
		CreateAggregateStatement.Raw st30 =null;
		DropAggregateStatement.Raw st31 =null;
		CreateRoleStatement st32 =null;
		AlterRoleStatement st33 =null;
		DropRoleStatement st34 =null;
		ListRolesStatement st35 =null;
		GrantRoleStatement st36 =null;
		RevokeRoleStatement st37 =null;
		CreateViewStatement.Raw st38 =null;
		DropViewStatement.Raw st39 =null;
		AlterViewStatement.Raw st40 =null;
		DescribeStatement st41 =null;

		try {
			// Parser.g:209:5: (st1= selectStatement |st2= insertStatement |st3= updateStatement |st4= batchStatement |st5= deleteStatement |st6= useStatement |st7= truncateStatement |st8= createKeyspaceStatement |st9= createTableStatement |st10= createIndexStatement |st11= dropKeyspaceStatement |st12= dropTableStatement |st13= dropIndexStatement |st14= alterTableStatement |st15= alterKeyspaceStatement |st16= grantPermissionsStatement |st17= revokePermissionsStatement |st18= listPermissionsStatement |st19= createUserStatement |st20= alterUserStatement |st21= dropUserStatement |st22= listUsersStatement |st23= createTriggerStatement |st24= dropTriggerStatement |st25= createTypeStatement |st26= alterTypeStatement |st27= dropTypeStatement |st28= createFunctionStatement |st29= dropFunctionStatement |st30= createAggregateStatement |st31= dropAggregateStatement |st32= createRoleStatement |st33= alterRoleStatement |st34= dropRoleStatement |st35= listRolesStatement |st36= grantRoleStatement |st37= revokeRoleStatement |st38= createMaterializedViewStatement |st39= dropMaterializedViewStatement |st40= alterMaterializedViewStatement |st41= describeStatement )
			int alt1=41;
			alt1 = dfa1.predict(input);
			switch (alt1) {
				case 1 :
					// Parser.g:209:7: st1= selectStatement
					{
					pushFollow(FOLLOW_selectStatement_in_cqlStatement59);
					st1=selectStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st1; }
					}
					break;
				case 2 :
					// Parser.g:210:7: st2= insertStatement
					{
					pushFollow(FOLLOW_insertStatement_in_cqlStatement88);
					st2=insertStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st2; }
					}
					break;
				case 3 :
					// Parser.g:211:7: st3= updateStatement
					{
					pushFollow(FOLLOW_updateStatement_in_cqlStatement117);
					st3=updateStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st3; }
					}
					break;
				case 4 :
					// Parser.g:212:7: st4= batchStatement
					{
					pushFollow(FOLLOW_batchStatement_in_cqlStatement146);
					st4=batchStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st4; }
					}
					break;
				case 5 :
					// Parser.g:213:7: st5= deleteStatement
					{
					pushFollow(FOLLOW_deleteStatement_in_cqlStatement176);
					st5=deleteStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st5; }
					}
					break;
				case 6 :
					// Parser.g:214:7: st6= useStatement
					{
					pushFollow(FOLLOW_useStatement_in_cqlStatement205);
					st6=useStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st6; }
					}
					break;
				case 7 :
					// Parser.g:215:7: st7= truncateStatement
					{
					pushFollow(FOLLOW_truncateStatement_in_cqlStatement237);
					st7=truncateStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st7; }
					}
					break;
				case 8 :
					// Parser.g:216:7: st8= createKeyspaceStatement
					{
					pushFollow(FOLLOW_createKeyspaceStatement_in_cqlStatement264);
					st8=createKeyspaceStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st8; }
					}
					break;
				case 9 :
					// Parser.g:217:7: st9= createTableStatement
					{
					pushFollow(FOLLOW_createTableStatement_in_cqlStatement285);
					st9=createTableStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st9; }
					}
					break;
				case 10 :
					// Parser.g:218:7: st10= createIndexStatement
					{
					pushFollow(FOLLOW_createIndexStatement_in_cqlStatement308);
					st10=createIndexStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st10; }
					}
					break;
				case 11 :
					// Parser.g:219:7: st11= dropKeyspaceStatement
					{
					pushFollow(FOLLOW_dropKeyspaceStatement_in_cqlStatement331);
					st11=dropKeyspaceStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st11; }
					}
					break;
				case 12 :
					// Parser.g:220:7: st12= dropTableStatement
					{
					pushFollow(FOLLOW_dropTableStatement_in_cqlStatement353);
					st12=dropTableStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st12; }
					}
					break;
				case 13 :
					// Parser.g:221:7: st13= dropIndexStatement
					{
					pushFollow(FOLLOW_dropIndexStatement_in_cqlStatement378);
					st13=dropIndexStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st13; }
					}
					break;
				case 14 :
					// Parser.g:222:7: st14= alterTableStatement
					{
					pushFollow(FOLLOW_alterTableStatement_in_cqlStatement403);
					st14=alterTableStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st14; }
					}
					break;
				case 15 :
					// Parser.g:223:7: st15= alterKeyspaceStatement
					{
					pushFollow(FOLLOW_alterKeyspaceStatement_in_cqlStatement427);
					st15=alterKeyspaceStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st15; }
					}
					break;
				case 16 :
					// Parser.g:224:7: st16= grantPermissionsStatement
					{
					pushFollow(FOLLOW_grantPermissionsStatement_in_cqlStatement448);
					st16=grantPermissionsStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st16; }
					}
					break;
				case 17 :
					// Parser.g:225:7: st17= revokePermissionsStatement
					{
					pushFollow(FOLLOW_revokePermissionsStatement_in_cqlStatement466);
					st17=revokePermissionsStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st17; }
					}
					break;
				case 18 :
					// Parser.g:226:7: st18= listPermissionsStatement
					{
					pushFollow(FOLLOW_listPermissionsStatement_in_cqlStatement483);
					st18=listPermissionsStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st18; }
					}
					break;
				case 19 :
					// Parser.g:227:7: st19= createUserStatement
					{
					pushFollow(FOLLOW_createUserStatement_in_cqlStatement502);
					st19=createUserStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st19; }
					}
					break;
				case 20 :
					// Parser.g:228:7: st20= alterUserStatement
					{
					pushFollow(FOLLOW_alterUserStatement_in_cqlStatement526);
					st20=alterUserStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st20; }
					}
					break;
				case 21 :
					// Parser.g:229:7: st21= dropUserStatement
					{
					pushFollow(FOLLOW_dropUserStatement_in_cqlStatement551);
					st21=dropUserStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st21; }
					}
					break;
				case 22 :
					// Parser.g:230:7: st22= listUsersStatement
					{
					pushFollow(FOLLOW_listUsersStatement_in_cqlStatement577);
					st22=listUsersStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st22; }
					}
					break;
				case 23 :
					// Parser.g:231:7: st23= createTriggerStatement
					{
					pushFollow(FOLLOW_createTriggerStatement_in_cqlStatement602);
					st23=createTriggerStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st23; }
					}
					break;
				case 24 :
					// Parser.g:232:7: st24= dropTriggerStatement
					{
					pushFollow(FOLLOW_dropTriggerStatement_in_cqlStatement623);
					st24=dropTriggerStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st24; }
					}
					break;
				case 25 :
					// Parser.g:233:7: st25= createTypeStatement
					{
					pushFollow(FOLLOW_createTypeStatement_in_cqlStatement646);
					st25=createTypeStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st25; }
					}
					break;
				case 26 :
					// Parser.g:234:7: st26= alterTypeStatement
					{
					pushFollow(FOLLOW_alterTypeStatement_in_cqlStatement670);
					st26=alterTypeStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st26; }
					}
					break;
				case 27 :
					// Parser.g:235:7: st27= dropTypeStatement
					{
					pushFollow(FOLLOW_dropTypeStatement_in_cqlStatement695);
					st27=dropTypeStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st27; }
					}
					break;
				case 28 :
					// Parser.g:236:7: st28= createFunctionStatement
					{
					pushFollow(FOLLOW_createFunctionStatement_in_cqlStatement721);
					st28=createFunctionStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st28; }
					}
					break;
				case 29 :
					// Parser.g:237:7: st29= dropFunctionStatement
					{
					pushFollow(FOLLOW_dropFunctionStatement_in_cqlStatement741);
					st29=dropFunctionStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st29; }
					}
					break;
				case 30 :
					// Parser.g:238:7: st30= createAggregateStatement
					{
					pushFollow(FOLLOW_createAggregateStatement_in_cqlStatement763);
					st30=createAggregateStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st30; }
					}
					break;
				case 31 :
					// Parser.g:239:7: st31= dropAggregateStatement
					{
					pushFollow(FOLLOW_dropAggregateStatement_in_cqlStatement782);
					st31=dropAggregateStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st31; }
					}
					break;
				case 32 :
					// Parser.g:240:7: st32= createRoleStatement
					{
					pushFollow(FOLLOW_createRoleStatement_in_cqlStatement803);
					st32=createRoleStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st32; }
					}
					break;
				case 33 :
					// Parser.g:241:7: st33= alterRoleStatement
					{
					pushFollow(FOLLOW_alterRoleStatement_in_cqlStatement827);
					st33=alterRoleStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st33; }
					}
					break;
				case 34 :
					// Parser.g:242:7: st34= dropRoleStatement
					{
					pushFollow(FOLLOW_dropRoleStatement_in_cqlStatement852);
					st34=dropRoleStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st34; }
					}
					break;
				case 35 :
					// Parser.g:243:7: st35= listRolesStatement
					{
					pushFollow(FOLLOW_listRolesStatement_in_cqlStatement878);
					st35=listRolesStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st35; }
					}
					break;
				case 36 :
					// Parser.g:244:7: st36= grantRoleStatement
					{
					pushFollow(FOLLOW_grantRoleStatement_in_cqlStatement903);
					st36=grantRoleStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st36; }
					}
					break;
				case 37 :
					// Parser.g:245:7: st37= revokeRoleStatement
					{
					pushFollow(FOLLOW_revokeRoleStatement_in_cqlStatement928);
					st37=revokeRoleStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st37; }
					}
					break;
				case 38 :
					// Parser.g:246:7: st38= createMaterializedViewStatement
					{
					pushFollow(FOLLOW_createMaterializedViewStatement_in_cqlStatement952);
					st38=createMaterializedViewStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st38; }
					}
					break;
				case 39 :
					// Parser.g:247:7: st39= dropMaterializedViewStatement
					{
					pushFollow(FOLLOW_dropMaterializedViewStatement_in_cqlStatement964);
					st39=dropMaterializedViewStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st39; }
					}
					break;
				case 40 :
					// Parser.g:248:7: st40= alterMaterializedViewStatement
					{
					pushFollow(FOLLOW_alterMaterializedViewStatement_in_cqlStatement978);
					st40=alterMaterializedViewStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st40; }
					}
					break;
				case 41 :
					// Parser.g:249:7: st41= describeStatement
					{
					pushFollow(FOLLOW_describeStatement_in_cqlStatement991);
					st41=describeStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = st41; }
					}
					break;

			}
			if ( state.backtracking==0 ) { if (stmt != null) stmt.setBindVariables(bindVariables); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "cqlStatement"



	// $ANTLR start "useStatement"
	// Parser.g:255:1: useStatement returns [UseStatement stmt] : K_USE ks= keyspaceName ;
	public final UseStatement useStatement() throws RecognitionException {
		UseStatement stmt = null;


		String ks =null;

		try {
			// Parser.g:256:5: ( K_USE ks= keyspaceName )
			// Parser.g:256:7: K_USE ks= keyspaceName
			{
			match(input,K_USE,FOLLOW_K_USE_in_useStatement1030); if (state.failed) return stmt;
			pushFollow(FOLLOW_keyspaceName_in_useStatement1034);
			ks=keyspaceName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new UseStatement(ks); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "useStatement"



	// $ANTLR start "selectStatement"
	// Parser.g:265:1: selectStatement returns [SelectStatement.RawStatement expr] : K_SELECT ( ( K_JSON selectClause )=> K_JSON )? sclause= selectClause K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_GROUP K_BY groupByClause[groups] ( ',' groupByClause[groups] )* )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_PER K_PARTITION K_LIMIT rows= intValue )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )? ;
	public final SelectStatement.RawStatement selectStatement() throws RecognitionException {
		SelectStatement.RawStatement expr = null;


		ParserRuleReturnScope sclause =null;
		QualifiedName cf =null;
		WhereClause.Builder wclause =null;
		Term.Raw rows =null;


		        Term.Raw limit = null;
		        Term.Raw perPartitionLimit = null;
		        Map<ColumnIdentifier, Boolean> orderings = new LinkedHashMap<>();
		        List<ColumnIdentifier> groups = new ArrayList<>();
		        boolean allowFiltering = false;
		        boolean isJson = false;
		    
		try {
			// Parser.g:274:5: ( K_SELECT ( ( K_JSON selectClause )=> K_JSON )? sclause= selectClause K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_GROUP K_BY groupByClause[groups] ( ',' groupByClause[groups] )* )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_PER K_PARTITION K_LIMIT rows= intValue )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )? )
			// Parser.g:274:7: K_SELECT ( ( K_JSON selectClause )=> K_JSON )? sclause= selectClause K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_GROUP K_BY groupByClause[groups] ( ',' groupByClause[groups] )* )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_PER K_PARTITION K_LIMIT rows= intValue )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )?
			{
			match(input,K_SELECT,FOLLOW_K_SELECT_in_selectStatement1068); if (state.failed) return expr;
			// Parser.g:276:7: ( ( K_JSON selectClause )=> K_JSON )?
			int alt2=2;
			alt2 = dfa2.predict(input);
			switch (alt2) {
				case 1 :
					// Parser.g:276:9: ( K_JSON selectClause )=> K_JSON
					{
					match(input,K_JSON,FOLLOW_K_JSON_in_selectStatement1094); if (state.failed) return expr;
					if ( state.backtracking==0 ) { isJson = true; }
					}
					break;

			}

			pushFollow(FOLLOW_selectClause_in_selectStatement1103);
			sclause=selectClause();
			state._fsp--;
			if (state.failed) return expr;
			match(input,K_FROM,FOLLOW_K_FROM_in_selectStatement1111); if (state.failed) return expr;
			pushFollow(FOLLOW_columnFamilyName_in_selectStatement1115);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:278:7: ( K_WHERE wclause= whereClause )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==K_WHERE) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// Parser.g:278:9: K_WHERE wclause= whereClause
					{
					match(input,K_WHERE,FOLLOW_K_WHERE_in_selectStatement1125); if (state.failed) return expr;
					pushFollow(FOLLOW_whereClause_in_selectStatement1129);
					wclause=whereClause();
					state._fsp--;
					if (state.failed) return expr;
					}
					break;

			}

			// Parser.g:279:7: ( K_GROUP K_BY groupByClause[groups] ( ',' groupByClause[groups] )* )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==K_GROUP) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Parser.g:279:9: K_GROUP K_BY groupByClause[groups] ( ',' groupByClause[groups] )*
					{
					match(input,K_GROUP,FOLLOW_K_GROUP_in_selectStatement1142); if (state.failed) return expr;
					match(input,K_BY,FOLLOW_K_BY_in_selectStatement1144); if (state.failed) return expr;
					pushFollow(FOLLOW_groupByClause_in_selectStatement1146);
					groupByClause(groups);
					state._fsp--;
					if (state.failed) return expr;
					// Parser.g:279:44: ( ',' groupByClause[groups] )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==204) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// Parser.g:279:46: ',' groupByClause[groups]
							{
							match(input,204,FOLLOW_204_in_selectStatement1151); if (state.failed) return expr;
							pushFollow(FOLLOW_groupByClause_in_selectStatement1153);
							groupByClause(groups);
							state._fsp--;
							if (state.failed) return expr;
							}
							break;

						default :
							break loop4;
						}
					}

					}
					break;

			}

			// Parser.g:280:7: ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==K_ORDER) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// Parser.g:280:9: K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )*
					{
					match(input,K_ORDER,FOLLOW_K_ORDER_in_selectStatement1170); if (state.failed) return expr;
					match(input,K_BY,FOLLOW_K_BY_in_selectStatement1172); if (state.failed) return expr;
					pushFollow(FOLLOW_orderByClause_in_selectStatement1174);
					orderByClause(orderings);
					state._fsp--;
					if (state.failed) return expr;
					// Parser.g:280:47: ( ',' orderByClause[orderings] )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==204) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// Parser.g:280:49: ',' orderByClause[orderings]
							{
							match(input,204,FOLLOW_204_in_selectStatement1179); if (state.failed) return expr;
							pushFollow(FOLLOW_orderByClause_in_selectStatement1181);
							orderByClause(orderings);
							state._fsp--;
							if (state.failed) return expr;
							}
							break;

						default :
							break loop6;
						}
					}

					}
					break;

			}

			// Parser.g:281:7: ( K_PER K_PARTITION K_LIMIT rows= intValue )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==K_PER) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// Parser.g:281:9: K_PER K_PARTITION K_LIMIT rows= intValue
					{
					match(input,K_PER,FOLLOW_K_PER_in_selectStatement1198); if (state.failed) return expr;
					match(input,K_PARTITION,FOLLOW_K_PARTITION_in_selectStatement1200); if (state.failed) return expr;
					match(input,K_LIMIT,FOLLOW_K_LIMIT_in_selectStatement1202); if (state.failed) return expr;
					pushFollow(FOLLOW_intValue_in_selectStatement1206);
					rows=intValue();
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { perPartitionLimit = rows; }
					}
					break;

			}

			// Parser.g:282:7: ( K_LIMIT rows= intValue )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==K_LIMIT) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// Parser.g:282:9: K_LIMIT rows= intValue
					{
					match(input,K_LIMIT,FOLLOW_K_LIMIT_in_selectStatement1221); if (state.failed) return expr;
					pushFollow(FOLLOW_intValue_in_selectStatement1225);
					rows=intValue();
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { limit = rows; }
					}
					break;

			}

			// Parser.g:283:7: ( K_ALLOW K_FILTERING )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==K_ALLOW) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// Parser.g:283:9: K_ALLOW K_FILTERING
					{
					match(input,K_ALLOW,FOLLOW_K_ALLOW_in_selectStatement1240); if (state.failed) return expr;
					match(input,K_FILTERING,FOLLOW_K_FILTERING_in_selectStatement1242); if (state.failed) return expr;
					if ( state.backtracking==0 ) { allowFiltering = true; }
					}
					break;

			}

			if ( state.backtracking==0 ) {
			          SelectStatement.Parameters params = new SelectStatement.Parameters(orderings,
			                                                                             groups,
			                                                                             (sclause!=null?((Cql_Parser.selectClause_return)sclause).isDistinct:false),
			                                                                             allowFiltering,
			                                                                             isJson);
			          WhereClause where = wclause == null ? WhereClause.empty() : wclause.build();
			          expr = new SelectStatement.RawStatement(cf, params, (sclause!=null?((Cql_Parser.selectClause_return)sclause).selectors:null), where, limit, perPartitionLimit);
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "selectStatement"


	public static class selectClause_return extends ParserRuleReturnScope {
		public boolean isDistinct;
		public List<RawSelector> selectors;
	};


	// $ANTLR start "selectClause"
	// Parser.g:295:1: selectClause returns [boolean isDistinct, List<RawSelector> selectors] : ( ( K_DISTINCT selectors )=> K_DISTINCT s= selectors |s= selectors );
	public final Cql_Parser.selectClause_return selectClause() throws RecognitionException {
		Cql_Parser.selectClause_return retval = new Cql_Parser.selectClause_return();
		retval.start = input.LT(1);

		List<RawSelector> s =null;

		 retval.isDistinct = false; 
		try {
			// Parser.g:298:5: ( ( K_DISTINCT selectors )=> K_DISTINCT s= selectors |s= selectors )
			int alt11=2;
			alt11 = dfa11.predict(input);
			switch (alt11) {
				case 1 :
					// Parser.g:298:7: ( K_DISTINCT selectors )=> K_DISTINCT s= selectors
					{
					match(input,K_DISTINCT,FOLLOW_K_DISTINCT_in_selectClause1297); if (state.failed) return retval;
					pushFollow(FOLLOW_selectors_in_selectClause1301);
					s=selectors();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.isDistinct = true; retval.selectors = s; }
					}
					break;
				case 2 :
					// Parser.g:299:7: s= selectors
					{
					pushFollow(FOLLOW_selectors_in_selectClause1313);
					s=selectors();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.selectors = s; }
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "selectClause"



	// $ANTLR start "selectors"
	// Parser.g:302:1: selectors returns [List<RawSelector> expr] : (t1= selector ( ',' tN= selector )* | '\\*' );
	public final List<RawSelector> selectors() throws RecognitionException {
		List<RawSelector> expr = null;


		RawSelector t1 =null;
		RawSelector tN =null;

		try {
			// Parser.g:303:5: (t1= selector ( ',' tN= selector )* | '\\*' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==BOOLEAN||LA13_0==DURATION||LA13_0==FLOAT||LA13_0==HEXNUMBER||(LA13_0 >= IDENT && LA13_0 <= INTEGER)||LA13_0==K_ACCESS||(LA13_0 >= K_AGGREGATE && LA13_0 <= K_ALL)||LA13_0==K_AS||LA13_0==K_ASCII||(LA13_0 >= K_BIGINT && LA13_0 <= K_BOOLEAN)||(LA13_0 >= K_CALLED && LA13_0 <= K_CLUSTERING)||(LA13_0 >= K_COMPACT && LA13_0 <= K_COUNTER)||(LA13_0 >= K_CUSTOM && LA13_0 <= K_DEFAULT)||(LA13_0 >= K_DISTINCT && LA13_0 <= K_DOUBLE)||LA13_0==K_DURATION||(LA13_0 >= K_EXISTS && LA13_0 <= K_FLOAT)||LA13_0==K_FROZEN||(LA13_0 >= K_FUNCTION && LA13_0 <= K_FUNCTIONS)||LA13_0==K_GROUP||(LA13_0 >= K_INET && LA13_0 <= K_INPUT)||(LA13_0 >= K_INT && LA13_0 <= K_INTERNALS)||(LA13_0 >= K_JSON && LA13_0 <= K_KEYS)||(LA13_0 >= K_KEYSPACES && LA13_0 <= K_LIKE)||(LA13_0 >= K_LIST && LA13_0 <= K_MAP)||(LA13_0 >= K_MBEAN && LA13_0 <= K_MBEANS)||(LA13_0 >= K_NEGATIVE_INFINITY && LA13_0 <= K_NOLOGIN)||LA13_0==K_NOSUPERUSER||LA13_0==K_NULL||(LA13_0 >= K_ONLY && LA13_0 <= K_OPTIONS)||(LA13_0 >= K_PARTITION && LA13_0 <= K_POSITIVE_NAN)||(LA13_0 >= K_REPLACE && LA13_0 <= K_RETURNS)||(LA13_0 >= K_ROLE && LA13_0 <= K_ROLES)||(LA13_0 >= K_SFUNC && LA13_0 <= K_TINYINT)||(LA13_0 >= K_TOKEN && LA13_0 <= K_TRIGGER)||(LA13_0 >= K_TTL && LA13_0 <= K_TYPES)||LA13_0==K_UNSET||(LA13_0 >= K_USER && LA13_0 <= K_USERS)||(LA13_0 >= K_UUID && LA13_0 <= K_VARINT)||LA13_0==K_WRITETIME||(LA13_0 >= QMARK && LA13_0 <= QUOTED_NAME)||LA13_0==STRING_LITERAL||LA13_0==UUID||LA13_0==200||LA13_0==205||LA13_0==209||LA13_0==216||LA13_0==220) ) {
				alt13=1;
			}
			else if ( (LA13_0==217) ) {
				alt13=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return expr;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// Parser.g:303:7: t1= selector ( ',' tN= selector )*
					{
					pushFollow(FOLLOW_selector_in_selectors1338);
					t1=selector();
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { expr = new ArrayList<RawSelector>(); expr.add(t1); }
					// Parser.g:303:76: ( ',' tN= selector )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==204) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// Parser.g:303:77: ',' tN= selector
							{
							match(input,204,FOLLOW_204_in_selectors1343); if (state.failed) return expr;
							pushFollow(FOLLOW_selector_in_selectors1347);
							tN=selector();
							state._fsp--;
							if (state.failed) return expr;
							if ( state.backtracking==0 ) { expr.add(tN); }
							}
							break;

						default :
							break loop12;
						}
					}

					}
					break;
				case 2 :
					// Parser.g:304:7: '\\*'
					{
					match(input,217,FOLLOW_217_in_selectors1359); if (state.failed) return expr;
					if ( state.backtracking==0 ) { expr = Collections.<RawSelector>emptyList();}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "selectors"



	// $ANTLR start "selector"
	// Parser.g:307:1: selector returns [RawSelector s] : us= unaliasedSelector ( K_AS c= noncol_ident )? ;
	public final RawSelector selector() throws RecognitionException {
		RawSelector s = null;


		Selectable.Raw us =null;
		ColumnIdentifier c =null;

		 ColumnIdentifier alias = null; 
		try {
			// Parser.g:309:5: (us= unaliasedSelector ( K_AS c= noncol_ident )? )
			// Parser.g:309:7: us= unaliasedSelector ( K_AS c= noncol_ident )?
			{
			pushFollow(FOLLOW_unaliasedSelector_in_selector1392);
			us=unaliasedSelector();
			state._fsp--;
			if (state.failed) return s;
			// Parser.g:309:28: ( K_AS c= noncol_ident )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==K_AS) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// Parser.g:309:29: K_AS c= noncol_ident
					{
					match(input,K_AS,FOLLOW_K_AS_in_selector1395); if (state.failed) return s;
					pushFollow(FOLLOW_noncol_ident_in_selector1399);
					c=noncol_ident();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { alias = c; }
					}
					break;

			}

			if ( state.backtracking==0 ) { s = new RawSelector(us, alias); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selector"



	// $ANTLR start "unaliasedSelector"
	// Parser.g:312:1: unaliasedSelector returns [Selectable.Raw s] : a= selectionAddition ;
	public final Selectable.Raw unaliasedSelector() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw a =null;

		try {
			// Parser.g:313:5: (a= selectionAddition )
			// Parser.g:313:7: a= selectionAddition
			{
			pushFollow(FOLLOW_selectionAddition_in_unaliasedSelector1428);
			a=selectionAddition();
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) {s = a;}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "unaliasedSelector"



	// $ANTLR start "selectionAddition"
	// Parser.g:316:1: selectionAddition returns [Selectable.Raw s] : l= selectionMultiplication ( '+' r= selectionMultiplication | '-' r= selectionMultiplication )* ;
	public final Selectable.Raw selectionAddition() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw l =null;
		Selectable.Raw r =null;

		try {
			// Parser.g:317:5: (l= selectionMultiplication ( '+' r= selectionMultiplication | '-' r= selectionMultiplication )* )
			// Parser.g:317:9: l= selectionMultiplication ( '+' r= selectionMultiplication | '-' r= selectionMultiplication )*
			{
			pushFollow(FOLLOW_selectionMultiplication_in_selectionAddition1455);
			l=selectionMultiplication();
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) {s = l;}
			// Parser.g:318:9: ( '+' r= selectionMultiplication | '-' r= selectionMultiplication )*
			loop15:
			while (true) {
				int alt15=3;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==202) ) {
					alt15=1;
				}
				else if ( (LA15_0==205) ) {
					alt15=2;
				}

				switch (alt15) {
				case 1 :
					// Parser.g:318:11: '+' r= selectionMultiplication
					{
					match(input,202,FOLLOW_202_in_selectionAddition1471); if (state.failed) return s;
					pushFollow(FOLLOW_selectionMultiplication_in_selectionAddition1475);
					r=selectionMultiplication();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) {s = Selectable.WithFunction.Raw.newOperation('+', s, r);}
					}
					break;
				case 2 :
					// Parser.g:319:11: '-' r= selectionMultiplication
					{
					match(input,205,FOLLOW_205_in_selectionAddition1489); if (state.failed) return s;
					pushFollow(FOLLOW_selectionMultiplication_in_selectionAddition1493);
					r=selectionMultiplication();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) {s = Selectable.WithFunction.Raw.newOperation('-', s, r);}
					}
					break;

				default :
					break loop15;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionAddition"



	// $ANTLR start "selectionMultiplication"
	// Parser.g:323:1: selectionMultiplication returns [Selectable.Raw s] : l= selectionGroup ( '\\*' r= selectionGroup | '/' r= selectionGroup | '%' r= selectionGroup )* ;
	public final Selectable.Raw selectionMultiplication() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw l =null;
		Selectable.Raw r =null;

		try {
			// Parser.g:324:5: (l= selectionGroup ( '\\*' r= selectionGroup | '/' r= selectionGroup | '%' r= selectionGroup )* )
			// Parser.g:324:9: l= selectionGroup ( '\\*' r= selectionGroup | '/' r= selectionGroup | '%' r= selectionGroup )*
			{
			pushFollow(FOLLOW_selectionGroup_in_selectionMultiplication1531);
			l=selectionGroup();
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) {s = l;}
			// Parser.g:325:9: ( '\\*' r= selectionGroup | '/' r= selectionGroup | '%' r= selectionGroup )*
			loop16:
			while (true) {
				int alt16=4;
				switch ( input.LA(1) ) {
				case 217:
					{
					alt16=1;
					}
					break;
				case 208:
					{
					alt16=2;
					}
					break;
				case 199:
					{
					alt16=3;
					}
					break;
				}
				switch (alt16) {
				case 1 :
					// Parser.g:325:11: '\\*' r= selectionGroup
					{
					match(input,217,FOLLOW_217_in_selectionMultiplication1547); if (state.failed) return s;
					pushFollow(FOLLOW_selectionGroup_in_selectionMultiplication1551);
					r=selectionGroup();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) {s = Selectable.WithFunction.Raw.newOperation('*', s, r);}
					}
					break;
				case 2 :
					// Parser.g:326:11: '/' r= selectionGroup
					{
					match(input,208,FOLLOW_208_in_selectionMultiplication1565); if (state.failed) return s;
					pushFollow(FOLLOW_selectionGroup_in_selectionMultiplication1569);
					r=selectionGroup();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) {s = Selectable.WithFunction.Raw.newOperation('/', s, r);}
					}
					break;
				case 3 :
					// Parser.g:327:11: '%' r= selectionGroup
					{
					match(input,199,FOLLOW_199_in_selectionMultiplication1583); if (state.failed) return s;
					pushFollow(FOLLOW_selectionGroup_in_selectionMultiplication1587);
					r=selectionGroup();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) {s = Selectable.WithFunction.Raw.newOperation('%', s, r);}
					}
					break;

				default :
					break loop16;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionMultiplication"



	// $ANTLR start "selectionGroup"
	// Parser.g:331:1: selectionGroup returns [Selectable.Raw s] : ( ( selectionGroupWithField )=>f= selectionGroupWithField |g= selectionGroupWithoutField | '-' g= selectionGroup );
	public final Selectable.Raw selectionGroup() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw f =null;
		Selectable.Raw g =null;

		try {
			// Parser.g:332:5: ( ( selectionGroupWithField )=>f= selectionGroupWithField |g= selectionGroupWithoutField | '-' g= selectionGroup )
			int alt17=3;
			alt17 = dfa17.predict(input);
			switch (alt17) {
				case 1 :
					// Parser.g:332:7: ( selectionGroupWithField )=>f= selectionGroupWithField
					{
					pushFollow(FOLLOW_selectionGroupWithField_in_selectionGroup1629);
					f=selectionGroupWithField();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s =f; }
					}
					break;
				case 2 :
					// Parser.g:333:7: g= selectionGroupWithoutField
					{
					pushFollow(FOLLOW_selectionGroupWithoutField_in_selectionGroup1641);
					g=selectionGroupWithoutField();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s =g; }
					}
					break;
				case 3 :
					// Parser.g:334:7: '-' g= selectionGroup
					{
					match(input,205,FOLLOW_205_in_selectionGroup1651); if (state.failed) return s;
					pushFollow(FOLLOW_selectionGroup_in_selectionGroup1655);
					g=selectionGroup();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) {s = Selectable.WithFunction.Raw.newNegation(g);}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionGroup"



	// $ANTLR start "selectionGroupWithField"
	// Parser.g:337:1: selectionGroupWithField returns [Selectable.Raw s] : g= selectionGroupWithoutField m= selectorModifier[g] ;
	public final Selectable.Raw selectionGroupWithField() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw g =null;
		Selectable.Raw m =null;

		try {
			// Parser.g:338:5: (g= selectionGroupWithoutField m= selectorModifier[g] )
			// Parser.g:338:7: g= selectionGroupWithoutField m= selectorModifier[g]
			{
			pushFollow(FOLLOW_selectionGroupWithoutField_in_selectionGroupWithField1680);
			g=selectionGroupWithoutField();
			state._fsp--;
			if (state.failed) return s;
			pushFollow(FOLLOW_selectorModifier_in_selectionGroupWithField1684);
			m=selectorModifier(g);
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) {s = m;}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionGroupWithField"



	// $ANTLR start "selectorModifier"
	// Parser.g:341:1: selectorModifier[Selectable.Raw receiver] returns [Selectable.Raw s] : (f= fieldSelectorModifier[receiver] m= selectorModifier[f] | '[' ss= collectionSubSelection[receiver] ']' m= selectorModifier[ss] |);
	public final Selectable.Raw selectorModifier(Selectable.Raw receiver) throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw f =null;
		Selectable.Raw m =null;
		Selectable.Raw ss =null;

		try {
			// Parser.g:342:5: (f= fieldSelectorModifier[receiver] m= selectorModifier[f] | '[' ss= collectionSubSelection[receiver] ']' m= selectorModifier[ss] |)
			int alt18=3;
			switch ( input.LA(1) ) {
			case 207:
				{
				alt18=1;
				}
				break;
			case 216:
				{
				alt18=2;
				}
				break;
			case EOF:
			case K_AS:
			case K_FROM:
			case 199:
			case 201:
			case 202:
			case 204:
			case 205:
			case 208:
			case 209:
			case 217:
			case 218:
			case 221:
				{
				alt18=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return s;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// Parser.g:342:7: f= fieldSelectorModifier[receiver] m= selectorModifier[f]
					{
					pushFollow(FOLLOW_fieldSelectorModifier_in_selectorModifier1711);
					f=fieldSelectorModifier(receiver);
					state._fsp--;
					if (state.failed) return s;
					pushFollow(FOLLOW_selectorModifier_in_selectorModifier1716);
					m=selectorModifier(f);
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = m; }
					}
					break;
				case 2 :
					// Parser.g:343:7: '[' ss= collectionSubSelection[receiver] ']' m= selectorModifier[ss]
					{
					match(input,216,FOLLOW_216_in_selectorModifier1727); if (state.failed) return s;
					pushFollow(FOLLOW_collectionSubSelection_in_selectorModifier1731);
					ss=collectionSubSelection(receiver);
					state._fsp--;
					if (state.failed) return s;
					match(input,218,FOLLOW_218_in_selectorModifier1734); if (state.failed) return s;
					pushFollow(FOLLOW_selectorModifier_in_selectorModifier1738);
					m=selectorModifier(ss);
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = m; }
					}
					break;
				case 3 :
					// Parser.g:344:7: 
					{
					if ( state.backtracking==0 ) { s = receiver; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectorModifier"



	// $ANTLR start "fieldSelectorModifier"
	// Parser.g:347:1: fieldSelectorModifier[Selectable.Raw receiver] returns [Selectable.Raw s] : '.' fi= fident ;
	public final Selectable.Raw fieldSelectorModifier(Selectable.Raw receiver) throws RecognitionException {
		Selectable.Raw s = null;


		FieldIdentifier fi =null;

		try {
			// Parser.g:348:5: ( '.' fi= fident )
			// Parser.g:348:7: '.' fi= fident
			{
			match(input,207,FOLLOW_207_in_fieldSelectorModifier1771); if (state.failed) return s;
			pushFollow(FOLLOW_fident_in_fieldSelectorModifier1775);
			fi=fident();
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) { s = new Selectable.WithFieldSelection.Raw(receiver, fi); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "fieldSelectorModifier"



	// $ANTLR start "collectionSubSelection"
	// Parser.g:351:1: collectionSubSelection[Selectable.Raw receiver] returns [Selectable.Raw s] : (t1= term ( RANGE (t2= term )? )? | RANGE t2= term ) ;
	public final Selectable.Raw collectionSubSelection(Selectable.Raw receiver) throws RecognitionException {
		Selectable.Raw s = null;


		Term.Raw t1 =null;
		Term.Raw t2 =null;

		 boolean isSlice=false; 
		try {
			// Parser.g:353:5: ( (t1= term ( RANGE (t2= term )? )? | RANGE t2= term ) )
			// Parser.g:353:7: (t1= term ( RANGE (t2= term )? )? | RANGE t2= term )
			{
			// Parser.g:353:7: (t1= term ( RANGE (t2= term )? )? | RANGE t2= term )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==BOOLEAN||LA21_0==DURATION||LA21_0==FLOAT||LA21_0==HEXNUMBER||(LA21_0 >= IDENT && LA21_0 <= INTEGER)||LA21_0==K_ACCESS||(LA21_0 >= K_AGGREGATE && LA21_0 <= K_ALL)||LA21_0==K_AS||LA21_0==K_ASCII||(LA21_0 >= K_BIGINT && LA21_0 <= K_BOOLEAN)||(LA21_0 >= K_CALLED && LA21_0 <= K_CLUSTERING)||(LA21_0 >= K_COMPACT && LA21_0 <= K_COUNTER)||(LA21_0 >= K_CUSTOM && LA21_0 <= K_DEFAULT)||(LA21_0 >= K_DISTINCT && LA21_0 <= K_DOUBLE)||LA21_0==K_DURATION||(LA21_0 >= K_EXISTS && LA21_0 <= K_FLOAT)||LA21_0==K_FROZEN||(LA21_0 >= K_FUNCTION && LA21_0 <= K_FUNCTIONS)||LA21_0==K_GROUP||(LA21_0 >= K_INET && LA21_0 <= K_INPUT)||(LA21_0 >= K_INT && LA21_0 <= K_INTERNALS)||(LA21_0 >= K_JSON && LA21_0 <= K_KEYS)||(LA21_0 >= K_KEYSPACES && LA21_0 <= K_LIKE)||(LA21_0 >= K_LIST && LA21_0 <= K_MAP)||(LA21_0 >= K_MBEAN && LA21_0 <= K_MBEANS)||(LA21_0 >= K_NEGATIVE_INFINITY && LA21_0 <= K_NOLOGIN)||LA21_0==K_NOSUPERUSER||LA21_0==K_NULL||(LA21_0 >= K_ONLY && LA21_0 <= K_OPTIONS)||(LA21_0 >= K_PARTITION && LA21_0 <= K_POSITIVE_NAN)||(LA21_0 >= K_REPLACE && LA21_0 <= K_RETURNS)||(LA21_0 >= K_ROLE && LA21_0 <= K_ROLES)||(LA21_0 >= K_SFUNC && LA21_0 <= K_TINYINT)||(LA21_0 >= K_TOKEN && LA21_0 <= K_TRIGGER)||(LA21_0 >= K_TTL && LA21_0 <= K_TYPES)||LA21_0==K_UNSET||(LA21_0 >= K_USER && LA21_0 <= K_USERS)||(LA21_0 >= K_UUID && LA21_0 <= K_VARINT)||LA21_0==K_WRITETIME||(LA21_0 >= QMARK && LA21_0 <= QUOTED_NAME)||LA21_0==STRING_LITERAL||LA21_0==UUID||LA21_0==200||LA21_0==205||LA21_0==209||LA21_0==216||LA21_0==220) ) {
				alt21=1;
			}
			else if ( (LA21_0==RANGE) ) {
				alt21=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return s;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// Parser.g:353:9: t1= term ( RANGE (t2= term )? )?
					{
					pushFollow(FOLLOW_term_in_collectionSubSelection1813);
					t1=term();
					state._fsp--;
					if (state.failed) return s;
					// Parser.g:353:17: ( RANGE (t2= term )? )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==RANGE) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// Parser.g:353:19: RANGE (t2= term )?
							{
							if ( state.backtracking==0 ) { isSlice=true; }
							match(input,RANGE,FOLLOW_RANGE_in_collectionSubSelection1819); if (state.failed) return s;
							// Parser.g:353:43: (t2= term )?
							int alt19=2;
							int LA19_0 = input.LA(1);
							if ( (LA19_0==BOOLEAN||LA19_0==DURATION||LA19_0==FLOAT||LA19_0==HEXNUMBER||(LA19_0 >= IDENT && LA19_0 <= INTEGER)||LA19_0==K_ACCESS||(LA19_0 >= K_AGGREGATE && LA19_0 <= K_ALL)||LA19_0==K_AS||LA19_0==K_ASCII||(LA19_0 >= K_BIGINT && LA19_0 <= K_BOOLEAN)||(LA19_0 >= K_CALLED && LA19_0 <= K_CLUSTERING)||(LA19_0 >= K_COMPACT && LA19_0 <= K_COUNTER)||(LA19_0 >= K_CUSTOM && LA19_0 <= K_DEFAULT)||(LA19_0 >= K_DISTINCT && LA19_0 <= K_DOUBLE)||LA19_0==K_DURATION||(LA19_0 >= K_EXISTS && LA19_0 <= K_FLOAT)||LA19_0==K_FROZEN||(LA19_0 >= K_FUNCTION && LA19_0 <= K_FUNCTIONS)||LA19_0==K_GROUP||(LA19_0 >= K_INET && LA19_0 <= K_INPUT)||(LA19_0 >= K_INT && LA19_0 <= K_INTERNALS)||(LA19_0 >= K_JSON && LA19_0 <= K_KEYS)||(LA19_0 >= K_KEYSPACES && LA19_0 <= K_LIKE)||(LA19_0 >= K_LIST && LA19_0 <= K_MAP)||(LA19_0 >= K_MBEAN && LA19_0 <= K_MBEANS)||(LA19_0 >= K_NEGATIVE_INFINITY && LA19_0 <= K_NOLOGIN)||LA19_0==K_NOSUPERUSER||LA19_0==K_NULL||(LA19_0 >= K_ONLY && LA19_0 <= K_OPTIONS)||(LA19_0 >= K_PARTITION && LA19_0 <= K_POSITIVE_NAN)||(LA19_0 >= K_REPLACE && LA19_0 <= K_RETURNS)||(LA19_0 >= K_ROLE && LA19_0 <= K_ROLES)||(LA19_0 >= K_SFUNC && LA19_0 <= K_TINYINT)||(LA19_0 >= K_TOKEN && LA19_0 <= K_TRIGGER)||(LA19_0 >= K_TTL && LA19_0 <= K_TYPES)||LA19_0==K_UNSET||(LA19_0 >= K_USER && LA19_0 <= K_USERS)||(LA19_0 >= K_UUID && LA19_0 <= K_VARINT)||LA19_0==K_WRITETIME||(LA19_0 >= QMARK && LA19_0 <= QUOTED_NAME)||LA19_0==STRING_LITERAL||LA19_0==UUID||LA19_0==200||LA19_0==205||LA19_0==209||LA19_0==216||LA19_0==220) ) {
								alt19=1;
							}
							switch (alt19) {
								case 1 :
									// Parser.g:353:44: t2= term
									{
									pushFollow(FOLLOW_term_in_collectionSubSelection1824);
									t2=term();
									state._fsp--;
									if (state.failed) return s;
									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 2 :
					// Parser.g:354:9: RANGE t2= term
					{
					match(input,RANGE,FOLLOW_RANGE_in_collectionSubSelection1839); if (state.failed) return s;
					if ( state.backtracking==0 ) { isSlice=true; }
					pushFollow(FOLLOW_term_in_collectionSubSelection1845);
					t2=term();
					state._fsp--;
					if (state.failed) return s;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			          s = isSlice
			             ? new Selectable.WithSliceSelection.Raw(receiver, t1, t2)
			             : new Selectable.WithElementSelection.Raw(receiver, t1);
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "collectionSubSelection"



	// $ANTLR start "selectionGroupWithoutField"
	// Parser.g:362:1: selectionGroupWithoutField returns [Selectable.Raw s] : (sn= simpleUnaliasedSelector | ( selectionTypeHint )=>h= selectionTypeHint |t= selectionTupleOrNestedSelector |l= selectionList |m= selectionMapOrSet );
	public final Selectable.Raw selectionGroupWithoutField() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw sn =null;
		Selectable.Raw h =null;
		Selectable.Raw t =null;
		Selectable.Raw l =null;
		Selectable.Raw m =null;

		 Selectable.Raw tmp = null; 
		try {
			// Parser.g:365:5: (sn= simpleUnaliasedSelector | ( selectionTypeHint )=>h= selectionTypeHint |t= selectionTupleOrNestedSelector |l= selectionList |m= selectionMapOrSet )
			int alt22=5;
			alt22 = dfa22.predict(input);
			switch (alt22) {
				case 1 :
					// Parser.g:365:7: sn= simpleUnaliasedSelector
					{
					pushFollow(FOLLOW_simpleUnaliasedSelector_in_selectionGroupWithoutField1897);
					sn=simpleUnaliasedSelector();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { tmp=sn; }
					}
					break;
				case 2 :
					// Parser.g:366:7: ( selectionTypeHint )=>h= selectionTypeHint
					{
					pushFollow(FOLLOW_selectionTypeHint_in_selectionGroupWithoutField1915);
					h=selectionTypeHint();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { tmp=h; }
					}
					break;
				case 3 :
					// Parser.g:367:7: t= selectionTupleOrNestedSelector
					{
					pushFollow(FOLLOW_selectionTupleOrNestedSelector_in_selectionGroupWithoutField1927);
					t=selectionTupleOrNestedSelector();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { tmp=t; }
					}
					break;
				case 4 :
					// Parser.g:368:7: l= selectionList
					{
					pushFollow(FOLLOW_selectionList_in_selectionGroupWithoutField1939);
					l=selectionList();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { tmp=l; }
					}
					break;
				case 5 :
					// Parser.g:369:7: m= selectionMapOrSet
					{
					pushFollow(FOLLOW_selectionMapOrSet_in_selectionGroupWithoutField1951);
					m=selectionMapOrSet();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { tmp=m; }
					}
					break;

			}
			if ( state.backtracking==0 ) { s = tmp; }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionGroupWithoutField"



	// $ANTLR start "selectionTypeHint"
	// Parser.g:373:1: selectionTypeHint returns [Selectable.Raw s] : '(' ct= comparatorType ')' a= selectionGroupWithoutField ;
	public final Selectable.Raw selectionTypeHint() throws RecognitionException {
		Selectable.Raw s = null;


		CQL3Type.Raw ct =null;
		Selectable.Raw a =null;

		try {
			// Parser.g:374:5: ( '(' ct= comparatorType ')' a= selectionGroupWithoutField )
			// Parser.g:374:7: '(' ct= comparatorType ')' a= selectionGroupWithoutField
			{
			match(input,200,FOLLOW_200_in_selectionTypeHint1979); if (state.failed) return s;
			pushFollow(FOLLOW_comparatorType_in_selectionTypeHint1983);
			ct=comparatorType();
			state._fsp--;
			if (state.failed) return s;
			match(input,201,FOLLOW_201_in_selectionTypeHint1985); if (state.failed) return s;
			pushFollow(FOLLOW_selectionGroupWithoutField_in_selectionTypeHint1989);
			a=selectionGroupWithoutField();
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) { s = new Selectable.WithTypeHint.Raw(ct, a); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionTypeHint"



	// $ANTLR start "selectionList"
	// Parser.g:377:1: selectionList returns [Selectable.Raw s] : '[' (t1= unaliasedSelector ( ',' tn= unaliasedSelector )* )? ']' ;
	public final Selectable.Raw selectionList() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw t1 =null;
		Selectable.Raw tn =null;

		 List<Selectable.Raw> l = new ArrayList<>(); 
		try {
			// Parser.g:380:5: ( '[' (t1= unaliasedSelector ( ',' tn= unaliasedSelector )* )? ']' )
			// Parser.g:380:7: '[' (t1= unaliasedSelector ( ',' tn= unaliasedSelector )* )? ']'
			{
			match(input,216,FOLLOW_216_in_selectionList2030); if (state.failed) return s;
			// Parser.g:380:11: (t1= unaliasedSelector ( ',' tn= unaliasedSelector )* )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==BOOLEAN||LA24_0==DURATION||LA24_0==FLOAT||LA24_0==HEXNUMBER||(LA24_0 >= IDENT && LA24_0 <= INTEGER)||LA24_0==K_ACCESS||(LA24_0 >= K_AGGREGATE && LA24_0 <= K_ALL)||LA24_0==K_AS||LA24_0==K_ASCII||(LA24_0 >= K_BIGINT && LA24_0 <= K_BOOLEAN)||(LA24_0 >= K_CALLED && LA24_0 <= K_CLUSTERING)||(LA24_0 >= K_COMPACT && LA24_0 <= K_COUNTER)||(LA24_0 >= K_CUSTOM && LA24_0 <= K_DEFAULT)||(LA24_0 >= K_DISTINCT && LA24_0 <= K_DOUBLE)||LA24_0==K_DURATION||(LA24_0 >= K_EXISTS && LA24_0 <= K_FLOAT)||LA24_0==K_FROZEN||(LA24_0 >= K_FUNCTION && LA24_0 <= K_FUNCTIONS)||LA24_0==K_GROUP||(LA24_0 >= K_INET && LA24_0 <= K_INPUT)||(LA24_0 >= K_INT && LA24_0 <= K_INTERNALS)||(LA24_0 >= K_JSON && LA24_0 <= K_KEYS)||(LA24_0 >= K_KEYSPACES && LA24_0 <= K_LIKE)||(LA24_0 >= K_LIST && LA24_0 <= K_MAP)||(LA24_0 >= K_MBEAN && LA24_0 <= K_MBEANS)||(LA24_0 >= K_NEGATIVE_INFINITY && LA24_0 <= K_NOLOGIN)||LA24_0==K_NOSUPERUSER||LA24_0==K_NULL||(LA24_0 >= K_ONLY && LA24_0 <= K_OPTIONS)||(LA24_0 >= K_PARTITION && LA24_0 <= K_POSITIVE_NAN)||(LA24_0 >= K_REPLACE && LA24_0 <= K_RETURNS)||(LA24_0 >= K_ROLE && LA24_0 <= K_ROLES)||(LA24_0 >= K_SFUNC && LA24_0 <= K_TINYINT)||(LA24_0 >= K_TOKEN && LA24_0 <= K_TRIGGER)||(LA24_0 >= K_TTL && LA24_0 <= K_TYPES)||LA24_0==K_UNSET||(LA24_0 >= K_USER && LA24_0 <= K_USERS)||(LA24_0 >= K_UUID && LA24_0 <= K_VARINT)||LA24_0==K_WRITETIME||(LA24_0 >= QMARK && LA24_0 <= QUOTED_NAME)||LA24_0==STRING_LITERAL||LA24_0==UUID||LA24_0==200||LA24_0==205||LA24_0==209||LA24_0==216||LA24_0==220) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// Parser.g:380:13: t1= unaliasedSelector ( ',' tn= unaliasedSelector )*
					{
					pushFollow(FOLLOW_unaliasedSelector_in_selectionList2036);
					t1=unaliasedSelector();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { l.add(t1); }
					// Parser.g:380:49: ( ',' tn= unaliasedSelector )*
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( (LA23_0==204) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// Parser.g:380:51: ',' tn= unaliasedSelector
							{
							match(input,204,FOLLOW_204_in_selectionList2042); if (state.failed) return s;
							pushFollow(FOLLOW_unaliasedSelector_in_selectionList2046);
							tn=unaliasedSelector();
							state._fsp--;
							if (state.failed) return s;
							if ( state.backtracking==0 ) { l.add(tn); }
							}
							break;

						default :
							break loop23;
						}
					}

					}
					break;

			}

			match(input,218,FOLLOW_218_in_selectionList2056); if (state.failed) return s;
			}

			if ( state.backtracking==0 ) { s = new Selectable.WithList.Raw(l); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionList"



	// $ANTLR start "selectionMapOrSet"
	// Parser.g:383:1: selectionMapOrSet returns [Selectable.Raw s] : ( '{' t1= unaliasedSelector (m= selectionMap[t1] |st= selectionSet[t1] ) '}' | '{' '}' );
	public final Selectable.Raw selectionMapOrSet() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw t1 =null;
		Selectable.Raw m =null;
		Selectable.Raw st =null;

		try {
			// Parser.g:384:5: ( '{' t1= unaliasedSelector (m= selectionMap[t1] |st= selectionSet[t1] ) '}' | '{' '}' )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==220) ) {
				int LA26_1 = input.LA(2);
				if ( (LA26_1==221) ) {
					alt26=2;
				}
				else if ( (LA26_1==BOOLEAN||LA26_1==DURATION||LA26_1==FLOAT||LA26_1==HEXNUMBER||(LA26_1 >= IDENT && LA26_1 <= INTEGER)||LA26_1==K_ACCESS||(LA26_1 >= K_AGGREGATE && LA26_1 <= K_ALL)||LA26_1==K_AS||LA26_1==K_ASCII||(LA26_1 >= K_BIGINT && LA26_1 <= K_BOOLEAN)||(LA26_1 >= K_CALLED && LA26_1 <= K_CLUSTERING)||(LA26_1 >= K_COMPACT && LA26_1 <= K_COUNTER)||(LA26_1 >= K_CUSTOM && LA26_1 <= K_DEFAULT)||(LA26_1 >= K_DISTINCT && LA26_1 <= K_DOUBLE)||LA26_1==K_DURATION||(LA26_1 >= K_EXISTS && LA26_1 <= K_FLOAT)||LA26_1==K_FROZEN||(LA26_1 >= K_FUNCTION && LA26_1 <= K_FUNCTIONS)||LA26_1==K_GROUP||(LA26_1 >= K_INET && LA26_1 <= K_INPUT)||(LA26_1 >= K_INT && LA26_1 <= K_INTERNALS)||(LA26_1 >= K_JSON && LA26_1 <= K_KEYS)||(LA26_1 >= K_KEYSPACES && LA26_1 <= K_LIKE)||(LA26_1 >= K_LIST && LA26_1 <= K_MAP)||(LA26_1 >= K_MBEAN && LA26_1 <= K_MBEANS)||(LA26_1 >= K_NEGATIVE_INFINITY && LA26_1 <= K_NOLOGIN)||LA26_1==K_NOSUPERUSER||LA26_1==K_NULL||(LA26_1 >= K_ONLY && LA26_1 <= K_OPTIONS)||(LA26_1 >= K_PARTITION && LA26_1 <= K_POSITIVE_NAN)||(LA26_1 >= K_REPLACE && LA26_1 <= K_RETURNS)||(LA26_1 >= K_ROLE && LA26_1 <= K_ROLES)||(LA26_1 >= K_SFUNC && LA26_1 <= K_TINYINT)||(LA26_1 >= K_TOKEN && LA26_1 <= K_TRIGGER)||(LA26_1 >= K_TTL && LA26_1 <= K_TYPES)||LA26_1==K_UNSET||(LA26_1 >= K_USER && LA26_1 <= K_USERS)||(LA26_1 >= K_UUID && LA26_1 <= K_VARINT)||LA26_1==K_WRITETIME||(LA26_1 >= QMARK && LA26_1 <= QUOTED_NAME)||LA26_1==STRING_LITERAL||LA26_1==UUID||LA26_1==200||LA26_1==205||LA26_1==209||LA26_1==216||LA26_1==220) ) {
					alt26=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return s;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 26, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return s;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// Parser.g:384:7: '{' t1= unaliasedSelector (m= selectionMap[t1] |st= selectionSet[t1] ) '}'
					{
					match(input,220,FOLLOW_220_in_selectionMapOrSet2077); if (state.failed) return s;
					pushFollow(FOLLOW_unaliasedSelector_in_selectionMapOrSet2081);
					t1=unaliasedSelector();
					state._fsp--;
					if (state.failed) return s;
					// Parser.g:384:32: (m= selectionMap[t1] |st= selectionSet[t1] )
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==209) ) {
						alt25=1;
					}
					else if ( (LA25_0==204||LA25_0==221) ) {
						alt25=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return s;}
						NoViableAltException nvae =
							new NoViableAltException("", 25, 0, input);
						throw nvae;
					}

					switch (alt25) {
						case 1 :
							// Parser.g:384:34: m= selectionMap[t1]
							{
							pushFollow(FOLLOW_selectionMap_in_selectionMapOrSet2087);
							m=selectionMap(t1);
							state._fsp--;
							if (state.failed) return s;
							if ( state.backtracking==0 ) { s = m; }
							}
							break;
						case 2 :
							// Parser.g:384:67: st= selectionSet[t1]
							{
							pushFollow(FOLLOW_selectionSet_in_selectionMapOrSet2096);
							st=selectionSet(t1);
							state._fsp--;
							if (state.failed) return s;
							if ( state.backtracking==0 ) { s = st; }
							}
							break;

					}

					match(input,221,FOLLOW_221_in_selectionMapOrSet2102); if (state.failed) return s;
					}
					break;
				case 2 :
					// Parser.g:385:7: '{' '}'
					{
					match(input,220,FOLLOW_220_in_selectionMapOrSet2110); if (state.failed) return s;
					match(input,221,FOLLOW_221_in_selectionMapOrSet2112); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = new Selectable.WithSet.Raw(Collections.emptyList());}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionMapOrSet"



	// $ANTLR start "selectionMap"
	// Parser.g:388:1: selectionMap[Selectable.Raw k1] returns [Selectable.Raw s] : ':' v1= unaliasedSelector ( ',' kn= unaliasedSelector ':' vn= unaliasedSelector )* ;
	public final Selectable.Raw selectionMap(Selectable.Raw k1) throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw v1 =null;
		Selectable.Raw kn =null;
		Selectable.Raw vn =null;

		 List<Pair<Selectable.Raw, Selectable.Raw>> m = new ArrayList<>(); 
		try {
			// Parser.g:391:7: ( ':' v1= unaliasedSelector ( ',' kn= unaliasedSelector ':' vn= unaliasedSelector )* )
			// Parser.g:391:9: ':' v1= unaliasedSelector ( ',' kn= unaliasedSelector ':' vn= unaliasedSelector )*
			{
			match(input,209,FOLLOW_209_in_selectionMap2157); if (state.failed) return s;
			pushFollow(FOLLOW_unaliasedSelector_in_selectionMap2161);
			v1=unaliasedSelector();
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) { m.add(Pair.create(k1, v1)); }
			// Parser.g:391:68: ( ',' kn= unaliasedSelector ':' vn= unaliasedSelector )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==204) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// Parser.g:391:70: ',' kn= unaliasedSelector ':' vn= unaliasedSelector
					{
					match(input,204,FOLLOW_204_in_selectionMap2169); if (state.failed) return s;
					pushFollow(FOLLOW_unaliasedSelector_in_selectionMap2173);
					kn=unaliasedSelector();
					state._fsp--;
					if (state.failed) return s;
					match(input,209,FOLLOW_209_in_selectionMap2175); if (state.failed) return s;
					pushFollow(FOLLOW_unaliasedSelector_in_selectionMap2179);
					vn=unaliasedSelector();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { m.add(Pair.create(kn, vn)); }
					}
					break;

				default :
					break loop27;
				}
			}

			}

			if ( state.backtracking==0 ) { s = new Selectable.WithMapOrUdt.Raw(m); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionMap"



	// $ANTLR start "selectionSet"
	// Parser.g:394:1: selectionSet[Selectable.Raw t1] returns [Selectable.Raw s] : ( ',' tn= unaliasedSelector )* ;
	public final Selectable.Raw selectionSet(Selectable.Raw t1) throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw tn =null;

		 List<Selectable.Raw> l = new ArrayList<>(); l.add(t1); 
		try {
			// Parser.g:397:7: ( ( ',' tn= unaliasedSelector )* )
			// Parser.g:397:9: ( ',' tn= unaliasedSelector )*
			{
			// Parser.g:397:9: ( ',' tn= unaliasedSelector )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==204) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// Parser.g:397:11: ',' tn= unaliasedSelector
					{
					match(input,204,FOLLOW_204_in_selectionSet2231); if (state.failed) return s;
					pushFollow(FOLLOW_unaliasedSelector_in_selectionSet2235);
					tn=unaliasedSelector();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { l.add(tn); }
					}
					break;

				default :
					break loop28;
				}
			}

			}

			if ( state.backtracking==0 ) { s = new Selectable.WithSet.Raw(l); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionSet"



	// $ANTLR start "selectionTupleOrNestedSelector"
	// Parser.g:400:1: selectionTupleOrNestedSelector returns [Selectable.Raw s] : '(' t1= unaliasedSelector ( ',' tn= unaliasedSelector )* ')' ;
	public final Selectable.Raw selectionTupleOrNestedSelector() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.Raw t1 =null;
		Selectable.Raw tn =null;

		 List<Selectable.Raw> l = new ArrayList<>(); 
		try {
			// Parser.g:403:5: ( '(' t1= unaliasedSelector ( ',' tn= unaliasedSelector )* ')' )
			// Parser.g:403:7: '(' t1= unaliasedSelector ( ',' tn= unaliasedSelector )* ')'
			{
			match(input,200,FOLLOW_200_in_selectionTupleOrNestedSelector2281); if (state.failed) return s;
			pushFollow(FOLLOW_unaliasedSelector_in_selectionTupleOrNestedSelector2285);
			t1=unaliasedSelector();
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) { l.add(t1); }
			// Parser.g:403:47: ( ',' tn= unaliasedSelector )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==204) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// Parser.g:403:48: ',' tn= unaliasedSelector
					{
					match(input,204,FOLLOW_204_in_selectionTupleOrNestedSelector2290); if (state.failed) return s;
					pushFollow(FOLLOW_unaliasedSelector_in_selectionTupleOrNestedSelector2294);
					tn=unaliasedSelector();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { l.add(tn); }
					}
					break;

				default :
					break loop29;
				}
			}

			match(input,201,FOLLOW_201_in_selectionTupleOrNestedSelector2301); if (state.failed) return s;
			}

			if ( state.backtracking==0 ) { s = new Selectable.BetweenParenthesesOrWithTuple.Raw(l); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionTupleOrNestedSelector"



	// $ANTLR start "simpleUnaliasedSelector"
	// Parser.g:410:1: simpleUnaliasedSelector returns [Selectable.Raw s] : (c= sident |l= selectionLiteral |f= selectionFunction );
	public final Selectable.Raw simpleUnaliasedSelector() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.RawIdentifier c =null;
		Term.Raw l =null;
		Selectable.Raw f =null;

		try {
			// Parser.g:411:5: (c= sident |l= selectionLiteral |f= selectionFunction )
			int alt30=3;
			alt30 = dfa30.predict(input);
			switch (alt30) {
				case 1 :
					// Parser.g:411:7: c= sident
					{
					pushFollow(FOLLOW_sident_in_simpleUnaliasedSelector2326);
					c=sident();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = c; }
					}
					break;
				case 2 :
					// Parser.g:412:7: l= selectionLiteral
					{
					pushFollow(FOLLOW_selectionLiteral_in_simpleUnaliasedSelector2372);
					l=selectionLiteral();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = new Selectable.WithTerm.Raw(l); }
					}
					break;
				case 3 :
					// Parser.g:413:7: f= selectionFunction
					{
					pushFollow(FOLLOW_selectionFunction_in_simpleUnaliasedSelector2408);
					f=selectionFunction();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = f; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "simpleUnaliasedSelector"



	// $ANTLR start "selectionFunction"
	// Parser.g:416:1: selectionFunction returns [Selectable.Raw s] : ( K_COUNT '(' '\\*' ')' | K_WRITETIME '(' c= sident ')' | K_TTL '(' c= sident ')' | K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')' |f= functionName args= selectionFunctionArgs );
	public final Selectable.Raw selectionFunction() throws RecognitionException {
		Selectable.Raw s = null;


		Selectable.RawIdentifier c =null;
		Selectable.Raw sn =null;
		CQL3Type t =null;
		FunctionName f =null;
		List<Selectable.Raw> args =null;

		try {
			// Parser.g:417:5: ( K_COUNT '(' '\\*' ')' | K_WRITETIME '(' c= sident ')' | K_TTL '(' c= sident ')' | K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')' |f= functionName args= selectionFunctionArgs )
			int alt31=5;
			alt31 = dfa31.predict(input);
			switch (alt31) {
				case 1 :
					// Parser.g:417:7: K_COUNT '(' '\\*' ')'
					{
					match(input,K_COUNT,FOLLOW_K_COUNT_in_selectionFunction2454); if (state.failed) return s;
					match(input,200,FOLLOW_200_in_selectionFunction2456); if (state.failed) return s;
					match(input,217,FOLLOW_217_in_selectionFunction2458); if (state.failed) return s;
					match(input,201,FOLLOW_201_in_selectionFunction2460); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = Selectable.WithFunction.Raw.newCountRowsFunction(); }
					}
					break;
				case 2 :
					// Parser.g:418:7: K_WRITETIME '(' c= sident ')'
					{
					match(input,K_WRITETIME,FOLLOW_K_WRITETIME_in_selectionFunction2491); if (state.failed) return s;
					match(input,200,FOLLOW_200_in_selectionFunction2493); if (state.failed) return s;
					pushFollow(FOLLOW_sident_in_selectionFunction2497);
					c=sident();
					state._fsp--;
					if (state.failed) return s;
					match(input,201,FOLLOW_201_in_selectionFunction2499); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = new Selectable.WritetimeOrTTL.Raw(c, true); }
					}
					break;
				case 3 :
					// Parser.g:419:7: K_TTL '(' c= sident ')'
					{
					match(input,K_TTL,FOLLOW_K_TTL_in_selectionFunction2522); if (state.failed) return s;
					match(input,200,FOLLOW_200_in_selectionFunction2530); if (state.failed) return s;
					pushFollow(FOLLOW_sident_in_selectionFunction2534);
					c=sident();
					state._fsp--;
					if (state.failed) return s;
					match(input,201,FOLLOW_201_in_selectionFunction2536); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = new Selectable.WritetimeOrTTL.Raw(c, false); }
					}
					break;
				case 4 :
					// Parser.g:420:7: K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')'
					{
					match(input,K_CAST,FOLLOW_K_CAST_in_selectionFunction2559); if (state.failed) return s;
					match(input,200,FOLLOW_200_in_selectionFunction2566); if (state.failed) return s;
					pushFollow(FOLLOW_unaliasedSelector_in_selectionFunction2570);
					sn=unaliasedSelector();
					state._fsp--;
					if (state.failed) return s;
					match(input,K_AS,FOLLOW_K_AS_in_selectionFunction2572); if (state.failed) return s;
					pushFollow(FOLLOW_native_type_in_selectionFunction2576);
					t=native_type();
					state._fsp--;
					if (state.failed) return s;
					match(input,201,FOLLOW_201_in_selectionFunction2578); if (state.failed) return s;
					if ( state.backtracking==0 ) {s = new Selectable.WithCast.Raw(sn, t);}
					}
					break;
				case 5 :
					// Parser.g:421:7: f= functionName args= selectionFunctionArgs
					{
					pushFollow(FOLLOW_functionName_in_selectionFunction2590);
					f=functionName();
					state._fsp--;
					if (state.failed) return s;
					pushFollow(FOLLOW_selectionFunctionArgs_in_selectionFunction2594);
					args=selectionFunctionArgs();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = new Selectable.WithFunction.Raw(f, args); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selectionFunction"



	// $ANTLR start "selectionLiteral"
	// Parser.g:424:1: selectionLiteral returns [Term.Raw value] : (c= constant | K_NULL | ':' id= noncol_ident | QMARK );
	public final Term.Raw selectionLiteral() throws RecognitionException {
		Term.Raw value = null;


		Constants.Literal c =null;
		ColumnIdentifier id =null;

		try {
			// Parser.g:425:5: (c= constant | K_NULL | ':' id= noncol_ident | QMARK )
			int alt32=4;
			switch ( input.LA(1) ) {
			case BOOLEAN:
			case DURATION:
			case FLOAT:
			case HEXNUMBER:
			case INTEGER:
			case K_NEGATIVE_INFINITY:
			case K_NEGATIVE_NAN:
			case K_POSITIVE_INFINITY:
			case K_POSITIVE_NAN:
			case STRING_LITERAL:
			case UUID:
				{
				alt32=1;
				}
				break;
			case K_NULL:
				{
				alt32=2;
				}
				break;
			case 209:
				{
				alt32=3;
				}
				break;
			case QMARK:
				{
				alt32=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return value;}
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// Parser.g:425:7: c= constant
					{
					pushFollow(FOLLOW_constant_in_selectionLiteral2619);
					c=constant();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = c; }
					}
					break;
				case 2 :
					// Parser.g:426:7: K_NULL
					{
					match(input,K_NULL,FOLLOW_K_NULL_in_selectionLiteral2649); if (state.failed) return value;
					if ( state.backtracking==0 ) { value = Constants.NULL_LITERAL; }
					}
					break;
				case 3 :
					// Parser.g:427:7: ':' id= noncol_ident
					{
					match(input,209,FOLLOW_209_in_selectionLiteral2683); if (state.failed) return value;
					pushFollow(FOLLOW_noncol_ident_in_selectionLiteral2687);
					id=noncol_ident();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = newBindVariables(id); }
					}
					break;
				case 4 :
					// Parser.g:428:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_selectionLiteral2708); if (state.failed) return value;
					if ( state.backtracking==0 ) { value = newBindVariables(null); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "selectionLiteral"



	// $ANTLR start "selectionFunctionArgs"
	// Parser.g:431:1: selectionFunctionArgs returns [List<Selectable.Raw> a] : '(' (s1= unaliasedSelector ( ',' sn= unaliasedSelector )* )? ')' ;
	public final List<Selectable.Raw> selectionFunctionArgs() throws RecognitionException {
		List<Selectable.Raw> a = null;


		Selectable.Raw s1 =null;
		Selectable.Raw sn =null;

		 a = new ArrayList<>(); 
		try {
			// Parser.g:433:5: ( '(' (s1= unaliasedSelector ( ',' sn= unaliasedSelector )* )? ')' )
			// Parser.g:433:7: '(' (s1= unaliasedSelector ( ',' sn= unaliasedSelector )* )? ')'
			{
			match(input,200,FOLLOW_200_in_selectionFunctionArgs2764); if (state.failed) return a;
			// Parser.g:433:11: (s1= unaliasedSelector ( ',' sn= unaliasedSelector )* )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==BOOLEAN||LA34_0==DURATION||LA34_0==FLOAT||LA34_0==HEXNUMBER||(LA34_0 >= IDENT && LA34_0 <= INTEGER)||LA34_0==K_ACCESS||(LA34_0 >= K_AGGREGATE && LA34_0 <= K_ALL)||LA34_0==K_AS||LA34_0==K_ASCII||(LA34_0 >= K_BIGINT && LA34_0 <= K_BOOLEAN)||(LA34_0 >= K_CALLED && LA34_0 <= K_CLUSTERING)||(LA34_0 >= K_COMPACT && LA34_0 <= K_COUNTER)||(LA34_0 >= K_CUSTOM && LA34_0 <= K_DEFAULT)||(LA34_0 >= K_DISTINCT && LA34_0 <= K_DOUBLE)||LA34_0==K_DURATION||(LA34_0 >= K_EXISTS && LA34_0 <= K_FLOAT)||LA34_0==K_FROZEN||(LA34_0 >= K_FUNCTION && LA34_0 <= K_FUNCTIONS)||LA34_0==K_GROUP||(LA34_0 >= K_INET && LA34_0 <= K_INPUT)||(LA34_0 >= K_INT && LA34_0 <= K_INTERNALS)||(LA34_0 >= K_JSON && LA34_0 <= K_KEYS)||(LA34_0 >= K_KEYSPACES && LA34_0 <= K_LIKE)||(LA34_0 >= K_LIST && LA34_0 <= K_MAP)||(LA34_0 >= K_MBEAN && LA34_0 <= K_MBEANS)||(LA34_0 >= K_NEGATIVE_INFINITY && LA34_0 <= K_NOLOGIN)||LA34_0==K_NOSUPERUSER||LA34_0==K_NULL||(LA34_0 >= K_ONLY && LA34_0 <= K_OPTIONS)||(LA34_0 >= K_PARTITION && LA34_0 <= K_POSITIVE_NAN)||(LA34_0 >= K_REPLACE && LA34_0 <= K_RETURNS)||(LA34_0 >= K_ROLE && LA34_0 <= K_ROLES)||(LA34_0 >= K_SFUNC && LA34_0 <= K_TINYINT)||(LA34_0 >= K_TOKEN && LA34_0 <= K_TRIGGER)||(LA34_0 >= K_TTL && LA34_0 <= K_TYPES)||LA34_0==K_UNSET||(LA34_0 >= K_USER && LA34_0 <= K_USERS)||(LA34_0 >= K_UUID && LA34_0 <= K_VARINT)||LA34_0==K_WRITETIME||(LA34_0 >= QMARK && LA34_0 <= QUOTED_NAME)||LA34_0==STRING_LITERAL||LA34_0==UUID||LA34_0==200||LA34_0==205||LA34_0==209||LA34_0==216||LA34_0==220) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// Parser.g:433:12: s1= unaliasedSelector ( ',' sn= unaliasedSelector )*
					{
					pushFollow(FOLLOW_unaliasedSelector_in_selectionFunctionArgs2769);
					s1=unaliasedSelector();
					state._fsp--;
					if (state.failed) return a;
					if ( state.backtracking==0 ) { a.add(s1); }
					// Parser.g:434:11: ( ',' sn= unaliasedSelector )*
					loop33:
					while (true) {
						int alt33=2;
						int LA33_0 = input.LA(1);
						if ( (LA33_0==204) ) {
							alt33=1;
						}

						switch (alt33) {
						case 1 :
							// Parser.g:434:13: ',' sn= unaliasedSelector
							{
							match(input,204,FOLLOW_204_in_selectionFunctionArgs2785); if (state.failed) return a;
							pushFollow(FOLLOW_unaliasedSelector_in_selectionFunctionArgs2789);
							sn=unaliasedSelector();
							state._fsp--;
							if (state.failed) return a;
							if ( state.backtracking==0 ) { a.add(sn); }
							}
							break;

						default :
							break loop33;
						}
					}

					}
					break;

			}

			match(input,201,FOLLOW_201_in_selectionFunctionArgs2804); if (state.failed) return a;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return a;
	}
	// $ANTLR end "selectionFunctionArgs"



	// $ANTLR start "sident"
	// Parser.g:438:1: sident returns [Selectable.RawIdentifier id] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword );
	public final Selectable.RawIdentifier sident() throws RecognitionException {
		Selectable.RawIdentifier id = null;


		Token t=null;
		String k =null;

		try {
			// Parser.g:439:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword )
			int alt35=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt35=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt35=2;
				}
				break;
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTER:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DATE:
			case K_DECIMAL:
			case K_DEFAULT:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_INTERNALS:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt35=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return id;}
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// Parser.g:439:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_sident2827); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = Selectable.RawIdentifier.forUnquoted((t!=null?t.getText():null)); }
					}
					break;
				case 2 :
					// Parser.g:440:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_sident2852); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = Selectable.RawIdentifier.forQuoted((t!=null?t.getText():null)); }
					}
					break;
				case 3 :
					// Parser.g:441:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_sident2871);
					k=unreserved_keyword();
					state._fsp--;
					if (state.failed) return id;
					if ( state.backtracking==0 ) { id = Selectable.RawIdentifier.forUnquoted(k); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "sident"



	// $ANTLR start "whereClause"
	// Parser.g:444:1: whereClause returns [WhereClause.Builder clause] : relationOrExpression[$clause] ( K_AND relationOrExpression[$clause] )* ;
	public final WhereClause.Builder whereClause() throws RecognitionException {
		WhereClause.Builder clause = null;


		 clause = new WhereClause.Builder(); 
		try {
			// Parser.g:446:5: ( relationOrExpression[$clause] ( K_AND relationOrExpression[$clause] )* )
			// Parser.g:446:7: relationOrExpression[$clause] ( K_AND relationOrExpression[$clause] )*
			{
			pushFollow(FOLLOW_relationOrExpression_in_whereClause2902);
			relationOrExpression(clause);
			state._fsp--;
			if (state.failed) return clause;
			// Parser.g:446:37: ( K_AND relationOrExpression[$clause] )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==K_AND) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// Parser.g:446:38: K_AND relationOrExpression[$clause]
					{
					match(input,K_AND,FOLLOW_K_AND_in_whereClause2906); if (state.failed) return clause;
					pushFollow(FOLLOW_relationOrExpression_in_whereClause2908);
					relationOrExpression(clause);
					state._fsp--;
					if (state.failed) return clause;
					}
					break;

				default :
					break loop36;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return clause;
	}
	// $ANTLR end "whereClause"



	// $ANTLR start "relationOrExpression"
	// Parser.g:449:1: relationOrExpression[WhereClause.Builder clause] : ( relation[$clause] | customIndexExpression[$clause] );
	public final void relationOrExpression(WhereClause.Builder clause) throws RecognitionException {
		try {
			// Parser.g:450:5: ( relation[$clause] | customIndexExpression[$clause] )
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==EMPTY_QUOTED_NAME||LA37_0==IDENT||LA37_0==K_ACCESS||(LA37_0 >= K_AGGREGATE && LA37_0 <= K_ALL)||LA37_0==K_AS||LA37_0==K_ASCII||(LA37_0 >= K_BIGINT && LA37_0 <= K_BOOLEAN)||(LA37_0 >= K_CALLED && LA37_0 <= K_CLUSTERING)||(LA37_0 >= K_COMPACT && LA37_0 <= K_COUNTER)||(LA37_0 >= K_CUSTOM && LA37_0 <= K_DEFAULT)||(LA37_0 >= K_DISTINCT && LA37_0 <= K_DOUBLE)||LA37_0==K_DURATION||(LA37_0 >= K_EXISTS && LA37_0 <= K_FLOAT)||LA37_0==K_FROZEN||(LA37_0 >= K_FUNCTION && LA37_0 <= K_FUNCTIONS)||LA37_0==K_GROUP||(LA37_0 >= K_INET && LA37_0 <= K_INPUT)||(LA37_0 >= K_INT && LA37_0 <= K_INTERNALS)||(LA37_0 >= K_JSON && LA37_0 <= K_KEYS)||(LA37_0 >= K_KEYSPACES && LA37_0 <= K_LIKE)||(LA37_0 >= K_LIST && LA37_0 <= K_MAP)||(LA37_0 >= K_MBEAN && LA37_0 <= K_MBEANS)||LA37_0==K_NOLOGIN||LA37_0==K_NOSUPERUSER||(LA37_0 >= K_ONLY && LA37_0 <= K_OPTIONS)||(LA37_0 >= K_PARTITION && LA37_0 <= K_PERMISSIONS)||(LA37_0 >= K_REPLACE && LA37_0 <= K_RETURNS)||(LA37_0 >= K_ROLE && LA37_0 <= K_ROLES)||(LA37_0 >= K_SFUNC && LA37_0 <= K_TINYINT)||(LA37_0 >= K_TOKEN && LA37_0 <= K_TRIGGER)||(LA37_0 >= K_TTL && LA37_0 <= K_TYPES)||LA37_0==K_UNSET||(LA37_0 >= K_USER && LA37_0 <= K_USERS)||(LA37_0 >= K_UUID && LA37_0 <= K_VARINT)||LA37_0==K_WRITETIME||LA37_0==QUOTED_NAME||LA37_0==200) ) {
				alt37=1;
			}
			else if ( (LA37_0==219) ) {
				alt37=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// Parser.g:450:7: relation[$clause]
					{
					pushFollow(FOLLOW_relation_in_relationOrExpression2930);
					relation(clause);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Parser.g:451:7: customIndexExpression[$clause]
					{
					pushFollow(FOLLOW_customIndexExpression_in_relationOrExpression2939);
					customIndexExpression(clause);
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "relationOrExpression"



	// $ANTLR start "customIndexExpression"
	// Parser.g:454:1: customIndexExpression[WhereClause.Builder clause] : 'expr(' idxName[name] ',' t= term ')' ;
	public final void customIndexExpression(WhereClause.Builder clause) throws RecognitionException {
		Term.Raw t =null;

		QualifiedName name = new QualifiedName();
		try {
			// Parser.g:456:5: ( 'expr(' idxName[name] ',' t= term ')' )
			// Parser.g:456:7: 'expr(' idxName[name] ',' t= term ')'
			{
			match(input,219,FOLLOW_219_in_customIndexExpression2967); if (state.failed) return;
			pushFollow(FOLLOW_idxName_in_customIndexExpression2969);
			idxName(name);
			state._fsp--;
			if (state.failed) return;
			match(input,204,FOLLOW_204_in_customIndexExpression2972); if (state.failed) return;
			pushFollow(FOLLOW_term_in_customIndexExpression2976);
			t=term();
			state._fsp--;
			if (state.failed) return;
			match(input,201,FOLLOW_201_in_customIndexExpression2978); if (state.failed) return;
			if ( state.backtracking==0 ) { clause.add(new CustomIndexExpression(name, t));}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "customIndexExpression"



	// $ANTLR start "orderByClause"
	// Parser.g:459:1: orderByClause[Map<ColumnIdentifier, Boolean> orderings] : c= cident ( K_ASC | K_DESC )? ;
	public final void orderByClause(Map<ColumnIdentifier, Boolean> orderings) throws RecognitionException {
		ColumnIdentifier c =null;


		        boolean reversed = false;
		    
		try {
			// Parser.g:463:5: (c= cident ( K_ASC | K_DESC )? )
			// Parser.g:463:7: c= cident ( K_ASC | K_DESC )?
			{
			pushFollow(FOLLOW_cident_in_orderByClause3008);
			c=cident();
			state._fsp--;
			if (state.failed) return;
			// Parser.g:463:16: ( K_ASC | K_DESC )?
			int alt38=3;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==K_ASC) ) {
				alt38=1;
			}
			else if ( (LA38_0==K_DESC) ) {
				alt38=2;
			}
			switch (alt38) {
				case 1 :
					// Parser.g:463:17: K_ASC
					{
					match(input,K_ASC,FOLLOW_K_ASC_in_orderByClause3011); if (state.failed) return;
					}
					break;
				case 2 :
					// Parser.g:463:25: K_DESC
					{
					match(input,K_DESC,FOLLOW_K_DESC_in_orderByClause3015); if (state.failed) return;
					if ( state.backtracking==0 ) { reversed = true; }
					}
					break;

			}

			if ( state.backtracking==0 ) { orderings.put(c, reversed); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "orderByClause"



	// $ANTLR start "groupByClause"
	// Parser.g:466:1: groupByClause[List<ColumnIdentifier> groups] : c= cident ;
	public final void groupByClause(List<ColumnIdentifier> groups) throws RecognitionException {
		ColumnIdentifier c =null;

		try {
			// Parser.g:467:5: (c= cident )
			// Parser.g:467:7: c= cident
			{
			pushFollow(FOLLOW_cident_in_groupByClause3041);
			c=cident();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) { groups.add(c); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "groupByClause"



	// $ANTLR start "insertStatement"
	// Parser.g:476:1: insertStatement returns [ModificationStatement.Parsed expr] : K_INSERT K_INTO cf= columnFamilyName (st1= normalInsertStatement[cf] | K_JSON st2= jsonInsertStatement[cf] ) ;
	public final ModificationStatement.Parsed insertStatement() throws RecognitionException {
		ModificationStatement.Parsed expr = null;


		QualifiedName cf =null;
		UpdateStatement.ParsedInsert st1 =null;
		UpdateStatement.ParsedInsertJson st2 =null;

		try {
			// Parser.g:477:5: ( K_INSERT K_INTO cf= columnFamilyName (st1= normalInsertStatement[cf] | K_JSON st2= jsonInsertStatement[cf] ) )
			// Parser.g:477:7: K_INSERT K_INTO cf= columnFamilyName (st1= normalInsertStatement[cf] | K_JSON st2= jsonInsertStatement[cf] )
			{
			match(input,K_INSERT,FOLLOW_K_INSERT_in_insertStatement3066); if (state.failed) return expr;
			match(input,K_INTO,FOLLOW_K_INTO_in_insertStatement3068); if (state.failed) return expr;
			pushFollow(FOLLOW_columnFamilyName_in_insertStatement3072);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:478:9: (st1= normalInsertStatement[cf] | K_JSON st2= jsonInsertStatement[cf] )
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==200) ) {
				alt39=1;
			}
			else if ( (LA39_0==K_JSON) ) {
				alt39=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return expr;}
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}

			switch (alt39) {
				case 1 :
					// Parser.g:478:11: st1= normalInsertStatement[cf]
					{
					pushFollow(FOLLOW_normalInsertStatement_in_insertStatement3086);
					st1=normalInsertStatement(cf);
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { expr = st1; }
					}
					break;
				case 2 :
					// Parser.g:479:11: K_JSON st2= jsonInsertStatement[cf]
					{
					match(input,K_JSON,FOLLOW_K_JSON_in_insertStatement3101); if (state.failed) return expr;
					pushFollow(FOLLOW_jsonInsertStatement_in_insertStatement3105);
					st2=jsonInsertStatement(cf);
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { expr = st2; }
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "insertStatement"



	// $ANTLR start "normalInsertStatement"
	// Parser.g:482:1: normalInsertStatement[QualifiedName qn] returns [UpdateStatement.ParsedInsert expr] : '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? ;
	public final UpdateStatement.ParsedInsert normalInsertStatement(QualifiedName qn) throws RecognitionException {
		UpdateStatement.ParsedInsert expr = null;


		ColumnIdentifier c1 =null;
		ColumnIdentifier cn =null;
		Term.Raw v1 =null;
		Term.Raw vn =null;


		        Attributes.Raw attrs = new Attributes.Raw();
		        List<ColumnIdentifier> columnNames  = new ArrayList<>();
		        List<Term.Raw> values = new ArrayList<>();
		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:489:5: ( '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? )
			// Parser.g:489:7: '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )?
			{
			match(input,200,FOLLOW_200_in_normalInsertStatement3141); if (state.failed) return expr;
			pushFollow(FOLLOW_cident_in_normalInsertStatement3145);
			c1=cident();
			state._fsp--;
			if (state.failed) return expr;
			if ( state.backtracking==0 ) { columnNames.add(c1); }
			// Parser.g:489:47: ( ',' cn= cident )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==204) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// Parser.g:489:49: ',' cn= cident
					{
					match(input,204,FOLLOW_204_in_normalInsertStatement3152); if (state.failed) return expr;
					pushFollow(FOLLOW_cident_in_normalInsertStatement3156);
					cn=cident();
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { columnNames.add(cn); }
					}
					break;

				default :
					break loop40;
				}
			}

			match(input,201,FOLLOW_201_in_normalInsertStatement3163); if (state.failed) return expr;
			match(input,K_VALUES,FOLLOW_K_VALUES_in_normalInsertStatement3171); if (state.failed) return expr;
			match(input,200,FOLLOW_200_in_normalInsertStatement3179); if (state.failed) return expr;
			pushFollow(FOLLOW_term_in_normalInsertStatement3183);
			v1=term();
			state._fsp--;
			if (state.failed) return expr;
			if ( state.backtracking==0 ) { values.add(v1); }
			// Parser.g:491:39: ( ',' vn= term )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==204) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// Parser.g:491:41: ',' vn= term
					{
					match(input,204,FOLLOW_204_in_normalInsertStatement3189); if (state.failed) return expr;
					pushFollow(FOLLOW_term_in_normalInsertStatement3193);
					vn=term();
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { values.add(vn); }
					}
					break;

				default :
					break loop41;
				}
			}

			match(input,201,FOLLOW_201_in_normalInsertStatement3200); if (state.failed) return expr;
			// Parser.g:492:7: ( K_IF K_NOT K_EXISTS )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==K_IF) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// Parser.g:492:9: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_normalInsertStatement3210); if (state.failed) return expr;
					match(input,K_NOT,FOLLOW_K_NOT_in_normalInsertStatement3212); if (state.failed) return expr;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_normalInsertStatement3214); if (state.failed) return expr;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			// Parser.g:493:7: ( usingClause[attrs] )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==K_USING) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// Parser.g:493:9: usingClause[attrs]
					{
					pushFollow(FOLLOW_usingClause_in_normalInsertStatement3229);
					usingClause(attrs);
					state._fsp--;
					if (state.failed) return expr;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			          expr = new UpdateStatement.ParsedInsert(qn, attrs, columnNames, values, ifNotExists);
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "normalInsertStatement"



	// $ANTLR start "jsonInsertStatement"
	// Parser.g:499:1: jsonInsertStatement[QualifiedName qn] returns [UpdateStatement.ParsedInsertJson expr] : val= jsonValue ( K_DEFAULT ( K_NULL | ( K_UNSET ) ) )? ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? ;
	public final UpdateStatement.ParsedInsertJson jsonInsertStatement(QualifiedName qn) throws RecognitionException {
		UpdateStatement.ParsedInsertJson expr = null;


		Json.Raw val =null;


		        Attributes.Raw attrs = new Attributes.Raw();
		        boolean ifNotExists = false;
		        boolean defaultUnset = false;
		    
		try {
			// Parser.g:505:5: (val= jsonValue ( K_DEFAULT ( K_NULL | ( K_UNSET ) ) )? ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? )
			// Parser.g:505:7: val= jsonValue ( K_DEFAULT ( K_NULL | ( K_UNSET ) ) )? ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )?
			{
			pushFollow(FOLLOW_jsonValue_in_jsonInsertStatement3275);
			val=jsonValue();
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:506:7: ( K_DEFAULT ( K_NULL | ( K_UNSET ) ) )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==K_DEFAULT) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// Parser.g:506:9: K_DEFAULT ( K_NULL | ( K_UNSET ) )
					{
					match(input,K_DEFAULT,FOLLOW_K_DEFAULT_in_jsonInsertStatement3285); if (state.failed) return expr;
					// Parser.g:506:19: ( K_NULL | ( K_UNSET ) )
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==K_NULL) ) {
						alt44=1;
					}
					else if ( (LA44_0==K_UNSET) ) {
						alt44=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return expr;}
						NoViableAltException nvae =
							new NoViableAltException("", 44, 0, input);
						throw nvae;
					}

					switch (alt44) {
						case 1 :
							// Parser.g:506:21: K_NULL
							{
							match(input,K_NULL,FOLLOW_K_NULL_in_jsonInsertStatement3289); if (state.failed) return expr;
							}
							break;
						case 2 :
							// Parser.g:506:30: ( K_UNSET )
							{
							// Parser.g:506:30: ( K_UNSET )
							// Parser.g:506:32: K_UNSET
							{
							if ( state.backtracking==0 ) { defaultUnset = true; }
							match(input,K_UNSET,FOLLOW_K_UNSET_in_jsonInsertStatement3297); if (state.failed) return expr;
							}

							}
							break;

					}

					}
					break;

			}

			// Parser.g:507:7: ( K_IF K_NOT K_EXISTS )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==K_IF) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// Parser.g:507:9: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_jsonInsertStatement3313); if (state.failed) return expr;
					match(input,K_NOT,FOLLOW_K_NOT_in_jsonInsertStatement3315); if (state.failed) return expr;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_jsonInsertStatement3317); if (state.failed) return expr;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			// Parser.g:508:7: ( usingClause[attrs] )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==K_USING) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// Parser.g:508:9: usingClause[attrs]
					{
					pushFollow(FOLLOW_usingClause_in_jsonInsertStatement3332);
					usingClause(attrs);
					state._fsp--;
					if (state.failed) return expr;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			          expr = new UpdateStatement.ParsedInsertJson(qn, attrs, val, defaultUnset, ifNotExists);
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "jsonInsertStatement"



	// $ANTLR start "jsonValue"
	// Parser.g:514:1: jsonValue returns [Json.Raw value] : (s= STRING_LITERAL | ':' id= noncol_ident | QMARK );
	public final Json.Raw jsonValue() throws RecognitionException {
		Json.Raw value = null;


		Token s=null;
		ColumnIdentifier id =null;

		try {
			// Parser.g:515:5: (s= STRING_LITERAL | ':' id= noncol_ident | QMARK )
			int alt48=3;
			switch ( input.LA(1) ) {
			case STRING_LITERAL:
				{
				alt48=1;
				}
				break;
			case 209:
				{
				alt48=2;
				}
				break;
			case QMARK:
				{
				alt48=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return value;}
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}
			switch (alt48) {
				case 1 :
					// Parser.g:515:7: s= STRING_LITERAL
					{
					s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_jsonValue3367); if (state.failed) return value;
					if ( state.backtracking==0 ) { value = new Json.Literal((s!=null?s.getText():null)); }
					}
					break;
				case 2 :
					// Parser.g:516:7: ':' id= noncol_ident
					{
					match(input,209,FOLLOW_209_in_jsonValue3377); if (state.failed) return value;
					pushFollow(FOLLOW_noncol_ident_in_jsonValue3381);
					id=noncol_ident();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = newJsonBindVariables(id); }
					}
					break;
				case 3 :
					// Parser.g:517:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_jsonValue3395); if (state.failed) return value;
					if ( state.backtracking==0 ) { value = newJsonBindVariables(null); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "jsonValue"



	// $ANTLR start "usingClause"
	// Parser.g:520:1: usingClause[Attributes.Raw attrs] : K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )* ;
	public final void usingClause(Attributes.Raw attrs) throws RecognitionException {
		try {
			// Parser.g:521:5: ( K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )* )
			// Parser.g:521:7: K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )*
			{
			match(input,K_USING,FOLLOW_K_USING_in_usingClause3426); if (state.failed) return;
			pushFollow(FOLLOW_usingClauseObjective_in_usingClause3428);
			usingClauseObjective(attrs);
			state._fsp--;
			if (state.failed) return;
			// Parser.g:521:43: ( K_AND usingClauseObjective[attrs] )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==K_AND) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// Parser.g:521:45: K_AND usingClauseObjective[attrs]
					{
					match(input,K_AND,FOLLOW_K_AND_in_usingClause3433); if (state.failed) return;
					pushFollow(FOLLOW_usingClauseObjective_in_usingClause3435);
					usingClauseObjective(attrs);
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop49;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "usingClause"



	// $ANTLR start "usingClauseObjective"
	// Parser.g:524:1: usingClauseObjective[Attributes.Raw attrs] : ( K_TIMESTAMP ts= intValue | K_TTL t= intValue );
	public final void usingClauseObjective(Attributes.Raw attrs) throws RecognitionException {
		Term.Raw ts =null;
		Term.Raw t =null;

		try {
			// Parser.g:525:5: ( K_TIMESTAMP ts= intValue | K_TTL t= intValue )
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==K_TIMESTAMP) ) {
				alt50=1;
			}
			else if ( (LA50_0==K_TTL) ) {
				alt50=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}

			switch (alt50) {
				case 1 :
					// Parser.g:525:7: K_TIMESTAMP ts= intValue
					{
					match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_usingClauseObjective3457); if (state.failed) return;
					pushFollow(FOLLOW_intValue_in_usingClauseObjective3461);
					ts=intValue();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { attrs.timestamp = ts; }
					}
					break;
				case 2 :
					// Parser.g:526:7: K_TTL t= intValue
					{
					match(input,K_TTL,FOLLOW_K_TTL_in_usingClauseObjective3471); if (state.failed) return;
					pushFollow(FOLLOW_intValue_in_usingClauseObjective3475);
					t=intValue();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { attrs.timeToLive = t; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "usingClauseObjective"



	// $ANTLR start "updateStatement"
	// Parser.g:536:1: updateStatement returns [UpdateStatement.ParsedUpdate expr] : K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )? ;
	public final UpdateStatement.ParsedUpdate updateStatement() throws RecognitionException {
		UpdateStatement.ParsedUpdate expr = null;


		QualifiedName cf =null;
		WhereClause.Builder wclause =null;
		List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions =null;


		        Attributes.Raw attrs = new Attributes.Raw();
		        List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations = new ArrayList<>();
		        boolean ifExists = false;
		    
		try {
			// Parser.g:542:5: ( K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )? )
			// Parser.g:542:7: K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )?
			{
			match(input,K_UPDATE,FOLLOW_K_UPDATE_in_updateStatement3509); if (state.failed) return expr;
			pushFollow(FOLLOW_columnFamilyName_in_updateStatement3513);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:543:7: ( usingClause[attrs] )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==K_USING) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// Parser.g:543:9: usingClause[attrs]
					{
					pushFollow(FOLLOW_usingClause_in_updateStatement3523);
					usingClause(attrs);
					state._fsp--;
					if (state.failed) return expr;
					}
					break;

			}

			match(input,K_SET,FOLLOW_K_SET_in_updateStatement3535); if (state.failed) return expr;
			pushFollow(FOLLOW_columnOperation_in_updateStatement3537);
			columnOperation(operations);
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:544:41: ( ',' columnOperation[operations] )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==204) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// Parser.g:544:42: ',' columnOperation[operations]
					{
					match(input,204,FOLLOW_204_in_updateStatement3541); if (state.failed) return expr;
					pushFollow(FOLLOW_columnOperation_in_updateStatement3543);
					columnOperation(operations);
					state._fsp--;
					if (state.failed) return expr;
					}
					break;

				default :
					break loop52;
				}
			}

			match(input,K_WHERE,FOLLOW_K_WHERE_in_updateStatement3554); if (state.failed) return expr;
			pushFollow(FOLLOW_whereClause_in_updateStatement3558);
			wclause=whereClause();
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:546:7: ( K_IF ( K_EXISTS |conditions= updateConditions ) )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==K_IF) ) {
				alt54=1;
			}
			switch (alt54) {
				case 1 :
					// Parser.g:546:9: K_IF ( K_EXISTS |conditions= updateConditions )
					{
					match(input,K_IF,FOLLOW_K_IF_in_updateStatement3568); if (state.failed) return expr;
					// Parser.g:546:14: ( K_EXISTS |conditions= updateConditions )
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==K_EXISTS) ) {
						int LA53_1 = input.LA(2);
						if ( (LA53_1==EOF||LA53_1==K_APPLY||LA53_1==K_DELETE||LA53_1==K_INSERT||LA53_1==K_UPDATE||LA53_1==210) ) {
							alt53=1;
						}
						else if ( (LA53_1==K_IN||LA53_1==198||LA53_1==207||(LA53_1 >= 211 && LA53_1 <= 216)) ) {
							alt53=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return expr;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 53, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA53_0==EMPTY_QUOTED_NAME||LA53_0==IDENT||LA53_0==K_ACCESS||(LA53_0 >= K_AGGREGATE && LA53_0 <= K_ALL)||LA53_0==K_AS||LA53_0==K_ASCII||(LA53_0 >= K_BIGINT && LA53_0 <= K_BOOLEAN)||(LA53_0 >= K_CALLED && LA53_0 <= K_CLUSTERING)||(LA53_0 >= K_COMPACT && LA53_0 <= K_COUNTER)||(LA53_0 >= K_CUSTOM && LA53_0 <= K_DEFAULT)||(LA53_0 >= K_DISTINCT && LA53_0 <= K_DOUBLE)||LA53_0==K_DURATION||(LA53_0 >= K_FILTERING && LA53_0 <= K_FLOAT)||LA53_0==K_FROZEN||(LA53_0 >= K_FUNCTION && LA53_0 <= K_FUNCTIONS)||LA53_0==K_GROUP||(LA53_0 >= K_INET && LA53_0 <= K_INPUT)||(LA53_0 >= K_INT && LA53_0 <= K_INTERNALS)||(LA53_0 >= K_JSON && LA53_0 <= K_KEYS)||(LA53_0 >= K_KEYSPACES && LA53_0 <= K_LIKE)||(LA53_0 >= K_LIST && LA53_0 <= K_MAP)||(LA53_0 >= K_MBEAN && LA53_0 <= K_MBEANS)||LA53_0==K_NOLOGIN||LA53_0==K_NOSUPERUSER||(LA53_0 >= K_ONLY && LA53_0 <= K_OPTIONS)||(LA53_0 >= K_PARTITION && LA53_0 <= K_PERMISSIONS)||(LA53_0 >= K_REPLACE && LA53_0 <= K_RETURNS)||(LA53_0 >= K_ROLE && LA53_0 <= K_ROLES)||(LA53_0 >= K_SFUNC && LA53_0 <= K_TINYINT)||LA53_0==K_TRIGGER||(LA53_0 >= K_TTL && LA53_0 <= K_TYPES)||LA53_0==K_UNSET||(LA53_0 >= K_USER && LA53_0 <= K_USERS)||(LA53_0 >= K_UUID && LA53_0 <= K_VARINT)||LA53_0==K_WRITETIME||LA53_0==QUOTED_NAME) ) {
						alt53=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return expr;}
						NoViableAltException nvae =
							new NoViableAltException("", 53, 0, input);
						throw nvae;
					}

					switch (alt53) {
						case 1 :
							// Parser.g:546:16: K_EXISTS
							{
							match(input,K_EXISTS,FOLLOW_K_EXISTS_in_updateStatement3572); if (state.failed) return expr;
							if ( state.backtracking==0 ) { ifExists = true; }
							}
							break;
						case 2 :
							// Parser.g:546:48: conditions= updateConditions
							{
							pushFollow(FOLLOW_updateConditions_in_updateStatement3580);
							conditions=updateConditions();
							state._fsp--;
							if (state.failed) return expr;
							}
							break;

					}

					}
					break;

			}

			if ( state.backtracking==0 ) {
			          expr = new UpdateStatement.ParsedUpdate(cf,
			                                                   attrs,
			                                                   operations,
			                                                   wclause.build(),
			                                                   conditions == null ? Collections.<Pair<ColumnIdentifier, ColumnCondition.Raw>>emptyList() : conditions,
			                                                   ifExists);
			     }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "updateStatement"



	// $ANTLR start "updateConditions"
	// Parser.g:557:1: updateConditions returns [List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions] : columnCondition[conditions] ( K_AND columnCondition[conditions] )* ;
	public final List<Pair<ColumnIdentifier, ColumnCondition.Raw>> updateConditions() throws RecognitionException {
		List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions = null;


		 conditions = new ArrayList<Pair<ColumnIdentifier, ColumnCondition.Raw>>(); 
		try {
			// Parser.g:559:5: ( columnCondition[conditions] ( K_AND columnCondition[conditions] )* )
			// Parser.g:559:7: columnCondition[conditions] ( K_AND columnCondition[conditions] )*
			{
			pushFollow(FOLLOW_columnCondition_in_updateConditions3622);
			columnCondition(conditions);
			state._fsp--;
			if (state.failed) return conditions;
			// Parser.g:559:35: ( K_AND columnCondition[conditions] )*
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==K_AND) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// Parser.g:559:37: K_AND columnCondition[conditions]
					{
					match(input,K_AND,FOLLOW_K_AND_in_updateConditions3627); if (state.failed) return conditions;
					pushFollow(FOLLOW_columnCondition_in_updateConditions3629);
					columnCondition(conditions);
					state._fsp--;
					if (state.failed) return conditions;
					}
					break;

				default :
					break loop55;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return conditions;
	}
	// $ANTLR end "updateConditions"



	// $ANTLR start "deleteStatement"
	// Parser.g:570:1: deleteStatement returns [DeleteStatement.Parsed expr] : K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )? ;
	public final DeleteStatement.Parsed deleteStatement() throws RecognitionException {
		DeleteStatement.Parsed expr = null;


		List<Operation.RawDeletion> dels =null;
		QualifiedName cf =null;
		WhereClause.Builder wclause =null;
		List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions =null;


		        Attributes.Raw attrs = new Attributes.Raw();
		        List<Operation.RawDeletion> columnDeletions = Collections.emptyList();
		        boolean ifExists = false;
		    
		try {
			// Parser.g:576:5: ( K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )? )
			// Parser.g:576:7: K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )?
			{
			match(input,K_DELETE,FOLLOW_K_DELETE_in_deleteStatement3666); if (state.failed) return expr;
			// Parser.g:576:16: (dels= deleteSelection )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==EMPTY_QUOTED_NAME||LA56_0==IDENT||LA56_0==K_ACCESS||(LA56_0 >= K_AGGREGATE && LA56_0 <= K_ALL)||LA56_0==K_AS||LA56_0==K_ASCII||(LA56_0 >= K_BIGINT && LA56_0 <= K_BOOLEAN)||(LA56_0 >= K_CALLED && LA56_0 <= K_CLUSTERING)||(LA56_0 >= K_COMPACT && LA56_0 <= K_COUNTER)||(LA56_0 >= K_CUSTOM && LA56_0 <= K_DEFAULT)||(LA56_0 >= K_DISTINCT && LA56_0 <= K_DOUBLE)||LA56_0==K_DURATION||(LA56_0 >= K_EXISTS && LA56_0 <= K_FLOAT)||LA56_0==K_FROZEN||(LA56_0 >= K_FUNCTION && LA56_0 <= K_FUNCTIONS)||LA56_0==K_GROUP||(LA56_0 >= K_INET && LA56_0 <= K_INPUT)||(LA56_0 >= K_INT && LA56_0 <= K_INTERNALS)||(LA56_0 >= K_JSON && LA56_0 <= K_KEYS)||(LA56_0 >= K_KEYSPACES && LA56_0 <= K_LIKE)||(LA56_0 >= K_LIST && LA56_0 <= K_MAP)||(LA56_0 >= K_MBEAN && LA56_0 <= K_MBEANS)||LA56_0==K_NOLOGIN||LA56_0==K_NOSUPERUSER||(LA56_0 >= K_ONLY && LA56_0 <= K_OPTIONS)||(LA56_0 >= K_PARTITION && LA56_0 <= K_PERMISSIONS)||(LA56_0 >= K_REPLACE && LA56_0 <= K_RETURNS)||(LA56_0 >= K_ROLE && LA56_0 <= K_ROLES)||(LA56_0 >= K_SFUNC && LA56_0 <= K_TINYINT)||LA56_0==K_TRIGGER||(LA56_0 >= K_TTL && LA56_0 <= K_TYPES)||LA56_0==K_UNSET||(LA56_0 >= K_USER && LA56_0 <= K_USERS)||(LA56_0 >= K_UUID && LA56_0 <= K_VARINT)||LA56_0==K_WRITETIME||LA56_0==QUOTED_NAME) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// Parser.g:576:18: dels= deleteSelection
					{
					pushFollow(FOLLOW_deleteSelection_in_deleteStatement3672);
					dels=deleteSelection();
					state._fsp--;
					if (state.failed) return expr;
					if ( state.backtracking==0 ) { columnDeletions = dels; }
					}
					break;

			}

			match(input,K_FROM,FOLLOW_K_FROM_in_deleteStatement3685); if (state.failed) return expr;
			pushFollow(FOLLOW_columnFamilyName_in_deleteStatement3689);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:578:7: ( usingClauseDelete[attrs] )?
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==K_USING) ) {
				alt57=1;
			}
			switch (alt57) {
				case 1 :
					// Parser.g:578:9: usingClauseDelete[attrs]
					{
					pushFollow(FOLLOW_usingClauseDelete_in_deleteStatement3699);
					usingClauseDelete(attrs);
					state._fsp--;
					if (state.failed) return expr;
					}
					break;

			}

			match(input,K_WHERE,FOLLOW_K_WHERE_in_deleteStatement3711); if (state.failed) return expr;
			pushFollow(FOLLOW_whereClause_in_deleteStatement3715);
			wclause=whereClause();
			state._fsp--;
			if (state.failed) return expr;
			// Parser.g:580:7: ( K_IF ( K_EXISTS |conditions= updateConditions ) )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==K_IF) ) {
				alt59=1;
			}
			switch (alt59) {
				case 1 :
					// Parser.g:580:9: K_IF ( K_EXISTS |conditions= updateConditions )
					{
					match(input,K_IF,FOLLOW_K_IF_in_deleteStatement3725); if (state.failed) return expr;
					// Parser.g:580:14: ( K_EXISTS |conditions= updateConditions )
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==K_EXISTS) ) {
						int LA58_1 = input.LA(2);
						if ( (LA58_1==EOF||LA58_1==K_APPLY||LA58_1==K_DELETE||LA58_1==K_INSERT||LA58_1==K_UPDATE||LA58_1==210) ) {
							alt58=1;
						}
						else if ( (LA58_1==K_IN||LA58_1==198||LA58_1==207||(LA58_1 >= 211 && LA58_1 <= 216)) ) {
							alt58=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return expr;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 58, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA58_0==EMPTY_QUOTED_NAME||LA58_0==IDENT||LA58_0==K_ACCESS||(LA58_0 >= K_AGGREGATE && LA58_0 <= K_ALL)||LA58_0==K_AS||LA58_0==K_ASCII||(LA58_0 >= K_BIGINT && LA58_0 <= K_BOOLEAN)||(LA58_0 >= K_CALLED && LA58_0 <= K_CLUSTERING)||(LA58_0 >= K_COMPACT && LA58_0 <= K_COUNTER)||(LA58_0 >= K_CUSTOM && LA58_0 <= K_DEFAULT)||(LA58_0 >= K_DISTINCT && LA58_0 <= K_DOUBLE)||LA58_0==K_DURATION||(LA58_0 >= K_FILTERING && LA58_0 <= K_FLOAT)||LA58_0==K_FROZEN||(LA58_0 >= K_FUNCTION && LA58_0 <= K_FUNCTIONS)||LA58_0==K_GROUP||(LA58_0 >= K_INET && LA58_0 <= K_INPUT)||(LA58_0 >= K_INT && LA58_0 <= K_INTERNALS)||(LA58_0 >= K_JSON && LA58_0 <= K_KEYS)||(LA58_0 >= K_KEYSPACES && LA58_0 <= K_LIKE)||(LA58_0 >= K_LIST && LA58_0 <= K_MAP)||(LA58_0 >= K_MBEAN && LA58_0 <= K_MBEANS)||LA58_0==K_NOLOGIN||LA58_0==K_NOSUPERUSER||(LA58_0 >= K_ONLY && LA58_0 <= K_OPTIONS)||(LA58_0 >= K_PARTITION && LA58_0 <= K_PERMISSIONS)||(LA58_0 >= K_REPLACE && LA58_0 <= K_RETURNS)||(LA58_0 >= K_ROLE && LA58_0 <= K_ROLES)||(LA58_0 >= K_SFUNC && LA58_0 <= K_TINYINT)||LA58_0==K_TRIGGER||(LA58_0 >= K_TTL && LA58_0 <= K_TYPES)||LA58_0==K_UNSET||(LA58_0 >= K_USER && LA58_0 <= K_USERS)||(LA58_0 >= K_UUID && LA58_0 <= K_VARINT)||LA58_0==K_WRITETIME||LA58_0==QUOTED_NAME) ) {
						alt58=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return expr;}
						NoViableAltException nvae =
							new NoViableAltException("", 58, 0, input);
						throw nvae;
					}

					switch (alt58) {
						case 1 :
							// Parser.g:580:16: K_EXISTS
							{
							match(input,K_EXISTS,FOLLOW_K_EXISTS_in_deleteStatement3729); if (state.failed) return expr;
							if ( state.backtracking==0 ) { ifExists = true; }
							}
							break;
						case 2 :
							// Parser.g:580:48: conditions= updateConditions
							{
							pushFollow(FOLLOW_updateConditions_in_deleteStatement3737);
							conditions=updateConditions();
							state._fsp--;
							if (state.failed) return expr;
							}
							break;

					}

					}
					break;

			}

			if ( state.backtracking==0 ) {
			          expr = new DeleteStatement.Parsed(cf,
			                                             attrs,
			                                             columnDeletions,
			                                             wclause.build(),
			                                             conditions == null ? Collections.<Pair<ColumnIdentifier, ColumnCondition.Raw>>emptyList() : conditions,
			                                             ifExists);
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "deleteStatement"



	// $ANTLR start "deleteSelection"
	// Parser.g:591:1: deleteSelection returns [List<Operation.RawDeletion> operations] :t1= deleteOp ( ',' tN= deleteOp )* ;
	public final List<Operation.RawDeletion> deleteSelection() throws RecognitionException {
		List<Operation.RawDeletion> operations = null;


		Operation.RawDeletion t1 =null;
		Operation.RawDeletion tN =null;

		try {
			// Parser.g:592:5: (t1= deleteOp ( ',' tN= deleteOp )* )
			// Parser.g:592:7: t1= deleteOp ( ',' tN= deleteOp )*
			{
			if ( state.backtracking==0 ) { operations = new ArrayList<Operation.RawDeletion>(); }
			pushFollow(FOLLOW_deleteOp_in_deleteSelection3784);
			t1=deleteOp();
			state._fsp--;
			if (state.failed) return operations;
			if ( state.backtracking==0 ) { operations.add(t1); }
			// Parser.g:594:11: ( ',' tN= deleteOp )*
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==204) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// Parser.g:594:12: ',' tN= deleteOp
					{
					match(input,204,FOLLOW_204_in_deleteSelection3799); if (state.failed) return operations;
					pushFollow(FOLLOW_deleteOp_in_deleteSelection3803);
					tN=deleteOp();
					state._fsp--;
					if (state.failed) return operations;
					if ( state.backtracking==0 ) { operations.add(tN); }
					}
					break;

				default :
					break loop60;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return operations;
	}
	// $ANTLR end "deleteSelection"



	// $ANTLR start "deleteOp"
	// Parser.g:597:1: deleteOp returns [Operation.RawDeletion op] : (c= cident |c= cident '[' t= term ']' |c= cident '.' field= fident );
	public final Operation.RawDeletion deleteOp() throws RecognitionException {
		Operation.RawDeletion op = null;


		ColumnIdentifier c =null;
		Term.Raw t =null;
		FieldIdentifier field =null;

		try {
			// Parser.g:598:5: (c= cident |c= cident '[' t= term ']' |c= cident '.' field= fident )
			int alt61=3;
			alt61 = dfa61.predict(input);
			switch (alt61) {
				case 1 :
					// Parser.g:598:7: c= cident
					{
					pushFollow(FOLLOW_cident_in_deleteOp3830);
					c=cident();
					state._fsp--;
					if (state.failed) return op;
					if ( state.backtracking==0 ) { op = new Operation.ColumnDeletion(c); }
					}
					break;
				case 2 :
					// Parser.g:599:7: c= cident '[' t= term ']'
					{
					pushFollow(FOLLOW_cident_in_deleteOp3857);
					c=cident();
					state._fsp--;
					if (state.failed) return op;
					match(input,216,FOLLOW_216_in_deleteOp3859); if (state.failed) return op;
					pushFollow(FOLLOW_term_in_deleteOp3863);
					t=term();
					state._fsp--;
					if (state.failed) return op;
					match(input,218,FOLLOW_218_in_deleteOp3865); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = new Operation.ElementDeletion(c, t); }
					}
					break;
				case 3 :
					// Parser.g:600:7: c= cident '.' field= fident
					{
					pushFollow(FOLLOW_cident_in_deleteOp3877);
					c=cident();
					state._fsp--;
					if (state.failed) return op;
					match(input,207,FOLLOW_207_in_deleteOp3879); if (state.failed) return op;
					pushFollow(FOLLOW_fident_in_deleteOp3883);
					field=fident();
					state._fsp--;
					if (state.failed) return op;
					if ( state.backtracking==0 ) { op = new Operation.FieldDeletion(c, field); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return op;
	}
	// $ANTLR end "deleteOp"



	// $ANTLR start "usingClauseDelete"
	// Parser.g:603:1: usingClauseDelete[Attributes.Raw attrs] : K_USING K_TIMESTAMP ts= intValue ;
	public final void usingClauseDelete(Attributes.Raw attrs) throws RecognitionException {
		Term.Raw ts =null;

		try {
			// Parser.g:604:5: ( K_USING K_TIMESTAMP ts= intValue )
			// Parser.g:604:7: K_USING K_TIMESTAMP ts= intValue
			{
			match(input,K_USING,FOLLOW_K_USING_in_usingClauseDelete3903); if (state.failed) return;
			match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_usingClauseDelete3905); if (state.failed) return;
			pushFollow(FOLLOW_intValue_in_usingClauseDelete3909);
			ts=intValue();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) { attrs.timestamp = ts; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "usingClauseDelete"



	// $ANTLR start "batchStatement"
	// Parser.g:631:1: batchStatement returns [BatchStatement.Parsed expr] : K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH ;
	public final BatchStatement.Parsed batchStatement() throws RecognitionException {
		BatchStatement.Parsed expr = null;


		ModificationStatement.Parsed s =null;


		        BatchStatement.Type type = BatchStatement.Type.LOGGED;
		        List<ModificationStatement.Parsed> statements = new ArrayList<ModificationStatement.Parsed>();
		        Attributes.Raw attrs = new Attributes.Raw();
		    
		try {
			// Parser.g:637:5: ( K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH )
			// Parser.g:637:7: K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH
			{
			match(input,K_BEGIN,FOLLOW_K_BEGIN_in_batchStatement3943); if (state.failed) return expr;
			// Parser.g:638:7: ( K_UNLOGGED | K_COUNTER )?
			int alt62=3;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==K_UNLOGGED) ) {
				alt62=1;
			}
			else if ( (LA62_0==K_COUNTER) ) {
				alt62=2;
			}
			switch (alt62) {
				case 1 :
					// Parser.g:638:9: K_UNLOGGED
					{
					match(input,K_UNLOGGED,FOLLOW_K_UNLOGGED_in_batchStatement3953); if (state.failed) return expr;
					if ( state.backtracking==0 ) { type = BatchStatement.Type.UNLOGGED; }
					}
					break;
				case 2 :
					// Parser.g:638:63: K_COUNTER
					{
					match(input,K_COUNTER,FOLLOW_K_COUNTER_in_batchStatement3959); if (state.failed) return expr;
					if ( state.backtracking==0 ) { type = BatchStatement.Type.COUNTER; }
					}
					break;

			}

			match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement3972); if (state.failed) return expr;
			// Parser.g:639:15: ( usingClause[attrs] )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==K_USING) ) {
				alt63=1;
			}
			switch (alt63) {
				case 1 :
					// Parser.g:639:17: usingClause[attrs]
					{
					pushFollow(FOLLOW_usingClause_in_batchStatement3976);
					usingClause(attrs);
					state._fsp--;
					if (state.failed) return expr;
					}
					break;

			}

			// Parser.g:640:11: (s= batchStatementObjective ( ';' )? )*
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==K_DELETE||LA65_0==K_INSERT||LA65_0==K_UPDATE) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// Parser.g:640:13: s= batchStatementObjective ( ';' )?
					{
					pushFollow(FOLLOW_batchStatementObjective_in_batchStatement3996);
					s=batchStatementObjective();
					state._fsp--;
					if (state.failed) return expr;
					// Parser.g:640:39: ( ';' )?
					int alt64=2;
					int LA64_0 = input.LA(1);
					if ( (LA64_0==210) ) {
						alt64=1;
					}
					switch (alt64) {
						case 1 :
							// Parser.g:640:39: ';'
							{
							match(input,210,FOLLOW_210_in_batchStatement3998); if (state.failed) return expr;
							}
							break;

					}

					if ( state.backtracking==0 ) { statements.add(s); }
					}
					break;

				default :
					break loop65;
				}
			}

			match(input,K_APPLY,FOLLOW_K_APPLY_in_batchStatement4012); if (state.failed) return expr;
			match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement4014); if (state.failed) return expr;
			if ( state.backtracking==0 ) {
			          expr = new BatchStatement.Parsed(type, attrs, statements);
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "batchStatement"



	// $ANTLR start "batchStatementObjective"
	// Parser.g:647:1: batchStatementObjective returns [ModificationStatement.Parsed statement] : (i= insertStatement |u= updateStatement |d= deleteStatement );
	public final ModificationStatement.Parsed batchStatementObjective() throws RecognitionException {
		ModificationStatement.Parsed statement = null;


		ModificationStatement.Parsed i =null;
		UpdateStatement.ParsedUpdate u =null;
		DeleteStatement.Parsed d =null;

		try {
			// Parser.g:648:5: (i= insertStatement |u= updateStatement |d= deleteStatement )
			int alt66=3;
			switch ( input.LA(1) ) {
			case K_INSERT:
				{
				alt66=1;
				}
				break;
			case K_UPDATE:
				{
				alt66=2;
				}
				break;
			case K_DELETE:
				{
				alt66=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return statement;}
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}
			switch (alt66) {
				case 1 :
					// Parser.g:648:7: i= insertStatement
					{
					pushFollow(FOLLOW_insertStatement_in_batchStatementObjective4045);
					i=insertStatement();
					state._fsp--;
					if (state.failed) return statement;
					if ( state.backtracking==0 ) { statement = i; }
					}
					break;
				case 2 :
					// Parser.g:649:7: u= updateStatement
					{
					pushFollow(FOLLOW_updateStatement_in_batchStatementObjective4058);
					u=updateStatement();
					state._fsp--;
					if (state.failed) return statement;
					if ( state.backtracking==0 ) { statement = u; }
					}
					break;
				case 3 :
					// Parser.g:650:7: d= deleteStatement
					{
					pushFollow(FOLLOW_deleteStatement_in_batchStatementObjective4071);
					d=deleteStatement();
					state._fsp--;
					if (state.failed) return statement;
					if ( state.backtracking==0 ) { statement = d; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return statement;
	}
	// $ANTLR end "batchStatementObjective"



	// $ANTLR start "createAggregateStatement"
	// Parser.g:653:1: createAggregateStatement returns [CreateAggregateStatement.Raw stmt] : K_CREATE ( K_OR K_REPLACE )? K_AGGREGATE ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' K_SFUNC sfunc= allowedFunctionName K_STYPE stype= comparatorType ( K_FINALFUNC ffunc= allowedFunctionName )? ( K_INITCOND ival= term )? ;
	public final CreateAggregateStatement.Raw createAggregateStatement() throws RecognitionException {
		CreateAggregateStatement.Raw stmt = null;


		FunctionName fn =null;
		CQL3Type.Raw v =null;
		String sfunc =null;
		CQL3Type.Raw stype =null;
		String ffunc =null;
		Term.Raw ival =null;


		        boolean orReplace = false;
		        boolean ifNotExists = false;

		        List<CQL3Type.Raw> argTypes = new ArrayList<>();
		    
		try {
			// Parser.g:660:5: ( K_CREATE ( K_OR K_REPLACE )? K_AGGREGATE ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' K_SFUNC sfunc= allowedFunctionName K_STYPE stype= comparatorType ( K_FINALFUNC ffunc= allowedFunctionName )? ( K_INITCOND ival= term )? )
			// Parser.g:660:7: K_CREATE ( K_OR K_REPLACE )? K_AGGREGATE ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' K_SFUNC sfunc= allowedFunctionName K_STYPE stype= comparatorType ( K_FINALFUNC ffunc= allowedFunctionName )? ( K_INITCOND ival= term )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createAggregateStatement4104); if (state.failed) return stmt;
			// Parser.g:660:16: ( K_OR K_REPLACE )?
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==K_OR) ) {
				alt67=1;
			}
			switch (alt67) {
				case 1 :
					// Parser.g:660:17: K_OR K_REPLACE
					{
					match(input,K_OR,FOLLOW_K_OR_in_createAggregateStatement4107); if (state.failed) return stmt;
					match(input,K_REPLACE,FOLLOW_K_REPLACE_in_createAggregateStatement4109); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { orReplace = true; }
					}
					break;

			}

			match(input,K_AGGREGATE,FOLLOW_K_AGGREGATE_in_createAggregateStatement4121); if (state.failed) return stmt;
			// Parser.g:662:7: ( K_IF K_NOT K_EXISTS )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==K_IF) ) {
				alt68=1;
			}
			switch (alt68) {
				case 1 :
					// Parser.g:662:8: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createAggregateStatement4130); if (state.failed) return stmt;
					match(input,K_NOT,FOLLOW_K_NOT_in_createAggregateStatement4132); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createAggregateStatement4134); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_functionName_in_createAggregateStatement4148);
			fn=functionName();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,200,FOLLOW_200_in_createAggregateStatement4156); if (state.failed) return stmt;
			// Parser.g:665:9: (v= comparatorType ( ',' v= comparatorType )* )?
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==IDENT||LA70_0==K_ACCESS||(LA70_0 >= K_AGGREGATE && LA70_0 <= K_ALL)||LA70_0==K_AS||LA70_0==K_ASCII||(LA70_0 >= K_BIGINT && LA70_0 <= K_BOOLEAN)||(LA70_0 >= K_CALLED && LA70_0 <= K_CLUSTERING)||(LA70_0 >= K_COMPACT && LA70_0 <= K_COUNTER)||(LA70_0 >= K_CUSTOM && LA70_0 <= K_DEFAULT)||(LA70_0 >= K_DISTINCT && LA70_0 <= K_DOUBLE)||LA70_0==K_DURATION||(LA70_0 >= K_EXISTS && LA70_0 <= K_FLOAT)||LA70_0==K_FROZEN||(LA70_0 >= K_FUNCTION && LA70_0 <= K_FUNCTIONS)||LA70_0==K_GROUP||(LA70_0 >= K_INET && LA70_0 <= K_INPUT)||(LA70_0 >= K_INT && LA70_0 <= K_INTERNALS)||(LA70_0 >= K_JSON && LA70_0 <= K_KEYS)||(LA70_0 >= K_KEYSPACES && LA70_0 <= K_LIKE)||(LA70_0 >= K_LIST && LA70_0 <= K_MAP)||(LA70_0 >= K_MBEAN && LA70_0 <= K_MBEANS)||LA70_0==K_NOLOGIN||LA70_0==K_NOSUPERUSER||(LA70_0 >= K_ONLY && LA70_0 <= K_OPTIONS)||(LA70_0 >= K_PARTITION && LA70_0 <= K_PERMISSIONS)||(LA70_0 >= K_REPLACE && LA70_0 <= K_RETURNS)||(LA70_0 >= K_ROLE && LA70_0 <= K_ROLES)||(LA70_0 >= K_SET && LA70_0 <= K_TINYINT)||LA70_0==K_TRIGGER||(LA70_0 >= K_TTL && LA70_0 <= K_TYPES)||LA70_0==K_UNSET||(LA70_0 >= K_USER && LA70_0 <= K_USERS)||(LA70_0 >= K_UUID && LA70_0 <= K_VARINT)||LA70_0==K_WRITETIME||LA70_0==QUOTED_NAME||LA70_0==STRING_LITERAL) ) {
				alt70=1;
			}
			switch (alt70) {
				case 1 :
					// Parser.g:666:11: v= comparatorType ( ',' v= comparatorType )*
					{
					pushFollow(FOLLOW_comparatorType_in_createAggregateStatement4180);
					v=comparatorType();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { argTypes.add(v); }
					// Parser.g:667:11: ( ',' v= comparatorType )*
					loop69:
					while (true) {
						int alt69=2;
						int LA69_0 = input.LA(1);
						if ( (LA69_0==204) ) {
							alt69=1;
						}

						switch (alt69) {
						case 1 :
							// Parser.g:667:13: ',' v= comparatorType
							{
							match(input,204,FOLLOW_204_in_createAggregateStatement4196); if (state.failed) return stmt;
							pushFollow(FOLLOW_comparatorType_in_createAggregateStatement4200);
							v=comparatorType();
							state._fsp--;
							if (state.failed) return stmt;
							if ( state.backtracking==0 ) { argTypes.add(v); }
							}
							break;

						default :
							break loop69;
						}
					}

					}
					break;

			}

			match(input,201,FOLLOW_201_in_createAggregateStatement4224); if (state.failed) return stmt;
			match(input,K_SFUNC,FOLLOW_K_SFUNC_in_createAggregateStatement4232); if (state.failed) return stmt;
			pushFollow(FOLLOW_allowedFunctionName_in_createAggregateStatement4238);
			sfunc=allowedFunctionName();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_STYPE,FOLLOW_K_STYPE_in_createAggregateStatement4246); if (state.failed) return stmt;
			pushFollow(FOLLOW_comparatorType_in_createAggregateStatement4252);
			stype=comparatorType();
			state._fsp--;
			if (state.failed) return stmt;
			// Parser.g:672:7: ( K_FINALFUNC ffunc= allowedFunctionName )?
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==K_FINALFUNC) ) {
				alt71=1;
			}
			switch (alt71) {
				case 1 :
					// Parser.g:673:9: K_FINALFUNC ffunc= allowedFunctionName
					{
					match(input,K_FINALFUNC,FOLLOW_K_FINALFUNC_in_createAggregateStatement4270); if (state.failed) return stmt;
					pushFollow(FOLLOW_allowedFunctionName_in_createAggregateStatement4276);
					ffunc=allowedFunctionName();
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			// Parser.g:675:7: ( K_INITCOND ival= term )?
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==K_INITCOND) ) {
				alt72=1;
			}
			switch (alt72) {
				case 1 :
					// Parser.g:676:9: K_INITCOND ival= term
					{
					match(input,K_INITCOND,FOLLOW_K_INITCOND_in_createAggregateStatement4303); if (state.failed) return stmt;
					pushFollow(FOLLOW_term_in_createAggregateStatement4309);
					ival=term();
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			if ( state.backtracking==0 ) { stmt = new CreateAggregateStatement.Raw(fn, argTypes, stype, sfunc, ffunc, ival, orReplace, ifNotExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createAggregateStatement"



	// $ANTLR start "dropAggregateStatement"
	// Parser.g:681:1: dropAggregateStatement returns [DropAggregateStatement.Raw stmt] : K_DROP K_AGGREGATE ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )? ;
	public final DropAggregateStatement.Raw dropAggregateStatement() throws RecognitionException {
		DropAggregateStatement.Raw stmt = null;


		FunctionName fn =null;
		CQL3Type.Raw v =null;


		        boolean ifExists = false;
		        List<CQL3Type.Raw> argTypes = new ArrayList<>();
		        boolean argsSpecified = false;
		    
		try {
			// Parser.g:687:5: ( K_DROP K_AGGREGATE ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )? )
			// Parser.g:687:7: K_DROP K_AGGREGATE ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )?
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropAggregateStatement4356); if (state.failed) return stmt;
			match(input,K_AGGREGATE,FOLLOW_K_AGGREGATE_in_dropAggregateStatement4358); if (state.failed) return stmt;
			// Parser.g:688:7: ( K_IF K_EXISTS )?
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==K_IF) ) {
				alt73=1;
			}
			switch (alt73) {
				case 1 :
					// Parser.g:688:8: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropAggregateStatement4367); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropAggregateStatement4369); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_functionName_in_dropAggregateStatement4384);
			fn=functionName();
			state._fsp--;
			if (state.failed) return stmt;
			// Parser.g:690:7: ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==200) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// Parser.g:691:9: '(' (v= comparatorType ( ',' v= comparatorType )* )? ')'
					{
					match(input,200,FOLLOW_200_in_dropAggregateStatement4402); if (state.failed) return stmt;
					// Parser.g:692:11: (v= comparatorType ( ',' v= comparatorType )* )?
					int alt75=2;
					int LA75_0 = input.LA(1);
					if ( (LA75_0==IDENT||LA75_0==K_ACCESS||(LA75_0 >= K_AGGREGATE && LA75_0 <= K_ALL)||LA75_0==K_AS||LA75_0==K_ASCII||(LA75_0 >= K_BIGINT && LA75_0 <= K_BOOLEAN)||(LA75_0 >= K_CALLED && LA75_0 <= K_CLUSTERING)||(LA75_0 >= K_COMPACT && LA75_0 <= K_COUNTER)||(LA75_0 >= K_CUSTOM && LA75_0 <= K_DEFAULT)||(LA75_0 >= K_DISTINCT && LA75_0 <= K_DOUBLE)||LA75_0==K_DURATION||(LA75_0 >= K_EXISTS && LA75_0 <= K_FLOAT)||LA75_0==K_FROZEN||(LA75_0 >= K_FUNCTION && LA75_0 <= K_FUNCTIONS)||LA75_0==K_GROUP||(LA75_0 >= K_INET && LA75_0 <= K_INPUT)||(LA75_0 >= K_INT && LA75_0 <= K_INTERNALS)||(LA75_0 >= K_JSON && LA75_0 <= K_KEYS)||(LA75_0 >= K_KEYSPACES && LA75_0 <= K_LIKE)||(LA75_0 >= K_LIST && LA75_0 <= K_MAP)||(LA75_0 >= K_MBEAN && LA75_0 <= K_MBEANS)||LA75_0==K_NOLOGIN||LA75_0==K_NOSUPERUSER||(LA75_0 >= K_ONLY && LA75_0 <= K_OPTIONS)||(LA75_0 >= K_PARTITION && LA75_0 <= K_PERMISSIONS)||(LA75_0 >= K_REPLACE && LA75_0 <= K_RETURNS)||(LA75_0 >= K_ROLE && LA75_0 <= K_ROLES)||(LA75_0 >= K_SET && LA75_0 <= K_TINYINT)||LA75_0==K_TRIGGER||(LA75_0 >= K_TTL && LA75_0 <= K_TYPES)||LA75_0==K_UNSET||(LA75_0 >= K_USER && LA75_0 <= K_USERS)||(LA75_0 >= K_UUID && LA75_0 <= K_VARINT)||LA75_0==K_WRITETIME||LA75_0==QUOTED_NAME||LA75_0==STRING_LITERAL) ) {
						alt75=1;
					}
					switch (alt75) {
						case 1 :
							// Parser.g:693:13: v= comparatorType ( ',' v= comparatorType )*
							{
							pushFollow(FOLLOW_comparatorType_in_dropAggregateStatement4430);
							v=comparatorType();
							state._fsp--;
							if (state.failed) return stmt;
							if ( state.backtracking==0 ) { argTypes.add(v); }
							// Parser.g:694:13: ( ',' v= comparatorType )*
							loop74:
							while (true) {
								int alt74=2;
								int LA74_0 = input.LA(1);
								if ( (LA74_0==204) ) {
									alt74=1;
								}

								switch (alt74) {
								case 1 :
									// Parser.g:694:15: ',' v= comparatorType
									{
									match(input,204,FOLLOW_204_in_dropAggregateStatement4448); if (state.failed) return stmt;
									pushFollow(FOLLOW_comparatorType_in_dropAggregateStatement4452);
									v=comparatorType();
									state._fsp--;
									if (state.failed) return stmt;
									if ( state.backtracking==0 ) { argTypes.add(v); }
									}
									break;

								default :
									break loop74;
								}
							}

							}
							break;

					}

					match(input,201,FOLLOW_201_in_dropAggregateStatement4480); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { argsSpecified = true; }
					}
					break;

			}

			if ( state.backtracking==0 ) { stmt = new DropAggregateStatement.Raw(fn, argTypes, argsSpecified, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropAggregateStatement"



	// $ANTLR start "createFunctionStatement"
	// Parser.g:702:1: createFunctionStatement returns [CreateFunctionStatement.Raw stmt] : K_CREATE ( K_OR K_REPLACE )? K_FUNCTION ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )* )? ')' ( ( K_RETURNS K_NULL ) | ( K_CALLED ) ) K_ON K_NULL K_INPUT K_RETURNS returnType= comparatorType K_LANGUAGE language= IDENT K_AS body= STRING_LITERAL ;
	public final CreateFunctionStatement.Raw createFunctionStatement() throws RecognitionException {
		CreateFunctionStatement.Raw stmt = null;


		Token language=null;
		Token body=null;
		FunctionName fn =null;
		ColumnIdentifier k =null;
		CQL3Type.Raw v =null;
		CQL3Type.Raw returnType =null;


		        boolean orReplace = false;
		        boolean ifNotExists = false;

		        List<ColumnIdentifier> argNames = new ArrayList<>();
		        List<CQL3Type.Raw> argTypes = new ArrayList<>();
		        boolean calledOnNullInput = false;
		    
		try {
			// Parser.g:711:5: ( K_CREATE ( K_OR K_REPLACE )? K_FUNCTION ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )* )? ')' ( ( K_RETURNS K_NULL ) | ( K_CALLED ) ) K_ON K_NULL K_INPUT K_RETURNS returnType= comparatorType K_LANGUAGE language= IDENT K_AS body= STRING_LITERAL )
			// Parser.g:711:7: K_CREATE ( K_OR K_REPLACE )? K_FUNCTION ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )* )? ')' ( ( K_RETURNS K_NULL ) | ( K_CALLED ) ) K_ON K_NULL K_INPUT K_RETURNS returnType= comparatorType K_LANGUAGE language= IDENT K_AS body= STRING_LITERAL
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createFunctionStatement4537); if (state.failed) return stmt;
			// Parser.g:711:16: ( K_OR K_REPLACE )?
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==K_OR) ) {
				alt77=1;
			}
			switch (alt77) {
				case 1 :
					// Parser.g:711:17: K_OR K_REPLACE
					{
					match(input,K_OR,FOLLOW_K_OR_in_createFunctionStatement4540); if (state.failed) return stmt;
					match(input,K_REPLACE,FOLLOW_K_REPLACE_in_createFunctionStatement4542); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { orReplace = true; }
					}
					break;

			}

			match(input,K_FUNCTION,FOLLOW_K_FUNCTION_in_createFunctionStatement4554); if (state.failed) return stmt;
			// Parser.g:713:7: ( K_IF K_NOT K_EXISTS )?
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==K_IF) ) {
				alt78=1;
			}
			switch (alt78) {
				case 1 :
					// Parser.g:713:8: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createFunctionStatement4563); if (state.failed) return stmt;
					match(input,K_NOT,FOLLOW_K_NOT_in_createFunctionStatement4565); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createFunctionStatement4567); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_functionName_in_createFunctionStatement4581);
			fn=functionName();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,200,FOLLOW_200_in_createFunctionStatement4589); if (state.failed) return stmt;
			// Parser.g:716:9: (k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )* )?
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==IDENT||LA80_0==K_ACCESS||(LA80_0 >= K_AGGREGATE && LA80_0 <= K_ALL)||LA80_0==K_AS||LA80_0==K_ASCII||(LA80_0 >= K_BIGINT && LA80_0 <= K_BOOLEAN)||(LA80_0 >= K_CALLED && LA80_0 <= K_CLUSTERING)||(LA80_0 >= K_COMPACT && LA80_0 <= K_COUNTER)||(LA80_0 >= K_CUSTOM && LA80_0 <= K_DEFAULT)||(LA80_0 >= K_DISTINCT && LA80_0 <= K_DOUBLE)||LA80_0==K_DURATION||(LA80_0 >= K_EXISTS && LA80_0 <= K_FLOAT)||LA80_0==K_FROZEN||(LA80_0 >= K_FUNCTION && LA80_0 <= K_FUNCTIONS)||LA80_0==K_GROUP||(LA80_0 >= K_INET && LA80_0 <= K_INPUT)||(LA80_0 >= K_INT && LA80_0 <= K_INTERNALS)||(LA80_0 >= K_JSON && LA80_0 <= K_KEYS)||(LA80_0 >= K_KEYSPACES && LA80_0 <= K_LIKE)||(LA80_0 >= K_LIST && LA80_0 <= K_MAP)||(LA80_0 >= K_MBEAN && LA80_0 <= K_MBEANS)||LA80_0==K_NOLOGIN||LA80_0==K_NOSUPERUSER||(LA80_0 >= K_ONLY && LA80_0 <= K_OPTIONS)||(LA80_0 >= K_PARTITION && LA80_0 <= K_PERMISSIONS)||(LA80_0 >= K_REPLACE && LA80_0 <= K_RETURNS)||(LA80_0 >= K_ROLE && LA80_0 <= K_ROLES)||(LA80_0 >= K_SFUNC && LA80_0 <= K_TINYINT)||LA80_0==K_TRIGGER||(LA80_0 >= K_TTL && LA80_0 <= K_TYPES)||LA80_0==K_UNSET||(LA80_0 >= K_USER && LA80_0 <= K_USERS)||(LA80_0 >= K_UUID && LA80_0 <= K_VARINT)||LA80_0==K_WRITETIME||LA80_0==QUOTED_NAME) ) {
				alt80=1;
			}
			switch (alt80) {
				case 1 :
					// Parser.g:717:11: k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )*
					{
					pushFollow(FOLLOW_noncol_ident_in_createFunctionStatement4613);
					k=noncol_ident();
					state._fsp--;
					if (state.failed) return stmt;
					pushFollow(FOLLOW_comparatorType_in_createFunctionStatement4617);
					v=comparatorType();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { argNames.add(k); argTypes.add(v); }
					// Parser.g:718:11: ( ',' k= noncol_ident v= comparatorType )*
					loop79:
					while (true) {
						int alt79=2;
						int LA79_0 = input.LA(1);
						if ( (LA79_0==204) ) {
							alt79=1;
						}

						switch (alt79) {
						case 1 :
							// Parser.g:718:13: ',' k= noncol_ident v= comparatorType
							{
							match(input,204,FOLLOW_204_in_createFunctionStatement4633); if (state.failed) return stmt;
							pushFollow(FOLLOW_noncol_ident_in_createFunctionStatement4637);
							k=noncol_ident();
							state._fsp--;
							if (state.failed) return stmt;
							pushFollow(FOLLOW_comparatorType_in_createFunctionStatement4641);
							v=comparatorType();
							state._fsp--;
							if (state.failed) return stmt;
							if ( state.backtracking==0 ) { argNames.add(k); argTypes.add(v); }
							}
							break;

						default :
							break loop79;
						}
					}

					}
					break;

			}

			match(input,201,FOLLOW_201_in_createFunctionStatement4665); if (state.failed) return stmt;
			// Parser.g:721:7: ( ( K_RETURNS K_NULL ) | ( K_CALLED ) )
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==K_RETURNS) ) {
				alt81=1;
			}
			else if ( (LA81_0==K_CALLED) ) {
				alt81=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return stmt;}
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}

			switch (alt81) {
				case 1 :
					// Parser.g:721:9: ( K_RETURNS K_NULL )
					{
					// Parser.g:721:9: ( K_RETURNS K_NULL )
					// Parser.g:721:10: K_RETURNS K_NULL
					{
					match(input,K_RETURNS,FOLLOW_K_RETURNS_in_createFunctionStatement4676); if (state.failed) return stmt;
					match(input,K_NULL,FOLLOW_K_NULL_in_createFunctionStatement4678); if (state.failed) return stmt;
					}

					}
					break;
				case 2 :
					// Parser.g:721:30: ( K_CALLED )
					{
					// Parser.g:721:30: ( K_CALLED )
					// Parser.g:721:31: K_CALLED
					{
					match(input,K_CALLED,FOLLOW_K_CALLED_in_createFunctionStatement4684); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { calledOnNullInput=true; }
					}

					}
					break;

			}

			match(input,K_ON,FOLLOW_K_ON_in_createFunctionStatement4690); if (state.failed) return stmt;
			match(input,K_NULL,FOLLOW_K_NULL_in_createFunctionStatement4692); if (state.failed) return stmt;
			match(input,K_INPUT,FOLLOW_K_INPUT_in_createFunctionStatement4694); if (state.failed) return stmt;
			match(input,K_RETURNS,FOLLOW_K_RETURNS_in_createFunctionStatement4702); if (state.failed) return stmt;
			pushFollow(FOLLOW_comparatorType_in_createFunctionStatement4708);
			returnType=comparatorType();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_LANGUAGE,FOLLOW_K_LANGUAGE_in_createFunctionStatement4716); if (state.failed) return stmt;
			language=(Token)match(input,IDENT,FOLLOW_IDENT_in_createFunctionStatement4722); if (state.failed) return stmt;
			match(input,K_AS,FOLLOW_K_AS_in_createFunctionStatement4730); if (state.failed) return stmt;
			body=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createFunctionStatement4736); if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new CreateFunctionStatement.Raw(
			          fn, argNames, argTypes, returnType, calledOnNullInput, (language!=null?language.getText():null).toLowerCase(), (body!=null?body.getText():null), orReplace, ifNotExists);
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createFunctionStatement"



	// $ANTLR start "dropFunctionStatement"
	// Parser.g:730:1: dropFunctionStatement returns [DropFunctionStatement.Raw stmt] : K_DROP K_FUNCTION ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )? ;
	public final DropFunctionStatement.Raw dropFunctionStatement() throws RecognitionException {
		DropFunctionStatement.Raw stmt = null;


		FunctionName fn =null;
		CQL3Type.Raw v =null;


		        boolean ifExists = false;
		        List<CQL3Type.Raw> argTypes = new ArrayList<>();
		        boolean argsSpecified = false;
		    
		try {
			// Parser.g:736:5: ( K_DROP K_FUNCTION ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )? )
			// Parser.g:736:7: K_DROP K_FUNCTION ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )?
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropFunctionStatement4774); if (state.failed) return stmt;
			match(input,K_FUNCTION,FOLLOW_K_FUNCTION_in_dropFunctionStatement4776); if (state.failed) return stmt;
			// Parser.g:737:7: ( K_IF K_EXISTS )?
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==K_IF) ) {
				alt82=1;
			}
			switch (alt82) {
				case 1 :
					// Parser.g:737:8: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropFunctionStatement4785); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropFunctionStatement4787); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_functionName_in_dropFunctionStatement4802);
			fn=functionName();
			state._fsp--;
			if (state.failed) return stmt;
			// Parser.g:739:7: ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )?
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==200) ) {
				alt85=1;
			}
			switch (alt85) {
				case 1 :
					// Parser.g:740:9: '(' (v= comparatorType ( ',' v= comparatorType )* )? ')'
					{
					match(input,200,FOLLOW_200_in_dropFunctionStatement4820); if (state.failed) return stmt;
					// Parser.g:741:11: (v= comparatorType ( ',' v= comparatorType )* )?
					int alt84=2;
					int LA84_0 = input.LA(1);
					if ( (LA84_0==IDENT||LA84_0==K_ACCESS||(LA84_0 >= K_AGGREGATE && LA84_0 <= K_ALL)||LA84_0==K_AS||LA84_0==K_ASCII||(LA84_0 >= K_BIGINT && LA84_0 <= K_BOOLEAN)||(LA84_0 >= K_CALLED && LA84_0 <= K_CLUSTERING)||(LA84_0 >= K_COMPACT && LA84_0 <= K_COUNTER)||(LA84_0 >= K_CUSTOM && LA84_0 <= K_DEFAULT)||(LA84_0 >= K_DISTINCT && LA84_0 <= K_DOUBLE)||LA84_0==K_DURATION||(LA84_0 >= K_EXISTS && LA84_0 <= K_FLOAT)||LA84_0==K_FROZEN||(LA84_0 >= K_FUNCTION && LA84_0 <= K_FUNCTIONS)||LA84_0==K_GROUP||(LA84_0 >= K_INET && LA84_0 <= K_INPUT)||(LA84_0 >= K_INT && LA84_0 <= K_INTERNALS)||(LA84_0 >= K_JSON && LA84_0 <= K_KEYS)||(LA84_0 >= K_KEYSPACES && LA84_0 <= K_LIKE)||(LA84_0 >= K_LIST && LA84_0 <= K_MAP)||(LA84_0 >= K_MBEAN && LA84_0 <= K_MBEANS)||LA84_0==K_NOLOGIN||LA84_0==K_NOSUPERUSER||(LA84_0 >= K_ONLY && LA84_0 <= K_OPTIONS)||(LA84_0 >= K_PARTITION && LA84_0 <= K_PERMISSIONS)||(LA84_0 >= K_REPLACE && LA84_0 <= K_RETURNS)||(LA84_0 >= K_ROLE && LA84_0 <= K_ROLES)||(LA84_0 >= K_SET && LA84_0 <= K_TINYINT)||LA84_0==K_TRIGGER||(LA84_0 >= K_TTL && LA84_0 <= K_TYPES)||LA84_0==K_UNSET||(LA84_0 >= K_USER && LA84_0 <= K_USERS)||(LA84_0 >= K_UUID && LA84_0 <= K_VARINT)||LA84_0==K_WRITETIME||LA84_0==QUOTED_NAME||LA84_0==STRING_LITERAL) ) {
						alt84=1;
					}
					switch (alt84) {
						case 1 :
							// Parser.g:742:13: v= comparatorType ( ',' v= comparatorType )*
							{
							pushFollow(FOLLOW_comparatorType_in_dropFunctionStatement4848);
							v=comparatorType();
							state._fsp--;
							if (state.failed) return stmt;
							if ( state.backtracking==0 ) { argTypes.add(v); }
							// Parser.g:743:13: ( ',' v= comparatorType )*
							loop83:
							while (true) {
								int alt83=2;
								int LA83_0 = input.LA(1);
								if ( (LA83_0==204) ) {
									alt83=1;
								}

								switch (alt83) {
								case 1 :
									// Parser.g:743:15: ',' v= comparatorType
									{
									match(input,204,FOLLOW_204_in_dropFunctionStatement4866); if (state.failed) return stmt;
									pushFollow(FOLLOW_comparatorType_in_dropFunctionStatement4870);
									v=comparatorType();
									state._fsp--;
									if (state.failed) return stmt;
									if ( state.backtracking==0 ) { argTypes.add(v); }
									}
									break;

								default :
									break loop83;
								}
							}

							}
							break;

					}

					match(input,201,FOLLOW_201_in_dropFunctionStatement4898); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { argsSpecified = true; }
					}
					break;

			}

			if ( state.backtracking==0 ) { stmt = new DropFunctionStatement.Raw(fn, argTypes, argsSpecified, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropFunctionStatement"



	// $ANTLR start "createKeyspaceStatement"
	// Parser.g:754:1: createKeyspaceStatement returns [CreateKeyspaceStatement.Raw stmt] : K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs] ;
	public final CreateKeyspaceStatement.Raw createKeyspaceStatement() throws RecognitionException {
		CreateKeyspaceStatement.Raw stmt = null;


		String ks =null;


		        KeyspaceAttributes attrs = new KeyspaceAttributes();
		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:759:5: ( K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs] )
			// Parser.g:759:7: K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs]
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createKeyspaceStatement4957); if (state.failed) return stmt;
			match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_createKeyspaceStatement4959); if (state.failed) return stmt;
			// Parser.g:759:27: ( K_IF K_NOT K_EXISTS )?
			int alt86=2;
			int LA86_0 = input.LA(1);
			if ( (LA86_0==K_IF) ) {
				alt86=1;
			}
			switch (alt86) {
				case 1 :
					// Parser.g:759:28: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createKeyspaceStatement4962); if (state.failed) return stmt;
					match(input,K_NOT,FOLLOW_K_NOT_in_createKeyspaceStatement4964); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createKeyspaceStatement4966); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_keyspaceName_in_createKeyspaceStatement4975);
			ks=keyspaceName();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_WITH,FOLLOW_K_WITH_in_createKeyspaceStatement4983); if (state.failed) return stmt;
			pushFollow(FOLLOW_properties_in_createKeyspaceStatement4985);
			properties(attrs);
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new CreateKeyspaceStatement.Raw(ks, attrs, ifNotExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createKeyspaceStatement"



	// $ANTLR start "createTableStatement"
	// Parser.g:770:1: createTableStatement returns [CreateTableStatement.Raw stmt] : K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName tableDefinition[stmt] ;
	public final CreateTableStatement.Raw createTableStatement() throws RecognitionException {
		CreateTableStatement.Raw stmt = null;


		QualifiedName cf =null;

		 boolean ifNotExists = false; 
		try {
			// Parser.g:772:5: ( K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName tableDefinition[stmt] )
			// Parser.g:772:7: K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName tableDefinition[stmt]
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createTableStatement5020); if (state.failed) return stmt;
			match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_createTableStatement5022); if (state.failed) return stmt;
			// Parser.g:772:31: ( K_IF K_NOT K_EXISTS )?
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==K_IF) ) {
				alt87=1;
			}
			switch (alt87) {
				case 1 :
					// Parser.g:772:32: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createTableStatement5025); if (state.failed) return stmt;
					match(input,K_NOT,FOLLOW_K_NOT_in_createTableStatement5027); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createTableStatement5029); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_createTableStatement5044);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new CreateTableStatement.Raw(cf, ifNotExists); }
			pushFollow(FOLLOW_tableDefinition_in_createTableStatement5054);
			tableDefinition(stmt);
			state._fsp--;
			if (state.failed) return stmt;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createTableStatement"



	// $ANTLR start "tableDefinition"
	// Parser.g:777:1: tableDefinition[CreateTableStatement.Raw stmt] : '(' tableColumns[stmt] ( ',' ( tableColumns[stmt] )? )* ')' ( K_WITH tableProperty[stmt] ( K_AND tableProperty[stmt] )* )? ;
	public final void tableDefinition(CreateTableStatement.Raw stmt) throws RecognitionException {
		try {
			// Parser.g:778:5: ( '(' tableColumns[stmt] ( ',' ( tableColumns[stmt] )? )* ')' ( K_WITH tableProperty[stmt] ( K_AND tableProperty[stmt] )* )? )
			// Parser.g:778:7: '(' tableColumns[stmt] ( ',' ( tableColumns[stmt] )? )* ')' ( K_WITH tableProperty[stmt] ( K_AND tableProperty[stmt] )* )?
			{
			match(input,200,FOLLOW_200_in_tableDefinition5073); if (state.failed) return;
			pushFollow(FOLLOW_tableColumns_in_tableDefinition5075);
			tableColumns(stmt);
			state._fsp--;
			if (state.failed) return;
			// Parser.g:778:30: ( ',' ( tableColumns[stmt] )? )*
			loop89:
			while (true) {
				int alt89=2;
				int LA89_0 = input.LA(1);
				if ( (LA89_0==204) ) {
					alt89=1;
				}

				switch (alt89) {
				case 1 :
					// Parser.g:778:32: ',' ( tableColumns[stmt] )?
					{
					match(input,204,FOLLOW_204_in_tableDefinition5080); if (state.failed) return;
					// Parser.g:778:36: ( tableColumns[stmt] )?
					int alt88=2;
					int LA88_0 = input.LA(1);
					if ( (LA88_0==IDENT||LA88_0==K_ACCESS||(LA88_0 >= K_AGGREGATE && LA88_0 <= K_ALL)||LA88_0==K_AS||LA88_0==K_ASCII||(LA88_0 >= K_BIGINT && LA88_0 <= K_BOOLEAN)||(LA88_0 >= K_CALLED && LA88_0 <= K_CLUSTERING)||(LA88_0 >= K_COMPACT && LA88_0 <= K_COUNTER)||(LA88_0 >= K_CUSTOM && LA88_0 <= K_DEFAULT)||(LA88_0 >= K_DISTINCT && LA88_0 <= K_DOUBLE)||LA88_0==K_DURATION||(LA88_0 >= K_EXISTS && LA88_0 <= K_FLOAT)||LA88_0==K_FROZEN||(LA88_0 >= K_FUNCTION && LA88_0 <= K_FUNCTIONS)||LA88_0==K_GROUP||(LA88_0 >= K_INET && LA88_0 <= K_INPUT)||(LA88_0 >= K_INT && LA88_0 <= K_INTERNALS)||(LA88_0 >= K_JSON && LA88_0 <= K_KEYS)||(LA88_0 >= K_KEYSPACES && LA88_0 <= K_LIKE)||(LA88_0 >= K_LIST && LA88_0 <= K_MAP)||(LA88_0 >= K_MBEAN && LA88_0 <= K_MBEANS)||LA88_0==K_NOLOGIN||LA88_0==K_NOSUPERUSER||(LA88_0 >= K_ONLY && LA88_0 <= K_OPTIONS)||(LA88_0 >= K_PARTITION && LA88_0 <= K_PERMISSIONS)||LA88_0==K_PRIMARY||(LA88_0 >= K_REPLACE && LA88_0 <= K_RETURNS)||(LA88_0 >= K_ROLE && LA88_0 <= K_ROLES)||(LA88_0 >= K_SFUNC && LA88_0 <= K_TINYINT)||LA88_0==K_TRIGGER||(LA88_0 >= K_TTL && LA88_0 <= K_TYPES)||LA88_0==K_UNSET||(LA88_0 >= K_USER && LA88_0 <= K_USERS)||(LA88_0 >= K_UUID && LA88_0 <= K_VARINT)||LA88_0==K_WRITETIME||LA88_0==QUOTED_NAME) ) {
						alt88=1;
					}
					switch (alt88) {
						case 1 :
							// Parser.g:778:36: tableColumns[stmt]
							{
							pushFollow(FOLLOW_tableColumns_in_tableDefinition5082);
							tableColumns(stmt);
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;

				default :
					break loop89;
				}
			}

			match(input,201,FOLLOW_201_in_tableDefinition5089); if (state.failed) return;
			// Parser.g:779:7: ( K_WITH tableProperty[stmt] ( K_AND tableProperty[stmt] )* )?
			int alt91=2;
			int LA91_0 = input.LA(1);
			if ( (LA91_0==K_WITH) ) {
				alt91=1;
			}
			switch (alt91) {
				case 1 :
					// Parser.g:779:9: K_WITH tableProperty[stmt] ( K_AND tableProperty[stmt] )*
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_tableDefinition5099); if (state.failed) return;
					pushFollow(FOLLOW_tableProperty_in_tableDefinition5101);
					tableProperty(stmt);
					state._fsp--;
					if (state.failed) return;
					// Parser.g:779:36: ( K_AND tableProperty[stmt] )*
					loop90:
					while (true) {
						int alt90=2;
						int LA90_0 = input.LA(1);
						if ( (LA90_0==K_AND) ) {
							alt90=1;
						}

						switch (alt90) {
						case 1 :
							// Parser.g:779:38: K_AND tableProperty[stmt]
							{
							match(input,K_AND,FOLLOW_K_AND_in_tableDefinition5106); if (state.failed) return;
							pushFollow(FOLLOW_tableProperty_in_tableDefinition5108);
							tableProperty(stmt);
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop90;
						}
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tableDefinition"



	// $ANTLR start "tableColumns"
	// Parser.g:782:1: tableColumns[CreateTableStatement.Raw stmt] : (k= ident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' tablePartitionKey[stmt] ( ',' c= ident )* ')' );
	public final void tableColumns(CreateTableStatement.Raw stmt) throws RecognitionException {
		ColumnIdentifier k =null;
		CQL3Type.Raw v =null;
		ColumnIdentifier c =null;

		 boolean isStatic = false; 
		try {
			// Parser.g:784:5: (k= ident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' tablePartitionKey[stmt] ( ',' c= ident )* ')' )
			int alt95=2;
			int LA95_0 = input.LA(1);
			if ( (LA95_0==IDENT||LA95_0==K_ACCESS||(LA95_0 >= K_AGGREGATE && LA95_0 <= K_ALL)||LA95_0==K_AS||LA95_0==K_ASCII||(LA95_0 >= K_BIGINT && LA95_0 <= K_BOOLEAN)||(LA95_0 >= K_CALLED && LA95_0 <= K_CLUSTERING)||(LA95_0 >= K_COMPACT && LA95_0 <= K_COUNTER)||(LA95_0 >= K_CUSTOM && LA95_0 <= K_DEFAULT)||(LA95_0 >= K_DISTINCT && LA95_0 <= K_DOUBLE)||LA95_0==K_DURATION||(LA95_0 >= K_EXISTS && LA95_0 <= K_FLOAT)||LA95_0==K_FROZEN||(LA95_0 >= K_FUNCTION && LA95_0 <= K_FUNCTIONS)||LA95_0==K_GROUP||(LA95_0 >= K_INET && LA95_0 <= K_INPUT)||(LA95_0 >= K_INT && LA95_0 <= K_INTERNALS)||(LA95_0 >= K_JSON && LA95_0 <= K_KEYS)||(LA95_0 >= K_KEYSPACES && LA95_0 <= K_LIKE)||(LA95_0 >= K_LIST && LA95_0 <= K_MAP)||(LA95_0 >= K_MBEAN && LA95_0 <= K_MBEANS)||LA95_0==K_NOLOGIN||LA95_0==K_NOSUPERUSER||(LA95_0 >= K_ONLY && LA95_0 <= K_OPTIONS)||(LA95_0 >= K_PARTITION && LA95_0 <= K_PERMISSIONS)||(LA95_0 >= K_REPLACE && LA95_0 <= K_RETURNS)||(LA95_0 >= K_ROLE && LA95_0 <= K_ROLES)||(LA95_0 >= K_SFUNC && LA95_0 <= K_TINYINT)||LA95_0==K_TRIGGER||(LA95_0 >= K_TTL && LA95_0 <= K_TYPES)||LA95_0==K_UNSET||(LA95_0 >= K_USER && LA95_0 <= K_USERS)||(LA95_0 >= K_UUID && LA95_0 <= K_VARINT)||LA95_0==K_WRITETIME||LA95_0==QUOTED_NAME) ) {
				alt95=1;
			}
			else if ( (LA95_0==K_PRIMARY) ) {
				alt95=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 95, 0, input);
				throw nvae;
			}

			switch (alt95) {
				case 1 :
					// Parser.g:784:7: k= ident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )?
					{
					pushFollow(FOLLOW_ident_in_tableColumns5143);
					k=ident();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_comparatorType_in_tableColumns5147);
					v=comparatorType();
					state._fsp--;
					if (state.failed) return;
					// Parser.g:784:32: ( K_STATIC )?
					int alt92=2;
					int LA92_0 = input.LA(1);
					if ( (LA92_0==K_STATIC) ) {
						alt92=1;
					}
					switch (alt92) {
						case 1 :
							// Parser.g:784:33: K_STATIC
							{
							match(input,K_STATIC,FOLLOW_K_STATIC_in_tableColumns5150); if (state.failed) return;
							if ( state.backtracking==0 ) { isStatic = true; }
							}
							break;

					}

					if ( state.backtracking==0 ) { stmt.addColumn(k, v, isStatic); }
					// Parser.g:785:9: ( K_PRIMARY K_KEY )?
					int alt93=2;
					int LA93_0 = input.LA(1);
					if ( (LA93_0==K_PRIMARY) ) {
						alt93=1;
					}
					switch (alt93) {
						case 1 :
							// Parser.g:785:10: K_PRIMARY K_KEY
							{
							match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_tableColumns5167); if (state.failed) return;
							match(input,K_KEY,FOLLOW_K_KEY_in_tableColumns5169); if (state.failed) return;
							if ( state.backtracking==0 ) { stmt.setPartitionKeyColumn(k); }
							}
							break;

					}

					}
					break;
				case 2 :
					// Parser.g:786:7: K_PRIMARY K_KEY '(' tablePartitionKey[stmt] ( ',' c= ident )* ')'
					{
					match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_tableColumns5181); if (state.failed) return;
					match(input,K_KEY,FOLLOW_K_KEY_in_tableColumns5183); if (state.failed) return;
					match(input,200,FOLLOW_200_in_tableColumns5185); if (state.failed) return;
					pushFollow(FOLLOW_tablePartitionKey_in_tableColumns5187);
					tablePartitionKey(stmt);
					state._fsp--;
					if (state.failed) return;
					// Parser.g:786:51: ( ',' c= ident )*
					loop94:
					while (true) {
						int alt94=2;
						int LA94_0 = input.LA(1);
						if ( (LA94_0==204) ) {
							alt94=1;
						}

						switch (alt94) {
						case 1 :
							// Parser.g:786:52: ',' c= ident
							{
							match(input,204,FOLLOW_204_in_tableColumns5191); if (state.failed) return;
							pushFollow(FOLLOW_ident_in_tableColumns5195);
							c=ident();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) { stmt.markClusteringColumn(c); }
							}
							break;

						default :
							break loop94;
						}
					}

					match(input,201,FOLLOW_201_in_tableColumns5202); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tableColumns"



	// $ANTLR start "tablePartitionKey"
	// Parser.g:789:1: tablePartitionKey[CreateTableStatement.Raw stmt] : (k1= ident | '(' k1= ident ( ',' kn= ident )* ')' );
	public final void tablePartitionKey(CreateTableStatement.Raw stmt) throws RecognitionException {
		ColumnIdentifier k1 =null;
		ColumnIdentifier kn =null;

		List<ColumnIdentifier> l = new ArrayList<ColumnIdentifier>();
		try {
			// Parser.g:792:5: (k1= ident | '(' k1= ident ( ',' kn= ident )* ')' )
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==IDENT||LA97_0==K_ACCESS||(LA97_0 >= K_AGGREGATE && LA97_0 <= K_ALL)||LA97_0==K_AS||LA97_0==K_ASCII||(LA97_0 >= K_BIGINT && LA97_0 <= K_BOOLEAN)||(LA97_0 >= K_CALLED && LA97_0 <= K_CLUSTERING)||(LA97_0 >= K_COMPACT && LA97_0 <= K_COUNTER)||(LA97_0 >= K_CUSTOM && LA97_0 <= K_DEFAULT)||(LA97_0 >= K_DISTINCT && LA97_0 <= K_DOUBLE)||LA97_0==K_DURATION||(LA97_0 >= K_EXISTS && LA97_0 <= K_FLOAT)||LA97_0==K_FROZEN||(LA97_0 >= K_FUNCTION && LA97_0 <= K_FUNCTIONS)||LA97_0==K_GROUP||(LA97_0 >= K_INET && LA97_0 <= K_INPUT)||(LA97_0 >= K_INT && LA97_0 <= K_INTERNALS)||(LA97_0 >= K_JSON && LA97_0 <= K_KEYS)||(LA97_0 >= K_KEYSPACES && LA97_0 <= K_LIKE)||(LA97_0 >= K_LIST && LA97_0 <= K_MAP)||(LA97_0 >= K_MBEAN && LA97_0 <= K_MBEANS)||LA97_0==K_NOLOGIN||LA97_0==K_NOSUPERUSER||(LA97_0 >= K_ONLY && LA97_0 <= K_OPTIONS)||(LA97_0 >= K_PARTITION && LA97_0 <= K_PERMISSIONS)||(LA97_0 >= K_REPLACE && LA97_0 <= K_RETURNS)||(LA97_0 >= K_ROLE && LA97_0 <= K_ROLES)||(LA97_0 >= K_SFUNC && LA97_0 <= K_TINYINT)||LA97_0==K_TRIGGER||(LA97_0 >= K_TTL && LA97_0 <= K_TYPES)||LA97_0==K_UNSET||(LA97_0 >= K_USER && LA97_0 <= K_USERS)||(LA97_0 >= K_UUID && LA97_0 <= K_VARINT)||LA97_0==K_WRITETIME||LA97_0==QUOTED_NAME) ) {
				alt97=1;
			}
			else if ( (LA97_0==200) ) {
				alt97=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 97, 0, input);
				throw nvae;
			}

			switch (alt97) {
				case 1 :
					// Parser.g:792:7: k1= ident
					{
					pushFollow(FOLLOW_ident_in_tablePartitionKey5239);
					k1=ident();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { l.add(k1);}
					}
					break;
				case 2 :
					// Parser.g:793:7: '(' k1= ident ( ',' kn= ident )* ')'
					{
					match(input,200,FOLLOW_200_in_tablePartitionKey5249); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_tablePartitionKey5253);
					k1=ident();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { l.add(k1); }
					// Parser.g:793:35: ( ',' kn= ident )*
					loop96:
					while (true) {
						int alt96=2;
						int LA96_0 = input.LA(1);
						if ( (LA96_0==204) ) {
							alt96=1;
						}

						switch (alt96) {
						case 1 :
							// Parser.g:793:37: ',' kn= ident
							{
							match(input,204,FOLLOW_204_in_tablePartitionKey5259); if (state.failed) return;
							pushFollow(FOLLOW_ident_in_tablePartitionKey5263);
							kn=ident();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) { l.add(kn); }
							}
							break;

						default :
							break loop96;
						}
					}

					match(input,201,FOLLOW_201_in_tablePartitionKey5270); if (state.failed) return;
					}
					break;

			}
			if ( state.backtracking==0 ) { stmt.setPartitionKeyColumns(l); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tablePartitionKey"



	// $ANTLR start "tableProperty"
	// Parser.g:796:1: tableProperty[CreateTableStatement.Raw stmt] : ( property[stmt.attrs] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' tableClusteringOrder[stmt] ( ',' tableClusteringOrder[stmt] )* ')' );
	public final void tableProperty(CreateTableStatement.Raw stmt) throws RecognitionException {
		try {
			// Parser.g:797:5: ( property[stmt.attrs] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' tableClusteringOrder[stmt] ( ',' tableClusteringOrder[stmt] )* ')' )
			int alt99=3;
			switch ( input.LA(1) ) {
			case IDENT:
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTER:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DATE:
			case K_DECIMAL:
			case K_DEFAULT:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_INTERNALS:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
			case QUOTED_NAME:
				{
				alt99=1;
				}
				break;
			case K_COMPACT:
				{
				int LA99_2 = input.LA(2);
				if ( (LA99_2==K_STORAGE) ) {
					alt99=2;
				}
				else if ( (LA99_2==213) ) {
					alt99=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 99, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_CLUSTERING:
				{
				int LA99_3 = input.LA(2);
				if ( (LA99_3==K_ORDER) ) {
					alt99=3;
				}
				else if ( (LA99_3==213) ) {
					alt99=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 99, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 99, 0, input);
				throw nvae;
			}
			switch (alt99) {
				case 1 :
					// Parser.g:797:7: property[stmt.attrs]
					{
					pushFollow(FOLLOW_property_in_tableProperty5288);
					property(stmt.attrs);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Parser.g:798:7: K_COMPACT K_STORAGE
					{
					match(input,K_COMPACT,FOLLOW_K_COMPACT_in_tableProperty5297); if (state.failed) return;
					match(input,K_STORAGE,FOLLOW_K_STORAGE_in_tableProperty5299); if (state.failed) return;
					if ( state.backtracking==0 ) { stmt.setCompactStorage(); }
					}
					break;
				case 3 :
					// Parser.g:799:7: K_CLUSTERING K_ORDER K_BY '(' tableClusteringOrder[stmt] ( ',' tableClusteringOrder[stmt] )* ')'
					{
					match(input,K_CLUSTERING,FOLLOW_K_CLUSTERING_in_tableProperty5309); if (state.failed) return;
					match(input,K_ORDER,FOLLOW_K_ORDER_in_tableProperty5311); if (state.failed) return;
					match(input,K_BY,FOLLOW_K_BY_in_tableProperty5313); if (state.failed) return;
					match(input,200,FOLLOW_200_in_tableProperty5315); if (state.failed) return;
					pushFollow(FOLLOW_tableClusteringOrder_in_tableProperty5317);
					tableClusteringOrder(stmt);
					state._fsp--;
					if (state.failed) return;
					// Parser.g:799:64: ( ',' tableClusteringOrder[stmt] )*
					loop98:
					while (true) {
						int alt98=2;
						int LA98_0 = input.LA(1);
						if ( (LA98_0==204) ) {
							alt98=1;
						}

						switch (alt98) {
						case 1 :
							// Parser.g:799:65: ',' tableClusteringOrder[stmt]
							{
							match(input,204,FOLLOW_204_in_tableProperty5321); if (state.failed) return;
							pushFollow(FOLLOW_tableClusteringOrder_in_tableProperty5323);
							tableClusteringOrder(stmt);
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop98;
						}
					}

					match(input,201,FOLLOW_201_in_tableProperty5328); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tableProperty"



	// $ANTLR start "tableClusteringOrder"
	// Parser.g:802:1: tableClusteringOrder[CreateTableStatement.Raw stmt] : k= ident ( K_ASC | K_DESC ) ;
	public final void tableClusteringOrder(CreateTableStatement.Raw stmt) throws RecognitionException {
		ColumnIdentifier k =null;

		 boolean ascending = true; 
		try {
			// Parser.g:804:5: (k= ident ( K_ASC | K_DESC ) )
			// Parser.g:804:7: k= ident ( K_ASC | K_DESC )
			{
			pushFollow(FOLLOW_ident_in_tableClusteringOrder5356);
			k=ident();
			state._fsp--;
			if (state.failed) return;
			// Parser.g:804:15: ( K_ASC | K_DESC )
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==K_ASC) ) {
				alt100=1;
			}
			else if ( (LA100_0==K_DESC) ) {
				alt100=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 100, 0, input);
				throw nvae;
			}

			switch (alt100) {
				case 1 :
					// Parser.g:804:16: K_ASC
					{
					match(input,K_ASC,FOLLOW_K_ASC_in_tableClusteringOrder5359); if (state.failed) return;
					}
					break;
				case 2 :
					// Parser.g:804:24: K_DESC
					{
					match(input,K_DESC,FOLLOW_K_DESC_in_tableClusteringOrder5363); if (state.failed) return;
					if ( state.backtracking==0 ) { ascending = false; }
					}
					break;

			}

			if ( state.backtracking==0 ) { stmt.extendClusteringOrder(k, ascending); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tableClusteringOrder"



	// $ANTLR start "createTypeStatement"
	// Parser.g:814:1: createTypeStatement returns [CreateTypeStatement.Raw stmt] : K_CREATE K_TYPE ( K_IF K_NOT K_EXISTS )? tn= userTypeName '(' typeColumns[stmt] ( ',' ( typeColumns[stmt] )? )* ')' ;
	public final CreateTypeStatement.Raw createTypeStatement() throws RecognitionException {
		CreateTypeStatement.Raw stmt = null;


		UTName tn =null;

		 boolean ifNotExists = false; 
		try {
			// Parser.g:816:5: ( K_CREATE K_TYPE ( K_IF K_NOT K_EXISTS )? tn= userTypeName '(' typeColumns[stmt] ( ',' ( typeColumns[stmt] )? )* ')' )
			// Parser.g:816:7: K_CREATE K_TYPE ( K_IF K_NOT K_EXISTS )? tn= userTypeName '(' typeColumns[stmt] ( ',' ( typeColumns[stmt] )? )* ')'
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createTypeStatement5401); if (state.failed) return stmt;
			match(input,K_TYPE,FOLLOW_K_TYPE_in_createTypeStatement5403); if (state.failed) return stmt;
			// Parser.g:816:23: ( K_IF K_NOT K_EXISTS )?
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==K_IF) ) {
				alt101=1;
			}
			switch (alt101) {
				case 1 :
					// Parser.g:816:24: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createTypeStatement5406); if (state.failed) return stmt;
					match(input,K_NOT,FOLLOW_K_NOT_in_createTypeStatement5408); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createTypeStatement5410); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_userTypeName_in_createTypeStatement5428);
			tn=userTypeName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new CreateTypeStatement.Raw(tn, ifNotExists); }
			match(input,200,FOLLOW_200_in_createTypeStatement5441); if (state.failed) return stmt;
			pushFollow(FOLLOW_typeColumns_in_createTypeStatement5443);
			typeColumns(stmt);
			state._fsp--;
			if (state.failed) return stmt;
			// Parser.g:818:32: ( ',' ( typeColumns[stmt] )? )*
			loop103:
			while (true) {
				int alt103=2;
				int LA103_0 = input.LA(1);
				if ( (LA103_0==204) ) {
					alt103=1;
				}

				switch (alt103) {
				case 1 :
					// Parser.g:818:34: ',' ( typeColumns[stmt] )?
					{
					match(input,204,FOLLOW_204_in_createTypeStatement5448); if (state.failed) return stmt;
					// Parser.g:818:38: ( typeColumns[stmt] )?
					int alt102=2;
					int LA102_0 = input.LA(1);
					if ( (LA102_0==IDENT||LA102_0==K_ACCESS||(LA102_0 >= K_AGGREGATE && LA102_0 <= K_ALL)||LA102_0==K_AS||LA102_0==K_ASCII||(LA102_0 >= K_BIGINT && LA102_0 <= K_BOOLEAN)||(LA102_0 >= K_CALLED && LA102_0 <= K_CLUSTERING)||(LA102_0 >= K_COMPACT && LA102_0 <= K_COUNTER)||(LA102_0 >= K_CUSTOM && LA102_0 <= K_DEFAULT)||(LA102_0 >= K_DISTINCT && LA102_0 <= K_DOUBLE)||LA102_0==K_DURATION||(LA102_0 >= K_EXISTS && LA102_0 <= K_FLOAT)||LA102_0==K_FROZEN||(LA102_0 >= K_FUNCTION && LA102_0 <= K_FUNCTIONS)||LA102_0==K_GROUP||(LA102_0 >= K_INET && LA102_0 <= K_INPUT)||(LA102_0 >= K_INT && LA102_0 <= K_INTERNALS)||(LA102_0 >= K_JSON && LA102_0 <= K_KEYS)||(LA102_0 >= K_KEYSPACES && LA102_0 <= K_LIKE)||(LA102_0 >= K_LIST && LA102_0 <= K_MAP)||(LA102_0 >= K_MBEAN && LA102_0 <= K_MBEANS)||LA102_0==K_NOLOGIN||LA102_0==K_NOSUPERUSER||(LA102_0 >= K_ONLY && LA102_0 <= K_OPTIONS)||(LA102_0 >= K_PARTITION && LA102_0 <= K_PERMISSIONS)||(LA102_0 >= K_REPLACE && LA102_0 <= K_RETURNS)||(LA102_0 >= K_ROLE && LA102_0 <= K_ROLES)||(LA102_0 >= K_SFUNC && LA102_0 <= K_TINYINT)||LA102_0==K_TRIGGER||(LA102_0 >= K_TTL && LA102_0 <= K_TYPES)||LA102_0==K_UNSET||(LA102_0 >= K_USER && LA102_0 <= K_USERS)||(LA102_0 >= K_UUID && LA102_0 <= K_VARINT)||LA102_0==K_WRITETIME||LA102_0==QUOTED_NAME) ) {
						alt102=1;
					}
					switch (alt102) {
						case 1 :
							// Parser.g:818:38: typeColumns[stmt]
							{
							pushFollow(FOLLOW_typeColumns_in_createTypeStatement5450);
							typeColumns(stmt);
							state._fsp--;
							if (state.failed) return stmt;
							}
							break;

					}

					}
					break;

				default :
					break loop103;
				}
			}

			match(input,201,FOLLOW_201_in_createTypeStatement5457); if (state.failed) return stmt;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createTypeStatement"



	// $ANTLR start "typeColumns"
	// Parser.g:821:1: typeColumns[CreateTypeStatement.Raw stmt] : k= fident v= comparatorType ;
	public final void typeColumns(CreateTypeStatement.Raw stmt) throws RecognitionException {
		FieldIdentifier k =null;
		CQL3Type.Raw v =null;

		try {
			// Parser.g:822:5: (k= fident v= comparatorType )
			// Parser.g:822:7: k= fident v= comparatorType
			{
			pushFollow(FOLLOW_fident_in_typeColumns5477);
			k=fident();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_comparatorType_in_typeColumns5481);
			v=comparatorType();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) { stmt.addField(k, v); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "typeColumns"



	// $ANTLR start "createIndexStatement"
	// Parser.g:829:1: createIndexStatement returns [CreateIndexStatement.Raw stmt] : K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? ( idxName[name] )? K_ON cf= columnFamilyName '(' ( indexIdent[targets] ( ',' indexIdent[targets] )* )? ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )? ;
	public final CreateIndexStatement.Raw createIndexStatement() throws RecognitionException {
		CreateIndexStatement.Raw stmt = null;


		Token cls=null;
		QualifiedName cf =null;


		        IndexAttributes props = new IndexAttributes();
		        boolean ifNotExists = false;
		        QualifiedName name = new QualifiedName();
		        List<IndexTarget.Raw> targets = new ArrayList<>();
		    
		try {
			// Parser.g:836:5: ( K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? ( idxName[name] )? K_ON cf= columnFamilyName '(' ( indexIdent[targets] ( ',' indexIdent[targets] )* )? ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )? )
			// Parser.g:836:7: K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? ( idxName[name] )? K_ON cf= columnFamilyName '(' ( indexIdent[targets] ( ',' indexIdent[targets] )* )? ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createIndexStatement5515); if (state.failed) return stmt;
			// Parser.g:836:16: ( K_CUSTOM )?
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==K_CUSTOM) ) {
				alt104=1;
			}
			switch (alt104) {
				case 1 :
					// Parser.g:836:17: K_CUSTOM
					{
					match(input,K_CUSTOM,FOLLOW_K_CUSTOM_in_createIndexStatement5518); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { props.isCustom = true; }
					}
					break;

			}

			match(input,K_INDEX,FOLLOW_K_INDEX_in_createIndexStatement5524); if (state.failed) return stmt;
			// Parser.g:836:63: ( K_IF K_NOT K_EXISTS )?
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==K_IF) ) {
				alt105=1;
			}
			switch (alt105) {
				case 1 :
					// Parser.g:836:64: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createIndexStatement5527); if (state.failed) return stmt;
					match(input,K_NOT,FOLLOW_K_NOT_in_createIndexStatement5529); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createIndexStatement5531); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			// Parser.g:837:9: ( idxName[name] )?
			int alt106=2;
			int LA106_0 = input.LA(1);
			if ( (LA106_0==IDENT||LA106_0==K_ACCESS||(LA106_0 >= K_AGGREGATE && LA106_0 <= K_ALL)||LA106_0==K_AS||LA106_0==K_ASCII||(LA106_0 >= K_BIGINT && LA106_0 <= K_BOOLEAN)||(LA106_0 >= K_CALLED && LA106_0 <= K_CLUSTERING)||(LA106_0 >= K_COMPACT && LA106_0 <= K_COUNTER)||(LA106_0 >= K_CUSTOM && LA106_0 <= K_DEFAULT)||(LA106_0 >= K_DISTINCT && LA106_0 <= K_DOUBLE)||LA106_0==K_DURATION||(LA106_0 >= K_EXISTS && LA106_0 <= K_FLOAT)||LA106_0==K_FROZEN||(LA106_0 >= K_FUNCTION && LA106_0 <= K_FUNCTIONS)||LA106_0==K_GROUP||(LA106_0 >= K_INET && LA106_0 <= K_INPUT)||(LA106_0 >= K_INT && LA106_0 <= K_INTERNALS)||(LA106_0 >= K_JSON && LA106_0 <= K_KEYS)||(LA106_0 >= K_KEYSPACES && LA106_0 <= K_LIKE)||(LA106_0 >= K_LIST && LA106_0 <= K_MAP)||(LA106_0 >= K_MBEAN && LA106_0 <= K_MBEANS)||LA106_0==K_NOLOGIN||LA106_0==K_NOSUPERUSER||(LA106_0 >= K_ONLY && LA106_0 <= K_OPTIONS)||(LA106_0 >= K_PARTITION && LA106_0 <= K_PERMISSIONS)||(LA106_0 >= K_REPLACE && LA106_0 <= K_RETURNS)||(LA106_0 >= K_ROLE && LA106_0 <= K_ROLES)||(LA106_0 >= K_SFUNC && LA106_0 <= K_TINYINT)||LA106_0==K_TRIGGER||(LA106_0 >= K_TTL && LA106_0 <= K_TYPES)||LA106_0==K_UNSET||(LA106_0 >= K_USER && LA106_0 <= K_USERS)||(LA106_0 >= K_UUID && LA106_0 <= K_VARINT)||LA106_0==K_WRITETIME||(LA106_0 >= QMARK && LA106_0 <= QUOTED_NAME)) ) {
				alt106=1;
			}
			switch (alt106) {
				case 1 :
					// Parser.g:837:10: idxName[name]
					{
					pushFollow(FOLLOW_idxName_in_createIndexStatement5547);
					idxName(name);
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			match(input,K_ON,FOLLOW_K_ON_in_createIndexStatement5552); if (state.failed) return stmt;
			pushFollow(FOLLOW_columnFamilyName_in_createIndexStatement5556);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,200,FOLLOW_200_in_createIndexStatement5558); if (state.failed) return stmt;
			// Parser.g:837:55: ( indexIdent[targets] ( ',' indexIdent[targets] )* )?
			int alt108=2;
			int LA108_0 = input.LA(1);
			if ( (LA108_0==EMPTY_QUOTED_NAME||LA108_0==IDENT||LA108_0==K_ACCESS||(LA108_0 >= K_AGGREGATE && LA108_0 <= K_ALL)||LA108_0==K_AS||LA108_0==K_ASCII||(LA108_0 >= K_BIGINT && LA108_0 <= K_BOOLEAN)||(LA108_0 >= K_CALLED && LA108_0 <= K_CLUSTERING)||(LA108_0 >= K_COMPACT && LA108_0 <= K_COUNTER)||(LA108_0 >= K_CUSTOM && LA108_0 <= K_DEFAULT)||(LA108_0 >= K_DISTINCT && LA108_0 <= K_DOUBLE)||(LA108_0 >= K_DURATION && LA108_0 <= K_ENTRIES)||(LA108_0 >= K_EXISTS && LA108_0 <= K_FLOAT)||(LA108_0 >= K_FROZEN && LA108_0 <= K_FUNCTIONS)||LA108_0==K_GROUP||(LA108_0 >= K_INET && LA108_0 <= K_INPUT)||(LA108_0 >= K_INT && LA108_0 <= K_INTERNALS)||(LA108_0 >= K_JSON && LA108_0 <= K_KEYS)||(LA108_0 >= K_KEYSPACES && LA108_0 <= K_LIKE)||(LA108_0 >= K_LIST && LA108_0 <= K_MAP)||(LA108_0 >= K_MBEAN && LA108_0 <= K_MBEANS)||LA108_0==K_NOLOGIN||LA108_0==K_NOSUPERUSER||(LA108_0 >= K_ONLY && LA108_0 <= K_OPTIONS)||(LA108_0 >= K_PARTITION && LA108_0 <= K_PERMISSIONS)||(LA108_0 >= K_REPLACE && LA108_0 <= K_RETURNS)||(LA108_0 >= K_ROLE && LA108_0 <= K_ROLES)||(LA108_0 >= K_SFUNC && LA108_0 <= K_TINYINT)||LA108_0==K_TRIGGER||(LA108_0 >= K_TTL && LA108_0 <= K_TYPES)||LA108_0==K_UNSET||(LA108_0 >= K_USER && LA108_0 <= K_USERS)||(LA108_0 >= K_UUID && LA108_0 <= K_VARINT)||LA108_0==K_WRITETIME||LA108_0==QUOTED_NAME) ) {
				alt108=1;
			}
			switch (alt108) {
				case 1 :
					// Parser.g:837:56: indexIdent[targets] ( ',' indexIdent[targets] )*
					{
					pushFollow(FOLLOW_indexIdent_in_createIndexStatement5561);
					indexIdent(targets);
					state._fsp--;
					if (state.failed) return stmt;
					// Parser.g:837:76: ( ',' indexIdent[targets] )*
					loop107:
					while (true) {
						int alt107=2;
						int LA107_0 = input.LA(1);
						if ( (LA107_0==204) ) {
							alt107=1;
						}

						switch (alt107) {
						case 1 :
							// Parser.g:837:77: ',' indexIdent[targets]
							{
							match(input,204,FOLLOW_204_in_createIndexStatement5565); if (state.failed) return stmt;
							pushFollow(FOLLOW_indexIdent_in_createIndexStatement5567);
							indexIdent(targets);
							state._fsp--;
							if (state.failed) return stmt;
							}
							break;

						default :
							break loop107;
						}
					}

					}
					break;

			}

			match(input,201,FOLLOW_201_in_createIndexStatement5574); if (state.failed) return stmt;
			// Parser.g:838:9: ( K_USING cls= STRING_LITERAL )?
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( (LA109_0==K_USING) ) {
				alt109=1;
			}
			switch (alt109) {
				case 1 :
					// Parser.g:838:10: K_USING cls= STRING_LITERAL
					{
					match(input,K_USING,FOLLOW_K_USING_in_createIndexStatement5585); if (state.failed) return stmt;
					cls=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createIndexStatement5589); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { props.customClass = (cls!=null?cls.getText():null); }
					}
					break;

			}

			// Parser.g:839:9: ( K_WITH properties[props] )?
			int alt110=2;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==K_WITH) ) {
				alt110=1;
			}
			switch (alt110) {
				case 1 :
					// Parser.g:839:10: K_WITH properties[props]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_createIndexStatement5604); if (state.failed) return stmt;
					pushFollow(FOLLOW_properties_in_createIndexStatement5606);
					properties(props);
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			if ( state.backtracking==0 ) { stmt = new CreateIndexStatement.Raw(cf, name, targets, props, ifNotExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createIndexStatement"



	// $ANTLR start "indexIdent"
	// Parser.g:843:1: indexIdent[List<IndexTarget.Raw> targets] : (c= cident | K_VALUES '(' c= cident ')' | K_KEYS '(' c= cident ')' | K_ENTRIES '(' c= cident ')' | K_FULL '(' c= cident ')' );
	public final void indexIdent(List<IndexTarget.Raw> targets) throws RecognitionException {
		ColumnIdentifier c =null;

		try {
			// Parser.g:844:5: (c= cident | K_VALUES '(' c= cident ')' | K_KEYS '(' c= cident ')' | K_ENTRIES '(' c= cident ')' | K_FULL '(' c= cident ')' )
			int alt111=5;
			switch ( input.LA(1) ) {
			case EMPTY_QUOTED_NAME:
			case IDENT:
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTER:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DATE:
			case K_DECIMAL:
			case K_DEFAULT:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_INTERNALS:
			case K_JSON:
			case K_KEY:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
			case QUOTED_NAME:
				{
				alt111=1;
				}
				break;
			case K_VALUES:
				{
				int LA111_2 = input.LA(2);
				if ( (LA111_2==200) ) {
					alt111=2;
				}
				else if ( (LA111_2==201||LA111_2==204) ) {
					alt111=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 111, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_KEYS:
				{
				int LA111_3 = input.LA(2);
				if ( (LA111_3==200) ) {
					alt111=3;
				}
				else if ( (LA111_3==201||LA111_3==204) ) {
					alt111=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 111, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_ENTRIES:
				{
				alt111=4;
				}
				break;
			case K_FULL:
				{
				alt111=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 111, 0, input);
				throw nvae;
			}
			switch (alt111) {
				case 1 :
					// Parser.g:844:7: c= cident
					{
					pushFollow(FOLLOW_cident_in_indexIdent5638);
					c=cident();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { targets.add(IndexTarget.Raw.simpleIndexOn(c)); }
					}
					break;
				case 2 :
					// Parser.g:845:7: K_VALUES '(' c= cident ')'
					{
					match(input,K_VALUES,FOLLOW_K_VALUES_in_indexIdent5666); if (state.failed) return;
					match(input,200,FOLLOW_200_in_indexIdent5668); if (state.failed) return;
					pushFollow(FOLLOW_cident_in_indexIdent5672);
					c=cident();
					state._fsp--;
					if (state.failed) return;
					match(input,201,FOLLOW_201_in_indexIdent5674); if (state.failed) return;
					if ( state.backtracking==0 ) { targets.add(IndexTarget.Raw.valuesOf(c)); }
					}
					break;
				case 3 :
					// Parser.g:846:7: K_KEYS '(' c= cident ')'
					{
					match(input,K_KEYS,FOLLOW_K_KEYS_in_indexIdent5685); if (state.failed) return;
					match(input,200,FOLLOW_200_in_indexIdent5687); if (state.failed) return;
					pushFollow(FOLLOW_cident_in_indexIdent5691);
					c=cident();
					state._fsp--;
					if (state.failed) return;
					match(input,201,FOLLOW_201_in_indexIdent5693); if (state.failed) return;
					if ( state.backtracking==0 ) { targets.add(IndexTarget.Raw.keysOf(c)); }
					}
					break;
				case 4 :
					// Parser.g:847:7: K_ENTRIES '(' c= cident ')'
					{
					match(input,K_ENTRIES,FOLLOW_K_ENTRIES_in_indexIdent5706); if (state.failed) return;
					match(input,200,FOLLOW_200_in_indexIdent5708); if (state.failed) return;
					pushFollow(FOLLOW_cident_in_indexIdent5712);
					c=cident();
					state._fsp--;
					if (state.failed) return;
					match(input,201,FOLLOW_201_in_indexIdent5714); if (state.failed) return;
					if ( state.backtracking==0 ) { targets.add(IndexTarget.Raw.keysAndValuesOf(c)); }
					}
					break;
				case 5 :
					// Parser.g:848:7: K_FULL '(' c= cident ')'
					{
					match(input,K_FULL,FOLLOW_K_FULL_in_indexIdent5724); if (state.failed) return;
					match(input,200,FOLLOW_200_in_indexIdent5726); if (state.failed) return;
					pushFollow(FOLLOW_cident_in_indexIdent5730);
					c=cident();
					state._fsp--;
					if (state.failed) return;
					match(input,201,FOLLOW_201_in_indexIdent5732); if (state.failed) return;
					if ( state.backtracking==0 ) { targets.add(IndexTarget.Raw.fullCollection(c)); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "indexIdent"



	// $ANTLR start "createMaterializedViewStatement"
	// Parser.g:859:1: createMaterializedViewStatement returns [CreateViewStatement.Raw stmt] : K_CREATE K_MATERIALIZED K_VIEW ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName K_AS K_SELECT sclause= selectors K_FROM basecf= columnFamilyName ( K_WHERE wclause= whereClause )? viewPrimaryKey[stmt] ( K_WITH viewProperty[stmt] ( K_AND viewProperty[stmt] )* )? ;
	public final CreateViewStatement.Raw createMaterializedViewStatement() throws RecognitionException {
		CreateViewStatement.Raw stmt = null;


		QualifiedName cf =null;
		List<RawSelector> sclause =null;
		QualifiedName basecf =null;
		WhereClause.Builder wclause =null;


		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:863:5: ( K_CREATE K_MATERIALIZED K_VIEW ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName K_AS K_SELECT sclause= selectors K_FROM basecf= columnFamilyName ( K_WHERE wclause= whereClause )? viewPrimaryKey[stmt] ( K_WITH viewProperty[stmt] ( K_AND viewProperty[stmt] )* )? )
			// Parser.g:863:7: K_CREATE K_MATERIALIZED K_VIEW ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName K_AS K_SELECT sclause= selectors K_FROM basecf= columnFamilyName ( K_WHERE wclause= whereClause )? viewPrimaryKey[stmt] ( K_WITH viewProperty[stmt] ( K_AND viewProperty[stmt] )* )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createMaterializedViewStatement5769); if (state.failed) return stmt;
			match(input,K_MATERIALIZED,FOLLOW_K_MATERIALIZED_in_createMaterializedViewStatement5771); if (state.failed) return stmt;
			match(input,K_VIEW,FOLLOW_K_VIEW_in_createMaterializedViewStatement5773); if (state.failed) return stmt;
			// Parser.g:863:38: ( K_IF K_NOT K_EXISTS )?
			int alt112=2;
			int LA112_0 = input.LA(1);
			if ( (LA112_0==K_IF) ) {
				alt112=1;
			}
			switch (alt112) {
				case 1 :
					// Parser.g:863:39: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createMaterializedViewStatement5776); if (state.failed) return stmt;
					match(input,K_NOT,FOLLOW_K_NOT_in_createMaterializedViewStatement5778); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createMaterializedViewStatement5780); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_createMaterializedViewStatement5788);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_AS,FOLLOW_K_AS_in_createMaterializedViewStatement5790); if (state.failed) return stmt;
			match(input,K_SELECT,FOLLOW_K_SELECT_in_createMaterializedViewStatement5800); if (state.failed) return stmt;
			pushFollow(FOLLOW_selectors_in_createMaterializedViewStatement5804);
			sclause=selectors();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_FROM,FOLLOW_K_FROM_in_createMaterializedViewStatement5806); if (state.failed) return stmt;
			pushFollow(FOLLOW_columnFamilyName_in_createMaterializedViewStatement5810);
			basecf=columnFamilyName();
			state._fsp--;
			if (state.failed) return stmt;
			// Parser.g:865:9: ( K_WHERE wclause= whereClause )?
			int alt113=2;
			int LA113_0 = input.LA(1);
			if ( (LA113_0==K_WHERE) ) {
				alt113=1;
			}
			switch (alt113) {
				case 1 :
					// Parser.g:865:10: K_WHERE wclause= whereClause
					{
					match(input,K_WHERE,FOLLOW_K_WHERE_in_createMaterializedViewStatement5821); if (state.failed) return stmt;
					pushFollow(FOLLOW_whereClause_in_createMaterializedViewStatement5825);
					wclause=whereClause();
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			             WhereClause where = wclause == null ? WhereClause.empty() : wclause.build();
			             stmt = new CreateViewStatement.Raw(basecf, cf, sclause, where, ifNotExists);
			        }
			pushFollow(FOLLOW_viewPrimaryKey_in_createMaterializedViewStatement5847);
			viewPrimaryKey(stmt);
			state._fsp--;
			if (state.failed) return stmt;
			// Parser.g:871:9: ( K_WITH viewProperty[stmt] ( K_AND viewProperty[stmt] )* )?
			int alt115=2;
			int LA115_0 = input.LA(1);
			if ( (LA115_0==K_WITH) ) {
				alt115=1;
			}
			switch (alt115) {
				case 1 :
					// Parser.g:871:11: K_WITH viewProperty[stmt] ( K_AND viewProperty[stmt] )*
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_createMaterializedViewStatement5860); if (state.failed) return stmt;
					pushFollow(FOLLOW_viewProperty_in_createMaterializedViewStatement5862);
					viewProperty(stmt);
					state._fsp--;
					if (state.failed) return stmt;
					// Parser.g:871:37: ( K_AND viewProperty[stmt] )*
					loop114:
					while (true) {
						int alt114=2;
						int LA114_0 = input.LA(1);
						if ( (LA114_0==K_AND) ) {
							alt114=1;
						}

						switch (alt114) {
						case 1 :
							// Parser.g:871:39: K_AND viewProperty[stmt]
							{
							match(input,K_AND,FOLLOW_K_AND_in_createMaterializedViewStatement5867); if (state.failed) return stmt;
							pushFollow(FOLLOW_viewProperty_in_createMaterializedViewStatement5869);
							viewProperty(stmt);
							state._fsp--;
							if (state.failed) return stmt;
							}
							break;

						default :
							break loop114;
						}
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createMaterializedViewStatement"



	// $ANTLR start "viewPrimaryKey"
	// Parser.g:874:1: viewPrimaryKey[CreateViewStatement.Raw stmt] : K_PRIMARY K_KEY '(' viewPartitionKey[stmt] ( ',' c= ident )* ')' ;
	public final void viewPrimaryKey(CreateViewStatement.Raw stmt) throws RecognitionException {
		ColumnIdentifier c =null;

		try {
			// Parser.g:875:5: ( K_PRIMARY K_KEY '(' viewPartitionKey[stmt] ( ',' c= ident )* ')' )
			// Parser.g:875:7: K_PRIMARY K_KEY '(' viewPartitionKey[stmt] ( ',' c= ident )* ')'
			{
			match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_viewPrimaryKey5893); if (state.failed) return;
			match(input,K_KEY,FOLLOW_K_KEY_in_viewPrimaryKey5895); if (state.failed) return;
			match(input,200,FOLLOW_200_in_viewPrimaryKey5897); if (state.failed) return;
			pushFollow(FOLLOW_viewPartitionKey_in_viewPrimaryKey5899);
			viewPartitionKey(stmt);
			state._fsp--;
			if (state.failed) return;
			// Parser.g:875:50: ( ',' c= ident )*
			loop116:
			while (true) {
				int alt116=2;
				int LA116_0 = input.LA(1);
				if ( (LA116_0==204) ) {
					alt116=1;
				}

				switch (alt116) {
				case 1 :
					// Parser.g:875:51: ',' c= ident
					{
					match(input,204,FOLLOW_204_in_viewPrimaryKey5903); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_viewPrimaryKey5907);
					c=ident();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { stmt.markClusteringColumn(c); }
					}
					break;

				default :
					break loop116;
				}
			}

			match(input,201,FOLLOW_201_in_viewPrimaryKey5914); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "viewPrimaryKey"



	// $ANTLR start "viewPartitionKey"
	// Parser.g:878:1: viewPartitionKey[CreateViewStatement.Raw stmt] : (k1= ident | '(' k1= ident ( ',' kn= ident )* ')' );
	public final void viewPartitionKey(CreateViewStatement.Raw stmt) throws RecognitionException {
		ColumnIdentifier k1 =null;
		ColumnIdentifier kn =null;

		List<ColumnIdentifier> l = new ArrayList<ColumnIdentifier>();
		try {
			// Parser.g:881:5: (k1= ident | '(' k1= ident ( ',' kn= ident )* ')' )
			int alt118=2;
			int LA118_0 = input.LA(1);
			if ( (LA118_0==IDENT||LA118_0==K_ACCESS||(LA118_0 >= K_AGGREGATE && LA118_0 <= K_ALL)||LA118_0==K_AS||LA118_0==K_ASCII||(LA118_0 >= K_BIGINT && LA118_0 <= K_BOOLEAN)||(LA118_0 >= K_CALLED && LA118_0 <= K_CLUSTERING)||(LA118_0 >= K_COMPACT && LA118_0 <= K_COUNTER)||(LA118_0 >= K_CUSTOM && LA118_0 <= K_DEFAULT)||(LA118_0 >= K_DISTINCT && LA118_0 <= K_DOUBLE)||LA118_0==K_DURATION||(LA118_0 >= K_EXISTS && LA118_0 <= K_FLOAT)||LA118_0==K_FROZEN||(LA118_0 >= K_FUNCTION && LA118_0 <= K_FUNCTIONS)||LA118_0==K_GROUP||(LA118_0 >= K_INET && LA118_0 <= K_INPUT)||(LA118_0 >= K_INT && LA118_0 <= K_INTERNALS)||(LA118_0 >= K_JSON && LA118_0 <= K_KEYS)||(LA118_0 >= K_KEYSPACES && LA118_0 <= K_LIKE)||(LA118_0 >= K_LIST && LA118_0 <= K_MAP)||(LA118_0 >= K_MBEAN && LA118_0 <= K_MBEANS)||LA118_0==K_NOLOGIN||LA118_0==K_NOSUPERUSER||(LA118_0 >= K_ONLY && LA118_0 <= K_OPTIONS)||(LA118_0 >= K_PARTITION && LA118_0 <= K_PERMISSIONS)||(LA118_0 >= K_REPLACE && LA118_0 <= K_RETURNS)||(LA118_0 >= K_ROLE && LA118_0 <= K_ROLES)||(LA118_0 >= K_SFUNC && LA118_0 <= K_TINYINT)||LA118_0==K_TRIGGER||(LA118_0 >= K_TTL && LA118_0 <= K_TYPES)||LA118_0==K_UNSET||(LA118_0 >= K_USER && LA118_0 <= K_USERS)||(LA118_0 >= K_UUID && LA118_0 <= K_VARINT)||LA118_0==K_WRITETIME||LA118_0==QUOTED_NAME) ) {
				alt118=1;
			}
			else if ( (LA118_0==200) ) {
				alt118=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 118, 0, input);
				throw nvae;
			}

			switch (alt118) {
				case 1 :
					// Parser.g:881:7: k1= ident
					{
					pushFollow(FOLLOW_ident_in_viewPartitionKey5951);
					k1=ident();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { l.add(k1);}
					}
					break;
				case 2 :
					// Parser.g:882:7: '(' k1= ident ( ',' kn= ident )* ')'
					{
					match(input,200,FOLLOW_200_in_viewPartitionKey5961); if (state.failed) return;
					pushFollow(FOLLOW_ident_in_viewPartitionKey5965);
					k1=ident();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { l.add(k1); }
					// Parser.g:882:35: ( ',' kn= ident )*
					loop117:
					while (true) {
						int alt117=2;
						int LA117_0 = input.LA(1);
						if ( (LA117_0==204) ) {
							alt117=1;
						}

						switch (alt117) {
						case 1 :
							// Parser.g:882:37: ',' kn= ident
							{
							match(input,204,FOLLOW_204_in_viewPartitionKey5971); if (state.failed) return;
							pushFollow(FOLLOW_ident_in_viewPartitionKey5975);
							kn=ident();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) { l.add(kn); }
							}
							break;

						default :
							break loop117;
						}
					}

					match(input,201,FOLLOW_201_in_viewPartitionKey5982); if (state.failed) return;
					}
					break;

			}
			if ( state.backtracking==0 ) { stmt.setPartitionKeyColumns(l); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "viewPartitionKey"



	// $ANTLR start "viewProperty"
	// Parser.g:885:1: viewProperty[CreateViewStatement.Raw stmt] : ( property[stmt.attrs] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' viewClusteringOrder[stmt] ( ',' viewClusteringOrder[stmt] )* ')' );
	public final void viewProperty(CreateViewStatement.Raw stmt) throws RecognitionException {
		try {
			// Parser.g:886:5: ( property[stmt.attrs] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' viewClusteringOrder[stmt] ( ',' viewClusteringOrder[stmt] )* ')' )
			int alt120=3;
			switch ( input.LA(1) ) {
			case IDENT:
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTER:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DATE:
			case K_DECIMAL:
			case K_DEFAULT:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_INTERNALS:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
			case QUOTED_NAME:
				{
				alt120=1;
				}
				break;
			case K_COMPACT:
				{
				int LA120_2 = input.LA(2);
				if ( (LA120_2==K_STORAGE) ) {
					alt120=2;
				}
				else if ( (LA120_2==213) ) {
					alt120=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 120, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_CLUSTERING:
				{
				int LA120_3 = input.LA(2);
				if ( (LA120_3==K_ORDER) ) {
					alt120=3;
				}
				else if ( (LA120_3==213) ) {
					alt120=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 120, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 120, 0, input);
				throw nvae;
			}
			switch (alt120) {
				case 1 :
					// Parser.g:886:7: property[stmt.attrs]
					{
					pushFollow(FOLLOW_property_in_viewProperty6000);
					property(stmt.attrs);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Parser.g:887:7: K_COMPACT K_STORAGE
					{
					match(input,K_COMPACT,FOLLOW_K_COMPACT_in_viewProperty6009); if (state.failed) return;
					match(input,K_STORAGE,FOLLOW_K_STORAGE_in_viewProperty6011); if (state.failed) return;
					if ( state.backtracking==0 ) { throw new SyntaxException("COMPACT STORAGE tables are not allowed starting with version 4.0"); }
					}
					break;
				case 3 :
					// Parser.g:888:7: K_CLUSTERING K_ORDER K_BY '(' viewClusteringOrder[stmt] ( ',' viewClusteringOrder[stmt] )* ')'
					{
					match(input,K_CLUSTERING,FOLLOW_K_CLUSTERING_in_viewProperty6021); if (state.failed) return;
					match(input,K_ORDER,FOLLOW_K_ORDER_in_viewProperty6023); if (state.failed) return;
					match(input,K_BY,FOLLOW_K_BY_in_viewProperty6025); if (state.failed) return;
					match(input,200,FOLLOW_200_in_viewProperty6027); if (state.failed) return;
					pushFollow(FOLLOW_viewClusteringOrder_in_viewProperty6029);
					viewClusteringOrder(stmt);
					state._fsp--;
					if (state.failed) return;
					// Parser.g:888:63: ( ',' viewClusteringOrder[stmt] )*
					loop119:
					while (true) {
						int alt119=2;
						int LA119_0 = input.LA(1);
						if ( (LA119_0==204) ) {
							alt119=1;
						}

						switch (alt119) {
						case 1 :
							// Parser.g:888:64: ',' viewClusteringOrder[stmt]
							{
							match(input,204,FOLLOW_204_in_viewProperty6033); if (state.failed) return;
							pushFollow(FOLLOW_viewClusteringOrder_in_viewProperty6035);
							viewClusteringOrder(stmt);
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop119;
						}
					}

					match(input,201,FOLLOW_201_in_viewProperty6040); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "viewProperty"



	// $ANTLR start "viewClusteringOrder"
	// Parser.g:891:1: viewClusteringOrder[CreateViewStatement.Raw stmt] : k= ident ( K_ASC | K_DESC ) ;
	public final void viewClusteringOrder(CreateViewStatement.Raw stmt) throws RecognitionException {
		ColumnIdentifier k =null;

		 boolean ascending = true; 
		try {
			// Parser.g:893:5: (k= ident ( K_ASC | K_DESC ) )
			// Parser.g:893:7: k= ident ( K_ASC | K_DESC )
			{
			pushFollow(FOLLOW_ident_in_viewClusteringOrder6068);
			k=ident();
			state._fsp--;
			if (state.failed) return;
			// Parser.g:893:15: ( K_ASC | K_DESC )
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==K_ASC) ) {
				alt121=1;
			}
			else if ( (LA121_0==K_DESC) ) {
				alt121=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 121, 0, input);
				throw nvae;
			}

			switch (alt121) {
				case 1 :
					// Parser.g:893:16: K_ASC
					{
					match(input,K_ASC,FOLLOW_K_ASC_in_viewClusteringOrder6071); if (state.failed) return;
					}
					break;
				case 2 :
					// Parser.g:893:24: K_DESC
					{
					match(input,K_DESC,FOLLOW_K_DESC_in_viewClusteringOrder6075); if (state.failed) return;
					if ( state.backtracking==0 ) { ascending = false; }
					}
					break;

			}

			if ( state.backtracking==0 ) { stmt.extendClusteringOrder(k, ascending); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "viewClusteringOrder"



	// $ANTLR start "createTriggerStatement"
	// Parser.g:899:1: createTriggerStatement returns [CreateTriggerStatement.Raw stmt] : K_CREATE K_TRIGGER ( K_IF K_NOT K_EXISTS )? (name= ident ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL ;
	public final CreateTriggerStatement.Raw createTriggerStatement() throws RecognitionException {
		CreateTriggerStatement.Raw stmt = null;


		Token cls=null;
		ColumnIdentifier name =null;
		QualifiedName cf =null;


		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:903:5: ( K_CREATE K_TRIGGER ( K_IF K_NOT K_EXISTS )? (name= ident ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL )
			// Parser.g:903:7: K_CREATE K_TRIGGER ( K_IF K_NOT K_EXISTS )? (name= ident ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createTriggerStatement6113); if (state.failed) return stmt;
			match(input,K_TRIGGER,FOLLOW_K_TRIGGER_in_createTriggerStatement6115); if (state.failed) return stmt;
			// Parser.g:903:26: ( K_IF K_NOT K_EXISTS )?
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==K_IF) ) {
				alt122=1;
			}
			switch (alt122) {
				case 1 :
					// Parser.g:903:27: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createTriggerStatement6118); if (state.failed) return stmt;
					match(input,K_NOT,FOLLOW_K_NOT_in_createTriggerStatement6120); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createTriggerStatement6122); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			// Parser.g:903:74: (name= ident )
			// Parser.g:903:75: name= ident
			{
			pushFollow(FOLLOW_ident_in_createTriggerStatement6132);
			name=ident();
			state._fsp--;
			if (state.failed) return stmt;
			}

			match(input,K_ON,FOLLOW_K_ON_in_createTriggerStatement6143); if (state.failed) return stmt;
			pushFollow(FOLLOW_columnFamilyName_in_createTriggerStatement6147);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_USING,FOLLOW_K_USING_in_createTriggerStatement6149); if (state.failed) return stmt;
			cls=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createTriggerStatement6153); if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new CreateTriggerStatement.Raw(cf, name.toString(), (cls!=null?cls.getText():null), ifNotExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createTriggerStatement"



	// $ANTLR start "dropTriggerStatement"
	// Parser.g:911:1: dropTriggerStatement returns [DropTriggerStatement.Raw stmt] : K_DROP K_TRIGGER ( K_IF K_EXISTS )? (name= ident ) K_ON cf= columnFamilyName ;
	public final DropTriggerStatement.Raw dropTriggerStatement() throws RecognitionException {
		DropTriggerStatement.Raw stmt = null;


		ColumnIdentifier name =null;
		QualifiedName cf =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:913:5: ( K_DROP K_TRIGGER ( K_IF K_EXISTS )? (name= ident ) K_ON cf= columnFamilyName )
			// Parser.g:913:7: K_DROP K_TRIGGER ( K_IF K_EXISTS )? (name= ident ) K_ON cf= columnFamilyName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropTriggerStatement6194); if (state.failed) return stmt;
			match(input,K_TRIGGER,FOLLOW_K_TRIGGER_in_dropTriggerStatement6196); if (state.failed) return stmt;
			// Parser.g:913:24: ( K_IF K_EXISTS )?
			int alt123=2;
			int LA123_0 = input.LA(1);
			if ( (LA123_0==K_IF) ) {
				alt123=1;
			}
			switch (alt123) {
				case 1 :
					// Parser.g:913:25: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropTriggerStatement6199); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropTriggerStatement6201); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			// Parser.g:913:63: (name= ident )
			// Parser.g:913:64: name= ident
			{
			pushFollow(FOLLOW_ident_in_dropTriggerStatement6211);
			name=ident();
			state._fsp--;
			if (state.failed) return stmt;
			}

			match(input,K_ON,FOLLOW_K_ON_in_dropTriggerStatement6214); if (state.failed) return stmt;
			pushFollow(FOLLOW_columnFamilyName_in_dropTriggerStatement6218);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new DropTriggerStatement.Raw(cf, name.toString(), ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropTriggerStatement"



	// $ANTLR start "alterKeyspaceStatement"
	// Parser.g:920:1: alterKeyspaceStatement returns [AlterKeyspaceStatement.Raw stmt] : K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] ;
	public final AlterKeyspaceStatement.Raw alterKeyspaceStatement() throws RecognitionException {
		AlterKeyspaceStatement.Raw stmt = null;


		String ks =null;

		 KeyspaceAttributes attrs = new KeyspaceAttributes(); 
		try {
			// Parser.g:922:5: ( K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] )
			// Parser.g:922:7: K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs]
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterKeyspaceStatement6258); if (state.failed) return stmt;
			match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_alterKeyspaceStatement6260); if (state.failed) return stmt;
			pushFollow(FOLLOW_keyspaceName_in_alterKeyspaceStatement6264);
			ks=keyspaceName();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_WITH,FOLLOW_K_WITH_in_alterKeyspaceStatement6274); if (state.failed) return stmt;
			pushFollow(FOLLOW_properties_in_alterKeyspaceStatement6276);
			properties(attrs);
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new AlterKeyspaceStatement.Raw(ks, attrs); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "alterKeyspaceStatement"



	// $ANTLR start "alterTableStatement"
	// Parser.g:933:1: alterTableStatement returns [AlterTableStatement.Raw stmt] : K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD (id= ident v= comparatorType b= isStaticColumn | ( '(' id1= ident v1= comparatorType b1= isStaticColumn ( ',' idn= ident vn= comparatorType bn= isStaticColumn )* ')' ) ) | K_DROP (id= ident | ( '(' id1= ident ( ',' idn= ident )* ')' ) ) ( K_USING K_TIMESTAMP t= INTEGER )? | K_RENAME id1= ident K_TO toId1= ident ( K_AND idn= ident K_TO toIdn= ident )* | K_DROP K_COMPACT K_STORAGE | K_WITH properties[$stmt.attrs] ) ;
	public final AlterTableStatement.Raw alterTableStatement() throws RecognitionException {
		AlterTableStatement.Raw stmt = null;


		Token t=null;
		QualifiedName cf =null;
		ColumnIdentifier id =null;
		CQL3Type.Raw v =null;
		boolean b =false;
		ColumnIdentifier id1 =null;
		CQL3Type.Raw v1 =null;
		boolean b1 =false;
		ColumnIdentifier idn =null;
		CQL3Type.Raw vn =null;
		boolean bn =false;
		ColumnIdentifier toId1 =null;
		ColumnIdentifier toIdn =null;

		try {
			// Parser.g:934:5: ( K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD (id= ident v= comparatorType b= isStaticColumn | ( '(' id1= ident v1= comparatorType b1= isStaticColumn ( ',' idn= ident vn= comparatorType bn= isStaticColumn )* ')' ) ) | K_DROP (id= ident | ( '(' id1= ident ( ',' idn= ident )* ')' ) ) ( K_USING K_TIMESTAMP t= INTEGER )? | K_RENAME id1= ident K_TO toId1= ident ( K_AND idn= ident K_TO toIdn= ident )* | K_DROP K_COMPACT K_STORAGE | K_WITH properties[$stmt.attrs] ) )
			// Parser.g:934:7: K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD (id= ident v= comparatorType b= isStaticColumn | ( '(' id1= ident v1= comparatorType b1= isStaticColumn ( ',' idn= ident vn= comparatorType bn= isStaticColumn )* ')' ) ) | K_DROP (id= ident | ( '(' id1= ident ( ',' idn= ident )* ')' ) ) ( K_USING K_TIMESTAMP t= INTEGER )? | K_RENAME id1= ident K_TO toId1= ident ( K_AND idn= ident K_TO toIdn= ident )* | K_DROP K_COMPACT K_STORAGE | K_WITH properties[$stmt.attrs] )
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement6302); if (state.failed) return stmt;
			match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_alterTableStatement6304); if (state.failed) return stmt;
			pushFollow(FOLLOW_columnFamilyName_in_alterTableStatement6308);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new AlterTableStatement.Raw(cf); }
			// Parser.g:935:7: ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD (id= ident v= comparatorType b= isStaticColumn | ( '(' id1= ident v1= comparatorType b1= isStaticColumn ( ',' idn= ident vn= comparatorType bn= isStaticColumn )* ')' ) ) | K_DROP (id= ident | ( '(' id1= ident ( ',' idn= ident )* ')' ) ) ( K_USING K_TIMESTAMP t= INTEGER )? | K_RENAME id1= ident K_TO toId1= ident ( K_AND idn= ident K_TO toIdn= ident )* | K_DROP K_COMPACT K_STORAGE | K_WITH properties[$stmt.attrs] )
			int alt130=6;
			switch ( input.LA(1) ) {
			case K_ALTER:
				{
				alt130=1;
				}
				break;
			case K_ADD:
				{
				alt130=2;
				}
				break;
			case K_DROP:
				{
				int LA130_3 = input.LA(2);
				if ( (LA130_3==K_COMPACT) ) {
					int LA130_6 = input.LA(3);
					if ( (LA130_6==K_STORAGE) ) {
						alt130=5;
					}
					else if ( (LA130_6==EOF||LA130_6==K_USING||LA130_6==210) ) {
						alt130=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return stmt;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 130, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA130_3==IDENT||LA130_3==K_ACCESS||(LA130_3 >= K_AGGREGATE && LA130_3 <= K_ALL)||LA130_3==K_AS||LA130_3==K_ASCII||(LA130_3 >= K_BIGINT && LA130_3 <= K_BOOLEAN)||(LA130_3 >= K_CALLED && LA130_3 <= K_CLUSTERING)||(LA130_3 >= K_CONTAINS && LA130_3 <= K_COUNTER)||(LA130_3 >= K_CUSTOM && LA130_3 <= K_DEFAULT)||(LA130_3 >= K_DISTINCT && LA130_3 <= K_DOUBLE)||LA130_3==K_DURATION||(LA130_3 >= K_EXISTS && LA130_3 <= K_FLOAT)||LA130_3==K_FROZEN||(LA130_3 >= K_FUNCTION && LA130_3 <= K_FUNCTIONS)||LA130_3==K_GROUP||(LA130_3 >= K_INET && LA130_3 <= K_INPUT)||(LA130_3 >= K_INT && LA130_3 <= K_INTERNALS)||(LA130_3 >= K_JSON && LA130_3 <= K_KEYS)||(LA130_3 >= K_KEYSPACES && LA130_3 <= K_LIKE)||(LA130_3 >= K_LIST && LA130_3 <= K_MAP)||(LA130_3 >= K_MBEAN && LA130_3 <= K_MBEANS)||LA130_3==K_NOLOGIN||LA130_3==K_NOSUPERUSER||(LA130_3 >= K_ONLY && LA130_3 <= K_OPTIONS)||(LA130_3 >= K_PARTITION && LA130_3 <= K_PERMISSIONS)||(LA130_3 >= K_REPLACE && LA130_3 <= K_RETURNS)||(LA130_3 >= K_ROLE && LA130_3 <= K_ROLES)||(LA130_3 >= K_SFUNC && LA130_3 <= K_TINYINT)||LA130_3==K_TRIGGER||(LA130_3 >= K_TTL && LA130_3 <= K_TYPES)||LA130_3==K_UNSET||(LA130_3 >= K_USER && LA130_3 <= K_USERS)||(LA130_3 >= K_UUID && LA130_3 <= K_VARINT)||LA130_3==K_WRITETIME||LA130_3==QUOTED_NAME||LA130_3==200) ) {
					alt130=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return stmt;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 130, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_RENAME:
				{
				alt130=4;
				}
				break;
			case K_WITH:
				{
				alt130=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return stmt;}
				NoViableAltException nvae =
					new NoViableAltException("", 130, 0, input);
				throw nvae;
			}
			switch (alt130) {
				case 1 :
					// Parser.g:936:9: K_ALTER id= cident K_TYPE v= comparatorType
					{
					match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement6328); if (state.failed) return stmt;
					pushFollow(FOLLOW_cident_in_alterTableStatement6332);
					id=cident();
					state._fsp--;
					if (state.failed) return stmt;
					match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTableStatement6334); if (state.failed) return stmt;
					pushFollow(FOLLOW_comparatorType_in_alterTableStatement6338);
					v=comparatorType();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt.alter(id, v); }
					}
					break;
				case 2 :
					// Parser.g:938:9: K_ADD (id= ident v= comparatorType b= isStaticColumn | ( '(' id1= ident v1= comparatorType b1= isStaticColumn ( ',' idn= ident vn= comparatorType bn= isStaticColumn )* ')' ) )
					{
					match(input,K_ADD,FOLLOW_K_ADD_in_alterTableStatement6351); if (state.failed) return stmt;
					// Parser.g:938:16: (id= ident v= comparatorType b= isStaticColumn | ( '(' id1= ident v1= comparatorType b1= isStaticColumn ( ',' idn= ident vn= comparatorType bn= isStaticColumn )* ')' ) )
					int alt125=2;
					int LA125_0 = input.LA(1);
					if ( (LA125_0==IDENT||LA125_0==K_ACCESS||(LA125_0 >= K_AGGREGATE && LA125_0 <= K_ALL)||LA125_0==K_AS||LA125_0==K_ASCII||(LA125_0 >= K_BIGINT && LA125_0 <= K_BOOLEAN)||(LA125_0 >= K_CALLED && LA125_0 <= K_CLUSTERING)||(LA125_0 >= K_COMPACT && LA125_0 <= K_COUNTER)||(LA125_0 >= K_CUSTOM && LA125_0 <= K_DEFAULT)||(LA125_0 >= K_DISTINCT && LA125_0 <= K_DOUBLE)||LA125_0==K_DURATION||(LA125_0 >= K_EXISTS && LA125_0 <= K_FLOAT)||LA125_0==K_FROZEN||(LA125_0 >= K_FUNCTION && LA125_0 <= K_FUNCTIONS)||LA125_0==K_GROUP||(LA125_0 >= K_INET && LA125_0 <= K_INPUT)||(LA125_0 >= K_INT && LA125_0 <= K_INTERNALS)||(LA125_0 >= K_JSON && LA125_0 <= K_KEYS)||(LA125_0 >= K_KEYSPACES && LA125_0 <= K_LIKE)||(LA125_0 >= K_LIST && LA125_0 <= K_MAP)||(LA125_0 >= K_MBEAN && LA125_0 <= K_MBEANS)||LA125_0==K_NOLOGIN||LA125_0==K_NOSUPERUSER||(LA125_0 >= K_ONLY && LA125_0 <= K_OPTIONS)||(LA125_0 >= K_PARTITION && LA125_0 <= K_PERMISSIONS)||(LA125_0 >= K_REPLACE && LA125_0 <= K_RETURNS)||(LA125_0 >= K_ROLE && LA125_0 <= K_ROLES)||(LA125_0 >= K_SFUNC && LA125_0 <= K_TINYINT)||LA125_0==K_TRIGGER||(LA125_0 >= K_TTL && LA125_0 <= K_TYPES)||LA125_0==K_UNSET||(LA125_0 >= K_USER && LA125_0 <= K_USERS)||(LA125_0 >= K_UUID && LA125_0 <= K_VARINT)||LA125_0==K_WRITETIME||LA125_0==QUOTED_NAME) ) {
						alt125=1;
					}
					else if ( (LA125_0==200) ) {
						alt125=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return stmt;}
						NoViableAltException nvae =
							new NoViableAltException("", 125, 0, input);
						throw nvae;
					}

					switch (alt125) {
						case 1 :
							// Parser.g:938:25: id= ident v= comparatorType b= isStaticColumn
							{
							pushFollow(FOLLOW_ident_in_alterTableStatement6365);
							id=ident();
							state._fsp--;
							if (state.failed) return stmt;
							pushFollow(FOLLOW_comparatorType_in_alterTableStatement6370);
							v=comparatorType();
							state._fsp--;
							if (state.failed) return stmt;
							pushFollow(FOLLOW_isStaticColumn_in_alterTableStatement6375);
							b=isStaticColumn();
							state._fsp--;
							if (state.failed) return stmt;
							if ( state.backtracking==0 ) { stmt.add(id,  v,  b);  }
							}
							break;
						case 2 :
							// Parser.g:939:18: ( '(' id1= ident v1= comparatorType b1= isStaticColumn ( ',' idn= ident vn= comparatorType bn= isStaticColumn )* ')' )
							{
							// Parser.g:939:18: ( '(' id1= ident v1= comparatorType b1= isStaticColumn ( ',' idn= ident vn= comparatorType bn= isStaticColumn )* ')' )
							// Parser.g:939:19: '(' id1= ident v1= comparatorType b1= isStaticColumn ( ',' idn= ident vn= comparatorType bn= isStaticColumn )* ')'
							{
							match(input,200,FOLLOW_200_in_alterTableStatement6397); if (state.failed) return stmt;
							pushFollow(FOLLOW_ident_in_alterTableStatement6402);
							id1=ident();
							state._fsp--;
							if (state.failed) return stmt;
							pushFollow(FOLLOW_comparatorType_in_alterTableStatement6406);
							v1=comparatorType();
							state._fsp--;
							if (state.failed) return stmt;
							pushFollow(FOLLOW_isStaticColumn_in_alterTableStatement6410);
							b1=isStaticColumn();
							state._fsp--;
							if (state.failed) return stmt;
							if ( state.backtracking==0 ) { stmt.add(id1, v1, b1); }
							// Parser.g:940:18: ( ',' idn= ident vn= comparatorType bn= isStaticColumn )*
							loop124:
							while (true) {
								int alt124=2;
								int LA124_0 = input.LA(1);
								if ( (LA124_0==204) ) {
									alt124=1;
								}

								switch (alt124) {
								case 1 :
									// Parser.g:940:20: ',' idn= ident vn= comparatorType bn= isStaticColumn
									{
									match(input,204,FOLLOW_204_in_alterTableStatement6433); if (state.failed) return stmt;
									pushFollow(FOLLOW_ident_in_alterTableStatement6437);
									idn=ident();
									state._fsp--;
									if (state.failed) return stmt;
									pushFollow(FOLLOW_comparatorType_in_alterTableStatement6441);
									vn=comparatorType();
									state._fsp--;
									if (state.failed) return stmt;
									pushFollow(FOLLOW_isStaticColumn_in_alterTableStatement6445);
									bn=isStaticColumn();
									state._fsp--;
									if (state.failed) return stmt;
									if ( state.backtracking==0 ) { stmt.add(idn, vn, bn); }
									}
									break;

								default :
									break loop124;
								}
							}

							match(input,201,FOLLOW_201_in_alterTableStatement6452); if (state.failed) return stmt;
							}

							}
							break;

					}

					}
					break;
				case 3 :
					// Parser.g:942:9: K_DROP (id= ident | ( '(' id1= ident ( ',' idn= ident )* ')' ) ) ( K_USING K_TIMESTAMP t= INTEGER )?
					{
					match(input,K_DROP,FOLLOW_K_DROP_in_alterTableStatement6466); if (state.failed) return stmt;
					// Parser.g:942:16: (id= ident | ( '(' id1= ident ( ',' idn= ident )* ')' ) )
					int alt127=2;
					int LA127_0 = input.LA(1);
					if ( (LA127_0==IDENT||LA127_0==K_ACCESS||(LA127_0 >= K_AGGREGATE && LA127_0 <= K_ALL)||LA127_0==K_AS||LA127_0==K_ASCII||(LA127_0 >= K_BIGINT && LA127_0 <= K_BOOLEAN)||(LA127_0 >= K_CALLED && LA127_0 <= K_CLUSTERING)||(LA127_0 >= K_COMPACT && LA127_0 <= K_COUNTER)||(LA127_0 >= K_CUSTOM && LA127_0 <= K_DEFAULT)||(LA127_0 >= K_DISTINCT && LA127_0 <= K_DOUBLE)||LA127_0==K_DURATION||(LA127_0 >= K_EXISTS && LA127_0 <= K_FLOAT)||LA127_0==K_FROZEN||(LA127_0 >= K_FUNCTION && LA127_0 <= K_FUNCTIONS)||LA127_0==K_GROUP||(LA127_0 >= K_INET && LA127_0 <= K_INPUT)||(LA127_0 >= K_INT && LA127_0 <= K_INTERNALS)||(LA127_0 >= K_JSON && LA127_0 <= K_KEYS)||(LA127_0 >= K_KEYSPACES && LA127_0 <= K_LIKE)||(LA127_0 >= K_LIST && LA127_0 <= K_MAP)||(LA127_0 >= K_MBEAN && LA127_0 <= K_MBEANS)||LA127_0==K_NOLOGIN||LA127_0==K_NOSUPERUSER||(LA127_0 >= K_ONLY && LA127_0 <= K_OPTIONS)||(LA127_0 >= K_PARTITION && LA127_0 <= K_PERMISSIONS)||(LA127_0 >= K_REPLACE && LA127_0 <= K_RETURNS)||(LA127_0 >= K_ROLE && LA127_0 <= K_ROLES)||(LA127_0 >= K_SFUNC && LA127_0 <= K_TINYINT)||LA127_0==K_TRIGGER||(LA127_0 >= K_TTL && LA127_0 <= K_TYPES)||LA127_0==K_UNSET||(LA127_0 >= K_USER && LA127_0 <= K_USERS)||(LA127_0 >= K_UUID && LA127_0 <= K_VARINT)||LA127_0==K_WRITETIME||LA127_0==QUOTED_NAME) ) {
						alt127=1;
					}
					else if ( (LA127_0==200) ) {
						alt127=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return stmt;}
						NoViableAltException nvae =
							new NoViableAltException("", 127, 0, input);
						throw nvae;
					}

					switch (alt127) {
						case 1 :
							// Parser.g:942:25: id= ident
							{
							pushFollow(FOLLOW_ident_in_alterTableStatement6479);
							id=ident();
							state._fsp--;
							if (state.failed) return stmt;
							if ( state.backtracking==0 ) { stmt.drop(id);  }
							}
							break;
						case 2 :
							// Parser.g:943:18: ( '(' id1= ident ( ',' idn= ident )* ')' )
							{
							// Parser.g:943:18: ( '(' id1= ident ( ',' idn= ident )* ')' )
							// Parser.g:943:19: '(' id1= ident ( ',' idn= ident )* ')'
							{
							match(input,200,FOLLOW_200_in_alterTableStatement6501); if (state.failed) return stmt;
							pushFollow(FOLLOW_ident_in_alterTableStatement6506);
							id1=ident();
							state._fsp--;
							if (state.failed) return stmt;
							if ( state.backtracking==0 ) { stmt.drop(id1); }
							// Parser.g:944:18: ( ',' idn= ident )*
							loop126:
							while (true) {
								int alt126=2;
								int LA126_0 = input.LA(1);
								if ( (LA126_0==204) ) {
									alt126=1;
								}

								switch (alt126) {
								case 1 :
									// Parser.g:944:20: ',' idn= ident
									{
									match(input,204,FOLLOW_204_in_alterTableStatement6529); if (state.failed) return stmt;
									pushFollow(FOLLOW_ident_in_alterTableStatement6533);
									idn=ident();
									state._fsp--;
									if (state.failed) return stmt;
									if ( state.backtracking==0 ) { stmt.drop(idn); }
									}
									break;

								default :
									break loop126;
								}
							}

							match(input,201,FOLLOW_201_in_alterTableStatement6540); if (state.failed) return stmt;
							}

							}
							break;

					}

					// Parser.g:945:16: ( K_USING K_TIMESTAMP t= INTEGER )?
					int alt128=2;
					int LA128_0 = input.LA(1);
					if ( (LA128_0==K_USING) ) {
						alt128=1;
					}
					switch (alt128) {
						case 1 :
							// Parser.g:945:18: K_USING K_TIMESTAMP t= INTEGER
							{
							match(input,K_USING,FOLLOW_K_USING_in_alterTableStatement6562); if (state.failed) return stmt;
							match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_alterTableStatement6564); if (state.failed) return stmt;
							t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_alterTableStatement6568); if (state.failed) return stmt;
							if ( state.backtracking==0 ) { stmt.timestamp(Long.parseLong(Constants.Literal.integer((t!=null?t.getText():null)).getText())); }
							}
							break;

					}

					}
					break;
				case 4 :
					// Parser.g:947:9: K_RENAME id1= ident K_TO toId1= ident ( K_AND idn= ident K_TO toIdn= ident )*
					{
					match(input,K_RENAME,FOLLOW_K_RENAME_in_alterTableStatement6584); if (state.failed) return stmt;
					pushFollow(FOLLOW_ident_in_alterTableStatement6588);
					id1=ident();
					state._fsp--;
					if (state.failed) return stmt;
					match(input,K_TO,FOLLOW_K_TO_in_alterTableStatement6590); if (state.failed) return stmt;
					pushFollow(FOLLOW_ident_in_alterTableStatement6594);
					toId1=ident();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt.rename(id1, toId1); }
					// Parser.g:948:10: ( K_AND idn= ident K_TO toIdn= ident )*
					loop129:
					while (true) {
						int alt129=2;
						int LA129_0 = input.LA(1);
						if ( (LA129_0==K_AND) ) {
							alt129=1;
						}

						switch (alt129) {
						case 1 :
							// Parser.g:948:12: K_AND idn= ident K_TO toIdn= ident
							{
							match(input,K_AND,FOLLOW_K_AND_in_alterTableStatement6609); if (state.failed) return stmt;
							pushFollow(FOLLOW_ident_in_alterTableStatement6613);
							idn=ident();
							state._fsp--;
							if (state.failed) return stmt;
							match(input,K_TO,FOLLOW_K_TO_in_alterTableStatement6615); if (state.failed) return stmt;
							pushFollow(FOLLOW_ident_in_alterTableStatement6619);
							toIdn=ident();
							state._fsp--;
							if (state.failed) return stmt;
							if ( state.backtracking==0 ) { stmt.rename(idn, toIdn); }
							}
							break;

						default :
							break loop129;
						}
					}

					}
					break;
				case 5 :
					// Parser.g:950:9: K_DROP K_COMPACT K_STORAGE
					{
					match(input,K_DROP,FOLLOW_K_DROP_in_alterTableStatement6635); if (state.failed) return stmt;
					match(input,K_COMPACT,FOLLOW_K_COMPACT_in_alterTableStatement6637); if (state.failed) return stmt;
					match(input,K_STORAGE,FOLLOW_K_STORAGE_in_alterTableStatement6639); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt.dropCompactStorage(); }
					}
					break;
				case 6 :
					// Parser.g:952:9: K_WITH properties[$stmt.attrs]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_alterTableStatement6652); if (state.failed) return stmt;
					pushFollow(FOLLOW_properties_in_alterTableStatement6654);
					properties(stmt.attrs);
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt.attrs(); }
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "alterTableStatement"



	// $ANTLR start "isStaticColumn"
	// Parser.g:956:1: isStaticColumn returns [boolean isStaticColumn] : ( K_STATIC )? ;
	public final boolean isStaticColumn() throws RecognitionException {
		boolean isStaticColumn = false;


		 boolean isStatic = false; 
		try {
			// Parser.g:958:5: ( ( K_STATIC )? )
			// Parser.g:958:7: ( K_STATIC )?
			{
			// Parser.g:958:7: ( K_STATIC )?
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==K_STATIC) ) {
				alt131=1;
			}
			switch (alt131) {
				case 1 :
					// Parser.g:958:8: K_STATIC
					{
					match(input,K_STATIC,FOLLOW_K_STATIC_in_isStaticColumn6696); if (state.failed) return isStaticColumn;
					if ( state.backtracking==0 ) { isStatic=true; }
					}
					break;

			}

			if ( state.backtracking==0 ) { isStaticColumn = isStatic; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return isStaticColumn;
	}
	// $ANTLR end "isStaticColumn"



	// $ANTLR start "alterMaterializedViewStatement"
	// Parser.g:961:1: alterMaterializedViewStatement returns [AlterViewStatement.Raw stmt] : K_ALTER K_MATERIALIZED K_VIEW name= columnFamilyName K_WITH properties[attrs] ;
	public final AlterViewStatement.Raw alterMaterializedViewStatement() throws RecognitionException {
		AlterViewStatement.Raw stmt = null;


		QualifiedName name =null;


		        TableAttributes attrs = new TableAttributes();
		    
		try {
			// Parser.g:965:5: ( K_ALTER K_MATERIALIZED K_VIEW name= columnFamilyName K_WITH properties[attrs] )
			// Parser.g:965:7: K_ALTER K_MATERIALIZED K_VIEW name= columnFamilyName K_WITH properties[attrs]
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterMaterializedViewStatement6732); if (state.failed) return stmt;
			match(input,K_MATERIALIZED,FOLLOW_K_MATERIALIZED_in_alterMaterializedViewStatement6734); if (state.failed) return stmt;
			match(input,K_VIEW,FOLLOW_K_VIEW_in_alterMaterializedViewStatement6736); if (state.failed) return stmt;
			pushFollow(FOLLOW_columnFamilyName_in_alterMaterializedViewStatement6740);
			name=columnFamilyName();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_WITH,FOLLOW_K_WITH_in_alterMaterializedViewStatement6752); if (state.failed) return stmt;
			pushFollow(FOLLOW_properties_in_alterMaterializedViewStatement6754);
			properties(attrs);
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) {
			        stmt = new AlterViewStatement.Raw(name, attrs);
			    }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "alterMaterializedViewStatement"



	// $ANTLR start "alterTypeStatement"
	// Parser.g:978:1: alterTypeStatement returns [AlterTypeStatement.Raw stmt] : K_ALTER K_TYPE name= userTypeName ( K_ALTER f= fident K_TYPE v= comparatorType | K_ADD f= fident v= comparatorType | K_RENAME f1= fident K_TO toF1= fident ( K_AND fn= fident K_TO toFn= fident )* ) ;
	public final AlterTypeStatement.Raw alterTypeStatement() throws RecognitionException {
		AlterTypeStatement.Raw stmt = null;


		UTName name =null;
		FieldIdentifier f =null;
		CQL3Type.Raw v =null;
		FieldIdentifier f1 =null;
		FieldIdentifier toF1 =null;
		FieldIdentifier fn =null;
		FieldIdentifier toFn =null;

		try {
			// Parser.g:979:5: ( K_ALTER K_TYPE name= userTypeName ( K_ALTER f= fident K_TYPE v= comparatorType | K_ADD f= fident v= comparatorType | K_RENAME f1= fident K_TO toF1= fident ( K_AND fn= fident K_TO toFn= fident )* ) )
			// Parser.g:979:7: K_ALTER K_TYPE name= userTypeName ( K_ALTER f= fident K_TYPE v= comparatorType | K_ADD f= fident v= comparatorType | K_RENAME f1= fident K_TO toF1= fident ( K_AND fn= fident K_TO toFn= fident )* )
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTypeStatement6785); if (state.failed) return stmt;
			match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTypeStatement6787); if (state.failed) return stmt;
			pushFollow(FOLLOW_userTypeName_in_alterTypeStatement6791);
			name=userTypeName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new AlterTypeStatement.Raw(name); }
			// Parser.g:980:7: ( K_ALTER f= fident K_TYPE v= comparatorType | K_ADD f= fident v= comparatorType | K_RENAME f1= fident K_TO toF1= fident ( K_AND fn= fident K_TO toFn= fident )* )
			int alt133=3;
			switch ( input.LA(1) ) {
			case K_ALTER:
				{
				alt133=1;
				}
				break;
			case K_ADD:
				{
				alt133=2;
				}
				break;
			case K_RENAME:
				{
				alt133=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return stmt;}
				NoViableAltException nvae =
					new NoViableAltException("", 133, 0, input);
				throw nvae;
			}
			switch (alt133) {
				case 1 :
					// Parser.g:981:9: K_ALTER f= fident K_TYPE v= comparatorType
					{
					match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTypeStatement6811); if (state.failed) return stmt;
					pushFollow(FOLLOW_fident_in_alterTypeStatement6817);
					f=fident();
					state._fsp--;
					if (state.failed) return stmt;
					match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTypeStatement6819); if (state.failed) return stmt;
					pushFollow(FOLLOW_comparatorType_in_alterTypeStatement6823);
					v=comparatorType();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt.alter(f, v); }
					}
					break;
				case 2 :
					// Parser.g:983:9: K_ADD f= fident v= comparatorType
					{
					match(input,K_ADD,FOLLOW_K_ADD_in_alterTypeStatement6836); if (state.failed) return stmt;
					pushFollow(FOLLOW_fident_in_alterTypeStatement6844);
					f=fident();
					state._fsp--;
					if (state.failed) return stmt;
					pushFollow(FOLLOW_comparatorType_in_alterTypeStatement6848);
					v=comparatorType();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt.add(f, v); }
					}
					break;
				case 3 :
					// Parser.g:985:9: K_RENAME f1= fident K_TO toF1= fident ( K_AND fn= fident K_TO toFn= fident )*
					{
					match(input,K_RENAME,FOLLOW_K_RENAME_in_alterTypeStatement6868); if (state.failed) return stmt;
					pushFollow(FOLLOW_fident_in_alterTypeStatement6872);
					f1=fident();
					state._fsp--;
					if (state.failed) return stmt;
					match(input,K_TO,FOLLOW_K_TO_in_alterTypeStatement6874); if (state.failed) return stmt;
					pushFollow(FOLLOW_fident_in_alterTypeStatement6878);
					toF1=fident();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt.rename(f1, toF1); }
					// Parser.g:986:10: ( K_AND fn= fident K_TO toFn= fident )*
					loop132:
					while (true) {
						int alt132=2;
						int LA132_0 = input.LA(1);
						if ( (LA132_0==K_AND) ) {
							alt132=1;
						}

						switch (alt132) {
						case 1 :
							// Parser.g:986:12: K_AND fn= fident K_TO toFn= fident
							{
							match(input,K_AND,FOLLOW_K_AND_in_alterTypeStatement6900); if (state.failed) return stmt;
							pushFollow(FOLLOW_fident_in_alterTypeStatement6904);
							fn=fident();
							state._fsp--;
							if (state.failed) return stmt;
							match(input,K_TO,FOLLOW_K_TO_in_alterTypeStatement6906); if (state.failed) return stmt;
							pushFollow(FOLLOW_fident_in_alterTypeStatement6910);
							toFn=fident();
							state._fsp--;
							if (state.failed) return stmt;
							if ( state.backtracking==0 ) { stmt.rename(fn, toFn); }
							}
							break;

						default :
							break loop132;
						}
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "alterTypeStatement"



	// $ANTLR start "dropKeyspaceStatement"
	// Parser.g:993:1: dropKeyspaceStatement returns [DropKeyspaceStatement.Raw stmt] : K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName ;
	public final DropKeyspaceStatement.Raw dropKeyspaceStatement() throws RecognitionException {
		DropKeyspaceStatement.Raw stmt = null;


		String ks =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:995:5: ( K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName )
			// Parser.g:995:7: K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropKeyspaceStatement6962); if (state.failed) return stmt;
			match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement6964); if (state.failed) return stmt;
			// Parser.g:995:25: ( K_IF K_EXISTS )?
			int alt134=2;
			int LA134_0 = input.LA(1);
			if ( (LA134_0==K_IF) ) {
				alt134=1;
			}
			switch (alt134) {
				case 1 :
					// Parser.g:995:26: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropKeyspaceStatement6967); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropKeyspaceStatement6969); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_keyspaceName_in_dropKeyspaceStatement6978);
			ks=keyspaceName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new DropKeyspaceStatement.Raw(ks, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropKeyspaceStatement"



	// $ANTLR start "dropTableStatement"
	// Parser.g:1001:1: dropTableStatement returns [DropTableStatement.Raw stmt] : K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? name= columnFamilyName ;
	public final DropTableStatement.Raw dropTableStatement() throws RecognitionException {
		DropTableStatement.Raw stmt = null;


		QualifiedName name =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:1003:5: ( K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? name= columnFamilyName )
			// Parser.g:1003:7: K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? name= columnFamilyName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropTableStatement7012); if (state.failed) return stmt;
			match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dropTableStatement7014); if (state.failed) return stmt;
			// Parser.g:1003:29: ( K_IF K_EXISTS )?
			int alt135=2;
			int LA135_0 = input.LA(1);
			if ( (LA135_0==K_IF) ) {
				alt135=1;
			}
			switch (alt135) {
				case 1 :
					// Parser.g:1003:30: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropTableStatement7017); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropTableStatement7019); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_dropTableStatement7028);
			name=columnFamilyName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new DropTableStatement.Raw(name, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropTableStatement"



	// $ANTLR start "dropTypeStatement"
	// Parser.g:1009:1: dropTypeStatement returns [DropTypeStatement.Raw stmt] : K_DROP K_TYPE ( K_IF K_EXISTS )? name= userTypeName ;
	public final DropTypeStatement.Raw dropTypeStatement() throws RecognitionException {
		DropTypeStatement.Raw stmt = null;


		UTName name =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:1011:5: ( K_DROP K_TYPE ( K_IF K_EXISTS )? name= userTypeName )
			// Parser.g:1011:7: K_DROP K_TYPE ( K_IF K_EXISTS )? name= userTypeName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropTypeStatement7062); if (state.failed) return stmt;
			match(input,K_TYPE,FOLLOW_K_TYPE_in_dropTypeStatement7064); if (state.failed) return stmt;
			// Parser.g:1011:21: ( K_IF K_EXISTS )?
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==K_IF) ) {
				alt136=1;
			}
			switch (alt136) {
				case 1 :
					// Parser.g:1011:22: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropTypeStatement7067); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropTypeStatement7069); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_userTypeName_in_dropTypeStatement7078);
			name=userTypeName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new DropTypeStatement.Raw(name, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropTypeStatement"



	// $ANTLR start "dropIndexStatement"
	// Parser.g:1017:1: dropIndexStatement returns [DropIndexStatement.Raw stmt] : K_DROP K_INDEX ( K_IF K_EXISTS )? index= indexName ;
	public final DropIndexStatement.Raw dropIndexStatement() throws RecognitionException {
		DropIndexStatement.Raw stmt = null;


		QualifiedName index =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:1019:5: ( K_DROP K_INDEX ( K_IF K_EXISTS )? index= indexName )
			// Parser.g:1019:7: K_DROP K_INDEX ( K_IF K_EXISTS )? index= indexName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropIndexStatement7112); if (state.failed) return stmt;
			match(input,K_INDEX,FOLLOW_K_INDEX_in_dropIndexStatement7114); if (state.failed) return stmt;
			// Parser.g:1019:22: ( K_IF K_EXISTS )?
			int alt137=2;
			int LA137_0 = input.LA(1);
			if ( (LA137_0==K_IF) ) {
				alt137=1;
			}
			switch (alt137) {
				case 1 :
					// Parser.g:1019:23: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropIndexStatement7117); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropIndexStatement7119); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_indexName_in_dropIndexStatement7128);
			index=indexName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new DropIndexStatement.Raw(index, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropIndexStatement"



	// $ANTLR start "dropMaterializedViewStatement"
	// Parser.g:1026:1: dropMaterializedViewStatement returns [DropViewStatement.Raw stmt] : K_DROP K_MATERIALIZED K_VIEW ( K_IF K_EXISTS )? cf= columnFamilyName ;
	public final DropViewStatement.Raw dropMaterializedViewStatement() throws RecognitionException {
		DropViewStatement.Raw stmt = null;


		QualifiedName cf =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:1028:5: ( K_DROP K_MATERIALIZED K_VIEW ( K_IF K_EXISTS )? cf= columnFamilyName )
			// Parser.g:1028:7: K_DROP K_MATERIALIZED K_VIEW ( K_IF K_EXISTS )? cf= columnFamilyName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropMaterializedViewStatement7168); if (state.failed) return stmt;
			match(input,K_MATERIALIZED,FOLLOW_K_MATERIALIZED_in_dropMaterializedViewStatement7170); if (state.failed) return stmt;
			match(input,K_VIEW,FOLLOW_K_VIEW_in_dropMaterializedViewStatement7172); if (state.failed) return stmt;
			// Parser.g:1028:36: ( K_IF K_EXISTS )?
			int alt138=2;
			int LA138_0 = input.LA(1);
			if ( (LA138_0==K_IF) ) {
				alt138=1;
			}
			switch (alt138) {
				case 1 :
					// Parser.g:1028:37: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropMaterializedViewStatement7175); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropMaterializedViewStatement7177); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_dropMaterializedViewStatement7186);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new DropViewStatement.Raw(cf, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropMaterializedViewStatement"



	// $ANTLR start "truncateStatement"
	// Parser.g:1035:1: truncateStatement returns [TruncateStatement stmt] : K_TRUNCATE ( K_COLUMNFAMILY )? cf= columnFamilyName ;
	public final TruncateStatement truncateStatement() throws RecognitionException {
		TruncateStatement stmt = null;


		QualifiedName cf =null;

		try {
			// Parser.g:1036:5: ( K_TRUNCATE ( K_COLUMNFAMILY )? cf= columnFamilyName )
			// Parser.g:1036:7: K_TRUNCATE ( K_COLUMNFAMILY )? cf= columnFamilyName
			{
			match(input,K_TRUNCATE,FOLLOW_K_TRUNCATE_in_truncateStatement7217); if (state.failed) return stmt;
			// Parser.g:1036:18: ( K_COLUMNFAMILY )?
			int alt139=2;
			int LA139_0 = input.LA(1);
			if ( (LA139_0==K_COLUMNFAMILY) ) {
				alt139=1;
			}
			switch (alt139) {
				case 1 :
					// Parser.g:1036:19: K_COLUMNFAMILY
					{
					match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_truncateStatement7220); if (state.failed) return stmt;
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_truncateStatement7226);
			cf=columnFamilyName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new TruncateStatement(cf); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "truncateStatement"



	// $ANTLR start "grantPermissionsStatement"
	// Parser.g:1042:1: grantPermissionsStatement returns [GrantPermissionsStatement stmt] : K_GRANT permissionOrAll K_ON resource K_TO grantee= userOrRoleName ;
	public final GrantPermissionsStatement grantPermissionsStatement() throws RecognitionException {
		GrantPermissionsStatement stmt = null;


		RoleName grantee =null;
		Set<Permission> permissionOrAll1 =null;
		IResource resource2 =null;

		try {
			// Parser.g:1043:5: ( K_GRANT permissionOrAll K_ON resource K_TO grantee= userOrRoleName )
			// Parser.g:1043:7: K_GRANT permissionOrAll K_ON resource K_TO grantee= userOrRoleName
			{
			match(input,K_GRANT,FOLLOW_K_GRANT_in_grantPermissionsStatement7251); if (state.failed) return stmt;
			pushFollow(FOLLOW_permissionOrAll_in_grantPermissionsStatement7263);
			permissionOrAll1=permissionOrAll();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_ON,FOLLOW_K_ON_in_grantPermissionsStatement7271); if (state.failed) return stmt;
			pushFollow(FOLLOW_resource_in_grantPermissionsStatement7283);
			resource2=resource();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_TO,FOLLOW_K_TO_in_grantPermissionsStatement7291); if (state.failed) return stmt;
			pushFollow(FOLLOW_userOrRoleName_in_grantPermissionsStatement7305);
			grantee=userOrRoleName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new GrantPermissionsStatement(filterPermissions(permissionOrAll1, resource2), resource2, grantee); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "grantPermissionsStatement"



	// $ANTLR start "revokePermissionsStatement"
	// Parser.g:1055:1: revokePermissionsStatement returns [RevokePermissionsStatement stmt] : K_REVOKE permissionOrAll K_ON resource K_FROM revokee= userOrRoleName ;
	public final RevokePermissionsStatement revokePermissionsStatement() throws RecognitionException {
		RevokePermissionsStatement stmt = null;


		RoleName revokee =null;
		Set<Permission> permissionOrAll3 =null;
		IResource resource4 =null;

		try {
			// Parser.g:1056:5: ( K_REVOKE permissionOrAll K_ON resource K_FROM revokee= userOrRoleName )
			// Parser.g:1056:7: K_REVOKE permissionOrAll K_ON resource K_FROM revokee= userOrRoleName
			{
			match(input,K_REVOKE,FOLLOW_K_REVOKE_in_revokePermissionsStatement7336); if (state.failed) return stmt;
			pushFollow(FOLLOW_permissionOrAll_in_revokePermissionsStatement7348);
			permissionOrAll3=permissionOrAll();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_ON,FOLLOW_K_ON_in_revokePermissionsStatement7356); if (state.failed) return stmt;
			pushFollow(FOLLOW_resource_in_revokePermissionsStatement7368);
			resource4=resource();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_FROM,FOLLOW_K_FROM_in_revokePermissionsStatement7376); if (state.failed) return stmt;
			pushFollow(FOLLOW_userOrRoleName_in_revokePermissionsStatement7390);
			revokee=userOrRoleName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new RevokePermissionsStatement(filterPermissions(permissionOrAll3, resource4), resource4, revokee); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "revokePermissionsStatement"



	// $ANTLR start "grantRoleStatement"
	// Parser.g:1068:1: grantRoleStatement returns [GrantRoleStatement stmt] : K_GRANT role= userOrRoleName K_TO grantee= userOrRoleName ;
	public final GrantRoleStatement grantRoleStatement() throws RecognitionException {
		GrantRoleStatement stmt = null;


		RoleName role =null;
		RoleName grantee =null;

		try {
			// Parser.g:1069:5: ( K_GRANT role= userOrRoleName K_TO grantee= userOrRoleName )
			// Parser.g:1069:7: K_GRANT role= userOrRoleName K_TO grantee= userOrRoleName
			{
			match(input,K_GRANT,FOLLOW_K_GRANT_in_grantRoleStatement7421); if (state.failed) return stmt;
			pushFollow(FOLLOW_userOrRoleName_in_grantRoleStatement7435);
			role=userOrRoleName();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_TO,FOLLOW_K_TO_in_grantRoleStatement7443); if (state.failed) return stmt;
			pushFollow(FOLLOW_userOrRoleName_in_grantRoleStatement7457);
			grantee=userOrRoleName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new GrantRoleStatement(role, grantee); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "grantRoleStatement"



	// $ANTLR start "revokeRoleStatement"
	// Parser.g:1079:1: revokeRoleStatement returns [RevokeRoleStatement stmt] : K_REVOKE role= userOrRoleName K_FROM revokee= userOrRoleName ;
	public final RevokeRoleStatement revokeRoleStatement() throws RecognitionException {
		RevokeRoleStatement stmt = null;


		RoleName role =null;
		RoleName revokee =null;

		try {
			// Parser.g:1080:5: ( K_REVOKE role= userOrRoleName K_FROM revokee= userOrRoleName )
			// Parser.g:1080:7: K_REVOKE role= userOrRoleName K_FROM revokee= userOrRoleName
			{
			match(input,K_REVOKE,FOLLOW_K_REVOKE_in_revokeRoleStatement7488); if (state.failed) return stmt;
			pushFollow(FOLLOW_userOrRoleName_in_revokeRoleStatement7502);
			role=userOrRoleName();
			state._fsp--;
			if (state.failed) return stmt;
			match(input,K_FROM,FOLLOW_K_FROM_in_revokeRoleStatement7510); if (state.failed) return stmt;
			pushFollow(FOLLOW_userOrRoleName_in_revokeRoleStatement7524);
			revokee=userOrRoleName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new RevokeRoleStatement(role, revokee); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "revokeRoleStatement"



	// $ANTLR start "listPermissionsStatement"
	// Parser.g:1087:1: listPermissionsStatement returns [ListPermissionsStatement stmt] : K_LIST permissionOrAll ( K_ON resource )? ( K_OF roleName[grantee] )? ( K_NORECURSIVE )? ;
	public final ListPermissionsStatement listPermissionsStatement() throws RecognitionException {
		ListPermissionsStatement stmt = null;


		IResource resource5 =null;
		Set<Permission> permissionOrAll6 =null;


		        IResource resource = null;
		        boolean recursive = true;
		        RoleName grantee = new RoleName();
		    
		try {
			// Parser.g:1093:5: ( K_LIST permissionOrAll ( K_ON resource )? ( K_OF roleName[grantee] )? ( K_NORECURSIVE )? )
			// Parser.g:1093:7: K_LIST permissionOrAll ( K_ON resource )? ( K_OF roleName[grantee] )? ( K_NORECURSIVE )?
			{
			match(input,K_LIST,FOLLOW_K_LIST_in_listPermissionsStatement7562); if (state.failed) return stmt;
			pushFollow(FOLLOW_permissionOrAll_in_listPermissionsStatement7574);
			permissionOrAll6=permissionOrAll();
			state._fsp--;
			if (state.failed) return stmt;
			// Parser.g:1095:7: ( K_ON resource )?
			int alt140=2;
			int LA140_0 = input.LA(1);
			if ( (LA140_0==K_ON) ) {
				alt140=1;
			}
			switch (alt140) {
				case 1 :
					// Parser.g:1095:9: K_ON resource
					{
					match(input,K_ON,FOLLOW_K_ON_in_listPermissionsStatement7584); if (state.failed) return stmt;
					pushFollow(FOLLOW_resource_in_listPermissionsStatement7586);
					resource5=resource();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { resource = resource5; }
					}
					break;

			}

			// Parser.g:1096:7: ( K_OF roleName[grantee] )?
			int alt141=2;
			int LA141_0 = input.LA(1);
			if ( (LA141_0==K_OF) ) {
				alt141=1;
			}
			switch (alt141) {
				case 1 :
					// Parser.g:1096:9: K_OF roleName[grantee]
					{
					match(input,K_OF,FOLLOW_K_OF_in_listPermissionsStatement7601); if (state.failed) return stmt;
					pushFollow(FOLLOW_roleName_in_listPermissionsStatement7603);
					roleName(grantee);
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			// Parser.g:1097:7: ( K_NORECURSIVE )?
			int alt142=2;
			int LA142_0 = input.LA(1);
			if ( (LA142_0==K_NORECURSIVE) ) {
				alt142=1;
			}
			switch (alt142) {
				case 1 :
					// Parser.g:1097:9: K_NORECURSIVE
					{
					match(input,K_NORECURSIVE,FOLLOW_K_NORECURSIVE_in_listPermissionsStatement7617); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { recursive = false; }
					}
					break;

			}

			if ( state.backtracking==0 ) { stmt = new ListPermissionsStatement(permissionOrAll6, resource, grantee, recursive); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "listPermissionsStatement"



	// $ANTLR start "permission"
	// Parser.g:1101:1: permission returns [Permission perm] : p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE | K_DESCRIBE | K_EXECUTE ) ;
	public final Permission permission() throws RecognitionException {
		Permission perm = null;


		Token p=null;

		try {
			// Parser.g:1102:5: (p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE | K_DESCRIBE | K_EXECUTE ) )
			// Parser.g:1102:7: p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE | K_DESCRIBE | K_EXECUTE )
			{
			p=input.LT(1);
			if ( input.LA(1)==K_ALTER||input.LA(1)==K_AUTHORIZE||input.LA(1)==K_CREATE||input.LA(1)==K_DESCRIBE||input.LA(1)==K_DROP||input.LA(1)==K_EXECUTE||input.LA(1)==K_MODIFY||input.LA(1)==K_SELECT ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return perm;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			if ( state.backtracking==0 ) { perm = Permission.valueOf((p!=null?p.getText():null).toUpperCase()); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return perm;
	}
	// $ANTLR end "permission"



	// $ANTLR start "permissionOrAll"
	// Parser.g:1106:1: permissionOrAll returns [Set<Permission> perms] : ( K_ALL ( K_PERMISSIONS )? |p= permission ( K_PERMISSION )? );
	public final Set<Permission> permissionOrAll() throws RecognitionException {
		Set<Permission> perms = null;


		Permission p =null;

		try {
			// Parser.g:1107:5: ( K_ALL ( K_PERMISSIONS )? |p= permission ( K_PERMISSION )? )
			int alt145=2;
			int LA145_0 = input.LA(1);
			if ( (LA145_0==K_ALL) ) {
				alt145=1;
			}
			else if ( (LA145_0==K_ALTER||LA145_0==K_AUTHORIZE||LA145_0==K_CREATE||LA145_0==K_DESCRIBE||LA145_0==K_DROP||LA145_0==K_EXECUTE||LA145_0==K_MODIFY||LA145_0==K_SELECT) ) {
				alt145=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return perms;}
				NoViableAltException nvae =
					new NoViableAltException("", 145, 0, input);
				throw nvae;
			}

			switch (alt145) {
				case 1 :
					// Parser.g:1107:7: K_ALL ( K_PERMISSIONS )?
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_permissionOrAll7710); if (state.failed) return perms;
					// Parser.g:1107:13: ( K_PERMISSIONS )?
					int alt143=2;
					int LA143_0 = input.LA(1);
					if ( (LA143_0==K_PERMISSIONS) ) {
						alt143=1;
					}
					switch (alt143) {
						case 1 :
							// Parser.g:1107:15: K_PERMISSIONS
							{
							match(input,K_PERMISSIONS,FOLLOW_K_PERMISSIONS_in_permissionOrAll7714); if (state.failed) return perms;
							}
							break;

					}

					if ( state.backtracking==0 ) { perms = Permission.ALL; }
					}
					break;
				case 2 :
					// Parser.g:1108:7: p= permission ( K_PERMISSION )?
					{
					pushFollow(FOLLOW_permission_in_permissionOrAll7735);
					p=permission();
					state._fsp--;
					if (state.failed) return perms;
					// Parser.g:1108:20: ( K_PERMISSION )?
					int alt144=2;
					int LA144_0 = input.LA(1);
					if ( (LA144_0==K_PERMISSION) ) {
						alt144=1;
					}
					switch (alt144) {
						case 1 :
							// Parser.g:1108:22: K_PERMISSION
							{
							match(input,K_PERMISSION,FOLLOW_K_PERMISSION_in_permissionOrAll7739); if (state.failed) return perms;
							}
							break;

					}

					if ( state.backtracking==0 ) { perms = EnumSet.of(p); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return perms;
	}
	// $ANTLR end "permissionOrAll"



	// $ANTLR start "resource"
	// Parser.g:1111:1: resource returns [IResource res] : (d= dataResource |r= roleResource |f= functionResource |j= jmxResource );
	public final IResource resource() throws RecognitionException {
		IResource res = null;


		DataResource d =null;
		RoleResource r =null;
		FunctionResource f =null;
		JMXResource j =null;

		try {
			// Parser.g:1112:5: (d= dataResource |r= roleResource |f= functionResource |j= jmxResource )
			int alt146=4;
			alt146 = dfa146.predict(input);
			switch (alt146) {
				case 1 :
					// Parser.g:1112:7: d= dataResource
					{
					pushFollow(FOLLOW_dataResource_in_resource7767);
					d=dataResource();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = d; }
					}
					break;
				case 2 :
					// Parser.g:1113:7: r= roleResource
					{
					pushFollow(FOLLOW_roleResource_in_resource7779);
					r=roleResource();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = r; }
					}
					break;
				case 3 :
					// Parser.g:1114:7: f= functionResource
					{
					pushFollow(FOLLOW_functionResource_in_resource7791);
					f=functionResource();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = f; }
					}
					break;
				case 4 :
					// Parser.g:1115:7: j= jmxResource
					{
					pushFollow(FOLLOW_jmxResource_in_resource7803);
					j=jmxResource();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = j; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "resource"



	// $ANTLR start "dataResource"
	// Parser.g:1118:1: dataResource returns [DataResource res] : ( K_ALL K_KEYSPACES | K_KEYSPACE ks= keyspaceName | ( K_COLUMNFAMILY )? cf= columnFamilyName );
	public final DataResource dataResource() throws RecognitionException {
		DataResource res = null;


		String ks =null;
		QualifiedName cf =null;

		try {
			// Parser.g:1119:5: ( K_ALL K_KEYSPACES | K_KEYSPACE ks= keyspaceName | ( K_COLUMNFAMILY )? cf= columnFamilyName )
			int alt148=3;
			switch ( input.LA(1) ) {
			case K_ALL:
				{
				int LA148_1 = input.LA(2);
				if ( (LA148_1==K_KEYSPACES) ) {
					alt148=1;
				}
				else if ( (LA148_1==EOF||LA148_1==K_FROM||LA148_1==K_NORECURSIVE||LA148_1==K_OF||LA148_1==K_TO||LA148_1==207||LA148_1==210) ) {
					alt148=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return res;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 148, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_KEYSPACE:
				{
				alt148=2;
				}
				break;
			case IDENT:
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTER:
			case K_CLUSTERING:
			case K_COLUMNFAMILY:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DATE:
			case K_DECIMAL:
			case K_DEFAULT:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_INTERNALS:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
			case QMARK:
			case QUOTED_NAME:
				{
				alt148=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return res;}
				NoViableAltException nvae =
					new NoViableAltException("", 148, 0, input);
				throw nvae;
			}
			switch (alt148) {
				case 1 :
					// Parser.g:1119:7: K_ALL K_KEYSPACES
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_dataResource7826); if (state.failed) return res;
					match(input,K_KEYSPACES,FOLLOW_K_KEYSPACES_in_dataResource7828); if (state.failed) return res;
					if ( state.backtracking==0 ) { res = DataResource.root(); }
					}
					break;
				case 2 :
					// Parser.g:1120:7: K_KEYSPACE ks= keyspaceName
					{
					match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dataResource7838); if (state.failed) return res;
					pushFollow(FOLLOW_keyspaceName_in_dataResource7844);
					ks=keyspaceName();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = DataResource.keyspace(ks); }
					}
					break;
				case 3 :
					// Parser.g:1121:7: ( K_COLUMNFAMILY )? cf= columnFamilyName
					{
					// Parser.g:1121:7: ( K_COLUMNFAMILY )?
					int alt147=2;
					int LA147_0 = input.LA(1);
					if ( (LA147_0==K_COLUMNFAMILY) ) {
						alt147=1;
					}
					switch (alt147) {
						case 1 :
							// Parser.g:1121:9: K_COLUMNFAMILY
							{
							match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dataResource7856); if (state.failed) return res;
							}
							break;

					}

					pushFollow(FOLLOW_columnFamilyName_in_dataResource7865);
					cf=columnFamilyName();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = DataResource.table(cf.getKeyspace(), cf.getName()); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "dataResource"



	// $ANTLR start "jmxResource"
	// Parser.g:1125:1: jmxResource returns [JMXResource res] : ( K_ALL K_MBEANS | K_MBEAN mbean | K_MBEANS mbean );
	public final JMXResource jmxResource() throws RecognitionException {
		JMXResource res = null;


		ParserRuleReturnScope mbean7 =null;
		ParserRuleReturnScope mbean8 =null;

		try {
			// Parser.g:1126:5: ( K_ALL K_MBEANS | K_MBEAN mbean | K_MBEANS mbean )
			int alt149=3;
			switch ( input.LA(1) ) {
			case K_ALL:
				{
				alt149=1;
				}
				break;
			case K_MBEAN:
				{
				alt149=2;
				}
				break;
			case K_MBEANS:
				{
				alt149=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return res;}
				NoViableAltException nvae =
					new NoViableAltException("", 149, 0, input);
				throw nvae;
			}
			switch (alt149) {
				case 1 :
					// Parser.g:1126:7: K_ALL K_MBEANS
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_jmxResource7894); if (state.failed) return res;
					match(input,K_MBEANS,FOLLOW_K_MBEANS_in_jmxResource7896); if (state.failed) return res;
					if ( state.backtracking==0 ) { res = JMXResource.root(); }
					}
					break;
				case 2 :
					// Parser.g:1129:7: K_MBEAN mbean
					{
					match(input,K_MBEAN,FOLLOW_K_MBEAN_in_jmxResource7916); if (state.failed) return res;
					pushFollow(FOLLOW_mbean_in_jmxResource7918);
					mbean7=mbean();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = JMXResource.mbean(canonicalizeObjectName((mbean7!=null?input.toString(mbean7.start,mbean7.stop):null), false)); }
					}
					break;
				case 3 :
					// Parser.g:1130:7: K_MBEANS mbean
					{
					match(input,K_MBEANS,FOLLOW_K_MBEANS_in_jmxResource7928); if (state.failed) return res;
					pushFollow(FOLLOW_mbean_in_jmxResource7930);
					mbean8=mbean();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = JMXResource.mbean(canonicalizeObjectName((mbean8!=null?input.toString(mbean8.start,mbean8.stop):null), true)); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "jmxResource"



	// $ANTLR start "roleResource"
	// Parser.g:1133:1: roleResource returns [RoleResource res] : ( K_ALL K_ROLES | K_ROLE role= userOrRoleName );
	public final RoleResource roleResource() throws RecognitionException {
		RoleResource res = null;


		RoleName role =null;

		try {
			// Parser.g:1134:5: ( K_ALL K_ROLES | K_ROLE role= userOrRoleName )
			int alt150=2;
			int LA150_0 = input.LA(1);
			if ( (LA150_0==K_ALL) ) {
				alt150=1;
			}
			else if ( (LA150_0==K_ROLE) ) {
				alt150=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return res;}
				NoViableAltException nvae =
					new NoViableAltException("", 150, 0, input);
				throw nvae;
			}

			switch (alt150) {
				case 1 :
					// Parser.g:1134:7: K_ALL K_ROLES
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_roleResource7953); if (state.failed) return res;
					match(input,K_ROLES,FOLLOW_K_ROLES_in_roleResource7955); if (state.failed) return res;
					if ( state.backtracking==0 ) { res = RoleResource.root(); }
					}
					break;
				case 2 :
					// Parser.g:1135:7: K_ROLE role= userOrRoleName
					{
					match(input,K_ROLE,FOLLOW_K_ROLE_in_roleResource7965); if (state.failed) return res;
					pushFollow(FOLLOW_userOrRoleName_in_roleResource7971);
					role=userOrRoleName();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = RoleResource.role(role.getName()); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "roleResource"



	// $ANTLR start "functionResource"
	// Parser.g:1138:1: functionResource returns [FunctionResource res] : ( K_ALL K_FUNCTIONS | K_ALL K_FUNCTIONS K_IN K_KEYSPACE ks= keyspaceName | K_FUNCTION fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' ) );
	public final FunctionResource functionResource() throws RecognitionException {
		FunctionResource res = null;


		String ks =null;
		FunctionName fn =null;
		CQL3Type.Raw v =null;


		        List<CQL3Type.Raw> argsTypes = new ArrayList<>();
		    
		try {
			// Parser.g:1142:5: ( K_ALL K_FUNCTIONS | K_ALL K_FUNCTIONS K_IN K_KEYSPACE ks= keyspaceName | K_FUNCTION fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' ) )
			int alt153=3;
			int LA153_0 = input.LA(1);
			if ( (LA153_0==K_ALL) ) {
				int LA153_1 = input.LA(2);
				if ( (LA153_1==K_FUNCTIONS) ) {
					int LA153_3 = input.LA(3);
					if ( (LA153_3==K_IN) ) {
						alt153=2;
					}
					else if ( (LA153_3==EOF||LA153_3==K_FROM||LA153_3==K_NORECURSIVE||LA153_3==K_OF||LA153_3==K_TO||LA153_3==210) ) {
						alt153=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return res;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 153, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return res;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 153, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA153_0==K_FUNCTION) ) {
				alt153=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return res;}
				NoViableAltException nvae =
					new NoViableAltException("", 153, 0, input);
				throw nvae;
			}

			switch (alt153) {
				case 1 :
					// Parser.g:1142:7: K_ALL K_FUNCTIONS
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_functionResource8003); if (state.failed) return res;
					match(input,K_FUNCTIONS,FOLLOW_K_FUNCTIONS_in_functionResource8005); if (state.failed) return res;
					if ( state.backtracking==0 ) { res = FunctionResource.root(); }
					}
					break;
				case 2 :
					// Parser.g:1143:7: K_ALL K_FUNCTIONS K_IN K_KEYSPACE ks= keyspaceName
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_functionResource8015); if (state.failed) return res;
					match(input,K_FUNCTIONS,FOLLOW_K_FUNCTIONS_in_functionResource8017); if (state.failed) return res;
					match(input,K_IN,FOLLOW_K_IN_in_functionResource8019); if (state.failed) return res;
					match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_functionResource8021); if (state.failed) return res;
					pushFollow(FOLLOW_keyspaceName_in_functionResource8027);
					ks=keyspaceName();
					state._fsp--;
					if (state.failed) return res;
					if ( state.backtracking==0 ) { res = FunctionResource.keyspace(ks); }
					}
					break;
				case 3 :
					// Parser.g:1145:7: K_FUNCTION fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )
					{
					match(input,K_FUNCTION,FOLLOW_K_FUNCTION_in_functionResource8042); if (state.failed) return res;
					pushFollow(FOLLOW_functionName_in_functionResource8046);
					fn=functionName();
					state._fsp--;
					if (state.failed) return res;
					// Parser.g:1146:7: ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )
					// Parser.g:1147:9: '(' (v= comparatorType ( ',' v= comparatorType )* )? ')'
					{
					match(input,200,FOLLOW_200_in_functionResource8064); if (state.failed) return res;
					// Parser.g:1148:11: (v= comparatorType ( ',' v= comparatorType )* )?
					int alt152=2;
					int LA152_0 = input.LA(1);
					if ( (LA152_0==IDENT||LA152_0==K_ACCESS||(LA152_0 >= K_AGGREGATE && LA152_0 <= K_ALL)||LA152_0==K_AS||LA152_0==K_ASCII||(LA152_0 >= K_BIGINT && LA152_0 <= K_BOOLEAN)||(LA152_0 >= K_CALLED && LA152_0 <= K_CLUSTERING)||(LA152_0 >= K_COMPACT && LA152_0 <= K_COUNTER)||(LA152_0 >= K_CUSTOM && LA152_0 <= K_DEFAULT)||(LA152_0 >= K_DISTINCT && LA152_0 <= K_DOUBLE)||LA152_0==K_DURATION||(LA152_0 >= K_EXISTS && LA152_0 <= K_FLOAT)||LA152_0==K_FROZEN||(LA152_0 >= K_FUNCTION && LA152_0 <= K_FUNCTIONS)||LA152_0==K_GROUP||(LA152_0 >= K_INET && LA152_0 <= K_INPUT)||(LA152_0 >= K_INT && LA152_0 <= K_INTERNALS)||(LA152_0 >= K_JSON && LA152_0 <= K_KEYS)||(LA152_0 >= K_KEYSPACES && LA152_0 <= K_LIKE)||(LA152_0 >= K_LIST && LA152_0 <= K_MAP)||(LA152_0 >= K_MBEAN && LA152_0 <= K_MBEANS)||LA152_0==K_NOLOGIN||LA152_0==K_NOSUPERUSER||(LA152_0 >= K_ONLY && LA152_0 <= K_OPTIONS)||(LA152_0 >= K_PARTITION && LA152_0 <= K_PERMISSIONS)||(LA152_0 >= K_REPLACE && LA152_0 <= K_RETURNS)||(LA152_0 >= K_ROLE && LA152_0 <= K_ROLES)||(LA152_0 >= K_SET && LA152_0 <= K_TINYINT)||LA152_0==K_TRIGGER||(LA152_0 >= K_TTL && LA152_0 <= K_TYPES)||LA152_0==K_UNSET||(LA152_0 >= K_USER && LA152_0 <= K_USERS)||(LA152_0 >= K_UUID && LA152_0 <= K_VARINT)||LA152_0==K_WRITETIME||LA152_0==QUOTED_NAME||LA152_0==STRING_LITERAL) ) {
						alt152=1;
					}
					switch (alt152) {
						case 1 :
							// Parser.g:1149:13: v= comparatorType ( ',' v= comparatorType )*
							{
							pushFollow(FOLLOW_comparatorType_in_functionResource8092);
							v=comparatorType();
							state._fsp--;
							if (state.failed) return res;
							if ( state.backtracking==0 ) { argsTypes.add(v); }
							// Parser.g:1150:13: ( ',' v= comparatorType )*
							loop151:
							while (true) {
								int alt151=2;
								int LA151_0 = input.LA(1);
								if ( (LA151_0==204) ) {
									alt151=1;
								}

								switch (alt151) {
								case 1 :
									// Parser.g:1150:15: ',' v= comparatorType
									{
									match(input,204,FOLLOW_204_in_functionResource8110); if (state.failed) return res;
									pushFollow(FOLLOW_comparatorType_in_functionResource8114);
									v=comparatorType();
									state._fsp--;
									if (state.failed) return res;
									if ( state.backtracking==0 ) { argsTypes.add(v); }
									}
									break;

								default :
									break loop151;
								}
							}

							}
							break;

					}

					match(input,201,FOLLOW_201_in_functionResource8142); if (state.failed) return res;
					}

					if ( state.backtracking==0 ) { res = FunctionResource.functionFromCql(fn.keyspace, fn.name, argsTypes); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "functionResource"



	// $ANTLR start "createUserStatement"
	// Parser.g:1160:1: createUserStatement returns [CreateRoleStatement stmt] : K_CREATE K_USER ( K_IF K_NOT K_EXISTS )? u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? ;
	public final CreateRoleStatement createUserStatement() throws RecognitionException {
		CreateRoleStatement stmt = null;


		ParserRuleReturnScope u =null;


		        RoleOptions opts = new RoleOptions();
		        opts.setOption(IRoleManager.Option.LOGIN, true);
		        boolean superuser = false;
		        boolean ifNotExists = false;
		        RoleName name = new RoleName();
		    
		try {
			// Parser.g:1168:5: ( K_CREATE K_USER ( K_IF K_NOT K_EXISTS )? u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? )
			// Parser.g:1168:7: K_CREATE K_USER ( K_IF K_NOT K_EXISTS )? u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createUserStatement8190); if (state.failed) return stmt;
			match(input,K_USER,FOLLOW_K_USER_in_createUserStatement8192); if (state.failed) return stmt;
			// Parser.g:1168:23: ( K_IF K_NOT K_EXISTS )?
			int alt154=2;
			int LA154_0 = input.LA(1);
			if ( (LA154_0==K_IF) ) {
				alt154=1;
			}
			switch (alt154) {
				case 1 :
					// Parser.g:1168:24: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createUserStatement8195); if (state.failed) return stmt;
					match(input,K_NOT,FOLLOW_K_NOT_in_createUserStatement8197); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createUserStatement8199); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_username_in_createUserStatement8207);
			u=username();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { name.setName((u!=null?input.toString(u.start,u.stop):null), true); }
			// Parser.g:1169:7: ( K_WITH userPassword[opts] )?
			int alt155=2;
			int LA155_0 = input.LA(1);
			if ( (LA155_0==K_WITH) ) {
				alt155=1;
			}
			switch (alt155) {
				case 1 :
					// Parser.g:1169:9: K_WITH userPassword[opts]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_createUserStatement8219); if (state.failed) return stmt;
					pushFollow(FOLLOW_userPassword_in_createUserStatement8221);
					userPassword(opts);
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			// Parser.g:1170:7: ( K_SUPERUSER | K_NOSUPERUSER )?
			int alt156=3;
			int LA156_0 = input.LA(1);
			if ( (LA156_0==K_SUPERUSER) ) {
				alt156=1;
			}
			else if ( (LA156_0==K_NOSUPERUSER) ) {
				alt156=2;
			}
			switch (alt156) {
				case 1 :
					// Parser.g:1170:9: K_SUPERUSER
					{
					match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_createUserStatement8235); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { superuser = true; }
					}
					break;
				case 2 :
					// Parser.g:1170:45: K_NOSUPERUSER
					{
					match(input,K_NOSUPERUSER,FOLLOW_K_NOSUPERUSER_in_createUserStatement8241); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { superuser = false; }
					}
					break;

			}

			if ( state.backtracking==0 ) { opts.setOption(IRoleManager.Option.SUPERUSER, superuser);
			        stmt = new CreateRoleStatement(name, opts, DCPermissions.all(), ifNotExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createUserStatement"



	// $ANTLR start "alterUserStatement"
	// Parser.g:1178:1: alterUserStatement returns [AlterRoleStatement stmt] : K_ALTER K_USER u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? ;
	public final AlterRoleStatement alterUserStatement() throws RecognitionException {
		AlterRoleStatement stmt = null;


		ParserRuleReturnScope u =null;


		        RoleOptions opts = new RoleOptions();
		        RoleName name = new RoleName();
		    
		try {
			// Parser.g:1183:5: ( K_ALTER K_USER u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? )
			// Parser.g:1183:7: K_ALTER K_USER u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )?
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterUserStatement8286); if (state.failed) return stmt;
			match(input,K_USER,FOLLOW_K_USER_in_alterUserStatement8288); if (state.failed) return stmt;
			pushFollow(FOLLOW_username_in_alterUserStatement8292);
			u=username();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { name.setName((u!=null?input.toString(u.start,u.stop):null), true); }
			// Parser.g:1184:7: ( K_WITH userPassword[opts] )?
			int alt157=2;
			int LA157_0 = input.LA(1);
			if ( (LA157_0==K_WITH) ) {
				alt157=1;
			}
			switch (alt157) {
				case 1 :
					// Parser.g:1184:9: K_WITH userPassword[opts]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_alterUserStatement8304); if (state.failed) return stmt;
					pushFollow(FOLLOW_userPassword_in_alterUserStatement8306);
					userPassword(opts);
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			// Parser.g:1185:7: ( K_SUPERUSER | K_NOSUPERUSER )?
			int alt158=3;
			int LA158_0 = input.LA(1);
			if ( (LA158_0==K_SUPERUSER) ) {
				alt158=1;
			}
			else if ( (LA158_0==K_NOSUPERUSER) ) {
				alt158=2;
			}
			switch (alt158) {
				case 1 :
					// Parser.g:1185:9: K_SUPERUSER
					{
					match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_alterUserStatement8320); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { opts.setOption(IRoleManager.Option.SUPERUSER, true); }
					}
					break;
				case 2 :
					// Parser.g:1186:11: K_NOSUPERUSER
					{
					match(input,K_NOSUPERUSER,FOLLOW_K_NOSUPERUSER_in_alterUserStatement8334); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { opts.setOption(IRoleManager.Option.SUPERUSER, false); }
					}
					break;

			}

			if ( state.backtracking==0 ) {  stmt = new AlterRoleStatement(name, opts, null); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "alterUserStatement"



	// $ANTLR start "dropUserStatement"
	// Parser.g:1193:1: dropUserStatement returns [DropRoleStatement stmt] : K_DROP K_USER ( K_IF K_EXISTS )? u= username ;
	public final DropRoleStatement dropUserStatement() throws RecognitionException {
		DropRoleStatement stmt = null;


		ParserRuleReturnScope u =null;


		        boolean ifExists = false;
		        RoleName name = new RoleName();
		    
		try {
			// Parser.g:1198:5: ( K_DROP K_USER ( K_IF K_EXISTS )? u= username )
			// Parser.g:1198:7: K_DROP K_USER ( K_IF K_EXISTS )? u= username
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropUserStatement8380); if (state.failed) return stmt;
			match(input,K_USER,FOLLOW_K_USER_in_dropUserStatement8382); if (state.failed) return stmt;
			// Parser.g:1198:21: ( K_IF K_EXISTS )?
			int alt159=2;
			int LA159_0 = input.LA(1);
			if ( (LA159_0==K_IF) ) {
				alt159=1;
			}
			switch (alt159) {
				case 1 :
					// Parser.g:1198:22: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropUserStatement8385); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropUserStatement8387); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_username_in_dropUserStatement8395);
			u=username();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { name.setName((u!=null?input.toString(u.start,u.stop):null), true); stmt = new DropRoleStatement(name, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropUserStatement"



	// $ANTLR start "listUsersStatement"
	// Parser.g:1204:1: listUsersStatement returns [ListRolesStatement stmt] : K_LIST K_USERS ;
	public final ListRolesStatement listUsersStatement() throws RecognitionException {
		ListRolesStatement stmt = null;


		try {
			// Parser.g:1205:5: ( K_LIST K_USERS )
			// Parser.g:1205:7: K_LIST K_USERS
			{
			match(input,K_LIST,FOLLOW_K_LIST_in_listUsersStatement8420); if (state.failed) return stmt;
			match(input,K_USERS,FOLLOW_K_USERS_in_listUsersStatement8422); if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new ListUsersStatement(); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "listUsersStatement"



	// $ANTLR start "createRoleStatement"
	// Parser.g:1217:1: createRoleStatement returns [CreateRoleStatement stmt] : K_CREATE K_ROLE ( K_IF K_NOT K_EXISTS )? name= userOrRoleName ( K_WITH roleOptions[opts, dcperms] )? ;
	public final CreateRoleStatement createRoleStatement() throws RecognitionException {
		CreateRoleStatement stmt = null;


		RoleName name =null;


		        RoleOptions opts = new RoleOptions();
		        DCPermissions.Builder dcperms = DCPermissions.builder();
		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:1223:5: ( K_CREATE K_ROLE ( K_IF K_NOT K_EXISTS )? name= userOrRoleName ( K_WITH roleOptions[opts, dcperms] )? )
			// Parser.g:1223:7: K_CREATE K_ROLE ( K_IF K_NOT K_EXISTS )? name= userOrRoleName ( K_WITH roleOptions[opts, dcperms] )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createRoleStatement8456); if (state.failed) return stmt;
			match(input,K_ROLE,FOLLOW_K_ROLE_in_createRoleStatement8458); if (state.failed) return stmt;
			// Parser.g:1223:23: ( K_IF K_NOT K_EXISTS )?
			int alt160=2;
			int LA160_0 = input.LA(1);
			if ( (LA160_0==K_IF) ) {
				alt160=1;
			}
			switch (alt160) {
				case 1 :
					// Parser.g:1223:24: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createRoleStatement8461); if (state.failed) return stmt;
					match(input,K_NOT,FOLLOW_K_NOT_in_createRoleStatement8463); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createRoleStatement8465); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifNotExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_userOrRoleName_in_createRoleStatement8473);
			name=userOrRoleName();
			state._fsp--;
			if (state.failed) return stmt;
			// Parser.g:1224:7: ( K_WITH roleOptions[opts, dcperms] )?
			int alt161=2;
			int LA161_0 = input.LA(1);
			if ( (LA161_0==K_WITH) ) {
				alt161=1;
			}
			switch (alt161) {
				case 1 :
					// Parser.g:1224:9: K_WITH roleOptions[opts, dcperms]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_createRoleStatement8483); if (state.failed) return stmt;
					pushFollow(FOLLOW_roleOptions_in_createRoleStatement8485);
					roleOptions(opts, dcperms);
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			        // set defaults if they weren't explictly supplied
			        if (!opts.getLogin().isPresent())
			        {
			            opts.setOption(IRoleManager.Option.LOGIN, false);
			        }
			        if (!opts.getSuperuser().isPresent())
			        {
			            opts.setOption(IRoleManager.Option.SUPERUSER, false);
			        }
			        stmt = new CreateRoleStatement(name, opts, dcperms.build(), ifNotExists);
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createRoleStatement"



	// $ANTLR start "alterRoleStatement"
	// Parser.g:1248:1: alterRoleStatement returns [AlterRoleStatement stmt] : K_ALTER K_ROLE name= userOrRoleName ( K_WITH roleOptions[opts, dcperms] )? ;
	public final AlterRoleStatement alterRoleStatement() throws RecognitionException {
		AlterRoleStatement stmt = null;


		RoleName name =null;


		        RoleOptions opts = new RoleOptions();
		        DCPermissions.Builder dcperms = DCPermissions.builder();
		    
		try {
			// Parser.g:1253:5: ( K_ALTER K_ROLE name= userOrRoleName ( K_WITH roleOptions[opts, dcperms] )? )
			// Parser.g:1253:7: K_ALTER K_ROLE name= userOrRoleName ( K_WITH roleOptions[opts, dcperms] )?
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterRoleStatement8529); if (state.failed) return stmt;
			match(input,K_ROLE,FOLLOW_K_ROLE_in_alterRoleStatement8531); if (state.failed) return stmt;
			pushFollow(FOLLOW_userOrRoleName_in_alterRoleStatement8535);
			name=userOrRoleName();
			state._fsp--;
			if (state.failed) return stmt;
			// Parser.g:1254:7: ( K_WITH roleOptions[opts, dcperms] )?
			int alt162=2;
			int LA162_0 = input.LA(1);
			if ( (LA162_0==K_WITH) ) {
				alt162=1;
			}
			switch (alt162) {
				case 1 :
					// Parser.g:1254:9: K_WITH roleOptions[opts, dcperms]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_alterRoleStatement8545); if (state.failed) return stmt;
					pushFollow(FOLLOW_roleOptions_in_alterRoleStatement8547);
					roleOptions(opts, dcperms);
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			if ( state.backtracking==0 ) {  stmt = new AlterRoleStatement(name, opts, dcperms.isModified() ? dcperms.build() : null); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "alterRoleStatement"



	// $ANTLR start "dropRoleStatement"
	// Parser.g:1261:1: dropRoleStatement returns [DropRoleStatement stmt] : K_DROP K_ROLE ( K_IF K_EXISTS )? name= userOrRoleName ;
	public final DropRoleStatement dropRoleStatement() throws RecognitionException {
		DropRoleStatement stmt = null;


		RoleName name =null;


		        boolean ifExists = false;
		    
		try {
			// Parser.g:1265:5: ( K_DROP K_ROLE ( K_IF K_EXISTS )? name= userOrRoleName )
			// Parser.g:1265:7: K_DROP K_ROLE ( K_IF K_EXISTS )? name= userOrRoleName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropRoleStatement8591); if (state.failed) return stmt;
			match(input,K_ROLE,FOLLOW_K_ROLE_in_dropRoleStatement8593); if (state.failed) return stmt;
			// Parser.g:1265:21: ( K_IF K_EXISTS )?
			int alt163=2;
			int LA163_0 = input.LA(1);
			if ( (LA163_0==K_IF) ) {
				alt163=1;
			}
			switch (alt163) {
				case 1 :
					// Parser.g:1265:22: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropRoleStatement8596); if (state.failed) return stmt;
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropRoleStatement8598); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { ifExists = true; }
					}
					break;

			}

			pushFollow(FOLLOW_userOrRoleName_in_dropRoleStatement8606);
			name=userOrRoleName();
			state._fsp--;
			if (state.failed) return stmt;
			if ( state.backtracking==0 ) { stmt = new DropRoleStatement(name, ifExists); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropRoleStatement"



	// $ANTLR start "listRolesStatement"
	// Parser.g:1272:1: listRolesStatement returns [ListRolesStatement stmt] : K_LIST K_ROLES ( K_OF roleName[grantee] )? ( K_NORECURSIVE )? ;
	public final ListRolesStatement listRolesStatement() throws RecognitionException {
		ListRolesStatement stmt = null;



		        boolean recursive = true;
		        RoleName grantee = new RoleName();
		    
		try {
			// Parser.g:1277:5: ( K_LIST K_ROLES ( K_OF roleName[grantee] )? ( K_NORECURSIVE )? )
			// Parser.g:1277:7: K_LIST K_ROLES ( K_OF roleName[grantee] )? ( K_NORECURSIVE )?
			{
			match(input,K_LIST,FOLLOW_K_LIST_in_listRolesStatement8646); if (state.failed) return stmt;
			match(input,K_ROLES,FOLLOW_K_ROLES_in_listRolesStatement8648); if (state.failed) return stmt;
			// Parser.g:1278:7: ( K_OF roleName[grantee] )?
			int alt164=2;
			int LA164_0 = input.LA(1);
			if ( (LA164_0==K_OF) ) {
				alt164=1;
			}
			switch (alt164) {
				case 1 :
					// Parser.g:1278:9: K_OF roleName[grantee]
					{
					match(input,K_OF,FOLLOW_K_OF_in_listRolesStatement8658); if (state.failed) return stmt;
					pushFollow(FOLLOW_roleName_in_listRolesStatement8660);
					roleName(grantee);
					state._fsp--;
					if (state.failed) return stmt;
					}
					break;

			}

			// Parser.g:1279:7: ( K_NORECURSIVE )?
			int alt165=2;
			int LA165_0 = input.LA(1);
			if ( (LA165_0==K_NORECURSIVE) ) {
				alt165=1;
			}
			switch (alt165) {
				case 1 :
					// Parser.g:1279:9: K_NORECURSIVE
					{
					match(input,K_NORECURSIVE,FOLLOW_K_NORECURSIVE_in_listRolesStatement8673); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { recursive = false; }
					}
					break;

			}

			if ( state.backtracking==0 ) { stmt = new ListRolesStatement(grantee, recursive); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "listRolesStatement"



	// $ANTLR start "roleOptions"
	// Parser.g:1283:1: roleOptions[RoleOptions opts, DCPermissions.Builder dcperms] : roleOption[opts, dcperms] ( K_AND roleOption[opts, dcperms] )* ;
	public final void roleOptions(RoleOptions opts, DCPermissions.Builder dcperms) throws RecognitionException {
		try {
			// Parser.g:1284:5: ( roleOption[opts, dcperms] ( K_AND roleOption[opts, dcperms] )* )
			// Parser.g:1284:7: roleOption[opts, dcperms] ( K_AND roleOption[opts, dcperms] )*
			{
			pushFollow(FOLLOW_roleOption_in_roleOptions8704);
			roleOption(opts, dcperms);
			state._fsp--;
			if (state.failed) return;
			// Parser.g:1284:33: ( K_AND roleOption[opts, dcperms] )*
			loop166:
			while (true) {
				int alt166=2;
				int LA166_0 = input.LA(1);
				if ( (LA166_0==K_AND) ) {
					alt166=1;
				}

				switch (alt166) {
				case 1 :
					// Parser.g:1284:34: K_AND roleOption[opts, dcperms]
					{
					match(input,K_AND,FOLLOW_K_AND_in_roleOptions8708); if (state.failed) return;
					pushFollow(FOLLOW_roleOption_in_roleOptions8710);
					roleOption(opts, dcperms);
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop166;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "roleOptions"



	// $ANTLR start "roleOption"
	// Parser.g:1287:1: roleOption[RoleOptions opts, DCPermissions.Builder dcperms] : ( K_PASSWORD '=' v= STRING_LITERAL | K_OPTIONS '=' m= fullMapLiteral | K_SUPERUSER '=' b= BOOLEAN | K_LOGIN '=' b= BOOLEAN | K_ACCESS K_TO K_ALL K_DATACENTERS | K_ACCESS K_TO K_DATACENTERS '{' dcPermission[dcperms] ( ',' dcPermission[dcperms] )* '}' );
	public final void roleOption(RoleOptions opts, DCPermissions.Builder dcperms) throws RecognitionException {
		Token v=null;
		Token b=null;
		Maps.Literal m =null;

		try {
			// Parser.g:1288:5: ( K_PASSWORD '=' v= STRING_LITERAL | K_OPTIONS '=' m= fullMapLiteral | K_SUPERUSER '=' b= BOOLEAN | K_LOGIN '=' b= BOOLEAN | K_ACCESS K_TO K_ALL K_DATACENTERS | K_ACCESS K_TO K_DATACENTERS '{' dcPermission[dcperms] ( ',' dcPermission[dcperms] )* '}' )
			int alt168=6;
			switch ( input.LA(1) ) {
			case K_PASSWORD:
				{
				alt168=1;
				}
				break;
			case K_OPTIONS:
				{
				alt168=2;
				}
				break;
			case K_SUPERUSER:
				{
				alt168=3;
				}
				break;
			case K_LOGIN:
				{
				alt168=4;
				}
				break;
			case K_ACCESS:
				{
				int LA168_5 = input.LA(2);
				if ( (LA168_5==K_TO) ) {
					int LA168_6 = input.LA(3);
					if ( (LA168_6==K_ALL) ) {
						alt168=5;
					}
					else if ( (LA168_6==K_DATACENTERS) ) {
						alt168=6;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 168, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 168, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 168, 0, input);
				throw nvae;
			}
			switch (alt168) {
				case 1 :
					// Parser.g:1288:8: K_PASSWORD '=' v= STRING_LITERAL
					{
					match(input,K_PASSWORD,FOLLOW_K_PASSWORD_in_roleOption8732); if (state.failed) return;
					match(input,213,FOLLOW_213_in_roleOption8734); if (state.failed) return;
					v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_roleOption8738); if (state.failed) return;
					if ( state.backtracking==0 ) { opts.setOption(IRoleManager.Option.PASSWORD, (v!=null?v.getText():null)); }
					}
					break;
				case 2 :
					// Parser.g:1289:8: K_OPTIONS '=' m= fullMapLiteral
					{
					match(input,K_OPTIONS,FOLLOW_K_OPTIONS_in_roleOption8749); if (state.failed) return;
					match(input,213,FOLLOW_213_in_roleOption8751); if (state.failed) return;
					pushFollow(FOLLOW_fullMapLiteral_in_roleOption8755);
					m=fullMapLiteral();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { opts.setOption(IRoleManager.Option.OPTIONS, convertPropertyMap(m)); }
					}
					break;
				case 3 :
					// Parser.g:1290:8: K_SUPERUSER '=' b= BOOLEAN
					{
					match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_roleOption8766); if (state.failed) return;
					match(input,213,FOLLOW_213_in_roleOption8768); if (state.failed) return;
					b=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_roleOption8772); if (state.failed) return;
					if ( state.backtracking==0 ) { opts.setOption(IRoleManager.Option.SUPERUSER, Boolean.valueOf((b!=null?b.getText():null))); }
					}
					break;
				case 4 :
					// Parser.g:1291:8: K_LOGIN '=' b= BOOLEAN
					{
					match(input,K_LOGIN,FOLLOW_K_LOGIN_in_roleOption8783); if (state.failed) return;
					match(input,213,FOLLOW_213_in_roleOption8785); if (state.failed) return;
					b=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_roleOption8789); if (state.failed) return;
					if ( state.backtracking==0 ) { opts.setOption(IRoleManager.Option.LOGIN, Boolean.valueOf((b!=null?b.getText():null))); }
					}
					break;
				case 5 :
					// Parser.g:1292:8: K_ACCESS K_TO K_ALL K_DATACENTERS
					{
					match(input,K_ACCESS,FOLLOW_K_ACCESS_in_roleOption8800); if (state.failed) return;
					match(input,K_TO,FOLLOW_K_TO_in_roleOption8802); if (state.failed) return;
					match(input,K_ALL,FOLLOW_K_ALL_in_roleOption8804); if (state.failed) return;
					match(input,K_DATACENTERS,FOLLOW_K_DATACENTERS_in_roleOption8806); if (state.failed) return;
					if ( state.backtracking==0 ) { dcperms.all(); }
					}
					break;
				case 6 :
					// Parser.g:1293:8: K_ACCESS K_TO K_DATACENTERS '{' dcPermission[dcperms] ( ',' dcPermission[dcperms] )* '}'
					{
					match(input,K_ACCESS,FOLLOW_K_ACCESS_in_roleOption8817); if (state.failed) return;
					match(input,K_TO,FOLLOW_K_TO_in_roleOption8819); if (state.failed) return;
					match(input,K_DATACENTERS,FOLLOW_K_DATACENTERS_in_roleOption8821); if (state.failed) return;
					match(input,220,FOLLOW_220_in_roleOption8823); if (state.failed) return;
					pushFollow(FOLLOW_dcPermission_in_roleOption8825);
					dcPermission(dcperms);
					state._fsp--;
					if (state.failed) return;
					// Parser.g:1293:62: ( ',' dcPermission[dcperms] )*
					loop167:
					while (true) {
						int alt167=2;
						int LA167_0 = input.LA(1);
						if ( (LA167_0==204) ) {
							alt167=1;
						}

						switch (alt167) {
						case 1 :
							// Parser.g:1293:63: ',' dcPermission[dcperms]
							{
							match(input,204,FOLLOW_204_in_roleOption8829); if (state.failed) return;
							pushFollow(FOLLOW_dcPermission_in_roleOption8831);
							dcPermission(dcperms);
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop167;
						}
					}

					match(input,221,FOLLOW_221_in_roleOption8836); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "roleOption"



	// $ANTLR start "dcPermission"
	// Parser.g:1296:1: dcPermission[DCPermissions.Builder builder] : dc= STRING_LITERAL ;
	public final void dcPermission(DCPermissions.Builder builder) throws RecognitionException {
		Token dc=null;

		try {
			// Parser.g:1297:5: (dc= STRING_LITERAL )
			// Parser.g:1297:7: dc= STRING_LITERAL
			{
			dc=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_dcPermission8856); if (state.failed) return;
			if ( state.backtracking==0 ) { builder.add((dc!=null?dc.getText():null)); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "dcPermission"



	// $ANTLR start "userPassword"
	// Parser.g:1301:1: userPassword[RoleOptions opts] : K_PASSWORD v= STRING_LITERAL ;
	public final void userPassword(RoleOptions opts) throws RecognitionException {
		Token v=null;

		try {
			// Parser.g:1302:5: ( K_PASSWORD v= STRING_LITERAL )
			// Parser.g:1302:8: K_PASSWORD v= STRING_LITERAL
			{
			match(input,K_PASSWORD,FOLLOW_K_PASSWORD_in_userPassword8878); if (state.failed) return;
			v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_userPassword8882); if (state.failed) return;
			if ( state.backtracking==0 ) { opts.setOption(IRoleManager.Option.PASSWORD, (v!=null?v.getText():null)); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "userPassword"



	// $ANTLR start "describeStatement"
	// Parser.g:1311:1: describeStatement returns [DescribeStatement stmt] : ( K_DESCRIBE | K_DESC ) ( ( K_CLUSTER )=> K_CLUSTER | ( K_FULL )? K_SCHEMA | ( K_KEYSPACES )=> K_KEYSPACES | ( K_ONLY )? K_KEYSPACE (ks= keyspaceName )? | ( K_TABLES )=> K_TABLES | K_COLUMNFAMILY cf= columnFamilyName | K_INDEX idx= columnFamilyName | K_MATERIALIZED K_VIEW view= columnFamilyName | ( K_TYPES )=> K_TYPES | K_TYPE tn= userTypeName | ( K_FUNCTIONS )=> K_FUNCTIONS | K_FUNCTION fn= functionName | ( K_AGGREGATES )=> K_AGGREGATES | K_AGGREGATE ag= functionName | ( (ksT= IDENT |ksT= QUOTED_NAME |ksK= unreserved_keyword ) '.' )? (tT= IDENT |tT= QUOTED_NAME |tK= unreserved_keyword ) ) ( K_WITH K_INTERNALS )? ;
	public final DescribeStatement describeStatement() throws RecognitionException {
		DescribeStatement stmt = null;


		Token ksT=null;
		Token tT=null;
		String ks =null;
		QualifiedName cf =null;
		QualifiedName idx =null;
		QualifiedName view =null;
		UTName tn =null;
		FunctionName fn =null;
		FunctionName ag =null;
		String ksK =null;
		String tK =null;


		        boolean fullSchema = false;
		        boolean pending = false;
		        boolean config = false;
		        boolean only = false;
		        QualifiedName gen = new QualifiedName();
		    
		try {
			// Parser.g:1319:5: ( ( K_DESCRIBE | K_DESC ) ( ( K_CLUSTER )=> K_CLUSTER | ( K_FULL )? K_SCHEMA | ( K_KEYSPACES )=> K_KEYSPACES | ( K_ONLY )? K_KEYSPACE (ks= keyspaceName )? | ( K_TABLES )=> K_TABLES | K_COLUMNFAMILY cf= columnFamilyName | K_INDEX idx= columnFamilyName | K_MATERIALIZED K_VIEW view= columnFamilyName | ( K_TYPES )=> K_TYPES | K_TYPE tn= userTypeName | ( K_FUNCTIONS )=> K_FUNCTIONS | K_FUNCTION fn= functionName | ( K_AGGREGATES )=> K_AGGREGATES | K_AGGREGATE ag= functionName | ( (ksT= IDENT |ksT= QUOTED_NAME |ksK= unreserved_keyword ) '.' )? (tT= IDENT |tT= QUOTED_NAME |tK= unreserved_keyword ) ) ( K_WITH K_INTERNALS )? )
			// Parser.g:1319:7: ( K_DESCRIBE | K_DESC ) ( ( K_CLUSTER )=> K_CLUSTER | ( K_FULL )? K_SCHEMA | ( K_KEYSPACES )=> K_KEYSPACES | ( K_ONLY )? K_KEYSPACE (ks= keyspaceName )? | ( K_TABLES )=> K_TABLES | K_COLUMNFAMILY cf= columnFamilyName | K_INDEX idx= columnFamilyName | K_MATERIALIZED K_VIEW view= columnFamilyName | ( K_TYPES )=> K_TYPES | K_TYPE tn= userTypeName | ( K_FUNCTIONS )=> K_FUNCTIONS | K_FUNCTION fn= functionName | ( K_AGGREGATES )=> K_AGGREGATES | K_AGGREGATE ag= functionName | ( (ksT= IDENT |ksT= QUOTED_NAME |ksK= unreserved_keyword ) '.' )? (tT= IDENT |tT= QUOTED_NAME |tK= unreserved_keyword ) ) ( K_WITH K_INTERNALS )?
			{
			if ( (input.LA(1) >= K_DESC && input.LA(1) <= K_DESCRIBE) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return stmt;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// Parser.g:1320:5: ( ( K_CLUSTER )=> K_CLUSTER | ( K_FULL )? K_SCHEMA | ( K_KEYSPACES )=> K_KEYSPACES | ( K_ONLY )? K_KEYSPACE (ks= keyspaceName )? | ( K_TABLES )=> K_TABLES | K_COLUMNFAMILY cf= columnFamilyName | K_INDEX idx= columnFamilyName | K_MATERIALIZED K_VIEW view= columnFamilyName | ( K_TYPES )=> K_TYPES | K_TYPE tn= userTypeName | ( K_FUNCTIONS )=> K_FUNCTIONS | K_FUNCTION fn= functionName | ( K_AGGREGATES )=> K_AGGREGATES | K_AGGREGATE ag= functionName | ( (ksT= IDENT |ksT= QUOTED_NAME |ksK= unreserved_keyword ) '.' )? (tT= IDENT |tT= QUOTED_NAME |tK= unreserved_keyword ) )
			int alt175=15;
			alt175 = dfa175.predict(input);
			switch (alt175) {
				case 1 :
					// Parser.g:1320:7: ( K_CLUSTER )=> K_CLUSTER
					{
					match(input,K_CLUSTER,FOLLOW_K_CLUSTER_in_describeStatement8937); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = DescribeStatement.cluster(); }
					}
					break;
				case 2 :
					// Parser.g:1321:7: ( K_FULL )? K_SCHEMA
					{
					// Parser.g:1321:7: ( K_FULL )?
					int alt169=2;
					int LA169_0 = input.LA(1);
					if ( (LA169_0==K_FULL) ) {
						alt169=1;
					}
					switch (alt169) {
						case 1 :
							// Parser.g:1321:8: K_FULL
							{
							match(input,K_FULL,FOLLOW_K_FULL_in_describeStatement8968); if (state.failed) return stmt;
							if ( state.backtracking==0 ) { fullSchema=true; }
							}
							break;

					}

					match(input,K_SCHEMA,FOLLOW_K_SCHEMA_in_describeStatement8974); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = DescribeStatement.schema(fullSchema); }
					}
					break;
				case 3 :
					// Parser.g:1322:7: ( K_KEYSPACES )=> K_KEYSPACES
					{
					match(input,K_KEYSPACES,FOLLOW_K_KEYSPACES_in_describeStatement8993); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = DescribeStatement.keyspaces(); }
					}
					break;
				case 4 :
					// Parser.g:1323:7: ( K_ONLY )? K_KEYSPACE (ks= keyspaceName )?
					{
					// Parser.g:1323:7: ( K_ONLY )?
					int alt170=2;
					int LA170_0 = input.LA(1);
					if ( (LA170_0==K_ONLY) ) {
						alt170=1;
					}
					switch (alt170) {
						case 1 :
							// Parser.g:1323:8: K_ONLY
							{
							match(input,K_ONLY,FOLLOW_K_ONLY_in_describeStatement9020); if (state.failed) return stmt;
							if ( state.backtracking==0 ) { only=true; }
							}
							break;

					}

					match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_describeStatement9026); if (state.failed) return stmt;
					// Parser.g:1323:43: (ks= keyspaceName )?
					int alt171=2;
					int LA171_0 = input.LA(1);
					if ( (LA171_0==IDENT||LA171_0==K_ACCESS||(LA171_0 >= K_AGGREGATE && LA171_0 <= K_ALL)||LA171_0==K_AS||LA171_0==K_ASCII||(LA171_0 >= K_BIGINT && LA171_0 <= K_BOOLEAN)||(LA171_0 >= K_CALLED && LA171_0 <= K_CLUSTERING)||(LA171_0 >= K_COMPACT && LA171_0 <= K_COUNTER)||(LA171_0 >= K_CUSTOM && LA171_0 <= K_DEFAULT)||(LA171_0 >= K_DISTINCT && LA171_0 <= K_DOUBLE)||LA171_0==K_DURATION||(LA171_0 >= K_EXISTS && LA171_0 <= K_FLOAT)||LA171_0==K_FROZEN||(LA171_0 >= K_FUNCTION && LA171_0 <= K_FUNCTIONS)||LA171_0==K_GROUP||(LA171_0 >= K_INET && LA171_0 <= K_INPUT)||(LA171_0 >= K_INT && LA171_0 <= K_INTERNALS)||(LA171_0 >= K_JSON && LA171_0 <= K_KEYS)||(LA171_0 >= K_KEYSPACES && LA171_0 <= K_LIKE)||(LA171_0 >= K_LIST && LA171_0 <= K_MAP)||(LA171_0 >= K_MBEAN && LA171_0 <= K_MBEANS)||LA171_0==K_NOLOGIN||LA171_0==K_NOSUPERUSER||(LA171_0 >= K_ONLY && LA171_0 <= K_OPTIONS)||(LA171_0 >= K_PARTITION && LA171_0 <= K_PERMISSIONS)||(LA171_0 >= K_REPLACE && LA171_0 <= K_RETURNS)||(LA171_0 >= K_ROLE && LA171_0 <= K_ROLES)||(LA171_0 >= K_SFUNC && LA171_0 <= K_TINYINT)||LA171_0==K_TRIGGER||(LA171_0 >= K_TTL && LA171_0 <= K_TYPES)||LA171_0==K_UNSET||(LA171_0 >= K_USER && LA171_0 <= K_USERS)||(LA171_0 >= K_UUID && LA171_0 <= K_VARINT)||LA171_0==K_WRITETIME||(LA171_0 >= QMARK && LA171_0 <= QUOTED_NAME)) ) {
						alt171=1;
					}
					switch (alt171) {
						case 1 :
							// Parser.g:1323:45: ks= keyspaceName
							{
							pushFollow(FOLLOW_keyspaceName_in_describeStatement9032);
							ks=keyspaceName();
							state._fsp--;
							if (state.failed) return stmt;
							}
							break;

					}

					if ( state.backtracking==0 ) { stmt = DescribeStatement.keyspace(ks, only); }
					}
					break;
				case 5 :
					// Parser.g:1325:7: ( K_TABLES )=> K_TABLES
					{
					match(input,K_TABLES,FOLLOW_K_TABLES_in_describeStatement9101); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = DescribeStatement.tables(); }
					}
					break;
				case 6 :
					// Parser.g:1326:7: K_COLUMNFAMILY cf= columnFamilyName
					{
					match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_describeStatement9132); if (state.failed) return stmt;
					pushFollow(FOLLOW_columnFamilyName_in_describeStatement9136);
					cf=columnFamilyName();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = DescribeStatement.table(cf.getKeyspace(), cf.getName()); }
					}
					break;
				case 7 :
					// Parser.g:1327:7: K_INDEX idx= columnFamilyName
					{
					match(input,K_INDEX,FOLLOW_K_INDEX_in_describeStatement9155); if (state.failed) return stmt;
					pushFollow(FOLLOW_columnFamilyName_in_describeStatement9159);
					idx=columnFamilyName();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = DescribeStatement.index(idx.getKeyspace(), idx.getName()); }
					}
					break;
				case 8 :
					// Parser.g:1328:7: K_MATERIALIZED K_VIEW view= columnFamilyName
					{
					match(input,K_MATERIALIZED,FOLLOW_K_MATERIALIZED_in_describeStatement9184); if (state.failed) return stmt;
					match(input,K_VIEW,FOLLOW_K_VIEW_in_describeStatement9186); if (state.failed) return stmt;
					pushFollow(FOLLOW_columnFamilyName_in_describeStatement9190);
					view=columnFamilyName();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = DescribeStatement.view(view.getKeyspace(), view.getName()); }
					}
					break;
				case 9 :
					// Parser.g:1329:7: ( K_TYPES )=> K_TYPES
					{
					match(input,K_TYPES,FOLLOW_K_TYPES_in_describeStatement9206); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = DescribeStatement.types(); }
					}
					break;
				case 10 :
					// Parser.g:1330:7: K_TYPE tn= userTypeName
					{
					match(input,K_TYPE,FOLLOW_K_TYPE_in_describeStatement9239); if (state.failed) return stmt;
					pushFollow(FOLLOW_userTypeName_in_describeStatement9243);
					tn=userTypeName();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = DescribeStatement.type(tn.getKeyspace(), tn.getStringTypeName()); }
					}
					break;
				case 11 :
					// Parser.g:1331:7: ( K_FUNCTIONS )=> K_FUNCTIONS
					{
					match(input,K_FUNCTIONS,FOLLOW_K_FUNCTIONS_in_describeStatement9280); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = DescribeStatement.functions(); }
					}
					break;
				case 12 :
					// Parser.g:1332:7: K_FUNCTION fn= functionName
					{
					match(input,K_FUNCTION,FOLLOW_K_FUNCTION_in_describeStatement9305); if (state.failed) return stmt;
					pushFollow(FOLLOW_functionName_in_describeStatement9309);
					fn=functionName();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = DescribeStatement.function(fn.keyspace, fn.name); }
					}
					break;
				case 13 :
					// Parser.g:1333:7: ( K_AGGREGATES )=> K_AGGREGATES
					{
					match(input,K_AGGREGATES,FOLLOW_K_AGGREGATES_in_describeStatement9342); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = DescribeStatement.aggregates(); }
					}
					break;
				case 14 :
					// Parser.g:1334:7: K_AGGREGATE ag= functionName
					{
					match(input,K_AGGREGATE,FOLLOW_K_AGGREGATE_in_describeStatement9365); if (state.failed) return stmt;
					pushFollow(FOLLOW_functionName_in_describeStatement9369);
					ag=functionName();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt = DescribeStatement.aggregate(ag.keyspace, ag.name); }
					}
					break;
				case 15 :
					// Parser.g:1335:7: ( (ksT= IDENT |ksT= QUOTED_NAME |ksK= unreserved_keyword ) '.' )? (tT= IDENT |tT= QUOTED_NAME |tK= unreserved_keyword )
					{
					// Parser.g:1335:7: ( (ksT= IDENT |ksT= QUOTED_NAME |ksK= unreserved_keyword ) '.' )?
					int alt173=2;
					alt173 = dfa173.predict(input);
					switch (alt173) {
						case 1 :
							// Parser.g:1335:9: (ksT= IDENT |ksT= QUOTED_NAME |ksK= unreserved_keyword ) '.'
							{
							// Parser.g:1335:9: (ksT= IDENT |ksT= QUOTED_NAME |ksK= unreserved_keyword )
							int alt172=3;
							switch ( input.LA(1) ) {
							case IDENT:
								{
								alt172=1;
								}
								break;
							case QUOTED_NAME:
								{
								alt172=2;
								}
								break;
							case K_ACCESS:
							case K_AGGREGATE:
							case K_AGGREGATES:
							case K_ALL:
							case K_AS:
							case K_ASCII:
							case K_BIGINT:
							case K_BLOB:
							case K_BOOLEAN:
							case K_CALLED:
							case K_CAST:
							case K_CLUSTER:
							case K_CLUSTERING:
							case K_COMPACT:
							case K_CONTAINS:
							case K_COUNT:
							case K_COUNTER:
							case K_CUSTOM:
							case K_DATACENTERS:
							case K_DATE:
							case K_DECIMAL:
							case K_DEFAULT:
							case K_DISTINCT:
							case K_DOUBLE:
							case K_DURATION:
							case K_EXISTS:
							case K_FILTERING:
							case K_FINALFUNC:
							case K_FLOAT:
							case K_FROZEN:
							case K_FUNCTION:
							case K_FUNCTIONS:
							case K_GROUP:
							case K_INET:
							case K_INITCOND:
							case K_INPUT:
							case K_INT:
							case K_INTERNALS:
							case K_JSON:
							case K_KEY:
							case K_KEYS:
							case K_KEYSPACES:
							case K_LANGUAGE:
							case K_LIKE:
							case K_LIST:
							case K_LOGIN:
							case K_MAP:
							case K_MBEAN:
							case K_MBEANS:
							case K_NOLOGIN:
							case K_NOSUPERUSER:
							case K_ONLY:
							case K_OPTIONS:
							case K_PARTITION:
							case K_PASSWORD:
							case K_PER:
							case K_PERMISSION:
							case K_PERMISSIONS:
							case K_REPLACE:
							case K_RETURNS:
							case K_ROLE:
							case K_ROLES:
							case K_SFUNC:
							case K_SMALLINT:
							case K_STATIC:
							case K_STORAGE:
							case K_STYPE:
							case K_SUPERUSER:
							case K_TABLES:
							case K_TEXT:
							case K_TIME:
							case K_TIMESTAMP:
							case K_TIMEUUID:
							case K_TINYINT:
							case K_TRIGGER:
							case K_TTL:
							case K_TUPLE:
							case K_TYPE:
							case K_TYPES:
							case K_UNSET:
							case K_USER:
							case K_USERS:
							case K_UUID:
							case K_VALUES:
							case K_VARCHAR:
							case K_VARINT:
							case K_WRITETIME:
								{
								alt172=3;
								}
								break;
							default:
								if (state.backtracking>0) {state.failed=true; return stmt;}
								NoViableAltException nvae =
									new NoViableAltException("", 172, 0, input);
								throw nvae;
							}
							switch (alt172) {
								case 1 :
									// Parser.g:1335:11: ksT= IDENT
									{
									ksT=(Token)match(input,IDENT,FOLLOW_IDENT_in_describeStatement9401); if (state.failed) return stmt;
									if ( state.backtracking==0 ) { gen.setKeyspace((ksT!=null?ksT.getText():null), false);}
									}
									break;
								case 2 :
									// Parser.g:1336:13: ksT= QUOTED_NAME
									{
									ksT=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_describeStatement9441); if (state.failed) return stmt;
									if ( state.backtracking==0 ) { gen.setKeyspace((ksT!=null?ksT.getText():null), true);}
									}
									break;
								case 3 :
									// Parser.g:1337:13: ksK= unreserved_keyword
									{
									pushFollow(FOLLOW_unreserved_keyword_in_describeStatement9475);
									ksK=unreserved_keyword();
									state._fsp--;
									if (state.failed) return stmt;
									if ( state.backtracking==0 ) { gen.setKeyspace(ksK, false);}
									}
									break;

							}

							match(input,207,FOLLOW_207_in_describeStatement9490); if (state.failed) return stmt;
							}
							break;

					}

					// Parser.g:1338:9: (tT= IDENT |tT= QUOTED_NAME |tK= unreserved_keyword )
					int alt174=3;
					switch ( input.LA(1) ) {
					case IDENT:
						{
						alt174=1;
						}
						break;
					case QUOTED_NAME:
						{
						alt174=2;
						}
						break;
					case K_ACCESS:
					case K_AGGREGATE:
					case K_AGGREGATES:
					case K_ALL:
					case K_AS:
					case K_ASCII:
					case K_BIGINT:
					case K_BLOB:
					case K_BOOLEAN:
					case K_CALLED:
					case K_CAST:
					case K_CLUSTER:
					case K_CLUSTERING:
					case K_COMPACT:
					case K_CONTAINS:
					case K_COUNT:
					case K_COUNTER:
					case K_CUSTOM:
					case K_DATACENTERS:
					case K_DATE:
					case K_DECIMAL:
					case K_DEFAULT:
					case K_DISTINCT:
					case K_DOUBLE:
					case K_DURATION:
					case K_EXISTS:
					case K_FILTERING:
					case K_FINALFUNC:
					case K_FLOAT:
					case K_FROZEN:
					case K_FUNCTION:
					case K_FUNCTIONS:
					case K_GROUP:
					case K_INET:
					case K_INITCOND:
					case K_INPUT:
					case K_INT:
					case K_INTERNALS:
					case K_JSON:
					case K_KEY:
					case K_KEYS:
					case K_KEYSPACES:
					case K_LANGUAGE:
					case K_LIKE:
					case K_LIST:
					case K_LOGIN:
					case K_MAP:
					case K_MBEAN:
					case K_MBEANS:
					case K_NOLOGIN:
					case K_NOSUPERUSER:
					case K_ONLY:
					case K_OPTIONS:
					case K_PARTITION:
					case K_PASSWORD:
					case K_PER:
					case K_PERMISSION:
					case K_PERMISSIONS:
					case K_REPLACE:
					case K_RETURNS:
					case K_ROLE:
					case K_ROLES:
					case K_SFUNC:
					case K_SMALLINT:
					case K_STATIC:
					case K_STORAGE:
					case K_STYPE:
					case K_SUPERUSER:
					case K_TABLES:
					case K_TEXT:
					case K_TIME:
					case K_TIMESTAMP:
					case K_TIMEUUID:
					case K_TINYINT:
					case K_TRIGGER:
					case K_TTL:
					case K_TUPLE:
					case K_TYPE:
					case K_TYPES:
					case K_UNSET:
					case K_USER:
					case K_USERS:
					case K_UUID:
					case K_VALUES:
					case K_VARCHAR:
					case K_VARINT:
					case K_WRITETIME:
						{
						alt174=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return stmt;}
						NoViableAltException nvae =
							new NoViableAltException("", 174, 0, input);
						throw nvae;
					}
					switch (alt174) {
						case 1 :
							// Parser.g:1338:11: tT= IDENT
							{
							tT=(Token)match(input,IDENT,FOLLOW_IDENT_in_describeStatement9507); if (state.failed) return stmt;
							if ( state.backtracking==0 ) { gen.setName((tT!=null?tT.getText():null), false);}
							}
							break;
						case 2 :
							// Parser.g:1339:11: tT= QUOTED_NAME
							{
							tT=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_describeStatement9548); if (state.failed) return stmt;
							if ( state.backtracking==0 ) { gen.setName((tT!=null?tT.getText():null), true);}
							}
							break;
						case 3 :
							// Parser.g:1340:11: tK= unreserved_keyword
							{
							pushFollow(FOLLOW_unreserved_keyword_in_describeStatement9583);
							tK=unreserved_keyword();
							state._fsp--;
							if (state.failed) return stmt;
							if ( state.backtracking==0 ) { gen.setName(tK, false);}
							}
							break;

					}

					if ( state.backtracking==0 ) { stmt = DescribeStatement.generic(gen.getKeyspace(), gen.getName()); }
					}
					break;

			}

			// Parser.g:1343:5: ( K_WITH K_INTERNALS )?
			int alt176=2;
			int LA176_0 = input.LA(1);
			if ( (LA176_0==K_WITH) ) {
				alt176=1;
			}
			switch (alt176) {
				case 1 :
					// Parser.g:1343:7: K_WITH K_INTERNALS
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_describeStatement9667); if (state.failed) return stmt;
					match(input,K_INTERNALS,FOLLOW_K_INTERNALS_in_describeStatement9669); if (state.failed) return stmt;
					if ( state.backtracking==0 ) { stmt.withInternalDetails(); }
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "describeStatement"



	// $ANTLR start "cident"
	// Parser.g:1350:1: cident returns [ColumnIdentifier id] : ( EMPTY_QUOTED_NAME |t= ident );
	public final ColumnIdentifier cident() throws RecognitionException {
		ColumnIdentifier id = null;


		ColumnIdentifier t =null;

		try {
			// Parser.g:1351:5: ( EMPTY_QUOTED_NAME |t= ident )
			int alt177=2;
			int LA177_0 = input.LA(1);
			if ( (LA177_0==EMPTY_QUOTED_NAME) ) {
				alt177=1;
			}
			else if ( (LA177_0==IDENT||LA177_0==K_ACCESS||(LA177_0 >= K_AGGREGATE && LA177_0 <= K_ALL)||LA177_0==K_AS||LA177_0==K_ASCII||(LA177_0 >= K_BIGINT && LA177_0 <= K_BOOLEAN)||(LA177_0 >= K_CALLED && LA177_0 <= K_CLUSTERING)||(LA177_0 >= K_COMPACT && LA177_0 <= K_COUNTER)||(LA177_0 >= K_CUSTOM && LA177_0 <= K_DEFAULT)||(LA177_0 >= K_DISTINCT && LA177_0 <= K_DOUBLE)||LA177_0==K_DURATION||(LA177_0 >= K_EXISTS && LA177_0 <= K_FLOAT)||LA177_0==K_FROZEN||(LA177_0 >= K_FUNCTION && LA177_0 <= K_FUNCTIONS)||LA177_0==K_GROUP||(LA177_0 >= K_INET && LA177_0 <= K_INPUT)||(LA177_0 >= K_INT && LA177_0 <= K_INTERNALS)||(LA177_0 >= K_JSON && LA177_0 <= K_KEYS)||(LA177_0 >= K_KEYSPACES && LA177_0 <= K_LIKE)||(LA177_0 >= K_LIST && LA177_0 <= K_MAP)||(LA177_0 >= K_MBEAN && LA177_0 <= K_MBEANS)||LA177_0==K_NOLOGIN||LA177_0==K_NOSUPERUSER||(LA177_0 >= K_ONLY && LA177_0 <= K_OPTIONS)||(LA177_0 >= K_PARTITION && LA177_0 <= K_PERMISSIONS)||(LA177_0 >= K_REPLACE && LA177_0 <= K_RETURNS)||(LA177_0 >= K_ROLE && LA177_0 <= K_ROLES)||(LA177_0 >= K_SFUNC && LA177_0 <= K_TINYINT)||LA177_0==K_TRIGGER||(LA177_0 >= K_TTL && LA177_0 <= K_TYPES)||LA177_0==K_UNSET||(LA177_0 >= K_USER && LA177_0 <= K_USERS)||(LA177_0 >= K_UUID && LA177_0 <= K_VARINT)||LA177_0==K_WRITETIME||LA177_0==QUOTED_NAME) ) {
				alt177=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return id;}
				NoViableAltException nvae =
					new NoViableAltException("", 177, 0, input);
				throw nvae;
			}

			switch (alt177) {
				case 1 :
					// Parser.g:1351:7: EMPTY_QUOTED_NAME
					{
					match(input,EMPTY_QUOTED_NAME,FOLLOW_EMPTY_QUOTED_NAME_in_cident9700); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = ColumnIdentifier.getInterned("", true); }
					}
					break;
				case 2 :
					// Parser.g:1352:7: t= ident
					{
					pushFollow(FOLLOW_ident_in_cident9715);
					t=ident();
					state._fsp--;
					if (state.failed) return id;
					if ( state.backtracking==0 ) { id = t; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "cident"



	// $ANTLR start "ident"
	// Parser.g:1355:1: ident returns [ColumnIdentifier id] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword );
	public final ColumnIdentifier ident() throws RecognitionException {
		ColumnIdentifier id = null;


		Token t=null;
		String k =null;

		try {
			// Parser.g:1356:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword )
			int alt178=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt178=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt178=2;
				}
				break;
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTER:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DATE:
			case K_DECIMAL:
			case K_DEFAULT:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_INTERNALS:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt178=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return id;}
				NoViableAltException nvae =
					new NoViableAltException("", 178, 0, input);
				throw nvae;
			}
			switch (alt178) {
				case 1 :
					// Parser.g:1356:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_ident9753); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = ColumnIdentifier.getInterned((t!=null?t.getText():null), false); }
					}
					break;
				case 2 :
					// Parser.g:1357:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_ident9778); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = ColumnIdentifier.getInterned((t!=null?t.getText():null), true); }
					}
					break;
				case 3 :
					// Parser.g:1358:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_ident9797);
					k=unreserved_keyword();
					state._fsp--;
					if (state.failed) return id;
					if ( state.backtracking==0 ) { id = ColumnIdentifier.getInterned(k, false); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "ident"



	// $ANTLR start "fident"
	// Parser.g:1361:1: fident returns [FieldIdentifier id] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword );
	public final FieldIdentifier fident() throws RecognitionException {
		FieldIdentifier id = null;


		Token t=null;
		String k =null;

		try {
			// Parser.g:1362:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword )
			int alt179=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt179=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt179=2;
				}
				break;
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTER:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DATE:
			case K_DECIMAL:
			case K_DEFAULT:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_INTERNALS:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt179=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return id;}
				NoViableAltException nvae =
					new NoViableAltException("", 179, 0, input);
				throw nvae;
			}
			switch (alt179) {
				case 1 :
					// Parser.g:1362:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_fident9822); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = FieldIdentifier.forUnquoted((t!=null?t.getText():null)); }
					}
					break;
				case 2 :
					// Parser.g:1363:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_fident9847); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = FieldIdentifier.forQuoted((t!=null?t.getText():null)); }
					}
					break;
				case 3 :
					// Parser.g:1364:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_fident9866);
					k=unreserved_keyword();
					state._fsp--;
					if (state.failed) return id;
					if ( state.backtracking==0 ) { id = FieldIdentifier.forUnquoted(k); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "fident"



	// $ANTLR start "noncol_ident"
	// Parser.g:1368:1: noncol_ident returns [ColumnIdentifier id] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword );
	public final ColumnIdentifier noncol_ident() throws RecognitionException {
		ColumnIdentifier id = null;


		Token t=null;
		String k =null;

		try {
			// Parser.g:1369:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword )
			int alt180=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt180=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt180=2;
				}
				break;
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTER:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DATE:
			case K_DECIMAL:
			case K_DEFAULT:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_INTERNALS:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt180=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return id;}
				NoViableAltException nvae =
					new NoViableAltException("", 180, 0, input);
				throw nvae;
			}
			switch (alt180) {
				case 1 :
					// Parser.g:1369:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_noncol_ident9892); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = new ColumnIdentifier((t!=null?t.getText():null), false); }
					}
					break;
				case 2 :
					// Parser.g:1370:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_noncol_ident9917); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = new ColumnIdentifier((t!=null?t.getText():null), true); }
					}
					break;
				case 3 :
					// Parser.g:1371:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_noncol_ident9936);
					k=unreserved_keyword();
					state._fsp--;
					if (state.failed) return id;
					if ( state.backtracking==0 ) { id = new ColumnIdentifier(k, false); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "noncol_ident"



	// $ANTLR start "keyspaceName"
	// Parser.g:1375:1: keyspaceName returns [String id] : ksName[name] ;
	public final String keyspaceName() throws RecognitionException {
		String id = null;


		 QualifiedName name = new QualifiedName(); 
		try {
			// Parser.g:1377:5: ( ksName[name] )
			// Parser.g:1377:7: ksName[name]
			{
			pushFollow(FOLLOW_ksName_in_keyspaceName9969);
			ksName(name);
			state._fsp--;
			if (state.failed) return id;
			if ( state.backtracking==0 ) { id = name.getKeyspace(); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "keyspaceName"



	// $ANTLR start "indexName"
	// Parser.g:1380:1: indexName returns [QualifiedName name] : ( ksName[name] '.' )? idxName[name] ;
	public final QualifiedName indexName() throws RecognitionException {
		QualifiedName name = null;


		 name = new QualifiedName(); 
		try {
			// Parser.g:1382:5: ( ( ksName[name] '.' )? idxName[name] )
			// Parser.g:1382:7: ( ksName[name] '.' )? idxName[name]
			{
			// Parser.g:1382:7: ( ksName[name] '.' )?
			int alt181=2;
			alt181 = dfa181.predict(input);
			switch (alt181) {
				case 1 :
					// Parser.g:1382:8: ksName[name] '.'
					{
					pushFollow(FOLLOW_ksName_in_indexName10003);
					ksName(name);
					state._fsp--;
					if (state.failed) return name;
					match(input,207,FOLLOW_207_in_indexName10006); if (state.failed) return name;
					}
					break;

			}

			pushFollow(FOLLOW_idxName_in_indexName10010);
			idxName(name);
			state._fsp--;
			if (state.failed) return name;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "indexName"



	// $ANTLR start "columnFamilyName"
	// Parser.g:1385:1: columnFamilyName returns [QualifiedName name] : ( ksName[name] '.' )? cfName[name] ;
	public final QualifiedName columnFamilyName() throws RecognitionException {
		QualifiedName name = null;


		 name = new QualifiedName(); 
		try {
			// Parser.g:1387:5: ( ( ksName[name] '.' )? cfName[name] )
			// Parser.g:1387:7: ( ksName[name] '.' )? cfName[name]
			{
			// Parser.g:1387:7: ( ksName[name] '.' )?
			int alt182=2;
			alt182 = dfa182.predict(input);
			switch (alt182) {
				case 1 :
					// Parser.g:1387:8: ksName[name] '.'
					{
					pushFollow(FOLLOW_ksName_in_columnFamilyName10042);
					ksName(name);
					state._fsp--;
					if (state.failed) return name;
					match(input,207,FOLLOW_207_in_columnFamilyName10045); if (state.failed) return name;
					}
					break;

			}

			pushFollow(FOLLOW_cfName_in_columnFamilyName10049);
			cfName(name);
			state._fsp--;
			if (state.failed) return name;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "columnFamilyName"



	// $ANTLR start "userTypeName"
	// Parser.g:1390:1: userTypeName returns [UTName name] : (ks= noncol_ident '.' )? ut= non_type_ident ;
	public final UTName userTypeName() throws RecognitionException {
		UTName name = null;


		ColumnIdentifier ks =null;
		ColumnIdentifier ut =null;

		try {
			// Parser.g:1391:5: ( (ks= noncol_ident '.' )? ut= non_type_ident )
			// Parser.g:1391:7: (ks= noncol_ident '.' )? ut= non_type_ident
			{
			// Parser.g:1391:7: (ks= noncol_ident '.' )?
			int alt183=2;
			switch ( input.LA(1) ) {
				case IDENT:
					{
					int LA183_1 = input.LA(2);
					if ( (LA183_1==207) ) {
						alt183=1;
					}
					}
					break;
				case QUOTED_NAME:
					{
					int LA183_2 = input.LA(2);
					if ( (LA183_2==207) ) {
						alt183=1;
					}
					}
					break;
				case K_ACCESS:
				case K_AGGREGATE:
				case K_AGGREGATES:
				case K_ALL:
				case K_AS:
				case K_CALLED:
				case K_CLUSTER:
				case K_CLUSTERING:
				case K_COMPACT:
				case K_CONTAINS:
				case K_CUSTOM:
				case K_DATACENTERS:
				case K_DEFAULT:
				case K_EXISTS:
				case K_FILTERING:
				case K_FINALFUNC:
				case K_FROZEN:
				case K_FUNCTION:
				case K_FUNCTIONS:
				case K_GROUP:
				case K_INITCOND:
				case K_INPUT:
				case K_INTERNALS:
				case K_KEYS:
				case K_KEYSPACES:
				case K_LANGUAGE:
				case K_LIKE:
				case K_LIST:
				case K_LOGIN:
				case K_MAP:
				case K_MBEAN:
				case K_MBEANS:
				case K_NOLOGIN:
				case K_NOSUPERUSER:
				case K_ONLY:
				case K_OPTIONS:
				case K_PARTITION:
				case K_PASSWORD:
				case K_PER:
				case K_PERMISSION:
				case K_PERMISSIONS:
				case K_REPLACE:
				case K_RETURNS:
				case K_ROLE:
				case K_ROLES:
				case K_SFUNC:
				case K_STATIC:
				case K_STORAGE:
				case K_STYPE:
				case K_SUPERUSER:
				case K_TABLES:
				case K_TRIGGER:
				case K_TUPLE:
				case K_TYPE:
				case K_TYPES:
				case K_UNSET:
				case K_USER:
				case K_USERS:
				case K_VALUES:
					{
					int LA183_3 = input.LA(2);
					if ( (LA183_3==207) ) {
						alt183=1;
					}
					}
					break;
				case K_ASCII:
				case K_BIGINT:
				case K_BLOB:
				case K_BOOLEAN:
				case K_CAST:
				case K_COUNT:
				case K_COUNTER:
				case K_DATE:
				case K_DECIMAL:
				case K_DISTINCT:
				case K_DOUBLE:
				case K_DURATION:
				case K_FLOAT:
				case K_INET:
				case K_INT:
				case K_JSON:
				case K_SMALLINT:
				case K_TEXT:
				case K_TIME:
				case K_TIMESTAMP:
				case K_TIMEUUID:
				case K_TINYINT:
				case K_TTL:
				case K_UUID:
				case K_VARCHAR:
				case K_VARINT:
				case K_WRITETIME:
					{
					alt183=1;
					}
					break;
				case K_KEY:
					{
					int LA183_5 = input.LA(2);
					if ( (LA183_5==207) ) {
						alt183=1;
					}
					}
					break;
			}
			switch (alt183) {
				case 1 :
					// Parser.g:1391:8: ks= noncol_ident '.'
					{
					pushFollow(FOLLOW_noncol_ident_in_userTypeName10074);
					ks=noncol_ident();
					state._fsp--;
					if (state.failed) return name;
					match(input,207,FOLLOW_207_in_userTypeName10076); if (state.failed) return name;
					}
					break;

			}

			pushFollow(FOLLOW_non_type_ident_in_userTypeName10082);
			ut=non_type_ident();
			state._fsp--;
			if (state.failed) return name;
			if ( state.backtracking==0 ) { name = new UTName(ks, ut); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "userTypeName"



	// $ANTLR start "userOrRoleName"
	// Parser.g:1394:1: userOrRoleName returns [RoleName name] : roleName[role] ;
	public final RoleName userOrRoleName() throws RecognitionException {
		RoleName name = null;


		 RoleName role = new RoleName(); 
		try {
			// Parser.g:1396:5: ( roleName[role] )
			// Parser.g:1396:7: roleName[role]
			{
			pushFollow(FOLLOW_roleName_in_userOrRoleName10114);
			roleName(role);
			state._fsp--;
			if (state.failed) return name;
			if ( state.backtracking==0 ) {name = role;}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "userOrRoleName"



	// $ANTLR start "ksName"
	// Parser.g:1399:1: ksName[QualifiedName name] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK );
	public final void ksName(QualifiedName name) throws RecognitionException {
		Token t=null;
		String k =null;

		try {
			// Parser.g:1400:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK )
			int alt184=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt184=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt184=2;
				}
				break;
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTER:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DATE:
			case K_DECIMAL:
			case K_DEFAULT:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_INTERNALS:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt184=3;
				}
				break;
			case QMARK:
				{
				alt184=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 184, 0, input);
				throw nvae;
			}
			switch (alt184) {
				case 1 :
					// Parser.g:1400:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_ksName10137); if (state.failed) return;
					if ( state.backtracking==0 ) { name.setKeyspace((t!=null?t.getText():null), false);}
					}
					break;
				case 2 :
					// Parser.g:1401:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_ksName10162); if (state.failed) return;
					if ( state.backtracking==0 ) { name.setKeyspace((t!=null?t.getText():null), true);}
					}
					break;
				case 3 :
					// Parser.g:1402:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_ksName10181);
					k=unreserved_keyword();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { name.setKeyspace(k, false);}
					}
					break;
				case 4 :
					// Parser.g:1403:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_ksName10191); if (state.failed) return;
					if ( state.backtracking==0 ) {addRecognitionError("Bind variables cannot be used for keyspace names");}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ksName"



	// $ANTLR start "cfName"
	// Parser.g:1406:1: cfName[QualifiedName name] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK );
	public final void cfName(QualifiedName name) throws RecognitionException {
		Token t=null;
		String k =null;

		try {
			// Parser.g:1407:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK )
			int alt185=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt185=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt185=2;
				}
				break;
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTER:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DATE:
			case K_DECIMAL:
			case K_DEFAULT:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_INTERNALS:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt185=3;
				}
				break;
			case QMARK:
				{
				alt185=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 185, 0, input);
				throw nvae;
			}
			switch (alt185) {
				case 1 :
					// Parser.g:1407:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_cfName10213); if (state.failed) return;
					if ( state.backtracking==0 ) { name.setName((t!=null?t.getText():null), false); }
					}
					break;
				case 2 :
					// Parser.g:1408:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_cfName10238); if (state.failed) return;
					if ( state.backtracking==0 ) { name.setName((t!=null?t.getText():null), true); }
					}
					break;
				case 3 :
					// Parser.g:1409:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_cfName10257);
					k=unreserved_keyword();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { name.setName(k, false); }
					}
					break;
				case 4 :
					// Parser.g:1410:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_cfName10267); if (state.failed) return;
					if ( state.backtracking==0 ) {addRecognitionError("Bind variables cannot be used for table names");}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cfName"



	// $ANTLR start "idxName"
	// Parser.g:1413:1: idxName[QualifiedName name] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK );
	public final void idxName(QualifiedName name) throws RecognitionException {
		Token t=null;
		String k =null;

		try {
			// Parser.g:1414:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK )
			int alt186=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt186=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt186=2;
				}
				break;
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTER:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DATE:
			case K_DECIMAL:
			case K_DEFAULT:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_INTERNALS:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt186=3;
				}
				break;
			case QMARK:
				{
				alt186=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 186, 0, input);
				throw nvae;
			}
			switch (alt186) {
				case 1 :
					// Parser.g:1414:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_idxName10289); if (state.failed) return;
					if ( state.backtracking==0 ) { name.setName((t!=null?t.getText():null), false); }
					}
					break;
				case 2 :
					// Parser.g:1415:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_idxName10314); if (state.failed) return;
					if ( state.backtracking==0 ) { name.setName((t!=null?t.getText():null), true);}
					}
					break;
				case 3 :
					// Parser.g:1416:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_idxName10333);
					k=unreserved_keyword();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { name.setName(k, false); }
					}
					break;
				case 4 :
					// Parser.g:1417:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_idxName10343); if (state.failed) return;
					if ( state.backtracking==0 ) {addRecognitionError("Bind variables cannot be used for index names");}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "idxName"



	// $ANTLR start "roleName"
	// Parser.g:1420:1: roleName[RoleName name] : (t= IDENT |s= STRING_LITERAL |t= QUOTED_NAME |k= unreserved_keyword | QMARK );
	public final void roleName(RoleName name) throws RecognitionException {
		Token t=null;
		Token s=null;
		String k =null;

		try {
			// Parser.g:1421:5: (t= IDENT |s= STRING_LITERAL |t= QUOTED_NAME |k= unreserved_keyword | QMARK )
			int alt187=5;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt187=1;
				}
				break;
			case STRING_LITERAL:
				{
				alt187=2;
				}
				break;
			case QUOTED_NAME:
				{
				alt187=3;
				}
				break;
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTER:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DATE:
			case K_DECIMAL:
			case K_DEFAULT:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_INTERNALS:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt187=4;
				}
				break;
			case QMARK:
				{
				alt187=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 187, 0, input);
				throw nvae;
			}
			switch (alt187) {
				case 1 :
					// Parser.g:1421:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_roleName10365); if (state.failed) return;
					if ( state.backtracking==0 ) { name.setName((t!=null?t.getText():null), false); }
					}
					break;
				case 2 :
					// Parser.g:1422:7: s= STRING_LITERAL
					{
					s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_roleName10390); if (state.failed) return;
					if ( state.backtracking==0 ) { name.setName((s!=null?s.getText():null), true); }
					}
					break;
				case 3 :
					// Parser.g:1423:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_roleName10406); if (state.failed) return;
					if ( state.backtracking==0 ) { name.setName((t!=null?t.getText():null), true); }
					}
					break;
				case 4 :
					// Parser.g:1424:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_roleName10425);
					k=unreserved_keyword();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { name.setName(k, false); }
					}
					break;
				case 5 :
					// Parser.g:1425:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_roleName10435); if (state.failed) return;
					if ( state.backtracking==0 ) {addRecognitionError("Bind variables cannot be used for role names");}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "roleName"



	// $ANTLR start "constant"
	// Parser.g:1428:1: constant returns [Constants.Literal constant] : (t= STRING_LITERAL |t= INTEGER |t= FLOAT |t= BOOLEAN |t= DURATION |t= UUID |t= HEXNUMBER | ( ( K_POSITIVE_NAN | K_NEGATIVE_NAN ) | K_POSITIVE_INFINITY | K_NEGATIVE_INFINITY ) );
	public final Constants.Literal constant() throws RecognitionException {
		Constants.Literal constant = null;


		Token t=null;

		try {
			// Parser.g:1429:5: (t= STRING_LITERAL |t= INTEGER |t= FLOAT |t= BOOLEAN |t= DURATION |t= UUID |t= HEXNUMBER | ( ( K_POSITIVE_NAN | K_NEGATIVE_NAN ) | K_POSITIVE_INFINITY | K_NEGATIVE_INFINITY ) )
			int alt189=8;
			switch ( input.LA(1) ) {
			case STRING_LITERAL:
				{
				alt189=1;
				}
				break;
			case INTEGER:
				{
				alt189=2;
				}
				break;
			case FLOAT:
				{
				alt189=3;
				}
				break;
			case BOOLEAN:
				{
				alt189=4;
				}
				break;
			case DURATION:
				{
				alt189=5;
				}
				break;
			case UUID:
				{
				alt189=6;
				}
				break;
			case HEXNUMBER:
				{
				alt189=7;
				}
				break;
			case K_NEGATIVE_INFINITY:
			case K_NEGATIVE_NAN:
			case K_POSITIVE_INFINITY:
			case K_POSITIVE_NAN:
				{
				alt189=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return constant;}
				NoViableAltException nvae =
					new NoViableAltException("", 189, 0, input);
				throw nvae;
			}
			switch (alt189) {
				case 1 :
					// Parser.g:1429:7: t= STRING_LITERAL
					{
					t=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_constant10460); if (state.failed) return constant;
					if ( state.backtracking==0 ) { constant = Constants.Literal.string((t!=null?t.getText():null)); }
					}
					break;
				case 2 :
					// Parser.g:1430:7: t= INTEGER
					{
					t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_constant10472); if (state.failed) return constant;
					if ( state.backtracking==0 ) { constant = Constants.Literal.integer((t!=null?t.getText():null)); }
					}
					break;
				case 3 :
					// Parser.g:1431:7: t= FLOAT
					{
					t=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constant10491); if (state.failed) return constant;
					if ( state.backtracking==0 ) { constant = Constants.Literal.floatingPoint((t!=null?t.getText():null)); }
					}
					break;
				case 4 :
					// Parser.g:1432:7: t= BOOLEAN
					{
					t=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_constant10512); if (state.failed) return constant;
					if ( state.backtracking==0 ) { constant = Constants.Literal.bool((t!=null?t.getText():null)); }
					}
					break;
				case 5 :
					// Parser.g:1433:7: t= DURATION
					{
					t=(Token)match(input,DURATION,FOLLOW_DURATION_in_constant10531); if (state.failed) return constant;
					if ( state.backtracking==0 ) { constant = Constants.Literal.duration((t!=null?t.getText():null));}
					}
					break;
				case 6 :
					// Parser.g:1434:7: t= UUID
					{
					t=(Token)match(input,UUID,FOLLOW_UUID_in_constant10549); if (state.failed) return constant;
					if ( state.backtracking==0 ) { constant = Constants.Literal.uuid((t!=null?t.getText():null)); }
					}
					break;
				case 7 :
					// Parser.g:1435:7: t= HEXNUMBER
					{
					t=(Token)match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_constant10571); if (state.failed) return constant;
					if ( state.backtracking==0 ) { constant = Constants.Literal.hex((t!=null?t.getText():null)); }
					}
					break;
				case 8 :
					// Parser.g:1436:7: ( ( K_POSITIVE_NAN | K_NEGATIVE_NAN ) | K_POSITIVE_INFINITY | K_NEGATIVE_INFINITY )
					{
					// Parser.g:1436:7: ( ( K_POSITIVE_NAN | K_NEGATIVE_NAN ) | K_POSITIVE_INFINITY | K_NEGATIVE_INFINITY )
					int alt188=3;
					switch ( input.LA(1) ) {
					case K_NEGATIVE_NAN:
					case K_POSITIVE_NAN:
						{
						alt188=1;
						}
						break;
					case K_POSITIVE_INFINITY:
						{
						alt188=2;
						}
						break;
					case K_NEGATIVE_INFINITY:
						{
						alt188=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return constant;}
						NoViableAltException nvae =
							new NoViableAltException("", 188, 0, input);
						throw nvae;
					}
					switch (alt188) {
						case 1 :
							// Parser.g:1436:8: ( K_POSITIVE_NAN | K_NEGATIVE_NAN )
							{
							if ( input.LA(1)==K_NEGATIVE_NAN||input.LA(1)==K_POSITIVE_NAN ) {
								input.consume();
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return constant;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							if ( state.backtracking==0 ) { constant = Constants.Literal.floatingPoint("NaN"); }
							}
							break;
						case 2 :
							// Parser.g:1437:11: K_POSITIVE_INFINITY
							{
							match(input,K_POSITIVE_INFINITY,FOLLOW_K_POSITIVE_INFINITY_in_constant10607); if (state.failed) return constant;
							if ( state.backtracking==0 ) { constant = Constants.Literal.floatingPoint("Infinity"); }
							}
							break;
						case 3 :
							// Parser.g:1438:11: K_NEGATIVE_INFINITY
							{
							match(input,K_NEGATIVE_INFINITY,FOLLOW_K_NEGATIVE_INFINITY_in_constant10622); if (state.failed) return constant;
							if ( state.backtracking==0 ) { constant = Constants.Literal.floatingPoint("-Infinity"); }
							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return constant;
	}
	// $ANTLR end "constant"



	// $ANTLR start "fullMapLiteral"
	// Parser.g:1441:1: fullMapLiteral returns [Maps.Literal map] : '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}' ;
	public final Maps.Literal fullMapLiteral() throws RecognitionException {
		Maps.Literal map = null;


		Term.Raw k1 =null;
		Term.Raw v1 =null;
		Term.Raw kn =null;
		Term.Raw vn =null;

		 List<Pair<Term.Raw, Term.Raw>> m = new ArrayList<Pair<Term.Raw, Term.Raw>>();
		try {
			// Parser.g:1444:5: ( '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}' )
			// Parser.g:1444:7: '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}'
			{
			match(input,220,FOLLOW_220_in_fullMapLiteral10663); if (state.failed) return map;
			// Parser.g:1444:11: (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )?
			int alt191=2;
			int LA191_0 = input.LA(1);
			if ( (LA191_0==BOOLEAN||LA191_0==DURATION||LA191_0==FLOAT||LA191_0==HEXNUMBER||(LA191_0 >= IDENT && LA191_0 <= INTEGER)||LA191_0==K_ACCESS||(LA191_0 >= K_AGGREGATE && LA191_0 <= K_ALL)||LA191_0==K_AS||LA191_0==K_ASCII||(LA191_0 >= K_BIGINT && LA191_0 <= K_BOOLEAN)||(LA191_0 >= K_CALLED && LA191_0 <= K_CLUSTERING)||(LA191_0 >= K_COMPACT && LA191_0 <= K_COUNTER)||(LA191_0 >= K_CUSTOM && LA191_0 <= K_DEFAULT)||(LA191_0 >= K_DISTINCT && LA191_0 <= K_DOUBLE)||LA191_0==K_DURATION||(LA191_0 >= K_EXISTS && LA191_0 <= K_FLOAT)||LA191_0==K_FROZEN||(LA191_0 >= K_FUNCTION && LA191_0 <= K_FUNCTIONS)||LA191_0==K_GROUP||(LA191_0 >= K_INET && LA191_0 <= K_INPUT)||(LA191_0 >= K_INT && LA191_0 <= K_INTERNALS)||(LA191_0 >= K_JSON && LA191_0 <= K_KEYS)||(LA191_0 >= K_KEYSPACES && LA191_0 <= K_LIKE)||(LA191_0 >= K_LIST && LA191_0 <= K_MAP)||(LA191_0 >= K_MBEAN && LA191_0 <= K_MBEANS)||(LA191_0 >= K_NEGATIVE_INFINITY && LA191_0 <= K_NOLOGIN)||LA191_0==K_NOSUPERUSER||LA191_0==K_NULL||(LA191_0 >= K_ONLY && LA191_0 <= K_OPTIONS)||(LA191_0 >= K_PARTITION && LA191_0 <= K_POSITIVE_NAN)||(LA191_0 >= K_REPLACE && LA191_0 <= K_RETURNS)||(LA191_0 >= K_ROLE && LA191_0 <= K_ROLES)||(LA191_0 >= K_SFUNC && LA191_0 <= K_TINYINT)||(LA191_0 >= K_TOKEN && LA191_0 <= K_TRIGGER)||(LA191_0 >= K_TTL && LA191_0 <= K_TYPES)||LA191_0==K_UNSET||(LA191_0 >= K_USER && LA191_0 <= K_USERS)||(LA191_0 >= K_UUID && LA191_0 <= K_VARINT)||LA191_0==K_WRITETIME||(LA191_0 >= QMARK && LA191_0 <= QUOTED_NAME)||LA191_0==STRING_LITERAL||LA191_0==UUID||LA191_0==200||LA191_0==205||LA191_0==209||LA191_0==216||LA191_0==220) ) {
				alt191=1;
			}
			switch (alt191) {
				case 1 :
					// Parser.g:1444:13: k1= term ':' v1= term ( ',' kn= term ':' vn= term )*
					{
					pushFollow(FOLLOW_term_in_fullMapLiteral10669);
					k1=term();
					state._fsp--;
					if (state.failed) return map;
					match(input,209,FOLLOW_209_in_fullMapLiteral10671); if (state.failed) return map;
					pushFollow(FOLLOW_term_in_fullMapLiteral10675);
					v1=term();
					state._fsp--;
					if (state.failed) return map;
					if ( state.backtracking==0 ) { m.add(Pair.create(k1, v1)); }
					// Parser.g:1444:65: ( ',' kn= term ':' vn= term )*
					loop190:
					while (true) {
						int alt190=2;
						int LA190_0 = input.LA(1);
						if ( (LA190_0==204) ) {
							alt190=1;
						}

						switch (alt190) {
						case 1 :
							// Parser.g:1444:67: ',' kn= term ':' vn= term
							{
							match(input,204,FOLLOW_204_in_fullMapLiteral10681); if (state.failed) return map;
							pushFollow(FOLLOW_term_in_fullMapLiteral10685);
							kn=term();
							state._fsp--;
							if (state.failed) return map;
							match(input,209,FOLLOW_209_in_fullMapLiteral10687); if (state.failed) return map;
							pushFollow(FOLLOW_term_in_fullMapLiteral10691);
							vn=term();
							state._fsp--;
							if (state.failed) return map;
							if ( state.backtracking==0 ) { m.add(Pair.create(kn, vn)); }
							}
							break;

						default :
							break loop190;
						}
					}

					}
					break;

			}

			match(input,221,FOLLOW_221_in_fullMapLiteral10707); if (state.failed) return map;
			}

			if ( state.backtracking==0 ) { map = new Maps.Literal(m); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return map;
	}
	// $ANTLR end "fullMapLiteral"



	// $ANTLR start "setOrMapLiteral"
	// Parser.g:1448:1: setOrMapLiteral[Term.Raw t] returns [Term.Raw value] : (m= mapLiteral[t] |s= setLiteral[t] );
	public final Term.Raw setOrMapLiteral(Term.Raw t) throws RecognitionException {
		Term.Raw value = null;


		Term.Raw m =null;
		Term.Raw s =null;

		try {
			// Parser.g:1449:5: (m= mapLiteral[t] |s= setLiteral[t] )
			int alt192=2;
			int LA192_0 = input.LA(1);
			if ( (LA192_0==209) ) {
				alt192=1;
			}
			else if ( (LA192_0==204||LA192_0==221) ) {
				alt192=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return value;}
				NoViableAltException nvae =
					new NoViableAltException("", 192, 0, input);
				throw nvae;
			}

			switch (alt192) {
				case 1 :
					// Parser.g:1449:7: m= mapLiteral[t]
					{
					pushFollow(FOLLOW_mapLiteral_in_setOrMapLiteral10731);
					m=mapLiteral(t);
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value =m; }
					}
					break;
				case 2 :
					// Parser.g:1450:7: s= setLiteral[t]
					{
					pushFollow(FOLLOW_setLiteral_in_setOrMapLiteral10744);
					s=setLiteral(t);
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value =s; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "setOrMapLiteral"



	// $ANTLR start "setLiteral"
	// Parser.g:1453:1: setLiteral[Term.Raw t] returns [Term.Raw value] : ( ',' tn= term )* ;
	public final Term.Raw setLiteral(Term.Raw t) throws RecognitionException {
		Term.Raw value = null;


		Term.Raw tn =null;

		 List<Term.Raw> s = new ArrayList<Term.Raw>(); s.add(t); 
		try {
			// Parser.g:1456:5: ( ( ',' tn= term )* )
			// Parser.g:1456:7: ( ',' tn= term )*
			{
			// Parser.g:1456:7: ( ',' tn= term )*
			loop193:
			while (true) {
				int alt193=2;
				int LA193_0 = input.LA(1);
				if ( (LA193_0==204) ) {
					alt193=1;
				}

				switch (alt193) {
				case 1 :
					// Parser.g:1456:9: ',' tn= term
					{
					match(input,204,FOLLOW_204_in_setLiteral10789); if (state.failed) return value;
					pushFollow(FOLLOW_term_in_setLiteral10793);
					tn=term();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { s.add(tn); }
					}
					break;

				default :
					break loop193;
				}
			}

			}

			if ( state.backtracking==0 ) { value = new Sets.Literal(s); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "setLiteral"



	// $ANTLR start "mapLiteral"
	// Parser.g:1459:1: mapLiteral[Term.Raw k] returns [Term.Raw value] : ':' v= term ( ',' kn= term ':' vn= term )* ;
	public final Term.Raw mapLiteral(Term.Raw k) throws RecognitionException {
		Term.Raw value = null;


		Term.Raw v =null;
		Term.Raw kn =null;
		Term.Raw vn =null;

		 List<Pair<Term.Raw, Term.Raw>> m = new ArrayList<Pair<Term.Raw, Term.Raw>>(); 
		try {
			// Parser.g:1462:5: ( ':' v= term ( ',' kn= term ':' vn= term )* )
			// Parser.g:1462:7: ':' v= term ( ',' kn= term ':' vn= term )*
			{
			match(input,209,FOLLOW_209_in_mapLiteral10838); if (state.failed) return value;
			pushFollow(FOLLOW_term_in_mapLiteral10842);
			v=term();
			state._fsp--;
			if (state.failed) return value;
			if ( state.backtracking==0 ) {  m.add(Pair.create(k, v)); }
			// Parser.g:1462:49: ( ',' kn= term ':' vn= term )*
			loop194:
			while (true) {
				int alt194=2;
				int LA194_0 = input.LA(1);
				if ( (LA194_0==204) ) {
					alt194=1;
				}

				switch (alt194) {
				case 1 :
					// Parser.g:1462:51: ',' kn= term ':' vn= term
					{
					match(input,204,FOLLOW_204_in_mapLiteral10848); if (state.failed) return value;
					pushFollow(FOLLOW_term_in_mapLiteral10852);
					kn=term();
					state._fsp--;
					if (state.failed) return value;
					match(input,209,FOLLOW_209_in_mapLiteral10854); if (state.failed) return value;
					pushFollow(FOLLOW_term_in_mapLiteral10858);
					vn=term();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { m.add(Pair.create(kn, vn)); }
					}
					break;

				default :
					break loop194;
				}
			}

			}

			if ( state.backtracking==0 ) { value = new Maps.Literal(m); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "mapLiteral"



	// $ANTLR start "collectionLiteral"
	// Parser.g:1465:1: collectionLiteral returns [Term.Raw value] : (l= listLiteral | '{' t= term v= setOrMapLiteral[t] '}' | '{' '}' );
	public final Term.Raw collectionLiteral() throws RecognitionException {
		Term.Raw value = null;


		Term.Raw l =null;
		Term.Raw t =null;
		Term.Raw v =null;

		try {
			// Parser.g:1466:5: (l= listLiteral | '{' t= term v= setOrMapLiteral[t] '}' | '{' '}' )
			int alt195=3;
			int LA195_0 = input.LA(1);
			if ( (LA195_0==216) ) {
				alt195=1;
			}
			else if ( (LA195_0==220) ) {
				int LA195_2 = input.LA(2);
				if ( (LA195_2==221) ) {
					alt195=3;
				}
				else if ( (LA195_2==BOOLEAN||LA195_2==DURATION||LA195_2==FLOAT||LA195_2==HEXNUMBER||(LA195_2 >= IDENT && LA195_2 <= INTEGER)||LA195_2==K_ACCESS||(LA195_2 >= K_AGGREGATE && LA195_2 <= K_ALL)||LA195_2==K_AS||LA195_2==K_ASCII||(LA195_2 >= K_BIGINT && LA195_2 <= K_BOOLEAN)||(LA195_2 >= K_CALLED && LA195_2 <= K_CLUSTERING)||(LA195_2 >= K_COMPACT && LA195_2 <= K_COUNTER)||(LA195_2 >= K_CUSTOM && LA195_2 <= K_DEFAULT)||(LA195_2 >= K_DISTINCT && LA195_2 <= K_DOUBLE)||LA195_2==K_DURATION||(LA195_2 >= K_EXISTS && LA195_2 <= K_FLOAT)||LA195_2==K_FROZEN||(LA195_2 >= K_FUNCTION && LA195_2 <= K_FUNCTIONS)||LA195_2==K_GROUP||(LA195_2 >= K_INET && LA195_2 <= K_INPUT)||(LA195_2 >= K_INT && LA195_2 <= K_INTERNALS)||(LA195_2 >= K_JSON && LA195_2 <= K_KEYS)||(LA195_2 >= K_KEYSPACES && LA195_2 <= K_LIKE)||(LA195_2 >= K_LIST && LA195_2 <= K_MAP)||(LA195_2 >= K_MBEAN && LA195_2 <= K_MBEANS)||(LA195_2 >= K_NEGATIVE_INFINITY && LA195_2 <= K_NOLOGIN)||LA195_2==K_NOSUPERUSER||LA195_2==K_NULL||(LA195_2 >= K_ONLY && LA195_2 <= K_OPTIONS)||(LA195_2 >= K_PARTITION && LA195_2 <= K_POSITIVE_NAN)||(LA195_2 >= K_REPLACE && LA195_2 <= K_RETURNS)||(LA195_2 >= K_ROLE && LA195_2 <= K_ROLES)||(LA195_2 >= K_SFUNC && LA195_2 <= K_TINYINT)||(LA195_2 >= K_TOKEN && LA195_2 <= K_TRIGGER)||(LA195_2 >= K_TTL && LA195_2 <= K_TYPES)||LA195_2==K_UNSET||(LA195_2 >= K_USER && LA195_2 <= K_USERS)||(LA195_2 >= K_UUID && LA195_2 <= K_VARINT)||LA195_2==K_WRITETIME||(LA195_2 >= QMARK && LA195_2 <= QUOTED_NAME)||LA195_2==STRING_LITERAL||LA195_2==UUID||LA195_2==200||LA195_2==205||LA195_2==209||LA195_2==216||LA195_2==220) ) {
					alt195=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return value;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 195, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return value;}
				NoViableAltException nvae =
					new NoViableAltException("", 195, 0, input);
				throw nvae;
			}

			switch (alt195) {
				case 1 :
					// Parser.g:1466:7: l= listLiteral
					{
					pushFollow(FOLLOW_listLiteral_in_collectionLiteral10886);
					l=listLiteral();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = l; }
					}
					break;
				case 2 :
					// Parser.g:1467:7: '{' t= term v= setOrMapLiteral[t] '}'
					{
					match(input,220,FOLLOW_220_in_collectionLiteral10896); if (state.failed) return value;
					pushFollow(FOLLOW_term_in_collectionLiteral10900);
					t=term();
					state._fsp--;
					if (state.failed) return value;
					pushFollow(FOLLOW_setOrMapLiteral_in_collectionLiteral10904);
					v=setOrMapLiteral(t);
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = v; }
					match(input,221,FOLLOW_221_in_collectionLiteral10909); if (state.failed) return value;
					}
					break;
				case 3 :
					// Parser.g:1470:7: '{' '}'
					{
					match(input,220,FOLLOW_220_in_collectionLiteral10927); if (state.failed) return value;
					match(input,221,FOLLOW_221_in_collectionLiteral10929); if (state.failed) return value;
					if ( state.backtracking==0 ) { value = new Sets.Literal(Collections.<Term.Raw>emptyList()); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "collectionLiteral"



	// $ANTLR start "listLiteral"
	// Parser.g:1473:1: listLiteral returns [Term.Raw value] : '[' (t1= term ( ',' tn= term )* )? ']' ;
	public final Term.Raw listLiteral() throws RecognitionException {
		Term.Raw value = null;


		Term.Raw t1 =null;
		Term.Raw tn =null;

		List<Term.Raw> l = new ArrayList<Term.Raw>();
		try {
			// Parser.g:1476:5: ( '[' (t1= term ( ',' tn= term )* )? ']' )
			// Parser.g:1476:7: '[' (t1= term ( ',' tn= term )* )? ']'
			{
			match(input,216,FOLLOW_216_in_listLiteral10970); if (state.failed) return value;
			// Parser.g:1476:11: (t1= term ( ',' tn= term )* )?
			int alt197=2;
			int LA197_0 = input.LA(1);
			if ( (LA197_0==BOOLEAN||LA197_0==DURATION||LA197_0==FLOAT||LA197_0==HEXNUMBER||(LA197_0 >= IDENT && LA197_0 <= INTEGER)||LA197_0==K_ACCESS||(LA197_0 >= K_AGGREGATE && LA197_0 <= K_ALL)||LA197_0==K_AS||LA197_0==K_ASCII||(LA197_0 >= K_BIGINT && LA197_0 <= K_BOOLEAN)||(LA197_0 >= K_CALLED && LA197_0 <= K_CLUSTERING)||(LA197_0 >= K_COMPACT && LA197_0 <= K_COUNTER)||(LA197_0 >= K_CUSTOM && LA197_0 <= K_DEFAULT)||(LA197_0 >= K_DISTINCT && LA197_0 <= K_DOUBLE)||LA197_0==K_DURATION||(LA197_0 >= K_EXISTS && LA197_0 <= K_FLOAT)||LA197_0==K_FROZEN||(LA197_0 >= K_FUNCTION && LA197_0 <= K_FUNCTIONS)||LA197_0==K_GROUP||(LA197_0 >= K_INET && LA197_0 <= K_INPUT)||(LA197_0 >= K_INT && LA197_0 <= K_INTERNALS)||(LA197_0 >= K_JSON && LA197_0 <= K_KEYS)||(LA197_0 >= K_KEYSPACES && LA197_0 <= K_LIKE)||(LA197_0 >= K_LIST && LA197_0 <= K_MAP)||(LA197_0 >= K_MBEAN && LA197_0 <= K_MBEANS)||(LA197_0 >= K_NEGATIVE_INFINITY && LA197_0 <= K_NOLOGIN)||LA197_0==K_NOSUPERUSER||LA197_0==K_NULL||(LA197_0 >= K_ONLY && LA197_0 <= K_OPTIONS)||(LA197_0 >= K_PARTITION && LA197_0 <= K_POSITIVE_NAN)||(LA197_0 >= K_REPLACE && LA197_0 <= K_RETURNS)||(LA197_0 >= K_ROLE && LA197_0 <= K_ROLES)||(LA197_0 >= K_SFUNC && LA197_0 <= K_TINYINT)||(LA197_0 >= K_TOKEN && LA197_0 <= K_TRIGGER)||(LA197_0 >= K_TTL && LA197_0 <= K_TYPES)||LA197_0==K_UNSET||(LA197_0 >= K_USER && LA197_0 <= K_USERS)||(LA197_0 >= K_UUID && LA197_0 <= K_VARINT)||LA197_0==K_WRITETIME||(LA197_0 >= QMARK && LA197_0 <= QUOTED_NAME)||LA197_0==STRING_LITERAL||LA197_0==UUID||LA197_0==200||LA197_0==205||LA197_0==209||LA197_0==216||LA197_0==220) ) {
				alt197=1;
			}
			switch (alt197) {
				case 1 :
					// Parser.g:1476:13: t1= term ( ',' tn= term )*
					{
					pushFollow(FOLLOW_term_in_listLiteral10976);
					t1=term();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { l.add(t1); }
					// Parser.g:1476:36: ( ',' tn= term )*
					loop196:
					while (true) {
						int alt196=2;
						int LA196_0 = input.LA(1);
						if ( (LA196_0==204) ) {
							alt196=1;
						}

						switch (alt196) {
						case 1 :
							// Parser.g:1476:38: ',' tn= term
							{
							match(input,204,FOLLOW_204_in_listLiteral10982); if (state.failed) return value;
							pushFollow(FOLLOW_term_in_listLiteral10986);
							tn=term();
							state._fsp--;
							if (state.failed) return value;
							if ( state.backtracking==0 ) { l.add(tn); }
							}
							break;

						default :
							break loop196;
						}
					}

					}
					break;

			}

			match(input,218,FOLLOW_218_in_listLiteral10996); if (state.failed) return value;
			if ( state.backtracking==0 ) { value = new Lists.Literal(l); }
			}

			if ( state.backtracking==0 ) {value = new Lists.Literal(l);}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "listLiteral"



	// $ANTLR start "usertypeLiteral"
	// Parser.g:1479:1: usertypeLiteral returns [UserTypes.Literal ut] : '{' k1= fident ':' v1= term ( ',' kn= fident ':' vn= term )* '}' ;
	public final UserTypes.Literal usertypeLiteral() throws RecognitionException {
		UserTypes.Literal ut = null;


		FieldIdentifier k1 =null;
		Term.Raw v1 =null;
		FieldIdentifier kn =null;
		Term.Raw vn =null;

		 Map<FieldIdentifier, Term.Raw> m = new HashMap<>(); 
		try {
			// Parser.g:1483:5: ( '{' k1= fident ':' v1= term ( ',' kn= fident ':' vn= term )* '}' )
			// Parser.g:1483:7: '{' k1= fident ':' v1= term ( ',' kn= fident ':' vn= term )* '}'
			{
			match(input,220,FOLLOW_220_in_usertypeLiteral11040); if (state.failed) return ut;
			pushFollow(FOLLOW_fident_in_usertypeLiteral11044);
			k1=fident();
			state._fsp--;
			if (state.failed) return ut;
			match(input,209,FOLLOW_209_in_usertypeLiteral11046); if (state.failed) return ut;
			pushFollow(FOLLOW_term_in_usertypeLiteral11050);
			v1=term();
			state._fsp--;
			if (state.failed) return ut;
			if ( state.backtracking==0 ) { m.put(k1, v1); }
			// Parser.g:1483:52: ( ',' kn= fident ':' vn= term )*
			loop198:
			while (true) {
				int alt198=2;
				int LA198_0 = input.LA(1);
				if ( (LA198_0==204) ) {
					alt198=1;
				}

				switch (alt198) {
				case 1 :
					// Parser.g:1483:54: ',' kn= fident ':' vn= term
					{
					match(input,204,FOLLOW_204_in_usertypeLiteral11056); if (state.failed) return ut;
					pushFollow(FOLLOW_fident_in_usertypeLiteral11060);
					kn=fident();
					state._fsp--;
					if (state.failed) return ut;
					match(input,209,FOLLOW_209_in_usertypeLiteral11062); if (state.failed) return ut;
					pushFollow(FOLLOW_term_in_usertypeLiteral11066);
					vn=term();
					state._fsp--;
					if (state.failed) return ut;
					if ( state.backtracking==0 ) { m.put(kn, vn); }
					}
					break;

				default :
					break loop198;
				}
			}

			match(input,221,FOLLOW_221_in_usertypeLiteral11073); if (state.failed) return ut;
			}

			if ( state.backtracking==0 ) { ut = new UserTypes.Literal(m); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ut;
	}
	// $ANTLR end "usertypeLiteral"



	// $ANTLR start "tupleLiteral"
	// Parser.g:1486:1: tupleLiteral returns [Tuples.Literal tt] : '(' t1= term ( ',' tn= term )* ')' ;
	public final Tuples.Literal tupleLiteral() throws RecognitionException {
		Tuples.Literal tt = null;


		Term.Raw t1 =null;
		Term.Raw tn =null;

		 List<Term.Raw> l = new ArrayList<Term.Raw>(); 
		try {
			// Parser.g:1489:5: ( '(' t1= term ( ',' tn= term )* ')' )
			// Parser.g:1489:7: '(' t1= term ( ',' tn= term )* ')'
			{
			match(input,200,FOLLOW_200_in_tupleLiteral11110); if (state.failed) return tt;
			pushFollow(FOLLOW_term_in_tupleLiteral11114);
			t1=term();
			state._fsp--;
			if (state.failed) return tt;
			if ( state.backtracking==0 ) { l.add(t1); }
			// Parser.g:1489:34: ( ',' tn= term )*
			loop199:
			while (true) {
				int alt199=2;
				int LA199_0 = input.LA(1);
				if ( (LA199_0==204) ) {
					alt199=1;
				}

				switch (alt199) {
				case 1 :
					// Parser.g:1489:36: ',' tn= term
					{
					match(input,204,FOLLOW_204_in_tupleLiteral11120); if (state.failed) return tt;
					pushFollow(FOLLOW_term_in_tupleLiteral11124);
					tn=term();
					state._fsp--;
					if (state.failed) return tt;
					if ( state.backtracking==0 ) { l.add(tn); }
					}
					break;

				default :
					break loop199;
				}
			}

			match(input,201,FOLLOW_201_in_tupleLiteral11131); if (state.failed) return tt;
			}

			if ( state.backtracking==0 ) { tt = new Tuples.Literal(l); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return tt;
	}
	// $ANTLR end "tupleLiteral"



	// $ANTLR start "value"
	// Parser.g:1492:1: value returns [Term.Raw value] : (c= constant |l= collectionLiteral |u= usertypeLiteral |t= tupleLiteral | K_NULL | ':' id= noncol_ident | QMARK );
	public final Term.Raw value() throws RecognitionException {
		Term.Raw value = null;


		Constants.Literal c =null;
		Term.Raw l =null;
		UserTypes.Literal u =null;
		Tuples.Literal t =null;
		ColumnIdentifier id =null;

		try {
			// Parser.g:1493:5: (c= constant |l= collectionLiteral |u= usertypeLiteral |t= tupleLiteral | K_NULL | ':' id= noncol_ident | QMARK )
			int alt200=7;
			alt200 = dfa200.predict(input);
			switch (alt200) {
				case 1 :
					// Parser.g:1493:7: c= constant
					{
					pushFollow(FOLLOW_constant_in_value11154);
					c=constant();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = c; }
					}
					break;
				case 2 :
					// Parser.g:1494:7: l= collectionLiteral
					{
					pushFollow(FOLLOW_collectionLiteral_in_value11176);
					l=collectionLiteral();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = l; }
					}
					break;
				case 3 :
					// Parser.g:1495:7: u= usertypeLiteral
					{
					pushFollow(FOLLOW_usertypeLiteral_in_value11189);
					u=usertypeLiteral();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = u; }
					}
					break;
				case 4 :
					// Parser.g:1496:7: t= tupleLiteral
					{
					pushFollow(FOLLOW_tupleLiteral_in_value11204);
					t=tupleLiteral();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = t; }
					}
					break;
				case 5 :
					// Parser.g:1497:7: K_NULL
					{
					match(input,K_NULL,FOLLOW_K_NULL_in_value11220); if (state.failed) return value;
					if ( state.backtracking==0 ) { value = Constants.NULL_LITERAL; }
					}
					break;
				case 6 :
					// Parser.g:1498:7: ':' id= noncol_ident
					{
					match(input,209,FOLLOW_209_in_value11244); if (state.failed) return value;
					pushFollow(FOLLOW_noncol_ident_in_value11248);
					id=noncol_ident();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = newBindVariables(id); }
					}
					break;
				case 7 :
					// Parser.g:1499:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_value11259); if (state.failed) return value;
					if ( state.backtracking==0 ) { value = newBindVariables(null); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "value"



	// $ANTLR start "intValue"
	// Parser.g:1502:1: intValue returns [Term.Raw value] : (t= INTEGER | ':' id= noncol_ident | QMARK );
	public final Term.Raw intValue() throws RecognitionException {
		Term.Raw value = null;


		Token t=null;
		ColumnIdentifier id =null;

		try {
			// Parser.g:1503:5: (t= INTEGER | ':' id= noncol_ident | QMARK )
			int alt201=3;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt201=1;
				}
				break;
			case 209:
				{
				alt201=2;
				}
				break;
			case QMARK:
				{
				alt201=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return value;}
				NoViableAltException nvae =
					new NoViableAltException("", 201, 0, input);
				throw nvae;
			}
			switch (alt201) {
				case 1 :
					// Parser.g:1503:7: t= INTEGER
					{
					t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_intValue11299); if (state.failed) return value;
					if ( state.backtracking==0 ) { value = Constants.Literal.integer((t!=null?t.getText():null)); }
					}
					break;
				case 2 :
					// Parser.g:1504:7: ':' id= noncol_ident
					{
					match(input,209,FOLLOW_209_in_intValue11313); if (state.failed) return value;
					pushFollow(FOLLOW_noncol_ident_in_intValue11317);
					id=noncol_ident();
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = newBindVariables(id); }
					}
					break;
				case 3 :
					// Parser.g:1505:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_intValue11328); if (state.failed) return value;
					if ( state.backtracking==0 ) { value = newBindVariables(null); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "intValue"



	// $ANTLR start "functionName"
	// Parser.g:1508:1: functionName returns [FunctionName s] : (ks= keyspaceName '.' )? f= allowedFunctionName ;
	public final FunctionName functionName() throws RecognitionException {
		FunctionName s = null;


		String ks =null;
		String f =null;

		try {
			// Parser.g:1511:5: ( (ks= keyspaceName '.' )? f= allowedFunctionName )
			// Parser.g:1511:7: (ks= keyspaceName '.' )? f= allowedFunctionName
			{
			// Parser.g:1511:7: (ks= keyspaceName '.' )?
			int alt202=2;
			alt202 = dfa202.predict(input);
			switch (alt202) {
				case 1 :
					// Parser.g:1511:8: ks= keyspaceName '.'
					{
					pushFollow(FOLLOW_keyspaceName_in_functionName11374);
					ks=keyspaceName();
					state._fsp--;
					if (state.failed) return s;
					match(input,207,FOLLOW_207_in_functionName11376); if (state.failed) return s;
					}
					break;

			}

			pushFollow(FOLLOW_allowedFunctionName_in_functionName11382);
			f=allowedFunctionName();
			state._fsp--;
			if (state.failed) return s;
			if ( state.backtracking==0 ) { s = f == null ? null : new FunctionName(ks, f); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "functionName"



	// $ANTLR start "allowedFunctionName"
	// Parser.g:1514:1: allowedFunctionName returns [String s] : (f= IDENT |f= QUOTED_NAME |u= unreserved_function_keyword | K_TOKEN | K_COUNT );
	public final String allowedFunctionName() throws RecognitionException {
		String s = null;


		Token f=null;
		String u =null;

		try {
			// Parser.g:1515:5: (f= IDENT |f= QUOTED_NAME |u= unreserved_function_keyword | K_TOKEN | K_COUNT )
			int alt203=5;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt203=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt203=2;
				}
				break;
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CLUSTER:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DATE:
			case K_DECIMAL:
			case K_DEFAULT:
			case K_DOUBLE:
			case K_DURATION:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_INTERNALS:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
				{
				alt203=3;
				}
				break;
			case K_TOKEN:
				{
				alt203=4;
				}
				break;
			case K_COUNT:
				{
				alt203=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return s;}
				NoViableAltException nvae =
					new NoViableAltException("", 203, 0, input);
				throw nvae;
			}
			switch (alt203) {
				case 1 :
					// Parser.g:1515:7: f= IDENT
					{
					f=(Token)match(input,IDENT,FOLLOW_IDENT_in_allowedFunctionName11409); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = (f!=null?f.getText():null).toLowerCase(); }
					}
					break;
				case 2 :
					// Parser.g:1516:7: f= QUOTED_NAME
					{
					f=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_allowedFunctionName11443); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = (f!=null?f.getText():null); }
					}
					break;
				case 3 :
					// Parser.g:1517:7: u= unreserved_function_keyword
					{
					pushFollow(FOLLOW_unreserved_function_keyword_in_allowedFunctionName11471);
					u=unreserved_function_keyword();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = u; }
					}
					break;
				case 4 :
					// Parser.g:1518:7: K_TOKEN
					{
					match(input,K_TOKEN,FOLLOW_K_TOKEN_in_allowedFunctionName11481); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = "token"; }
					}
					break;
				case 5 :
					// Parser.g:1519:7: K_COUNT
					{
					match(input,K_COUNT,FOLLOW_K_COUNT_in_allowedFunctionName11513); if (state.failed) return s;
					if ( state.backtracking==0 ) { s = "count"; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "allowedFunctionName"



	// $ANTLR start "function"
	// Parser.g:1522:1: function returns [Term.Raw t] : (f= functionName '(' ')' |f= functionName '(' args= functionArgs ')' );
	public final Term.Raw function() throws RecognitionException {
		Term.Raw t = null;


		FunctionName f =null;
		List<Term.Raw> args =null;

		try {
			// Parser.g:1523:5: (f= functionName '(' ')' |f= functionName '(' args= functionArgs ')' )
			int alt204=2;
			alt204 = dfa204.predict(input);
			switch (alt204) {
				case 1 :
					// Parser.g:1523:7: f= functionName '(' ')'
					{
					pushFollow(FOLLOW_functionName_in_function11560);
					f=functionName();
					state._fsp--;
					if (state.failed) return t;
					match(input,200,FOLLOW_200_in_function11562); if (state.failed) return t;
					match(input,201,FOLLOW_201_in_function11564); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = new FunctionCall.Raw(f, Collections.<Term.Raw>emptyList()); }
					}
					break;
				case 2 :
					// Parser.g:1524:7: f= functionName '(' args= functionArgs ')'
					{
					pushFollow(FOLLOW_functionName_in_function11594);
					f=functionName();
					state._fsp--;
					if (state.failed) return t;
					match(input,200,FOLLOW_200_in_function11596); if (state.failed) return t;
					pushFollow(FOLLOW_functionArgs_in_function11600);
					args=functionArgs();
					state._fsp--;
					if (state.failed) return t;
					match(input,201,FOLLOW_201_in_function11602); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = new FunctionCall.Raw(f, args); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "function"



	// $ANTLR start "functionArgs"
	// Parser.g:1527:1: functionArgs returns [List<Term.Raw> args] : t1= term ( ',' tn= term )* ;
	public final List<Term.Raw> functionArgs() throws RecognitionException {
		List<Term.Raw> args = null;


		Term.Raw t1 =null;
		Term.Raw tn =null;

		 args = new ArrayList<Term.Raw>(); 
		try {
			// Parser.g:1529:5: (t1= term ( ',' tn= term )* )
			// Parser.g:1529:7: t1= term ( ',' tn= term )*
			{
			pushFollow(FOLLOW_term_in_functionArgs11635);
			t1=term();
			state._fsp--;
			if (state.failed) return args;
			if ( state.backtracking==0 ) {args.add(t1); }
			// Parser.g:1529:32: ( ',' tn= term )*
			loop205:
			while (true) {
				int alt205=2;
				int LA205_0 = input.LA(1);
				if ( (LA205_0==204) ) {
					alt205=1;
				}

				switch (alt205) {
				case 1 :
					// Parser.g:1529:34: ',' tn= term
					{
					match(input,204,FOLLOW_204_in_functionArgs11641); if (state.failed) return args;
					pushFollow(FOLLOW_term_in_functionArgs11645);
					tn=term();
					state._fsp--;
					if (state.failed) return args;
					if ( state.backtracking==0 ) { args.add(tn); }
					}
					break;

				default :
					break loop205;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return args;
	}
	// $ANTLR end "functionArgs"



	// $ANTLR start "term"
	// Parser.g:1532:1: term returns [Term.Raw term] : t= termAddition ;
	public final Term.Raw term() throws RecognitionException {
		Term.Raw term = null;


		Term.Raw t =null;

		try {
			// Parser.g:1533:5: (t= termAddition )
			// Parser.g:1533:7: t= termAddition
			{
			pushFollow(FOLLOW_termAddition_in_term11673);
			t=termAddition();
			state._fsp--;
			if (state.failed) return term;
			if ( state.backtracking==0 ) { term = t; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return term;
	}
	// $ANTLR end "term"



	// $ANTLR start "termAddition"
	// Parser.g:1536:1: termAddition returns [Term.Raw term] : l= termMultiplication ( '+' r= termMultiplication | '-' r= termMultiplication )* ;
	public final Term.Raw termAddition() throws RecognitionException {
		Term.Raw term = null;


		Term.Raw l =null;
		Term.Raw r =null;

		try {
			// Parser.g:1537:5: (l= termMultiplication ( '+' r= termMultiplication | '-' r= termMultiplication )* )
			// Parser.g:1537:9: l= termMultiplication ( '+' r= termMultiplication | '-' r= termMultiplication )*
			{
			pushFollow(FOLLOW_termMultiplication_in_termAddition11725);
			l=termMultiplication();
			state._fsp--;
			if (state.failed) return term;
			if ( state.backtracking==0 ) {term = l;}
			// Parser.g:1538:9: ( '+' r= termMultiplication | '-' r= termMultiplication )*
			loop206:
			while (true) {
				int alt206=3;
				alt206 = dfa206.predict(input);
				switch (alt206) {
				case 1 :
					// Parser.g:1538:11: '+' r= termMultiplication
					{
					match(input,202,FOLLOW_202_in_termAddition11741); if (state.failed) return term;
					pushFollow(FOLLOW_termMultiplication_in_termAddition11745);
					r=termMultiplication();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) {term = FunctionCall.Raw.newOperation('+', term, r);}
					}
					break;
				case 2 :
					// Parser.g:1539:11: '-' r= termMultiplication
					{
					match(input,205,FOLLOW_205_in_termAddition11759); if (state.failed) return term;
					pushFollow(FOLLOW_termMultiplication_in_termAddition11763);
					r=termMultiplication();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) {term = FunctionCall.Raw.newOperation('-', term, r);}
					}
					break;

				default :
					break loop206;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return term;
	}
	// $ANTLR end "termAddition"



	// $ANTLR start "termMultiplication"
	// Parser.g:1543:1: termMultiplication returns [Term.Raw term] : l= termGroup ( '\\*' r= termGroup | '/' r= termGroup | '%' r= termGroup )* ;
	public final Term.Raw termMultiplication() throws RecognitionException {
		Term.Raw term = null;


		Term.Raw l =null;
		Term.Raw r =null;

		try {
			// Parser.g:1544:5: (l= termGroup ( '\\*' r= termGroup | '/' r= termGroup | '%' r= termGroup )* )
			// Parser.g:1544:9: l= termGroup ( '\\*' r= termGroup | '/' r= termGroup | '%' r= termGroup )*
			{
			pushFollow(FOLLOW_termGroup_in_termMultiplication11801);
			l=termGroup();
			state._fsp--;
			if (state.failed) return term;
			if ( state.backtracking==0 ) {term = l;}
			// Parser.g:1545:9: ( '\\*' r= termGroup | '/' r= termGroup | '%' r= termGroup )*
			loop207:
			while (true) {
				int alt207=4;
				switch ( input.LA(1) ) {
				case 217:
					{
					alt207=1;
					}
					break;
				case 208:
					{
					alt207=2;
					}
					break;
				case 199:
					{
					alt207=3;
					}
					break;
				}
				switch (alt207) {
				case 1 :
					// Parser.g:1545:11: '\\*' r= termGroup
					{
					match(input,217,FOLLOW_217_in_termMultiplication11817); if (state.failed) return term;
					pushFollow(FOLLOW_termGroup_in_termMultiplication11821);
					r=termGroup();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) {term = FunctionCall.Raw.newOperation('*', term, r);}
					}
					break;
				case 2 :
					// Parser.g:1546:11: '/' r= termGroup
					{
					match(input,208,FOLLOW_208_in_termMultiplication11835); if (state.failed) return term;
					pushFollow(FOLLOW_termGroup_in_termMultiplication11839);
					r=termGroup();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) {term = FunctionCall.Raw.newOperation('/', term, r);}
					}
					break;
				case 3 :
					// Parser.g:1547:11: '%' r= termGroup
					{
					match(input,199,FOLLOW_199_in_termMultiplication11853); if (state.failed) return term;
					pushFollow(FOLLOW_termGroup_in_termMultiplication11857);
					r=termGroup();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) {term = FunctionCall.Raw.newOperation('%', term, r);}
					}
					break;

				default :
					break loop207;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return term;
	}
	// $ANTLR end "termMultiplication"



	// $ANTLR start "termGroup"
	// Parser.g:1551:1: termGroup returns [Term.Raw term] : (t= simpleTerm | '-' t= simpleTerm );
	public final Term.Raw termGroup() throws RecognitionException {
		Term.Raw term = null;


		Term.Raw t =null;

		try {
			// Parser.g:1552:5: (t= simpleTerm | '-' t= simpleTerm )
			int alt208=2;
			int LA208_0 = input.LA(1);
			if ( (LA208_0==BOOLEAN||LA208_0==DURATION||LA208_0==FLOAT||LA208_0==HEXNUMBER||(LA208_0 >= IDENT && LA208_0 <= INTEGER)||LA208_0==K_ACCESS||(LA208_0 >= K_AGGREGATE && LA208_0 <= K_ALL)||LA208_0==K_AS||LA208_0==K_ASCII||(LA208_0 >= K_BIGINT && LA208_0 <= K_BOOLEAN)||(LA208_0 >= K_CALLED && LA208_0 <= K_CLUSTERING)||(LA208_0 >= K_COMPACT && LA208_0 <= K_COUNTER)||(LA208_0 >= K_CUSTOM && LA208_0 <= K_DEFAULT)||(LA208_0 >= K_DISTINCT && LA208_0 <= K_DOUBLE)||LA208_0==K_DURATION||(LA208_0 >= K_EXISTS && LA208_0 <= K_FLOAT)||LA208_0==K_FROZEN||(LA208_0 >= K_FUNCTION && LA208_0 <= K_FUNCTIONS)||LA208_0==K_GROUP||(LA208_0 >= K_INET && LA208_0 <= K_INPUT)||(LA208_0 >= K_INT && LA208_0 <= K_INTERNALS)||(LA208_0 >= K_JSON && LA208_0 <= K_KEYS)||(LA208_0 >= K_KEYSPACES && LA208_0 <= K_LIKE)||(LA208_0 >= K_LIST && LA208_0 <= K_MAP)||(LA208_0 >= K_MBEAN && LA208_0 <= K_MBEANS)||(LA208_0 >= K_NEGATIVE_INFINITY && LA208_0 <= K_NOLOGIN)||LA208_0==K_NOSUPERUSER||LA208_0==K_NULL||(LA208_0 >= K_ONLY && LA208_0 <= K_OPTIONS)||(LA208_0 >= K_PARTITION && LA208_0 <= K_POSITIVE_NAN)||(LA208_0 >= K_REPLACE && LA208_0 <= K_RETURNS)||(LA208_0 >= K_ROLE && LA208_0 <= K_ROLES)||(LA208_0 >= K_SFUNC && LA208_0 <= K_TINYINT)||(LA208_0 >= K_TOKEN && LA208_0 <= K_TRIGGER)||(LA208_0 >= K_TTL && LA208_0 <= K_TYPES)||LA208_0==K_UNSET||(LA208_0 >= K_USER && LA208_0 <= K_USERS)||(LA208_0 >= K_UUID && LA208_0 <= K_VARINT)||LA208_0==K_WRITETIME||(LA208_0 >= QMARK && LA208_0 <= QUOTED_NAME)||LA208_0==STRING_LITERAL||LA208_0==UUID||LA208_0==200||LA208_0==209||LA208_0==216||LA208_0==220) ) {
				alt208=1;
			}
			else if ( (LA208_0==205) ) {
				alt208=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return term;}
				NoViableAltException nvae =
					new NoViableAltException("", 208, 0, input);
				throw nvae;
			}

			switch (alt208) {
				case 1 :
					// Parser.g:1552:7: t= simpleTerm
					{
					pushFollow(FOLLOW_simpleTerm_in_termGroup11893);
					t=simpleTerm();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) { term = t; }
					}
					break;
				case 2 :
					// Parser.g:1553:7: '-' t= simpleTerm
					{
					match(input,205,FOLLOW_205_in_termGroup11916); if (state.failed) return term;
					pushFollow(FOLLOW_simpleTerm_in_termGroup11921);
					t=simpleTerm();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) { term = FunctionCall.Raw.newNegation(t); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return term;
	}
	// $ANTLR end "termGroup"



	// $ANTLR start "simpleTerm"
	// Parser.g:1556:1: simpleTerm returns [Term.Raw term] : (v= value |f= function | '(' c= comparatorType ')' t= simpleTerm );
	public final Term.Raw simpleTerm() throws RecognitionException {
		Term.Raw term = null;


		Term.Raw v =null;
		Term.Raw f =null;
		CQL3Type.Raw c =null;
		Term.Raw t =null;

		try {
			// Parser.g:1557:5: (v= value |f= function | '(' c= comparatorType ')' t= simpleTerm )
			int alt209=3;
			alt209 = dfa209.predict(input);
			switch (alt209) {
				case 1 :
					// Parser.g:1557:7: v= value
					{
					pushFollow(FOLLOW_value_in_simpleTerm11954);
					v=value();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) { term = v; }
					}
					break;
				case 2 :
					// Parser.g:1558:7: f= function
					{
					pushFollow(FOLLOW_function_in_simpleTerm11998);
					f=function();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) { term = f; }
					}
					break;
				case 3 :
					// Parser.g:1559:7: '(' c= comparatorType ')' t= simpleTerm
					{
					match(input,200,FOLLOW_200_in_simpleTerm12037); if (state.failed) return term;
					pushFollow(FOLLOW_comparatorType_in_simpleTerm12041);
					c=comparatorType();
					state._fsp--;
					if (state.failed) return term;
					match(input,201,FOLLOW_201_in_simpleTerm12043); if (state.failed) return term;
					pushFollow(FOLLOW_simpleTerm_in_simpleTerm12047);
					t=simpleTerm();
					state._fsp--;
					if (state.failed) return term;
					if ( state.backtracking==0 ) { term = new TypeCast(c, t); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return term;
	}
	// $ANTLR end "simpleTerm"



	// $ANTLR start "columnOperation"
	// Parser.g:1562:1: columnOperation[List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations] : key= cident columnOperationDifferentiator[operations, key] ;
	public final void columnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations) throws RecognitionException {
		ColumnIdentifier key =null;

		try {
			// Parser.g:1563:5: (key= cident columnOperationDifferentiator[operations, key] )
			// Parser.g:1563:7: key= cident columnOperationDifferentiator[operations, key]
			{
			pushFollow(FOLLOW_cident_in_columnOperation12071);
			key=cident();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_columnOperationDifferentiator_in_columnOperation12073);
			columnOperationDifferentiator(operations, key);
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "columnOperation"



	// $ANTLR start "columnOperationDifferentiator"
	// Parser.g:1566:1: columnOperationDifferentiator[List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key] : ( '=' normalColumnOperation[operations, key] | shorthandColumnOperation[operations, key] | '[' k= term ']' collectionColumnOperation[operations, key, k] | '.' field= fident udtColumnOperation[operations, key, field] );
	public final void columnOperationDifferentiator(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key) throws RecognitionException {
		Term.Raw k =null;
		FieldIdentifier field =null;

		try {
			// Parser.g:1567:5: ( '=' normalColumnOperation[operations, key] | shorthandColumnOperation[operations, key] | '[' k= term ']' collectionColumnOperation[operations, key, k] | '.' field= fident udtColumnOperation[operations, key, field] )
			int alt210=4;
			switch ( input.LA(1) ) {
			case 213:
				{
				alt210=1;
				}
				break;
			case 203:
			case 206:
				{
				alt210=2;
				}
				break;
			case 216:
				{
				alt210=3;
				}
				break;
			case 207:
				{
				alt210=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 210, 0, input);
				throw nvae;
			}
			switch (alt210) {
				case 1 :
					// Parser.g:1567:7: '=' normalColumnOperation[operations, key]
					{
					match(input,213,FOLLOW_213_in_columnOperationDifferentiator12092); if (state.failed) return;
					pushFollow(FOLLOW_normalColumnOperation_in_columnOperationDifferentiator12094);
					normalColumnOperation(operations, key);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Parser.g:1568:7: shorthandColumnOperation[operations, key]
					{
					pushFollow(FOLLOW_shorthandColumnOperation_in_columnOperationDifferentiator12103);
					shorthandColumnOperation(operations, key);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Parser.g:1569:7: '[' k= term ']' collectionColumnOperation[operations, key, k]
					{
					match(input,216,FOLLOW_216_in_columnOperationDifferentiator12112); if (state.failed) return;
					pushFollow(FOLLOW_term_in_columnOperationDifferentiator12116);
					k=term();
					state._fsp--;
					if (state.failed) return;
					match(input,218,FOLLOW_218_in_columnOperationDifferentiator12118); if (state.failed) return;
					pushFollow(FOLLOW_collectionColumnOperation_in_columnOperationDifferentiator12120);
					collectionColumnOperation(operations, key, k);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Parser.g:1570:7: '.' field= fident udtColumnOperation[operations, key, field]
					{
					match(input,207,FOLLOW_207_in_columnOperationDifferentiator12129); if (state.failed) return;
					pushFollow(FOLLOW_fident_in_columnOperationDifferentiator12133);
					field=fident();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_udtColumnOperation_in_columnOperationDifferentiator12135);
					udtColumnOperation(operations, key, field);
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "columnOperationDifferentiator"



	// $ANTLR start "normalColumnOperation"
	// Parser.g:1573:1: normalColumnOperation[List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key] : (t= term ( '+' c= cident )? |c= cident sig= ( '+' | '-' ) t= term |c= cident i= INTEGER );
	public final void normalColumnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key) throws RecognitionException {
		Token sig=null;
		Token i=null;
		Term.Raw t =null;
		ColumnIdentifier c =null;

		try {
			// Parser.g:1574:5: (t= term ( '+' c= cident )? |c= cident sig= ( '+' | '-' ) t= term |c= cident i= INTEGER )
			int alt212=3;
			alt212 = dfa212.predict(input);
			switch (alt212) {
				case 1 :
					// Parser.g:1574:7: t= term ( '+' c= cident )?
					{
					pushFollow(FOLLOW_term_in_normalColumnOperation12156);
					t=term();
					state._fsp--;
					if (state.failed) return;
					// Parser.g:1574:14: ( '+' c= cident )?
					int alt211=2;
					int LA211_0 = input.LA(1);
					if ( (LA211_0==202) ) {
						alt211=1;
					}
					switch (alt211) {
						case 1 :
							// Parser.g:1574:15: '+' c= cident
							{
							match(input,202,FOLLOW_202_in_normalColumnOperation12159); if (state.failed) return;
							pushFollow(FOLLOW_cident_in_normalColumnOperation12163);
							c=cident();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					if ( state.backtracking==0 ) {
					          if (c == null)
					          {
					              addRawUpdate(operations, key, new Operation.SetValue(t));
					          }
					          else
					          {
					              if (!key.equals(c))
					                  addRecognitionError("Only expressions of the form X = <value> + X are supported.");
					              addRawUpdate(operations, key, new Operation.Prepend(t));
					          }
					      }
					}
					break;
				case 2 :
					// Parser.g:1587:7: c= cident sig= ( '+' | '-' ) t= term
					{
					pushFollow(FOLLOW_cident_in_normalColumnOperation12184);
					c=cident();
					state._fsp--;
					if (state.failed) return;
					sig=input.LT(1);
					if ( input.LA(1)==202||input.LA(1)==205 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_term_in_normalColumnOperation12198);
					t=term();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					          if (!key.equals(c))
					              addRecognitionError("Only expressions of the form X = X " + (sig!=null?sig.getText():null) + "<value> are supported.");
					          addRawUpdate(operations, key, (sig!=null?sig.getText():null).equals("+") ? new Operation.Addition(t) : new Operation.Substraction(t));
					      }
					}
					break;
				case 3 :
					// Parser.g:1593:7: c= cident i= INTEGER
					{
					pushFollow(FOLLOW_cident_in_normalColumnOperation12216);
					c=cident();
					state._fsp--;
					if (state.failed) return;
					i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_normalColumnOperation12220); if (state.failed) return;
					if ( state.backtracking==0 ) {
					          // Note that this production *is* necessary because X = X - 3 will in fact be lexed as [ X, '=', X, INTEGER].
					          if (!key.equals(c))
					              // We don't yet allow a '+' in front of an integer, but we could in the future really, so let's be future-proof in our error message
					              addRecognitionError("Only expressions of the form X = X " + ((i!=null?i.getText():null).charAt(0) == '-' ? '-' : '+') + " <value> are supported.");
					          addRawUpdate(operations, key, new Operation.Addition(Constants.Literal.integer((i!=null?i.getText():null))));
					      }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "normalColumnOperation"



	// $ANTLR start "shorthandColumnOperation"
	// Parser.g:1603:1: shorthandColumnOperation[List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key] : sig= ( '+=' | '-=' ) t= term ;
	public final void shorthandColumnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key) throws RecognitionException {
		Token sig=null;
		Term.Raw t =null;

		try {
			// Parser.g:1604:5: (sig= ( '+=' | '-=' ) t= term )
			// Parser.g:1604:7: sig= ( '+=' | '-=' ) t= term
			{
			sig=input.LT(1);
			if ( input.LA(1)==203||input.LA(1)==206 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_term_in_shorthandColumnOperation12258);
			t=term();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			          addRawUpdate(operations, key, (sig!=null?sig.getText():null).equals("+=") ? new Operation.Addition(t) : new Operation.Substraction(t));
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "shorthandColumnOperation"



	// $ANTLR start "collectionColumnOperation"
	// Parser.g:1610:1: collectionColumnOperation[List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key, Term.Raw k] : '=' t= term ;
	public final void collectionColumnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key, Term.Raw k) throws RecognitionException {
		Term.Raw t =null;

		try {
			// Parser.g:1611:5: ( '=' t= term )
			// Parser.g:1611:7: '=' t= term
			{
			match(input,213,FOLLOW_213_in_collectionColumnOperation12284); if (state.failed) return;
			pushFollow(FOLLOW_term_in_collectionColumnOperation12288);
			t=term();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			          addRawUpdate(operations, key, new Operation.SetElement(k, t));
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "collectionColumnOperation"



	// $ANTLR start "udtColumnOperation"
	// Parser.g:1617:1: udtColumnOperation[List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key, FieldIdentifier field] : '=' t= term ;
	public final void udtColumnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key, FieldIdentifier field) throws RecognitionException {
		Term.Raw t =null;

		try {
			// Parser.g:1618:5: ( '=' t= term )
			// Parser.g:1618:7: '=' t= term
			{
			match(input,213,FOLLOW_213_in_udtColumnOperation12314); if (state.failed) return;
			pushFollow(FOLLOW_term_in_udtColumnOperation12318);
			t=term();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			          addRawUpdate(operations, key, new Operation.SetField(field, t));
			      }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "udtColumnOperation"



	// $ANTLR start "columnCondition"
	// Parser.g:1624:1: columnCondition[List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions] : key= cident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) | '.' field= fident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) ) ;
	public final void columnCondition(List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions) throws RecognitionException {
		ColumnIdentifier key =null;
		Operator op =null;
		Term.Raw t =null;
		List<Term.Raw> values =null;
		AbstractMarker.INRaw marker =null;
		Term.Raw element =null;
		FieldIdentifier field =null;

		try {
			// Parser.g:1626:5: (key= cident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) | '.' field= fident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) ) )
			// Parser.g:1626:7: key= cident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) | '.' field= fident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) )
			{
			pushFollow(FOLLOW_cident_in_columnCondition12351);
			key=cident();
			state._fsp--;
			if (state.failed) return;
			// Parser.g:1627:9: (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) | '.' field= fident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) )
			int alt218=4;
			switch ( input.LA(1) ) {
			case 198:
			case 211:
			case 212:
			case 213:
			case 214:
			case 215:
				{
				alt218=1;
				}
				break;
			case K_IN:
				{
				alt218=2;
				}
				break;
			case 216:
				{
				alt218=3;
				}
				break;
			case 207:
				{
				alt218=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 218, 0, input);
				throw nvae;
			}
			switch (alt218) {
				case 1 :
					// Parser.g:1627:11: op= relationType t= term
					{
					pushFollow(FOLLOW_relationType_in_columnCondition12365);
					op=relationType();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_term_in_columnCondition12369);
					t=term();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.simpleCondition(t, op))); }
					}
					break;
				case 2 :
					// Parser.g:1628:11: K_IN (values= singleColumnInValues |marker= inMarker )
					{
					match(input,K_IN,FOLLOW_K_IN_in_columnCondition12383); if (state.failed) return;
					// Parser.g:1629:13: (values= singleColumnInValues |marker= inMarker )
					int alt213=2;
					int LA213_0 = input.LA(1);
					if ( (LA213_0==200) ) {
						alt213=1;
					}
					else if ( (LA213_0==QMARK||LA213_0==209) ) {
						alt213=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 213, 0, input);
						throw nvae;
					}

					switch (alt213) {
						case 1 :
							// Parser.g:1629:15: values= singleColumnInValues
							{
							pushFollow(FOLLOW_singleColumnInValues_in_columnCondition12401);
							values=singleColumnInValues();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.simpleInCondition(values))); }
							}
							break;
						case 2 :
							// Parser.g:1630:15: marker= inMarker
							{
							pushFollow(FOLLOW_inMarker_in_columnCondition12421);
							marker=inMarker();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.simpleInCondition(marker))); }
							}
							break;

					}

					}
					break;
				case 3 :
					// Parser.g:1632:11: '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) )
					{
					match(input,216,FOLLOW_216_in_columnCondition12449); if (state.failed) return;
					pushFollow(FOLLOW_term_in_columnCondition12453);
					element=term();
					state._fsp--;
					if (state.failed) return;
					match(input,218,FOLLOW_218_in_columnCondition12455); if (state.failed) return;
					// Parser.g:1633:13: (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) )
					int alt215=2;
					int LA215_0 = input.LA(1);
					if ( (LA215_0==198||(LA215_0 >= 211 && LA215_0 <= 215)) ) {
						alt215=1;
					}
					else if ( (LA215_0==K_IN) ) {
						alt215=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 215, 0, input);
						throw nvae;
					}

					switch (alt215) {
						case 1 :
							// Parser.g:1633:15: op= relationType t= term
							{
							pushFollow(FOLLOW_relationType_in_columnCondition12473);
							op=relationType();
							state._fsp--;
							if (state.failed) return;
							pushFollow(FOLLOW_term_in_columnCondition12477);
							t=term();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.collectionCondition(t, element, op))); }
							}
							break;
						case 2 :
							// Parser.g:1634:15: K_IN (values= singleColumnInValues |marker= inMarker )
							{
							match(input,K_IN,FOLLOW_K_IN_in_columnCondition12495); if (state.failed) return;
							// Parser.g:1635:17: (values= singleColumnInValues |marker= inMarker )
							int alt214=2;
							int LA214_0 = input.LA(1);
							if ( (LA214_0==200) ) {
								alt214=1;
							}
							else if ( (LA214_0==QMARK||LA214_0==209) ) {
								alt214=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								NoViableAltException nvae =
									new NoViableAltException("", 214, 0, input);
								throw nvae;
							}

							switch (alt214) {
								case 1 :
									// Parser.g:1635:19: values= singleColumnInValues
									{
									pushFollow(FOLLOW_singleColumnInValues_in_columnCondition12517);
									values=singleColumnInValues();
									state._fsp--;
									if (state.failed) return;
									if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.collectionInCondition(element, values))); }
									}
									break;
								case 2 :
									// Parser.g:1636:19: marker= inMarker
									{
									pushFollow(FOLLOW_inMarker_in_columnCondition12541);
									marker=inMarker();
									state._fsp--;
									if (state.failed) return;
									if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.collectionInCondition(element, marker))); }
									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 4 :
					// Parser.g:1639:11: '.' field= fident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) )
					{
					match(input,207,FOLLOW_207_in_columnCondition12587); if (state.failed) return;
					pushFollow(FOLLOW_fident_in_columnCondition12591);
					field=fident();
					state._fsp--;
					if (state.failed) return;
					// Parser.g:1640:13: (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) )
					int alt217=2;
					int LA217_0 = input.LA(1);
					if ( (LA217_0==198||(LA217_0 >= 211 && LA217_0 <= 215)) ) {
						alt217=1;
					}
					else if ( (LA217_0==K_IN) ) {
						alt217=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 217, 0, input);
						throw nvae;
					}

					switch (alt217) {
						case 1 :
							// Parser.g:1640:15: op= relationType t= term
							{
							pushFollow(FOLLOW_relationType_in_columnCondition12609);
							op=relationType();
							state._fsp--;
							if (state.failed) return;
							pushFollow(FOLLOW_term_in_columnCondition12613);
							t=term();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.udtFieldCondition(t, field, op))); }
							}
							break;
						case 2 :
							// Parser.g:1641:15: K_IN (values= singleColumnInValues |marker= inMarker )
							{
							match(input,K_IN,FOLLOW_K_IN_in_columnCondition12631); if (state.failed) return;
							// Parser.g:1642:17: (values= singleColumnInValues |marker= inMarker )
							int alt216=2;
							int LA216_0 = input.LA(1);
							if ( (LA216_0==200) ) {
								alt216=1;
							}
							else if ( (LA216_0==QMARK||LA216_0==209) ) {
								alt216=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								NoViableAltException nvae =
									new NoViableAltException("", 216, 0, input);
								throw nvae;
							}

							switch (alt216) {
								case 1 :
									// Parser.g:1642:19: values= singleColumnInValues
									{
									pushFollow(FOLLOW_singleColumnInValues_in_columnCondition12653);
									values=singleColumnInValues();
									state._fsp--;
									if (state.failed) return;
									if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.udtFieldInCondition(field, values))); }
									}
									break;
								case 2 :
									// Parser.g:1643:19: marker= inMarker
									{
									pushFollow(FOLLOW_inMarker_in_columnCondition12677);
									marker=inMarker();
									state._fsp--;
									if (state.failed) return;
									if ( state.backtracking==0 ) { conditions.add(Pair.create(key, ColumnCondition.Raw.udtFieldInCondition(field, marker))); }
									}
									break;

							}

							}
							break;

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "columnCondition"



	// $ANTLR start "properties"
	// Parser.g:1649:1: properties[PropertyDefinitions props] : property[props] ( K_AND property[props] )* ;
	public final void properties(PropertyDefinitions props) throws RecognitionException {
		try {
			// Parser.g:1650:5: ( property[props] ( K_AND property[props] )* )
			// Parser.g:1650:7: property[props] ( K_AND property[props] )*
			{
			pushFollow(FOLLOW_property_in_properties12739);
			property(props);
			state._fsp--;
			if (state.failed) return;
			// Parser.g:1650:23: ( K_AND property[props] )*
			loop219:
			while (true) {
				int alt219=2;
				int LA219_0 = input.LA(1);
				if ( (LA219_0==K_AND) ) {
					alt219=1;
				}

				switch (alt219) {
				case 1 :
					// Parser.g:1650:24: K_AND property[props]
					{
					match(input,K_AND,FOLLOW_K_AND_in_properties12743); if (state.failed) return;
					pushFollow(FOLLOW_property_in_properties12745);
					property(props);
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop219;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "properties"



	// $ANTLR start "property"
	// Parser.g:1653:1: property[PropertyDefinitions props] : (k= noncol_ident '=' simple= propertyValue |k= noncol_ident '=' map= fullMapLiteral );
	public final void property(PropertyDefinitions props) throws RecognitionException {
		ColumnIdentifier k =null;
		String simple =null;
		Maps.Literal map =null;

		try {
			// Parser.g:1654:5: (k= noncol_ident '=' simple= propertyValue |k= noncol_ident '=' map= fullMapLiteral )
			int alt220=2;
			alt220 = dfa220.predict(input);
			switch (alt220) {
				case 1 :
					// Parser.g:1654:7: k= noncol_ident '=' simple= propertyValue
					{
					pushFollow(FOLLOW_noncol_ident_in_property12768);
					k=noncol_ident();
					state._fsp--;
					if (state.failed) return;
					match(input,213,FOLLOW_213_in_property12770); if (state.failed) return;
					pushFollow(FOLLOW_propertyValue_in_property12774);
					simple=propertyValue();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { try { props.addProperty(k.toString(), simple); } catch (SyntaxException e) { addRecognitionError(e.getMessage()); } }
					}
					break;
				case 2 :
					// Parser.g:1655:7: k= noncol_ident '=' map= fullMapLiteral
					{
					pushFollow(FOLLOW_noncol_ident_in_property12786);
					k=noncol_ident();
					state._fsp--;
					if (state.failed) return;
					match(input,213,FOLLOW_213_in_property12788); if (state.failed) return;
					pushFollow(FOLLOW_fullMapLiteral_in_property12792);
					map=fullMapLiteral();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { try { props.addProperty(k.toString(), convertPropertyMap(map)); } catch (SyntaxException e) { addRecognitionError(e.getMessage()); } }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "property"



	// $ANTLR start "propertyValue"
	// Parser.g:1658:1: propertyValue returns [String str] : (c= constant |u= unreserved_keyword );
	public final String propertyValue() throws RecognitionException {
		String str = null;


		Constants.Literal c =null;
		String u =null;

		try {
			// Parser.g:1659:5: (c= constant |u= unreserved_keyword )
			int alt221=2;
			int LA221_0 = input.LA(1);
			if ( (LA221_0==BOOLEAN||LA221_0==DURATION||LA221_0==FLOAT||LA221_0==HEXNUMBER||LA221_0==INTEGER||(LA221_0 >= K_NEGATIVE_INFINITY && LA221_0 <= K_NEGATIVE_NAN)||(LA221_0 >= K_POSITIVE_INFINITY && LA221_0 <= K_POSITIVE_NAN)||LA221_0==STRING_LITERAL||LA221_0==UUID) ) {
				alt221=1;
			}
			else if ( (LA221_0==K_ACCESS||(LA221_0 >= K_AGGREGATE && LA221_0 <= K_ALL)||LA221_0==K_AS||LA221_0==K_ASCII||(LA221_0 >= K_BIGINT && LA221_0 <= K_BOOLEAN)||(LA221_0 >= K_CALLED && LA221_0 <= K_CLUSTERING)||(LA221_0 >= K_COMPACT && LA221_0 <= K_COUNTER)||(LA221_0 >= K_CUSTOM && LA221_0 <= K_DEFAULT)||(LA221_0 >= K_DISTINCT && LA221_0 <= K_DOUBLE)||LA221_0==K_DURATION||(LA221_0 >= K_EXISTS && LA221_0 <= K_FLOAT)||LA221_0==K_FROZEN||(LA221_0 >= K_FUNCTION && LA221_0 <= K_FUNCTIONS)||LA221_0==K_GROUP||(LA221_0 >= K_INET && LA221_0 <= K_INPUT)||(LA221_0 >= K_INT && LA221_0 <= K_INTERNALS)||(LA221_0 >= K_JSON && LA221_0 <= K_KEYS)||(LA221_0 >= K_KEYSPACES && LA221_0 <= K_LIKE)||(LA221_0 >= K_LIST && LA221_0 <= K_MAP)||(LA221_0 >= K_MBEAN && LA221_0 <= K_MBEANS)||LA221_0==K_NOLOGIN||LA221_0==K_NOSUPERUSER||(LA221_0 >= K_ONLY && LA221_0 <= K_OPTIONS)||(LA221_0 >= K_PARTITION && LA221_0 <= K_PERMISSIONS)||(LA221_0 >= K_REPLACE && LA221_0 <= K_RETURNS)||(LA221_0 >= K_ROLE && LA221_0 <= K_ROLES)||(LA221_0 >= K_SFUNC && LA221_0 <= K_TINYINT)||LA221_0==K_TRIGGER||(LA221_0 >= K_TTL && LA221_0 <= K_TYPES)||LA221_0==K_UNSET||(LA221_0 >= K_USER && LA221_0 <= K_USERS)||(LA221_0 >= K_UUID && LA221_0 <= K_VARINT)||LA221_0==K_WRITETIME) ) {
				alt221=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 221, 0, input);
				throw nvae;
			}

			switch (alt221) {
				case 1 :
					// Parser.g:1659:7: c= constant
					{
					pushFollow(FOLLOW_constant_in_propertyValue12817);
					c=constant();
					state._fsp--;
					if (state.failed) return str;
					if ( state.backtracking==0 ) { str = c.getRawText(); }
					}
					break;
				case 2 :
					// Parser.g:1660:7: u= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_propertyValue12839);
					u=unreserved_keyword();
					state._fsp--;
					if (state.failed) return str;
					if ( state.backtracking==0 ) { str = u; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "propertyValue"



	// $ANTLR start "relationType"
	// Parser.g:1663:1: relationType returns [Operator op] : ( '=' | '<' | '<=' | '>' | '>=' | '!=' );
	public final Operator relationType() throws RecognitionException {
		Operator op = null;


		try {
			// Parser.g:1664:5: ( '=' | '<' | '<=' | '>' | '>=' | '!=' )
			int alt222=6;
			switch ( input.LA(1) ) {
			case 213:
				{
				alt222=1;
				}
				break;
			case 211:
				{
				alt222=2;
				}
				break;
			case 212:
				{
				alt222=3;
				}
				break;
			case 214:
				{
				alt222=4;
				}
				break;
			case 215:
				{
				alt222=5;
				}
				break;
			case 198:
				{
				alt222=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return op;}
				NoViableAltException nvae =
					new NoViableAltException("", 222, 0, input);
				throw nvae;
			}
			switch (alt222) {
				case 1 :
					// Parser.g:1664:7: '='
					{
					match(input,213,FOLLOW_213_in_relationType12862); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = Operator.EQ; }
					}
					break;
				case 2 :
					// Parser.g:1665:7: '<'
					{
					match(input,211,FOLLOW_211_in_relationType12873); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = Operator.LT; }
					}
					break;
				case 3 :
					// Parser.g:1666:7: '<='
					{
					match(input,212,FOLLOW_212_in_relationType12884); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = Operator.LTE; }
					}
					break;
				case 4 :
					// Parser.g:1667:7: '>'
					{
					match(input,214,FOLLOW_214_in_relationType12894); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = Operator.GT; }
					}
					break;
				case 5 :
					// Parser.g:1668:7: '>='
					{
					match(input,215,FOLLOW_215_in_relationType12905); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = Operator.GTE; }
					}
					break;
				case 6 :
					// Parser.g:1669:7: '!='
					{
					match(input,198,FOLLOW_198_in_relationType12915); if (state.failed) return op;
					if ( state.backtracking==0 ) { op = Operator.NEQ; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return op;
	}
	// $ANTLR end "relationType"



	// $ANTLR start "relation"
	// Parser.g:1672:1: relation[WhereClause.Builder clauses] : (name= cident type= relationType t= term |name= cident K_LIKE t= term |name= cident K_IS K_NOT K_NULL | K_TOKEN l= tupleOfIdentifiers type= relationType t= term |name= cident K_IN marker= inMarker |name= cident K_IN inValues= singleColumnInValues |name= cident rt= containsOperator t= term |name= cident '[' key= term ']' type= relationType t= term |ids= tupleOfIdentifiers ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple ) | '(' relation[$clauses] ')' );
	public final void relation(WhereClause.Builder clauses) throws RecognitionException {
		ColumnIdentifier name =null;
		Operator type =null;
		Term.Raw t =null;
		List<ColumnIdentifier> l =null;
		AbstractMarker.INRaw marker =null;
		List<Term.Raw> inValues =null;
		Operator rt =null;
		Term.Raw key =null;
		List<ColumnIdentifier> ids =null;
		Tuples.INRaw tupleInMarker =null;
		List<Tuples.Literal> literals =null;
		List<Tuples.Raw> markers =null;
		Tuples.Literal literal =null;
		Tuples.Raw tupleMarker =null;

		try {
			// Parser.g:1673:5: (name= cident type= relationType t= term |name= cident K_LIKE t= term |name= cident K_IS K_NOT K_NULL | K_TOKEN l= tupleOfIdentifiers type= relationType t= term |name= cident K_IN marker= inMarker |name= cident K_IN inValues= singleColumnInValues |name= cident rt= containsOperator t= term |name= cident '[' key= term ']' type= relationType t= term |ids= tupleOfIdentifiers ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple ) | '(' relation[$clauses] ')' )
			int alt225=10;
			alt225 = dfa225.predict(input);
			switch (alt225) {
				case 1 :
					// Parser.g:1673:7: name= cident type= relationType t= term
					{
					pushFollow(FOLLOW_cident_in_relation12937);
					name=cident();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_relationType_in_relation12941);
					type=relationType();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_term_in_relation12945);
					t=term();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { clauses.add(new SingleColumnRelation(name, type, t)); }
					}
					break;
				case 2 :
					// Parser.g:1674:7: name= cident K_LIKE t= term
					{
					pushFollow(FOLLOW_cident_in_relation12957);
					name=cident();
					state._fsp--;
					if (state.failed) return;
					match(input,K_LIKE,FOLLOW_K_LIKE_in_relation12959); if (state.failed) return;
					pushFollow(FOLLOW_term_in_relation12963);
					t=term();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { clauses.add(new SingleColumnRelation(name, Operator.LIKE, t)); }
					}
					break;
				case 3 :
					// Parser.g:1675:7: name= cident K_IS K_NOT K_NULL
					{
					pushFollow(FOLLOW_cident_in_relation12975);
					name=cident();
					state._fsp--;
					if (state.failed) return;
					match(input,K_IS,FOLLOW_K_IS_in_relation12977); if (state.failed) return;
					match(input,K_NOT,FOLLOW_K_NOT_in_relation12979); if (state.failed) return;
					match(input,K_NULL,FOLLOW_K_NULL_in_relation12981); if (state.failed) return;
					if ( state.backtracking==0 ) { clauses.add(new SingleColumnRelation(name, Operator.IS_NOT, Constants.NULL_LITERAL)); }
					}
					break;
				case 4 :
					// Parser.g:1676:7: K_TOKEN l= tupleOfIdentifiers type= relationType t= term
					{
					match(input,K_TOKEN,FOLLOW_K_TOKEN_in_relation12991); if (state.failed) return;
					pushFollow(FOLLOW_tupleOfIdentifiers_in_relation12995);
					l=tupleOfIdentifiers();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_relationType_in_relation12999);
					type=relationType();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_term_in_relation13003);
					t=term();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { clauses.add(new TokenRelation(l, type, t)); }
					}
					break;
				case 5 :
					// Parser.g:1678:7: name= cident K_IN marker= inMarker
					{
					pushFollow(FOLLOW_cident_in_relation13023);
					name=cident();
					state._fsp--;
					if (state.failed) return;
					match(input,K_IN,FOLLOW_K_IN_in_relation13025); if (state.failed) return;
					pushFollow(FOLLOW_inMarker_in_relation13029);
					marker=inMarker();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { clauses.add(new SingleColumnRelation(name, Operator.IN, marker)); }
					}
					break;
				case 6 :
					// Parser.g:1680:7: name= cident K_IN inValues= singleColumnInValues
					{
					pushFollow(FOLLOW_cident_in_relation13049);
					name=cident();
					state._fsp--;
					if (state.failed) return;
					match(input,K_IN,FOLLOW_K_IN_in_relation13051); if (state.failed) return;
					pushFollow(FOLLOW_singleColumnInValues_in_relation13055);
					inValues=singleColumnInValues();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { clauses.add(SingleColumnRelation.createInRelation(name, inValues)); }
					}
					break;
				case 7 :
					// Parser.g:1682:7: name= cident rt= containsOperator t= term
					{
					pushFollow(FOLLOW_cident_in_relation13075);
					name=cident();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_containsOperator_in_relation13079);
					rt=containsOperator();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_term_in_relation13083);
					t=term();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { clauses.add(new SingleColumnRelation(name, rt, t)); }
					}
					break;
				case 8 :
					// Parser.g:1683:7: name= cident '[' key= term ']' type= relationType t= term
					{
					pushFollow(FOLLOW_cident_in_relation13095);
					name=cident();
					state._fsp--;
					if (state.failed) return;
					match(input,216,FOLLOW_216_in_relation13097); if (state.failed) return;
					pushFollow(FOLLOW_term_in_relation13101);
					key=term();
					state._fsp--;
					if (state.failed) return;
					match(input,218,FOLLOW_218_in_relation13103); if (state.failed) return;
					pushFollow(FOLLOW_relationType_in_relation13107);
					type=relationType();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_term_in_relation13111);
					t=term();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { clauses.add(new SingleColumnRelation(name, key, type, t)); }
					}
					break;
				case 9 :
					// Parser.g:1684:7: ids= tupleOfIdentifiers ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple )
					{
					pushFollow(FOLLOW_tupleOfIdentifiers_in_relation13123);
					ids=tupleOfIdentifiers();
					state._fsp--;
					if (state.failed) return;
					// Parser.g:1685:7: ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple )
					int alt224=3;
					alt224 = dfa224.predict(input);
					switch (alt224) {
						case 1 :
							// Parser.g:1685:9: K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples )
							{
							match(input,K_IN,FOLLOW_K_IN_in_relation13133); if (state.failed) return;
							// Parser.g:1686:11: ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples )
							int alt223=4;
							int LA223_0 = input.LA(1);
							if ( (LA223_0==200) ) {
								switch ( input.LA(2) ) {
								case 201:
									{
									alt223=1;
									}
									break;
								case 200:
									{
									alt223=3;
									}
									break;
								case QMARK:
								case 209:
									{
									alt223=4;
									}
									break;
								default:
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 223, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}
							else if ( (LA223_0==QMARK||LA223_0==209) ) {
								alt223=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								NoViableAltException nvae =
									new NoViableAltException("", 223, 0, input);
								throw nvae;
							}

							switch (alt223) {
								case 1 :
									// Parser.g:1686:13: '(' ')'
									{
									match(input,200,FOLLOW_200_in_relation13147); if (state.failed) return;
									match(input,201,FOLLOW_201_in_relation13149); if (state.failed) return;
									if ( state.backtracking==0 ) { clauses.add(MultiColumnRelation.createInRelation(ids, new ArrayList<Tuples.Literal>())); }
									}
									break;
								case 2 :
									// Parser.g:1688:13: tupleInMarker= inMarkerForTuple
									{
									pushFollow(FOLLOW_inMarkerForTuple_in_relation13181);
									tupleInMarker=inMarkerForTuple();
									state._fsp--;
									if (state.failed) return;
									if ( state.backtracking==0 ) { clauses.add(MultiColumnRelation.createSingleMarkerInRelation(ids, tupleInMarker)); }
									}
									break;
								case 3 :
									// Parser.g:1690:13: literals= tupleOfTupleLiterals
									{
									pushFollow(FOLLOW_tupleOfTupleLiterals_in_relation13215);
									literals=tupleOfTupleLiterals();
									state._fsp--;
									if (state.failed) return;
									if ( state.backtracking==0 ) {
									                  clauses.add(MultiColumnRelation.createInRelation(ids, literals));
									              }
									}
									break;
								case 4 :
									// Parser.g:1694:13: markers= tupleOfMarkersForTuples
									{
									pushFollow(FOLLOW_tupleOfMarkersForTuples_in_relation13249);
									markers=tupleOfMarkersForTuples();
									state._fsp--;
									if (state.failed) return;
									if ( state.backtracking==0 ) { clauses.add(MultiColumnRelation.createInRelation(ids, markers)); }
									}
									break;

							}

							}
							break;
						case 2 :
							// Parser.g:1697:9: type= relationType literal= tupleLiteral
							{
							pushFollow(FOLLOW_relationType_in_relation13291);
							type=relationType();
							state._fsp--;
							if (state.failed) return;
							pushFollow(FOLLOW_tupleLiteral_in_relation13295);
							literal=tupleLiteral();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) {
							              clauses.add(MultiColumnRelation.createNonInRelation(ids, type, literal));
							          }
							}
							break;
						case 3 :
							// Parser.g:1701:9: type= relationType tupleMarker= markerForTuple
							{
							pushFollow(FOLLOW_relationType_in_relation13321);
							type=relationType();
							state._fsp--;
							if (state.failed) return;
							pushFollow(FOLLOW_markerForTuple_in_relation13325);
							tupleMarker=markerForTuple();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) { clauses.add(MultiColumnRelation.createNonInRelation(ids, type, tupleMarker)); }
							}
							break;

					}

					}
					break;
				case 10 :
					// Parser.g:1704:7: '(' relation[$clauses] ')'
					{
					match(input,200,FOLLOW_200_in_relation13355); if (state.failed) return;
					pushFollow(FOLLOW_relation_in_relation13357);
					relation(clauses);
					state._fsp--;
					if (state.failed) return;
					match(input,201,FOLLOW_201_in_relation13360); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "relation"



	// $ANTLR start "containsOperator"
	// Parser.g:1707:1: containsOperator returns [Operator o] : K_CONTAINS ( K_KEY )? ;
	public final Operator containsOperator() throws RecognitionException {
		Operator o = null;


		try {
			// Parser.g:1708:5: ( K_CONTAINS ( K_KEY )? )
			// Parser.g:1708:7: K_CONTAINS ( K_KEY )?
			{
			match(input,K_CONTAINS,FOLLOW_K_CONTAINS_in_containsOperator13381); if (state.failed) return o;
			if ( state.backtracking==0 ) { o = Operator.CONTAINS; }
			// Parser.g:1708:45: ( K_KEY )?
			int alt226=2;
			int LA226_0 = input.LA(1);
			if ( (LA226_0==K_KEY) ) {
				int LA226_1 = input.LA(2);
				if ( (LA226_1==BOOLEAN||LA226_1==DURATION||LA226_1==FLOAT||LA226_1==HEXNUMBER||(LA226_1 >= IDENT && LA226_1 <= INTEGER)||LA226_1==K_ACCESS||(LA226_1 >= K_AGGREGATE && LA226_1 <= K_ALL)||LA226_1==K_AS||LA226_1==K_ASCII||(LA226_1 >= K_BIGINT && LA226_1 <= K_BOOLEAN)||(LA226_1 >= K_CALLED && LA226_1 <= K_CLUSTERING)||(LA226_1 >= K_COMPACT && LA226_1 <= K_COUNTER)||(LA226_1 >= K_CUSTOM && LA226_1 <= K_DEFAULT)||(LA226_1 >= K_DISTINCT && LA226_1 <= K_DOUBLE)||LA226_1==K_DURATION||(LA226_1 >= K_EXISTS && LA226_1 <= K_FLOAT)||LA226_1==K_FROZEN||(LA226_1 >= K_FUNCTION && LA226_1 <= K_FUNCTIONS)||LA226_1==K_GROUP||(LA226_1 >= K_INET && LA226_1 <= K_INPUT)||(LA226_1 >= K_INT && LA226_1 <= K_INTERNALS)||(LA226_1 >= K_JSON && LA226_1 <= K_KEYS)||(LA226_1 >= K_KEYSPACES && LA226_1 <= K_LIKE)||(LA226_1 >= K_LIST && LA226_1 <= K_MAP)||(LA226_1 >= K_MBEAN && LA226_1 <= K_MBEANS)||(LA226_1 >= K_NEGATIVE_INFINITY && LA226_1 <= K_NOLOGIN)||LA226_1==K_NOSUPERUSER||LA226_1==K_NULL||(LA226_1 >= K_ONLY && LA226_1 <= K_OPTIONS)||(LA226_1 >= K_PARTITION && LA226_1 <= K_POSITIVE_NAN)||(LA226_1 >= K_REPLACE && LA226_1 <= K_RETURNS)||(LA226_1 >= K_ROLE && LA226_1 <= K_ROLES)||(LA226_1 >= K_SFUNC && LA226_1 <= K_TINYINT)||(LA226_1 >= K_TOKEN && LA226_1 <= K_TRIGGER)||(LA226_1 >= K_TTL && LA226_1 <= K_TYPES)||LA226_1==K_UNSET||(LA226_1 >= K_USER && LA226_1 <= K_USERS)||(LA226_1 >= K_UUID && LA226_1 <= K_VARINT)||LA226_1==K_WRITETIME||(LA226_1 >= QMARK && LA226_1 <= QUOTED_NAME)||LA226_1==STRING_LITERAL||LA226_1==UUID||LA226_1==200||LA226_1==205||LA226_1==209||LA226_1==216||LA226_1==220) ) {
					alt226=1;
				}
			}
			switch (alt226) {
				case 1 :
					// Parser.g:1708:46: K_KEY
					{
					match(input,K_KEY,FOLLOW_K_KEY_in_containsOperator13386); if (state.failed) return o;
					if ( state.backtracking==0 ) { o = Operator.CONTAINS_KEY; }
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return o;
	}
	// $ANTLR end "containsOperator"



	// $ANTLR start "inMarker"
	// Parser.g:1711:1: inMarker returns [AbstractMarker.INRaw marker] : ( QMARK | ':' name= noncol_ident );
	public final AbstractMarker.INRaw inMarker() throws RecognitionException {
		AbstractMarker.INRaw marker = null;


		ColumnIdentifier name =null;

		try {
			// Parser.g:1712:5: ( QMARK | ':' name= noncol_ident )
			int alt227=2;
			int LA227_0 = input.LA(1);
			if ( (LA227_0==QMARK) ) {
				alt227=1;
			}
			else if ( (LA227_0==209) ) {
				alt227=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return marker;}
				NoViableAltException nvae =
					new NoViableAltException("", 227, 0, input);
				throw nvae;
			}

			switch (alt227) {
				case 1 :
					// Parser.g:1712:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_inMarker13411); if (state.failed) return marker;
					if ( state.backtracking==0 ) { marker = newINBindVariables(null); }
					}
					break;
				case 2 :
					// Parser.g:1713:7: ':' name= noncol_ident
					{
					match(input,209,FOLLOW_209_in_inMarker13421); if (state.failed) return marker;
					pushFollow(FOLLOW_noncol_ident_in_inMarker13425);
					name=noncol_ident();
					state._fsp--;
					if (state.failed) return marker;
					if ( state.backtracking==0 ) { marker = newINBindVariables(name); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return marker;
	}
	// $ANTLR end "inMarker"



	// $ANTLR start "tupleOfIdentifiers"
	// Parser.g:1716:1: tupleOfIdentifiers returns [List<ColumnIdentifier> ids] : '(' n1= cident ( ',' ni= cident )* ')' ;
	public final List<ColumnIdentifier> tupleOfIdentifiers() throws RecognitionException {
		List<ColumnIdentifier> ids = null;


		ColumnIdentifier n1 =null;
		ColumnIdentifier ni =null;

		 ids = new ArrayList<ColumnIdentifier>(); 
		try {
			// Parser.g:1718:5: ( '(' n1= cident ( ',' ni= cident )* ')' )
			// Parser.g:1718:7: '(' n1= cident ( ',' ni= cident )* ')'
			{
			match(input,200,FOLLOW_200_in_tupleOfIdentifiers13457); if (state.failed) return ids;
			pushFollow(FOLLOW_cident_in_tupleOfIdentifiers13461);
			n1=cident();
			state._fsp--;
			if (state.failed) return ids;
			if ( state.backtracking==0 ) { ids.add(n1); }
			// Parser.g:1718:39: ( ',' ni= cident )*
			loop228:
			while (true) {
				int alt228=2;
				int LA228_0 = input.LA(1);
				if ( (LA228_0==204) ) {
					alt228=1;
				}

				switch (alt228) {
				case 1 :
					// Parser.g:1718:40: ',' ni= cident
					{
					match(input,204,FOLLOW_204_in_tupleOfIdentifiers13466); if (state.failed) return ids;
					pushFollow(FOLLOW_cident_in_tupleOfIdentifiers13470);
					ni=cident();
					state._fsp--;
					if (state.failed) return ids;
					if ( state.backtracking==0 ) { ids.add(ni); }
					}
					break;

				default :
					break loop228;
				}
			}

			match(input,201,FOLLOW_201_in_tupleOfIdentifiers13476); if (state.failed) return ids;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ids;
	}
	// $ANTLR end "tupleOfIdentifiers"



	// $ANTLR start "singleColumnInValues"
	// Parser.g:1721:1: singleColumnInValues returns [List<Term.Raw> terms] : '(' (t1= term ( ',' ti= term )* )? ')' ;
	public final List<Term.Raw> singleColumnInValues() throws RecognitionException {
		List<Term.Raw> terms = null;


		Term.Raw t1 =null;
		Term.Raw ti =null;

		 terms = new ArrayList<Term.Raw>(); 
		try {
			// Parser.g:1723:5: ( '(' (t1= term ( ',' ti= term )* )? ')' )
			// Parser.g:1723:7: '(' (t1= term ( ',' ti= term )* )? ')'
			{
			match(input,200,FOLLOW_200_in_singleColumnInValues13506); if (state.failed) return terms;
			// Parser.g:1723:11: (t1= term ( ',' ti= term )* )?
			int alt230=2;
			int LA230_0 = input.LA(1);
			if ( (LA230_0==BOOLEAN||LA230_0==DURATION||LA230_0==FLOAT||LA230_0==HEXNUMBER||(LA230_0 >= IDENT && LA230_0 <= INTEGER)||LA230_0==K_ACCESS||(LA230_0 >= K_AGGREGATE && LA230_0 <= K_ALL)||LA230_0==K_AS||LA230_0==K_ASCII||(LA230_0 >= K_BIGINT && LA230_0 <= K_BOOLEAN)||(LA230_0 >= K_CALLED && LA230_0 <= K_CLUSTERING)||(LA230_0 >= K_COMPACT && LA230_0 <= K_COUNTER)||(LA230_0 >= K_CUSTOM && LA230_0 <= K_DEFAULT)||(LA230_0 >= K_DISTINCT && LA230_0 <= K_DOUBLE)||LA230_0==K_DURATION||(LA230_0 >= K_EXISTS && LA230_0 <= K_FLOAT)||LA230_0==K_FROZEN||(LA230_0 >= K_FUNCTION && LA230_0 <= K_FUNCTIONS)||LA230_0==K_GROUP||(LA230_0 >= K_INET && LA230_0 <= K_INPUT)||(LA230_0 >= K_INT && LA230_0 <= K_INTERNALS)||(LA230_0 >= K_JSON && LA230_0 <= K_KEYS)||(LA230_0 >= K_KEYSPACES && LA230_0 <= K_LIKE)||(LA230_0 >= K_LIST && LA230_0 <= K_MAP)||(LA230_0 >= K_MBEAN && LA230_0 <= K_MBEANS)||(LA230_0 >= K_NEGATIVE_INFINITY && LA230_0 <= K_NOLOGIN)||LA230_0==K_NOSUPERUSER||LA230_0==K_NULL||(LA230_0 >= K_ONLY && LA230_0 <= K_OPTIONS)||(LA230_0 >= K_PARTITION && LA230_0 <= K_POSITIVE_NAN)||(LA230_0 >= K_REPLACE && LA230_0 <= K_RETURNS)||(LA230_0 >= K_ROLE && LA230_0 <= K_ROLES)||(LA230_0 >= K_SFUNC && LA230_0 <= K_TINYINT)||(LA230_0 >= K_TOKEN && LA230_0 <= K_TRIGGER)||(LA230_0 >= K_TTL && LA230_0 <= K_TYPES)||LA230_0==K_UNSET||(LA230_0 >= K_USER && LA230_0 <= K_USERS)||(LA230_0 >= K_UUID && LA230_0 <= K_VARINT)||LA230_0==K_WRITETIME||(LA230_0 >= QMARK && LA230_0 <= QUOTED_NAME)||LA230_0==STRING_LITERAL||LA230_0==UUID||LA230_0==200||LA230_0==205||LA230_0==209||LA230_0==216||LA230_0==220) ) {
				alt230=1;
			}
			switch (alt230) {
				case 1 :
					// Parser.g:1723:13: t1= term ( ',' ti= term )*
					{
					pushFollow(FOLLOW_term_in_singleColumnInValues13514);
					t1=term();
					state._fsp--;
					if (state.failed) return terms;
					if ( state.backtracking==0 ) { terms.add(t1); }
					// Parser.g:1723:43: ( ',' ti= term )*
					loop229:
					while (true) {
						int alt229=2;
						int LA229_0 = input.LA(1);
						if ( (LA229_0==204) ) {
							alt229=1;
						}

						switch (alt229) {
						case 1 :
							// Parser.g:1723:44: ',' ti= term
							{
							match(input,204,FOLLOW_204_in_singleColumnInValues13519); if (state.failed) return terms;
							pushFollow(FOLLOW_term_in_singleColumnInValues13523);
							ti=term();
							state._fsp--;
							if (state.failed) return terms;
							if ( state.backtracking==0 ) { terms.add(ti); }
							}
							break;

						default :
							break loop229;
						}
					}

					}
					break;

			}

			match(input,201,FOLLOW_201_in_singleColumnInValues13532); if (state.failed) return terms;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return terms;
	}
	// $ANTLR end "singleColumnInValues"



	// $ANTLR start "tupleOfTupleLiterals"
	// Parser.g:1726:1: tupleOfTupleLiterals returns [List<Tuples.Literal> literals] : '(' t1= tupleLiteral ( ',' ti= tupleLiteral )* ')' ;
	public final List<Tuples.Literal> tupleOfTupleLiterals() throws RecognitionException {
		List<Tuples.Literal> literals = null;


		Tuples.Literal t1 =null;
		Tuples.Literal ti =null;

		 literals = new ArrayList<>(); 
		try {
			// Parser.g:1728:5: ( '(' t1= tupleLiteral ( ',' ti= tupleLiteral )* ')' )
			// Parser.g:1728:7: '(' t1= tupleLiteral ( ',' ti= tupleLiteral )* ')'
			{
			match(input,200,FOLLOW_200_in_tupleOfTupleLiterals13562); if (state.failed) return literals;
			pushFollow(FOLLOW_tupleLiteral_in_tupleOfTupleLiterals13566);
			t1=tupleLiteral();
			state._fsp--;
			if (state.failed) return literals;
			if ( state.backtracking==0 ) { literals.add(t1); }
			// Parser.g:1728:50: ( ',' ti= tupleLiteral )*
			loop231:
			while (true) {
				int alt231=2;
				int LA231_0 = input.LA(1);
				if ( (LA231_0==204) ) {
					alt231=1;
				}

				switch (alt231) {
				case 1 :
					// Parser.g:1728:51: ',' ti= tupleLiteral
					{
					match(input,204,FOLLOW_204_in_tupleOfTupleLiterals13571); if (state.failed) return literals;
					pushFollow(FOLLOW_tupleLiteral_in_tupleOfTupleLiterals13575);
					ti=tupleLiteral();
					state._fsp--;
					if (state.failed) return literals;
					if ( state.backtracking==0 ) { literals.add(ti); }
					}
					break;

				default :
					break loop231;
				}
			}

			match(input,201,FOLLOW_201_in_tupleOfTupleLiterals13581); if (state.failed) return literals;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return literals;
	}
	// $ANTLR end "tupleOfTupleLiterals"



	// $ANTLR start "markerForTuple"
	// Parser.g:1731:1: markerForTuple returns [Tuples.Raw marker] : ( QMARK | ':' name= noncol_ident );
	public final Tuples.Raw markerForTuple() throws RecognitionException {
		Tuples.Raw marker = null;


		ColumnIdentifier name =null;

		try {
			// Parser.g:1732:5: ( QMARK | ':' name= noncol_ident )
			int alt232=2;
			int LA232_0 = input.LA(1);
			if ( (LA232_0==QMARK) ) {
				alt232=1;
			}
			else if ( (LA232_0==209) ) {
				alt232=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return marker;}
				NoViableAltException nvae =
					new NoViableAltException("", 232, 0, input);
				throw nvae;
			}

			switch (alt232) {
				case 1 :
					// Parser.g:1732:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_markerForTuple13602); if (state.failed) return marker;
					if ( state.backtracking==0 ) { marker = newTupleBindVariables(null); }
					}
					break;
				case 2 :
					// Parser.g:1733:7: ':' name= noncol_ident
					{
					match(input,209,FOLLOW_209_in_markerForTuple13612); if (state.failed) return marker;
					pushFollow(FOLLOW_noncol_ident_in_markerForTuple13616);
					name=noncol_ident();
					state._fsp--;
					if (state.failed) return marker;
					if ( state.backtracking==0 ) { marker = newTupleBindVariables(name); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return marker;
	}
	// $ANTLR end "markerForTuple"



	// $ANTLR start "tupleOfMarkersForTuples"
	// Parser.g:1736:1: tupleOfMarkersForTuples returns [List<Tuples.Raw> markers] : '(' m1= markerForTuple ( ',' mi= markerForTuple )* ')' ;
	public final List<Tuples.Raw> tupleOfMarkersForTuples() throws RecognitionException {
		List<Tuples.Raw> markers = null;


		Tuples.Raw m1 =null;
		Tuples.Raw mi =null;

		 markers = new ArrayList<Tuples.Raw>(); 
		try {
			// Parser.g:1738:5: ( '(' m1= markerForTuple ( ',' mi= markerForTuple )* ')' )
			// Parser.g:1738:7: '(' m1= markerForTuple ( ',' mi= markerForTuple )* ')'
			{
			match(input,200,FOLLOW_200_in_tupleOfMarkersForTuples13648); if (state.failed) return markers;
			pushFollow(FOLLOW_markerForTuple_in_tupleOfMarkersForTuples13652);
			m1=markerForTuple();
			state._fsp--;
			if (state.failed) return markers;
			if ( state.backtracking==0 ) { markers.add(m1); }
			// Parser.g:1738:51: ( ',' mi= markerForTuple )*
			loop233:
			while (true) {
				int alt233=2;
				int LA233_0 = input.LA(1);
				if ( (LA233_0==204) ) {
					alt233=1;
				}

				switch (alt233) {
				case 1 :
					// Parser.g:1738:52: ',' mi= markerForTuple
					{
					match(input,204,FOLLOW_204_in_tupleOfMarkersForTuples13657); if (state.failed) return markers;
					pushFollow(FOLLOW_markerForTuple_in_tupleOfMarkersForTuples13661);
					mi=markerForTuple();
					state._fsp--;
					if (state.failed) return markers;
					if ( state.backtracking==0 ) { markers.add(mi); }
					}
					break;

				default :
					break loop233;
				}
			}

			match(input,201,FOLLOW_201_in_tupleOfMarkersForTuples13667); if (state.failed) return markers;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return markers;
	}
	// $ANTLR end "tupleOfMarkersForTuples"



	// $ANTLR start "inMarkerForTuple"
	// Parser.g:1741:1: inMarkerForTuple returns [Tuples.INRaw marker] : ( QMARK | ':' name= noncol_ident );
	public final Tuples.INRaw inMarkerForTuple() throws RecognitionException {
		Tuples.INRaw marker = null;


		ColumnIdentifier name =null;

		try {
			// Parser.g:1742:5: ( QMARK | ':' name= noncol_ident )
			int alt234=2;
			int LA234_0 = input.LA(1);
			if ( (LA234_0==QMARK) ) {
				alt234=1;
			}
			else if ( (LA234_0==209) ) {
				alt234=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return marker;}
				NoViableAltException nvae =
					new NoViableAltException("", 234, 0, input);
				throw nvae;
			}

			switch (alt234) {
				case 1 :
					// Parser.g:1742:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_inMarkerForTuple13688); if (state.failed) return marker;
					if ( state.backtracking==0 ) { marker = newTupleINBindVariables(null); }
					}
					break;
				case 2 :
					// Parser.g:1743:7: ':' name= noncol_ident
					{
					match(input,209,FOLLOW_209_in_inMarkerForTuple13698); if (state.failed) return marker;
					pushFollow(FOLLOW_noncol_ident_in_inMarkerForTuple13702);
					name=noncol_ident();
					state._fsp--;
					if (state.failed) return marker;
					if ( state.backtracking==0 ) { marker = newTupleINBindVariables(name); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return marker;
	}
	// $ANTLR end "inMarkerForTuple"



	// $ANTLR start "comparatorType"
	// Parser.g:1746:1: comparatorType returns [CQL3Type.Raw t] : (n= native_type |c= collection_type |tt= tuple_type |id= userTypeName | K_FROZEN '<' f= comparatorType '>' |s= STRING_LITERAL );
	public final CQL3Type.Raw comparatorType() throws RecognitionException {
		CQL3Type.Raw t = null;


		Token s=null;
		CQL3Type n =null;
		CQL3Type.Raw c =null;
		CQL3Type.Raw tt =null;
		UTName id =null;
		CQL3Type.Raw f =null;

		try {
			// Parser.g:1747:5: (n= native_type |c= collection_type |tt= tuple_type |id= userTypeName | K_FROZEN '<' f= comparatorType '>' |s= STRING_LITERAL )
			int alt235=6;
			alt235 = dfa235.predict(input);
			switch (alt235) {
				case 1 :
					// Parser.g:1747:7: n= native_type
					{
					pushFollow(FOLLOW_native_type_in_comparatorType13727);
					n=native_type();
					state._fsp--;
					if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Raw.from(n); }
					}
					break;
				case 2 :
					// Parser.g:1748:7: c= collection_type
					{
					pushFollow(FOLLOW_collection_type_in_comparatorType13743);
					c=collection_type();
					state._fsp--;
					if (state.failed) return t;
					if ( state.backtracking==0 ) { t = c; }
					}
					break;
				case 3 :
					// Parser.g:1749:7: tt= tuple_type
					{
					pushFollow(FOLLOW_tuple_type_in_comparatorType13755);
					tt=tuple_type();
					state._fsp--;
					if (state.failed) return t;
					if ( state.backtracking==0 ) { t = tt; }
					}
					break;
				case 4 :
					// Parser.g:1750:7: id= userTypeName
					{
					pushFollow(FOLLOW_userTypeName_in_comparatorType13771);
					id=userTypeName();
					state._fsp--;
					if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Raw.userType(id); }
					}
					break;
				case 5 :
					// Parser.g:1751:7: K_FROZEN '<' f= comparatorType '>'
					{
					match(input,K_FROZEN,FOLLOW_K_FROZEN_in_comparatorType13783); if (state.failed) return t;
					match(input,211,FOLLOW_211_in_comparatorType13785); if (state.failed) return t;
					pushFollow(FOLLOW_comparatorType_in_comparatorType13789);
					f=comparatorType();
					state._fsp--;
					if (state.failed) return t;
					match(input,214,FOLLOW_214_in_comparatorType13791); if (state.failed) return t;
					if ( state.backtracking==0 ) {
					        try {
					            t = f.freeze();
					        } catch (InvalidRequestException e) {
					            addRecognitionError(e.getMessage());
					        }
					      }
					}
					break;
				case 6 :
					// Parser.g:1759:7: s= STRING_LITERAL
					{
					s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_comparatorType13809); if (state.failed) return t;
					if ( state.backtracking==0 ) {
					        try {
					            t = CQL3Type.Raw.from(new CQL3Type.Custom((s!=null?s.getText():null)));
					        } catch (SyntaxException e) {
					            addRecognitionError("Cannot parse type " + (s!=null?s.getText():null) + ": " + e.getMessage());
					        } catch (ConfigurationException e) {
					            addRecognitionError("Error setting type " + (s!=null?s.getText():null) + ": " + e.getMessage());
					        }
					      }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "comparatorType"



	// $ANTLR start "native_type"
	// Parser.g:1771:1: native_type returns [CQL3Type t] : ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_DURATION | K_FLOAT | K_INET | K_INT | K_SMALLINT | K_TEXT | K_TIMESTAMP | K_TINYINT | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID | K_DATE | K_TIME );
	public final CQL3Type native_type() throws RecognitionException {
		CQL3Type t = null;


		try {
			// Parser.g:1772:5: ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_DURATION | K_FLOAT | K_INET | K_INT | K_SMALLINT | K_TEXT | K_TIMESTAMP | K_TINYINT | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID | K_DATE | K_TIME )
			int alt236=21;
			switch ( input.LA(1) ) {
			case K_ASCII:
				{
				alt236=1;
				}
				break;
			case K_BIGINT:
				{
				alt236=2;
				}
				break;
			case K_BLOB:
				{
				alt236=3;
				}
				break;
			case K_BOOLEAN:
				{
				alt236=4;
				}
				break;
			case K_COUNTER:
				{
				alt236=5;
				}
				break;
			case K_DECIMAL:
				{
				alt236=6;
				}
				break;
			case K_DOUBLE:
				{
				alt236=7;
				}
				break;
			case K_DURATION:
				{
				alt236=8;
				}
				break;
			case K_FLOAT:
				{
				alt236=9;
				}
				break;
			case K_INET:
				{
				alt236=10;
				}
				break;
			case K_INT:
				{
				alt236=11;
				}
				break;
			case K_SMALLINT:
				{
				alt236=12;
				}
				break;
			case K_TEXT:
				{
				alt236=13;
				}
				break;
			case K_TIMESTAMP:
				{
				alt236=14;
				}
				break;
			case K_TINYINT:
				{
				alt236=15;
				}
				break;
			case K_UUID:
				{
				alt236=16;
				}
				break;
			case K_VARCHAR:
				{
				alt236=17;
				}
				break;
			case K_VARINT:
				{
				alt236=18;
				}
				break;
			case K_TIMEUUID:
				{
				alt236=19;
				}
				break;
			case K_DATE:
				{
				alt236=20;
				}
				break;
			case K_TIME:
				{
				alt236=21;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return t;}
				NoViableAltException nvae =
					new NoViableAltException("", 236, 0, input);
				throw nvae;
			}
			switch (alt236) {
				case 1 :
					// Parser.g:1772:7: K_ASCII
					{
					match(input,K_ASCII,FOLLOW_K_ASCII_in_native_type13838); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.ASCII; }
					}
					break;
				case 2 :
					// Parser.g:1773:7: K_BIGINT
					{
					match(input,K_BIGINT,FOLLOW_K_BIGINT_in_native_type13852); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.BIGINT; }
					}
					break;
				case 3 :
					// Parser.g:1774:7: K_BLOB
					{
					match(input,K_BLOB,FOLLOW_K_BLOB_in_native_type13865); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.BLOB; }
					}
					break;
				case 4 :
					// Parser.g:1775:7: K_BOOLEAN
					{
					match(input,K_BOOLEAN,FOLLOW_K_BOOLEAN_in_native_type13880); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.BOOLEAN; }
					}
					break;
				case 5 :
					// Parser.g:1776:7: K_COUNTER
					{
					match(input,K_COUNTER,FOLLOW_K_COUNTER_in_native_type13892); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.COUNTER; }
					}
					break;
				case 6 :
					// Parser.g:1777:7: K_DECIMAL
					{
					match(input,K_DECIMAL,FOLLOW_K_DECIMAL_in_native_type13904); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.DECIMAL; }
					}
					break;
				case 7 :
					// Parser.g:1778:7: K_DOUBLE
					{
					match(input,K_DOUBLE,FOLLOW_K_DOUBLE_in_native_type13916); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.DOUBLE; }
					}
					break;
				case 8 :
					// Parser.g:1779:7: K_DURATION
					{
					match(input,K_DURATION,FOLLOW_K_DURATION_in_native_type13929); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.DURATION; }
					}
					break;
				case 9 :
					// Parser.g:1780:7: K_FLOAT
					{
					match(input,K_FLOAT,FOLLOW_K_FLOAT_in_native_type13942); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.FLOAT; }
					}
					break;
				case 10 :
					// Parser.g:1781:7: K_INET
					{
					match(input,K_INET,FOLLOW_K_INET_in_native_type13956); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.INET;}
					}
					break;
				case 11 :
					// Parser.g:1782:7: K_INT
					{
					match(input,K_INT,FOLLOW_K_INT_in_native_type13971); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.INT; }
					}
					break;
				case 12 :
					// Parser.g:1783:7: K_SMALLINT
					{
					match(input,K_SMALLINT,FOLLOW_K_SMALLINT_in_native_type13987); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.SMALLINT; }
					}
					break;
				case 13 :
					// Parser.g:1784:7: K_TEXT
					{
					match(input,K_TEXT,FOLLOW_K_TEXT_in_native_type13998); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.TEXT; }
					}
					break;
				case 14 :
					// Parser.g:1785:7: K_TIMESTAMP
					{
					match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_native_type14013); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.TIMESTAMP; }
					}
					break;
				case 15 :
					// Parser.g:1786:7: K_TINYINT
					{
					match(input,K_TINYINT,FOLLOW_K_TINYINT_in_native_type14023); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.TINYINT; }
					}
					break;
				case 16 :
					// Parser.g:1787:7: K_UUID
					{
					match(input,K_UUID,FOLLOW_K_UUID_in_native_type14035); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.UUID; }
					}
					break;
				case 17 :
					// Parser.g:1788:7: K_VARCHAR
					{
					match(input,K_VARCHAR,FOLLOW_K_VARCHAR_in_native_type14050); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.VARCHAR; }
					}
					break;
				case 18 :
					// Parser.g:1789:7: K_VARINT
					{
					match(input,K_VARINT,FOLLOW_K_VARINT_in_native_type14062); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.VARINT; }
					}
					break;
				case 19 :
					// Parser.g:1790:7: K_TIMEUUID
					{
					match(input,K_TIMEUUID,FOLLOW_K_TIMEUUID_in_native_type14075); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.TIMEUUID; }
					}
					break;
				case 20 :
					// Parser.g:1791:7: K_DATE
					{
					match(input,K_DATE,FOLLOW_K_DATE_in_native_type14086); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.DATE; }
					}
					break;
				case 21 :
					// Parser.g:1792:7: K_TIME
					{
					match(input,K_TIME,FOLLOW_K_TIME_in_native_type14101); if (state.failed) return t;
					if ( state.backtracking==0 ) { t = CQL3Type.Native.TIME; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "native_type"



	// $ANTLR start "collection_type"
	// Parser.g:1795:1: collection_type returns [CQL3Type.Raw pt] : ( K_MAP '<' t1= comparatorType ',' t2= comparatorType '>' | K_LIST '<' t= comparatorType '>' | K_SET '<' t= comparatorType '>' );
	public final CQL3Type.Raw collection_type() throws RecognitionException {
		CQL3Type.Raw pt = null;


		CQL3Type.Raw t1 =null;
		CQL3Type.Raw t2 =null;
		CQL3Type.Raw t =null;

		try {
			// Parser.g:1796:5: ( K_MAP '<' t1= comparatorType ',' t2= comparatorType '>' | K_LIST '<' t= comparatorType '>' | K_SET '<' t= comparatorType '>' )
			int alt237=3;
			switch ( input.LA(1) ) {
			case K_MAP:
				{
				alt237=1;
				}
				break;
			case K_LIST:
				{
				alt237=2;
				}
				break;
			case K_SET:
				{
				alt237=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return pt;}
				NoViableAltException nvae =
					new NoViableAltException("", 237, 0, input);
				throw nvae;
			}
			switch (alt237) {
				case 1 :
					// Parser.g:1796:7: K_MAP '<' t1= comparatorType ',' t2= comparatorType '>'
					{
					match(input,K_MAP,FOLLOW_K_MAP_in_collection_type14129); if (state.failed) return pt;
					match(input,211,FOLLOW_211_in_collection_type14132); if (state.failed) return pt;
					pushFollow(FOLLOW_comparatorType_in_collection_type14136);
					t1=comparatorType();
					state._fsp--;
					if (state.failed) return pt;
					match(input,204,FOLLOW_204_in_collection_type14138); if (state.failed) return pt;
					pushFollow(FOLLOW_comparatorType_in_collection_type14142);
					t2=comparatorType();
					state._fsp--;
					if (state.failed) return pt;
					match(input,214,FOLLOW_214_in_collection_type14144); if (state.failed) return pt;
					if ( state.backtracking==0 ) {
					            // if we can't parse either t1 or t2, antlr will "recover" and we may have t1 or t2 null.
					            if (t1 != null && t2 != null)
					                pt = CQL3Type.Raw.map(t1, t2);
					        }
					}
					break;
				case 2 :
					// Parser.g:1802:7: K_LIST '<' t= comparatorType '>'
					{
					match(input,K_LIST,FOLLOW_K_LIST_in_collection_type14162); if (state.failed) return pt;
					match(input,211,FOLLOW_211_in_collection_type14164); if (state.failed) return pt;
					pushFollow(FOLLOW_comparatorType_in_collection_type14168);
					t=comparatorType();
					state._fsp--;
					if (state.failed) return pt;
					match(input,214,FOLLOW_214_in_collection_type14170); if (state.failed) return pt;
					if ( state.backtracking==0 ) { if (t != null) pt = CQL3Type.Raw.list(t); }
					}
					break;
				case 3 :
					// Parser.g:1804:7: K_SET '<' t= comparatorType '>'
					{
					match(input,K_SET,FOLLOW_K_SET_in_collection_type14188); if (state.failed) return pt;
					match(input,211,FOLLOW_211_in_collection_type14191); if (state.failed) return pt;
					pushFollow(FOLLOW_comparatorType_in_collection_type14195);
					t=comparatorType();
					state._fsp--;
					if (state.failed) return pt;
					match(input,214,FOLLOW_214_in_collection_type14197); if (state.failed) return pt;
					if ( state.backtracking==0 ) { if (t != null) pt = CQL3Type.Raw.set(t); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return pt;
	}
	// $ANTLR end "collection_type"



	// $ANTLR start "tuple_type"
	// Parser.g:1808:1: tuple_type returns [CQL3Type.Raw t] : K_TUPLE '<' t1= comparatorType ( ',' tn= comparatorType )* '>' ;
	public final CQL3Type.Raw tuple_type() throws RecognitionException {
		CQL3Type.Raw t = null;


		CQL3Type.Raw t1 =null;
		CQL3Type.Raw tn =null;

		List<CQL3Type.Raw> types = new ArrayList<>();
		try {
			// Parser.g:1811:5: ( K_TUPLE '<' t1= comparatorType ( ',' tn= comparatorType )* '>' )
			// Parser.g:1811:7: K_TUPLE '<' t1= comparatorType ( ',' tn= comparatorType )* '>'
			{
			match(input,K_TUPLE,FOLLOW_K_TUPLE_in_tuple_type14246); if (state.failed) return t;
			match(input,211,FOLLOW_211_in_tuple_type14248); if (state.failed) return t;
			pushFollow(FOLLOW_comparatorType_in_tuple_type14252);
			t1=comparatorType();
			state._fsp--;
			if (state.failed) return t;
			if ( state.backtracking==0 ) { types.add(t1); }
			// Parser.g:1811:56: ( ',' tn= comparatorType )*
			loop238:
			while (true) {
				int alt238=2;
				int LA238_0 = input.LA(1);
				if ( (LA238_0==204) ) {
					alt238=1;
				}

				switch (alt238) {
				case 1 :
					// Parser.g:1811:57: ',' tn= comparatorType
					{
					match(input,204,FOLLOW_204_in_tuple_type14257); if (state.failed) return t;
					pushFollow(FOLLOW_comparatorType_in_tuple_type14261);
					tn=comparatorType();
					state._fsp--;
					if (state.failed) return t;
					if ( state.backtracking==0 ) { types.add(tn); }
					}
					break;

				default :
					break loop238;
				}
			}

			match(input,214,FOLLOW_214_in_tuple_type14267); if (state.failed) return t;
			}

			if ( state.backtracking==0 ) {t = CQL3Type.Raw.tuple(types);}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "tuple_type"


	public static class username_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "username"
	// Parser.g:1814:1: username : ( IDENT | STRING_LITERAL | QUOTED_NAME );
	public final Cql_Parser.username_return username() throws RecognitionException {
		Cql_Parser.username_return retval = new Cql_Parser.username_return();
		retval.start = input.LT(1);

		try {
			// Parser.g:1815:5: ( IDENT | STRING_LITERAL | QUOTED_NAME )
			int alt239=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt239=1;
				}
				break;
			case STRING_LITERAL:
				{
				alt239=2;
				}
				break;
			case QUOTED_NAME:
				{
				alt239=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 239, 0, input);
				throw nvae;
			}
			switch (alt239) {
				case 1 :
					// Parser.g:1815:7: IDENT
					{
					match(input,IDENT,FOLLOW_IDENT_in_username14284); if (state.failed) return retval;
					}
					break;
				case 2 :
					// Parser.g:1816:7: STRING_LITERAL
					{
					match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_username14292); if (state.failed) return retval;
					}
					break;
				case 3 :
					// Parser.g:1817:7: QUOTED_NAME
					{
					match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_username14300); if (state.failed) return retval;
					if ( state.backtracking==0 ) { addRecognitionError("Quoted strings are are not supported for user names and USER is deprecated, please use ROLE");}
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "username"


	public static class mbean_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "mbean"
	// Parser.g:1820:1: mbean : STRING_LITERAL ;
	public final Cql_Parser.mbean_return mbean() throws RecognitionException {
		Cql_Parser.mbean_return retval = new Cql_Parser.mbean_return();
		retval.start = input.LT(1);

		try {
			// Parser.g:1821:5: ( STRING_LITERAL )
			// Parser.g:1821:7: STRING_LITERAL
			{
			match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_mbean14319); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mbean"



	// $ANTLR start "non_type_ident"
	// Parser.g:1826:1: non_type_ident returns [ColumnIdentifier id] : (t= IDENT |t= QUOTED_NAME |k= basic_unreserved_keyword |kk= K_KEY );
	public final ColumnIdentifier non_type_ident() throws RecognitionException {
		ColumnIdentifier id = null;


		Token t=null;
		Token kk=null;
		String k =null;

		try {
			// Parser.g:1827:5: (t= IDENT |t= QUOTED_NAME |k= basic_unreserved_keyword |kk= K_KEY )
			int alt240=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt240=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt240=2;
				}
				break;
			case K_ACCESS:
			case K_AGGREGATE:
			case K_AGGREGATES:
			case K_ALL:
			case K_AS:
			case K_CALLED:
			case K_CLUSTER:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_CUSTOM:
			case K_DATACENTERS:
			case K_DEFAULT:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_GROUP:
			case K_INITCOND:
			case K_INPUT:
			case K_INTERNALS:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_MBEAN:
			case K_MBEANS:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_ONLY:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_REPLACE:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TABLES:
			case K_TRIGGER:
			case K_TUPLE:
			case K_TYPE:
			case K_TYPES:
			case K_UNSET:
			case K_USER:
			case K_USERS:
			case K_VALUES:
				{
				alt240=3;
				}
				break;
			case K_KEY:
				{
				alt240=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return id;}
				NoViableAltException nvae =
					new NoViableAltException("", 240, 0, input);
				throw nvae;
			}
			switch (alt240) {
				case 1 :
					// Parser.g:1827:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_non_type_ident14344); if (state.failed) return id;
					if ( state.backtracking==0 ) { if (reservedTypeNames.contains((t!=null?t.getText():null))) addRecognitionError("Invalid (reserved) user type name " + (t!=null?t.getText():null)); id = new ColumnIdentifier((t!=null?t.getText():null), false); }
					}
					break;
				case 2 :
					// Parser.g:1828:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_non_type_ident14375); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = new ColumnIdentifier((t!=null?t.getText():null), true); }
					}
					break;
				case 3 :
					// Parser.g:1829:7: k= basic_unreserved_keyword
					{
					pushFollow(FOLLOW_basic_unreserved_keyword_in_non_type_ident14400);
					k=basic_unreserved_keyword();
					state._fsp--;
					if (state.failed) return id;
					if ( state.backtracking==0 ) { id = new ColumnIdentifier(k, false); }
					}
					break;
				case 4 :
					// Parser.g:1830:7: kk= K_KEY
					{
					kk=(Token)match(input,K_KEY,FOLLOW_K_KEY_in_non_type_ident14412); if (state.failed) return id;
					if ( state.backtracking==0 ) { id = new ColumnIdentifier((kk!=null?kk.getText():null), false); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "non_type_ident"



	// $ANTLR start "unreserved_keyword"
	// Parser.g:1833:1: unreserved_keyword returns [String str] : (u= unreserved_function_keyword |k= ( K_TTL | K_COUNT | K_WRITETIME | K_KEY | K_CAST | K_JSON | K_DISTINCT ) );
	public final String unreserved_keyword() throws RecognitionException {
		String str = null;


		Token k=null;
		String u =null;

		try {
			// Parser.g:1834:5: (u= unreserved_function_keyword |k= ( K_TTL | K_COUNT | K_WRITETIME | K_KEY | K_CAST | K_JSON | K_DISTINCT ) )
			int alt241=2;
			int LA241_0 = input.LA(1);
			if ( (LA241_0==K_ACCESS||(LA241_0 >= K_AGGREGATE && LA241_0 <= K_ALL)||LA241_0==K_AS||LA241_0==K_ASCII||(LA241_0 >= K_BIGINT && LA241_0 <= K_BOOLEAN)||LA241_0==K_CALLED||(LA241_0 >= K_CLUSTER && LA241_0 <= K_CLUSTERING)||(LA241_0 >= K_COMPACT && LA241_0 <= K_CONTAINS)||LA241_0==K_COUNTER||(LA241_0 >= K_CUSTOM && LA241_0 <= K_DEFAULT)||LA241_0==K_DOUBLE||LA241_0==K_DURATION||(LA241_0 >= K_EXISTS && LA241_0 <= K_FLOAT)||LA241_0==K_FROZEN||(LA241_0 >= K_FUNCTION && LA241_0 <= K_FUNCTIONS)||LA241_0==K_GROUP||(LA241_0 >= K_INET && LA241_0 <= K_INPUT)||(LA241_0 >= K_INT && LA241_0 <= K_INTERNALS)||LA241_0==K_KEYS||(LA241_0 >= K_KEYSPACES && LA241_0 <= K_LIKE)||(LA241_0 >= K_LIST && LA241_0 <= K_MAP)||(LA241_0 >= K_MBEAN && LA241_0 <= K_MBEANS)||LA241_0==K_NOLOGIN||LA241_0==K_NOSUPERUSER||(LA241_0 >= K_ONLY && LA241_0 <= K_OPTIONS)||(LA241_0 >= K_PARTITION && LA241_0 <= K_PERMISSIONS)||(LA241_0 >= K_REPLACE && LA241_0 <= K_RETURNS)||(LA241_0 >= K_ROLE && LA241_0 <= K_ROLES)||(LA241_0 >= K_SFUNC && LA241_0 <= K_TINYINT)||LA241_0==K_TRIGGER||(LA241_0 >= K_TUPLE && LA241_0 <= K_TYPES)||LA241_0==K_UNSET||(LA241_0 >= K_USER && LA241_0 <= K_USERS)||(LA241_0 >= K_UUID && LA241_0 <= K_VARINT)) ) {
				alt241=1;
			}
			else if ( (LA241_0==K_CAST||LA241_0==K_COUNT||LA241_0==K_DISTINCT||(LA241_0 >= K_JSON && LA241_0 <= K_KEY)||LA241_0==K_TTL||LA241_0==K_WRITETIME) ) {
				alt241=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 241, 0, input);
				throw nvae;
			}

			switch (alt241) {
				case 1 :
					// Parser.g:1834:7: u= unreserved_function_keyword
					{
					pushFollow(FOLLOW_unreserved_function_keyword_in_unreserved_keyword14455);
					u=unreserved_function_keyword();
					state._fsp--;
					if (state.failed) return str;
					if ( state.backtracking==0 ) { str = u; }
					}
					break;
				case 2 :
					// Parser.g:1835:7: k= ( K_TTL | K_COUNT | K_WRITETIME | K_KEY | K_CAST | K_JSON | K_DISTINCT )
					{
					k=input.LT(1);
					if ( input.LA(1)==K_CAST||input.LA(1)==K_COUNT||input.LA(1)==K_DISTINCT||(input.LA(1) >= K_JSON && input.LA(1) <= K_KEY)||input.LA(1)==K_TTL||input.LA(1)==K_WRITETIME ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return str;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					if ( state.backtracking==0 ) { str = (k!=null?k.getText():null); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "unreserved_keyword"



	// $ANTLR start "unreserved_function_keyword"
	// Parser.g:1838:1: unreserved_function_keyword returns [String str] : (u= basic_unreserved_keyword |t= native_type );
	public final String unreserved_function_keyword() throws RecognitionException {
		String str = null;


		String u =null;
		CQL3Type t =null;

		try {
			// Parser.g:1839:5: (u= basic_unreserved_keyword |t= native_type )
			int alt242=2;
			int LA242_0 = input.LA(1);
			if ( (LA242_0==K_ACCESS||(LA242_0 >= K_AGGREGATE && LA242_0 <= K_ALL)||LA242_0==K_AS||LA242_0==K_CALLED||(LA242_0 >= K_CLUSTER && LA242_0 <= K_CLUSTERING)||(LA242_0 >= K_COMPACT && LA242_0 <= K_CONTAINS)||(LA242_0 >= K_CUSTOM && LA242_0 <= K_DATACENTERS)||LA242_0==K_DEFAULT||(LA242_0 >= K_EXISTS && LA242_0 <= K_FINALFUNC)||LA242_0==K_FROZEN||(LA242_0 >= K_FUNCTION && LA242_0 <= K_FUNCTIONS)||LA242_0==K_GROUP||(LA242_0 >= K_INITCOND && LA242_0 <= K_INPUT)||LA242_0==K_INTERNALS||LA242_0==K_KEYS||(LA242_0 >= K_KEYSPACES && LA242_0 <= K_LIKE)||(LA242_0 >= K_LIST && LA242_0 <= K_MAP)||(LA242_0 >= K_MBEAN && LA242_0 <= K_MBEANS)||LA242_0==K_NOLOGIN||LA242_0==K_NOSUPERUSER||(LA242_0 >= K_ONLY && LA242_0 <= K_OPTIONS)||(LA242_0 >= K_PARTITION && LA242_0 <= K_PERMISSIONS)||(LA242_0 >= K_REPLACE && LA242_0 <= K_RETURNS)||(LA242_0 >= K_ROLE && LA242_0 <= K_ROLES)||LA242_0==K_SFUNC||(LA242_0 >= K_STATIC && LA242_0 <= K_TABLES)||LA242_0==K_TRIGGER||(LA242_0 >= K_TUPLE && LA242_0 <= K_TYPES)||LA242_0==K_UNSET||(LA242_0 >= K_USER && LA242_0 <= K_USERS)||LA242_0==K_VALUES) ) {
				alt242=1;
			}
			else if ( (LA242_0==K_ASCII||(LA242_0 >= K_BIGINT && LA242_0 <= K_BOOLEAN)||LA242_0==K_COUNTER||(LA242_0 >= K_DATE && LA242_0 <= K_DECIMAL)||LA242_0==K_DOUBLE||LA242_0==K_DURATION||LA242_0==K_FLOAT||LA242_0==K_INET||LA242_0==K_INT||LA242_0==K_SMALLINT||(LA242_0 >= K_TEXT && LA242_0 <= K_TINYINT)||LA242_0==K_UUID||(LA242_0 >= K_VARCHAR && LA242_0 <= K_VARINT)) ) {
				alt242=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 242, 0, input);
				throw nvae;
			}

			switch (alt242) {
				case 1 :
					// Parser.g:1839:7: u= basic_unreserved_keyword
					{
					pushFollow(FOLLOW_basic_unreserved_keyword_in_unreserved_function_keyword14522);
					u=basic_unreserved_keyword();
					state._fsp--;
					if (state.failed) return str;
					if ( state.backtracking==0 ) { str = u; }
					}
					break;
				case 2 :
					// Parser.g:1840:7: t= native_type
					{
					pushFollow(FOLLOW_native_type_in_unreserved_function_keyword14534);
					t=native_type();
					state._fsp--;
					if (state.failed) return str;
					if ( state.backtracking==0 ) { str = t.toString(); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "unreserved_function_keyword"



	// $ANTLR start "basic_unreserved_keyword"
	// Parser.g:1843:1: basic_unreserved_keyword returns [String str] : k= ( K_KEYS | K_AS | K_CLUSTER | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TABLES | K_TYPE | K_TYPES | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_ROLE | K_ROLES | K_SUPERUSER | K_NOSUPERUSER | K_LOGIN | K_NOLOGIN | K_OPTIONS | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER | K_CONTAINS | K_INTERNALS | K_ONLY | K_STATIC | K_FROZEN | K_TUPLE | K_FUNCTION | K_FUNCTIONS | K_AGGREGATE | K_AGGREGATES | K_SFUNC | K_STYPE | K_FINALFUNC | K_INITCOND | K_RETURNS | K_LANGUAGE | K_CALLED | K_INPUT | K_LIKE | K_PER | K_PARTITION | K_GROUP | K_DATACENTERS | K_ACCESS | K_DEFAULT | K_MBEAN | K_MBEANS | K_REPLACE | K_UNSET ) ;
	public final String basic_unreserved_keyword() throws RecognitionException {
		String str = null;


		Token k=null;

		try {
			// Parser.g:1844:5: (k= ( K_KEYS | K_AS | K_CLUSTER | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TABLES | K_TYPE | K_TYPES | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_ROLE | K_ROLES | K_SUPERUSER | K_NOSUPERUSER | K_LOGIN | K_NOLOGIN | K_OPTIONS | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER | K_CONTAINS | K_INTERNALS | K_ONLY | K_STATIC | K_FROZEN | K_TUPLE | K_FUNCTION | K_FUNCTIONS | K_AGGREGATE | K_AGGREGATES | K_SFUNC | K_STYPE | K_FINALFUNC | K_INITCOND | K_RETURNS | K_LANGUAGE | K_CALLED | K_INPUT | K_LIKE | K_PER | K_PARTITION | K_GROUP | K_DATACENTERS | K_ACCESS | K_DEFAULT | K_MBEAN | K_MBEANS | K_REPLACE | K_UNSET ) )
			// Parser.g:1844:7: k= ( K_KEYS | K_AS | K_CLUSTER | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TABLES | K_TYPE | K_TYPES | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_ROLE | K_ROLES | K_SUPERUSER | K_NOSUPERUSER | K_LOGIN | K_NOLOGIN | K_OPTIONS | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER | K_CONTAINS | K_INTERNALS | K_ONLY | K_STATIC | K_FROZEN | K_TUPLE | K_FUNCTION | K_FUNCTIONS | K_AGGREGATE | K_AGGREGATES | K_SFUNC | K_STYPE | K_FINALFUNC | K_INITCOND | K_RETURNS | K_LANGUAGE | K_CALLED | K_INPUT | K_LIKE | K_PER | K_PARTITION | K_GROUP | K_DATACENTERS | K_ACCESS | K_DEFAULT | K_MBEAN | K_MBEANS | K_REPLACE | K_UNSET )
			{
			k=input.LT(1);
			if ( input.LA(1)==K_ACCESS||(input.LA(1) >= K_AGGREGATE && input.LA(1) <= K_ALL)||input.LA(1)==K_AS||input.LA(1)==K_CALLED||(input.LA(1) >= K_CLUSTER && input.LA(1) <= K_CLUSTERING)||(input.LA(1) >= K_COMPACT && input.LA(1) <= K_CONTAINS)||(input.LA(1) >= K_CUSTOM && input.LA(1) <= K_DATACENTERS)||input.LA(1)==K_DEFAULT||(input.LA(1) >= K_EXISTS && input.LA(1) <= K_FINALFUNC)||input.LA(1)==K_FROZEN||(input.LA(1) >= K_FUNCTION && input.LA(1) <= K_FUNCTIONS)||input.LA(1)==K_GROUP||(input.LA(1) >= K_INITCOND && input.LA(1) <= K_INPUT)||input.LA(1)==K_INTERNALS||input.LA(1)==K_KEYS||(input.LA(1) >= K_KEYSPACES && input.LA(1) <= K_LIKE)||(input.LA(1) >= K_LIST && input.LA(1) <= K_MAP)||(input.LA(1) >= K_MBEAN && input.LA(1) <= K_MBEANS)||input.LA(1)==K_NOLOGIN||input.LA(1)==K_NOSUPERUSER||(input.LA(1) >= K_ONLY && input.LA(1) <= K_OPTIONS)||(input.LA(1) >= K_PARTITION && input.LA(1) <= K_PERMISSIONS)||(input.LA(1) >= K_REPLACE && input.LA(1) <= K_RETURNS)||(input.LA(1) >= K_ROLE && input.LA(1) <= K_ROLES)||input.LA(1)==K_SFUNC||(input.LA(1) >= K_STATIC && input.LA(1) <= K_TABLES)||input.LA(1)==K_TRIGGER||(input.LA(1) >= K_TUPLE && input.LA(1) <= K_TYPES)||input.LA(1)==K_UNSET||(input.LA(1) >= K_USER && input.LA(1) <= K_USERS)||input.LA(1)==K_VALUES ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return str;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			if ( state.backtracking==0 ) { str = (k!=null?k.getText():null); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "basic_unreserved_keyword"

	// $ANTLR start synpred1_Parser
	public final void synpred1_Parser_fragment() throws RecognitionException {
		// Parser.g:276:9: ( K_JSON selectClause )
		// Parser.g:276:10: K_JSON selectClause
		{
		match(input,K_JSON,FOLLOW_K_JSON_in_synpred1_Parser1088); if (state.failed) return;
		pushFollow(FOLLOW_selectClause_in_synpred1_Parser1090);
		selectClause();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred1_Parser

	// $ANTLR start synpred2_Parser
	public final void synpred2_Parser_fragment() throws RecognitionException {
		// Parser.g:298:7: ( K_DISTINCT selectors )
		// Parser.g:298:8: K_DISTINCT selectors
		{
		match(input,K_DISTINCT,FOLLOW_K_DISTINCT_in_synpred2_Parser1291); if (state.failed) return;
		pushFollow(FOLLOW_selectors_in_synpred2_Parser1293);
		selectors();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred2_Parser

	// $ANTLR start synpred3_Parser
	public final void synpred3_Parser_fragment() throws RecognitionException {
		// Parser.g:332:7: ( selectionGroupWithField )
		// Parser.g:332:8: selectionGroupWithField
		{
		pushFollow(FOLLOW_selectionGroupWithField_in_synpred3_Parser1622);
		selectionGroupWithField();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred3_Parser

	// $ANTLR start synpred4_Parser
	public final void synpred4_Parser_fragment() throws RecognitionException {
		// Parser.g:366:7: ( selectionTypeHint )
		// Parser.g:366:8: selectionTypeHint
		{
		pushFollow(FOLLOW_selectionTypeHint_in_synpred4_Parser1909);
		selectionTypeHint();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred4_Parser

	// $ANTLR start synpred5_Parser
	public final void synpred5_Parser_fragment() throws RecognitionException {
		// Parser.g:1320:7: ( K_CLUSTER )
		// Parser.g:1320:8: K_CLUSTER
		{
		match(input,K_CLUSTER,FOLLOW_K_CLUSTER_in_synpred5_Parser8933); if (state.failed) return;
		}

	}
	// $ANTLR end synpred5_Parser

	// $ANTLR start synpred6_Parser
	public final void synpred6_Parser_fragment() throws RecognitionException {
		// Parser.g:1322:7: ( K_KEYSPACES )
		// Parser.g:1322:8: K_KEYSPACES
		{
		match(input,K_KEYSPACES,FOLLOW_K_KEYSPACES_in_synpred6_Parser8989); if (state.failed) return;
		}

	}
	// $ANTLR end synpred6_Parser

	// $ANTLR start synpred7_Parser
	public final void synpred7_Parser_fragment() throws RecognitionException {
		// Parser.g:1325:7: ( K_TABLES )
		// Parser.g:1325:8: K_TABLES
		{
		match(input,K_TABLES,FOLLOW_K_TABLES_in_synpred7_Parser9096); if (state.failed) return;
		}

	}
	// $ANTLR end synpred7_Parser

	// $ANTLR start synpred8_Parser
	public final void synpred8_Parser_fragment() throws RecognitionException {
		// Parser.g:1329:7: ( K_TYPES )
		// Parser.g:1329:8: K_TYPES
		{
		match(input,K_TYPES,FOLLOW_K_TYPES_in_synpred8_Parser9201); if (state.failed) return;
		}

	}
	// $ANTLR end synpred8_Parser

	// $ANTLR start synpred9_Parser
	public final void synpred9_Parser_fragment() throws RecognitionException {
		// Parser.g:1331:7: ( K_FUNCTIONS )
		// Parser.g:1331:8: K_FUNCTIONS
		{
		match(input,K_FUNCTIONS,FOLLOW_K_FUNCTIONS_in_synpred9_Parser9275); if (state.failed) return;
		}

	}
	// $ANTLR end synpred9_Parser

	// $ANTLR start synpred10_Parser
	public final void synpred10_Parser_fragment() throws RecognitionException {
		// Parser.g:1333:7: ( K_AGGREGATES )
		// Parser.g:1333:8: K_AGGREGATES
		{
		match(input,K_AGGREGATES,FOLLOW_K_AGGREGATES_in_synpred10_Parser9337); if (state.failed) return;
		}

	}
	// $ANTLR end synpred10_Parser

	// Delegated rules

	public final boolean synpred2_Parser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_Parser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred10_Parser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred10_Parser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_Parser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_Parser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_Parser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_Parser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_Parser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_Parser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred5_Parser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_Parser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred6_Parser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_Parser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred7_Parser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred7_Parser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred8_Parser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred8_Parser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred9_Parser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred9_Parser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA1 dfa1 = new DFA1(this);
	protected DFA2 dfa2 = new DFA2(this);
	protected DFA11 dfa11 = new DFA11(this);
	protected DFA17 dfa17 = new DFA17(this);
	protected DFA22 dfa22 = new DFA22(this);
	protected DFA30 dfa30 = new DFA30(this);
	protected DFA31 dfa31 = new DFA31(this);
	protected DFA61 dfa61 = new DFA61(this);
	protected DFA146 dfa146 = new DFA146(this);
	protected DFA175 dfa175 = new DFA175(this);
	protected DFA173 dfa173 = new DFA173(this);
	protected DFA181 dfa181 = new DFA181(this);
	protected DFA182 dfa182 = new DFA182(this);
	protected DFA200 dfa200 = new DFA200(this);
	protected DFA202 dfa202 = new DFA202(this);
	protected DFA204 dfa204 = new DFA204(this);
	protected DFA206 dfa206 = new DFA206(this);
	protected DFA209 dfa209 = new DFA209(this);
	protected DFA212 dfa212 = new DFA212(this);
	protected DFA220 dfa220 = new DFA220(this);
	protected DFA225 dfa225 = new DFA225(this);
	protected DFA224 dfa224 = new DFA224(this);
	protected DFA235 dfa235 = new DFA235(this);
	static final String DFA1_eotS =
		"\64\uffff";
	static final String DFA1_eofS =
		"\64\uffff";
	static final String DFA1_minS =
		"\1\44\7\uffff\2\40\1\65\2\32\1\42\11\uffff\1\u0084\22\uffff\1\166\2\uffff"+
		"\1\115\5\uffff\1\40";
	static final String DFA1_maxS =
		"\1\u00a3\7\uffff\3\u00a4\2\u00bc\1\u00a5\11\uffff\1\u0084\22\uffff\1\u0098"+
		"\2\uffff\1\177\5\uffff\1\120";
	static final String DFA1_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\6\uffff\1\51\1\10\1\11\1\23\1\27"+
		"\1\31\1\40\1\46\1\12\1\uffff\1\34\1\36\1\13\1\14\1\15\1\25\1\30\1\33\1"+
		"\35\1\37\1\42\1\47\1\16\1\17\1\24\1\32\1\41\1\50\1\uffff\1\20\1\44\1\uffff"+
		"\1\21\1\45\1\26\1\43\1\22\1\uffff";
	static final String DFA1_specialS =
		"\64\uffff}>";
	static final String[] DFA1_transitionS = {
			"\1\12\7\uffff\1\4\15\uffff\1\10\5\uffff\1\5\2\16\2\uffff\1\11\14\uffff"+
			"\1\13\7\uffff\1\2\14\uffff\1\15\36\uffff\1\14\3\uffff\1\1\20\uffff\1"+
			"\7\6\uffff\1\3\1\6",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\31\24\uffff\1\20\5\uffff\1\26\24\uffff\1\30\5\uffff\1\26\13\uffff"+
			"\1\17\7\uffff\1\25\16\uffff\1\27\15\uffff\1\24\22\uffff\1\22\3\uffff"+
			"\1\23\5\uffff\1\21",
			"\1\41\24\uffff\1\33\32\uffff\1\40\5\uffff\1\34\13\uffff\1\32\7\uffff"+
			"\1\43\34\uffff\1\42\22\uffff\1\36\3\uffff\1\37\5\uffff\1\35",
			"\1\44\54\uffff\1\45\7\uffff\1\51\34\uffff\1\50\26\uffff\1\47\5\uffff"+
			"\1\46",
			"\1\54\3\uffff\1\54\1\uffff\2\54\1\52\1\uffff\1\53\2\uffff\1\54\1\uffff"+
			"\1\54\1\53\2\uffff\3\54\1\uffff\4\54\1\uffff\4\54\1\53\5\54\2\uffff\1"+
			"\53\2\54\1\53\1\54\1\uffff\1\53\4\54\1\uffff\1\54\1\uffff\2\54\1\uffff"+
			"\1\54\3\uffff\3\54\1\uffff\2\54\2\uffff\3\54\1\uffff\3\54\1\uffff\3\54"+
			"\1\uffff\2\54\1\53\2\uffff\1\54\1\uffff\1\54\4\uffff\2\54\2\uffff\5\54"+
			"\4\uffff\2\54\1\uffff\2\54\1\uffff\1\53\1\uffff\14\54\2\uffff\1\54\1"+
			"\uffff\4\54\1\uffff\1\54\2\uffff\2\54\1\uffff\4\54\3\uffff\1\54\10\uffff"+
			"\2\54\3\uffff\1\54",
			"\1\57\3\uffff\1\57\1\uffff\2\57\1\55\1\uffff\1\56\2\uffff\1\57\1\uffff"+
			"\1\57\1\56\2\uffff\3\57\1\uffff\4\57\1\uffff\4\57\1\56\5\57\2\uffff\1"+
			"\56\2\57\1\56\1\57\1\uffff\1\56\4\57\1\uffff\1\57\1\uffff\2\57\1\uffff"+
			"\1\57\3\uffff\3\57\1\uffff\2\57\2\uffff\3\57\1\uffff\3\57\1\uffff\3\57"+
			"\1\uffff\2\57\1\56\2\uffff\1\57\1\uffff\1\57\4\uffff\2\57\2\uffff\5\57"+
			"\4\uffff\2\57\1\uffff\2\57\1\uffff\1\56\1\uffff\14\57\2\uffff\1\57\1"+
			"\uffff\4\57\1\uffff\1\57\2\uffff\2\57\1\uffff\4\57\3\uffff\1\57\10\uffff"+
			"\2\57\3\uffff\1\57",
			"\1\62\1\uffff\1\62\5\uffff\1\62\17\uffff\1\62\7\uffff\1\62\2\uffff\1"+
			"\62\2\uffff\1\62\44\uffff\1\62\32\uffff\1\61\1\uffff\1\62\32\uffff\1"+
			"\60",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\63",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\53\10\uffff\1\53\30\uffff\1\54",
			"",
			"",
			"\1\57\50\uffff\1\56\10\uffff\1\56",
			"",
			"",
			"",
			"",
			"",
			"\1\31\57\uffff\1\30"
	};

	static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
	static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
	static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
	static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
	static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
	static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
	static final short[][] DFA1_transition;

	static {
		int numStates = DFA1_transitionS.length;
		DFA1_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
		}
	}

	protected class DFA1 extends DFA {

		public DFA1(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 1;
			this.eot = DFA1_eot;
			this.eof = DFA1_eof;
			this.min = DFA1_min;
			this.max = DFA1_max;
			this.accept = DFA1_accept;
			this.special = DFA1_special;
			this.transition = DFA1_transition;
		}
		@Override
		public String getDescription() {
			return "207:1: cqlStatement returns [CQLStatement.Raw stmt] : (st1= selectStatement |st2= insertStatement |st3= updateStatement |st4= batchStatement |st5= deleteStatement |st6= useStatement |st7= truncateStatement |st8= createKeyspaceStatement |st9= createTableStatement |st10= createIndexStatement |st11= dropKeyspaceStatement |st12= dropTableStatement |st13= dropIndexStatement |st14= alterTableStatement |st15= alterKeyspaceStatement |st16= grantPermissionsStatement |st17= revokePermissionsStatement |st18= listPermissionsStatement |st19= createUserStatement |st20= alterUserStatement |st21= dropUserStatement |st22= listUsersStatement |st23= createTriggerStatement |st24= dropTriggerStatement |st25= createTypeStatement |st26= alterTypeStatement |st27= dropTypeStatement |st28= createFunctionStatement |st29= dropFunctionStatement |st30= createAggregateStatement |st31= dropAggregateStatement |st32= createRoleStatement |st33= alterRoleStatement |st34= dropRoleStatement |st35= listRolesStatement |st36= grantRoleStatement |st37= revokeRoleStatement |st38= createMaterializedViewStatement |st39= dropMaterializedViewStatement |st40= alterMaterializedViewStatement |st41= describeStatement );";
		}
	}

	static final String DFA2_eotS =
		"\64\uffff";
	static final String DFA2_eofS =
		"\64\uffff";
	static final String DFA2_minS =
		"\1\6\1\0\62\uffff";
	static final String DFA2_maxS =
		"\1\u00dc\1\0\62\uffff";
	static final String DFA2_acceptS =
		"\2\uffff\1\2\60\uffff\1\1";
	static final String DFA2_specialS =
		"\1\uffff\1\0\62\uffff}>";
	static final String[] DFA2_transitionS = {
			"\1\2\4\uffff\1\2\10\uffff\1\2\3\uffff\1\2\1\uffff\2\2\2\uffff\1\2\1\uffff"+
			"\3\2\4\uffff\1\2\1\uffff\1\2\3\uffff\3\2\1\uffff\4\2\1\uffff\4\2\1\uffff"+
			"\5\2\3\uffff\2\2\1\uffff\1\2\2\uffff\4\2\1\uffff\1\2\1\uffff\2\2\1\uffff"+
			"\1\2\3\uffff\3\2\1\uffff\2\2\2\uffff\1\1\2\2\1\uffff\3\2\1\uffff\3\2"+
			"\1\uffff\2\2\1\uffff\3\2\1\uffff\1\2\1\uffff\1\2\2\uffff\2\2\2\uffff"+
			"\7\2\2\uffff\2\2\1\uffff\2\2\3\uffff\14\2\1\uffff\2\2\1\uffff\4\2\1\uffff"+
			"\1\2\2\uffff\2\2\1\uffff\4\2\3\uffff\1\2\10\uffff\2\2\3\uffff\1\2\2\uffff"+
			"\1\2\10\uffff\1\2\4\uffff\1\2\3\uffff\1\2\6\uffff\2\2\2\uffff\1\2",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
	static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
	static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
	static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
	static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
	static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
	static final short[][] DFA2_transition;

	static {
		int numStates = DFA2_transitionS.length;
		DFA2_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
		}
	}

	protected class DFA2 extends DFA {

		public DFA2(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 2;
			this.eot = DFA2_eot;
			this.eof = DFA2_eof;
			this.min = DFA2_min;
			this.max = DFA2_max;
			this.accept = DFA2_accept;
			this.special = DFA2_special;
			this.transition = DFA2_transition;
		}
		@Override
		public String getDescription() {
			return "276:7: ( ( K_JSON selectClause )=> K_JSON )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA2_1 = input.LA(1);
						 
						int index2_1 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Parser()) ) {s = 51;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index2_1);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 2, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA11_eotS =
		"\63\uffff";
	static final String DFA11_eofS =
		"\63\uffff";
	static final String DFA11_minS =
		"\1\6\1\0\61\uffff";
	static final String DFA11_maxS =
		"\1\u00dc\1\0\61\uffff";
	static final String DFA11_acceptS =
		"\2\uffff\1\2\57\uffff\1\1";
	static final String DFA11_specialS =
		"\1\uffff\1\0\61\uffff}>";
	static final String[] DFA11_transitionS = {
			"\1\2\4\uffff\1\2\10\uffff\1\2\3\uffff\1\2\1\uffff\2\2\2\uffff\1\2\1\uffff"+
			"\3\2\4\uffff\1\2\1\uffff\1\2\3\uffff\3\2\1\uffff\4\2\1\uffff\4\2\1\uffff"+
			"\5\2\3\uffff\1\1\1\2\1\uffff\1\2\2\uffff\4\2\1\uffff\1\2\1\uffff\2\2"+
			"\1\uffff\1\2\3\uffff\3\2\1\uffff\2\2\2\uffff\3\2\1\uffff\3\2\1\uffff"+
			"\3\2\1\uffff\2\2\1\uffff\3\2\1\uffff\1\2\1\uffff\1\2\2\uffff\2\2\2\uffff"+
			"\7\2\2\uffff\2\2\1\uffff\2\2\3\uffff\14\2\1\uffff\2\2\1\uffff\4\2\1\uffff"+
			"\1\2\2\uffff\2\2\1\uffff\4\2\3\uffff\1\2\10\uffff\2\2\3\uffff\1\2\2\uffff"+
			"\1\2\10\uffff\1\2\4\uffff\1\2\3\uffff\1\2\6\uffff\2\2\2\uffff\1\2",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "295:1: selectClause returns [boolean isDistinct, List<RawSelector> selectors] : ( ( K_DISTINCT selectors )=> K_DISTINCT s= selectors |s= selectors );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA11_1 = input.LA(1);
						 
						int index11_1 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Parser()) ) {s = 50;}
						else if ( (true) ) {s = 2;}
						 
						input.seek(index11_1);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 11, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA17_eotS =
		"\62\uffff";
	static final String DFA17_eofS =
		"\62\uffff";
	static final String DFA17_minS =
		"\1\6\56\0\3\uffff";
	static final String DFA17_maxS =
		"\1\u00dc\56\0\3\uffff";
	static final String DFA17_acceptS =
		"\57\uffff\1\3\1\1\1\2";
	static final String DFA17_specialS =
		"\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
		"\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
		"\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
		"\1\52\1\53\1\54\1\55\3\uffff}>";
	static final String[] DFA17_transitionS = {
			"\1\35\4\uffff\1\36\10\uffff\1\34\3\uffff\1\40\1\uffff\1\1\1\33\2\uffff"+
			"\1\3\1\uffff\3\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\51\2\3\1\uffff\2\3\1\31\1\10\1\uffff\2\3\1\27\1\11\1\3\3\uffff"+
			"\1\52\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff\2\3\1\uffff"+
			"\1\3\3\uffff\1\15\2\3\1\uffff\1\16\1\3\2\uffff\2\52\1\3\1\uffff\3\3\1"+
			"\uffff\3\3\1\uffff\2\3\1\uffff\1\43\1\41\1\3\1\uffff\1\3\1\uffff\1\44"+
			"\2\uffff\2\3\2\uffff\5\3\1\42\1\41\2\uffff\2\3\1\uffff\2\3\3\uffff\1"+
			"\3\1\17\5\3\1\20\1\30\1\21\1\26\1\22\1\uffff\1\53\1\3\1\uffff\1\50\3"+
			"\3\1\uffff\1\3\2\uffff\2\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff\1\47\10"+
			"\uffff\1\46\1\2\3\uffff\1\32\2\uffff\1\37\10\uffff\1\54\4\uffff\1\57"+
			"\3\uffff\1\45\6\uffff\1\55\3\uffff\1\56",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			""
	};

	static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
	static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
	static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
	static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
	static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
	static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
	static final short[][] DFA17_transition;

	static {
		int numStates = DFA17_transitionS.length;
		DFA17_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
		}
	}

	protected class DFA17 extends DFA {

		public DFA17(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 17;
			this.eot = DFA17_eot;
			this.eof = DFA17_eof;
			this.min = DFA17_min;
			this.max = DFA17_max;
			this.accept = DFA17_accept;
			this.special = DFA17_special;
			this.transition = DFA17_transition;
		}
		@Override
		public String getDescription() {
			return "331:1: selectionGroup returns [Selectable.Raw s] : ( ( selectionGroupWithField )=>f= selectionGroupWithField |g= selectionGroupWithoutField | '-' g= selectionGroup );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA17_1 = input.LA(1);
						 
						int index17_1 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_1);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA17_2 = input.LA(1);
						 
						int index17_2 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_2);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA17_3 = input.LA(1);
						 
						int index17_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_3);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA17_4 = input.LA(1);
						 
						int index17_4 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_4);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA17_5 = input.LA(1);
						 
						int index17_5 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_5);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA17_6 = input.LA(1);
						 
						int index17_6 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_6);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA17_7 = input.LA(1);
						 
						int index17_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_7);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA17_8 = input.LA(1);
						 
						int index17_8 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_8);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA17_9 = input.LA(1);
						 
						int index17_9 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_9);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA17_10 = input.LA(1);
						 
						int index17_10 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_10);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA17_11 = input.LA(1);
						 
						int index17_11 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_11);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA17_12 = input.LA(1);
						 
						int index17_12 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_12);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA17_13 = input.LA(1);
						 
						int index17_13 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_13);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA17_14 = input.LA(1);
						 
						int index17_14 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_14);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA17_15 = input.LA(1);
						 
						int index17_15 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_15);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA17_16 = input.LA(1);
						 
						int index17_16 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_16);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA17_17 = input.LA(1);
						 
						int index17_17 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_17);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA17_18 = input.LA(1);
						 
						int index17_18 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_18);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA17_19 = input.LA(1);
						 
						int index17_19 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_19);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA17_20 = input.LA(1);
						 
						int index17_20 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_20);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA17_21 = input.LA(1);
						 
						int index17_21 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_21);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA17_22 = input.LA(1);
						 
						int index17_22 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_22);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA17_23 = input.LA(1);
						 
						int index17_23 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_23);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA17_24 = input.LA(1);
						 
						int index17_24 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_24);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA17_25 = input.LA(1);
						 
						int index17_25 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_25);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA17_26 = input.LA(1);
						 
						int index17_26 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_26);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA17_27 = input.LA(1);
						 
						int index17_27 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_27);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA17_28 = input.LA(1);
						 
						int index17_28 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_28);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA17_29 = input.LA(1);
						 
						int index17_29 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_29);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA17_30 = input.LA(1);
						 
						int index17_30 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_30);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA17_31 = input.LA(1);
						 
						int index17_31 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_31);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA17_32 = input.LA(1);
						 
						int index17_32 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_32);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA17_33 = input.LA(1);
						 
						int index17_33 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_33);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA17_34 = input.LA(1);
						 
						int index17_34 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_34);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA17_35 = input.LA(1);
						 
						int index17_35 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_35);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA17_36 = input.LA(1);
						 
						int index17_36 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_36);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA17_37 = input.LA(1);
						 
						int index17_37 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_37);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA17_38 = input.LA(1);
						 
						int index17_38 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_38);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA17_39 = input.LA(1);
						 
						int index17_39 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_39);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA17_40 = input.LA(1);
						 
						int index17_40 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_40);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA17_41 = input.LA(1);
						 
						int index17_41 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_41);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA17_42 = input.LA(1);
						 
						int index17_42 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_42);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA17_43 = input.LA(1);
						 
						int index17_43 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_43);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA17_44 = input.LA(1);
						 
						int index17_44 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_44);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA17_45 = input.LA(1);
						 
						int index17_45 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_45);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA17_46 = input.LA(1);
						 
						int index17_46 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Parser()) ) {s = 48;}
						else if ( (true) ) {s = 49;}
						 
						input.seek(index17_46);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 17, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA22_eotS =
		"\61\uffff";
	static final String DFA22_eofS =
		"\61\uffff";
	static final String DFA22_minS =
		"\1\6\53\uffff\1\0\4\uffff";
	static final String DFA22_maxS =
		"\1\u00dc\53\uffff\1\0\4\uffff";
	static final String DFA22_acceptS =
		"\1\uffff\1\1\53\uffff\1\4\1\5\1\2\1\3";
	static final String DFA22_specialS =
		"\54\uffff\1\0\4\uffff}>";
	static final String[] DFA22_transitionS = {
			"\1\1\4\uffff\1\1\10\uffff\1\1\3\uffff\1\1\1\uffff\2\1\2\uffff\1\1\1\uffff"+
			"\3\1\4\uffff\1\1\1\uffff\1\1\3\uffff\3\1\1\uffff\4\1\1\uffff\4\1\1\uffff"+
			"\5\1\3\uffff\2\1\1\uffff\1\1\2\uffff\4\1\1\uffff\1\1\1\uffff\2\1\1\uffff"+
			"\1\1\3\uffff\3\1\1\uffff\2\1\2\uffff\3\1\1\uffff\3\1\1\uffff\3\1\1\uffff"+
			"\2\1\1\uffff\3\1\1\uffff\1\1\1\uffff\1\1\2\uffff\2\1\2\uffff\7\1\2\uffff"+
			"\2\1\1\uffff\2\1\3\uffff\14\1\1\uffff\2\1\1\uffff\4\1\1\uffff\1\1\2\uffff"+
			"\2\1\1\uffff\4\1\3\uffff\1\1\10\uffff\2\1\3\uffff\1\1\2\uffff\1\1\10"+
			"\uffff\1\54\10\uffff\1\1\6\uffff\1\55\3\uffff\1\56",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			""
	};

	static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
	static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
	static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
	static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
	static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
	static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
	static final short[][] DFA22_transition;

	static {
		int numStates = DFA22_transitionS.length;
		DFA22_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
		}
	}

	protected class DFA22 extends DFA {

		public DFA22(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 22;
			this.eot = DFA22_eot;
			this.eof = DFA22_eof;
			this.min = DFA22_min;
			this.max = DFA22_max;
			this.accept = DFA22_accept;
			this.special = DFA22_special;
			this.transition = DFA22_transition;
		}
		@Override
		public String getDescription() {
			return "362:1: selectionGroupWithoutField returns [Selectable.Raw s] : (sn= simpleUnaliasedSelector | ( selectionTypeHint )=>h= selectionTypeHint |t= selectionTupleOrNestedSelector |l= selectionList |m= selectionMapOrSet );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA22_44 = input.LA(1);
						 
						int index22_44 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Parser()) ) {s = 47;}
						else if ( (true) ) {s = 48;}
						 
						input.seek(index22_44);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 22, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA30_eotS =
		"\126\uffff";
	static final String DFA30_eofS =
		"\1\uffff\31\41\1\uffff\1\32\4\41\4\uffff\31\41\31\32";
	static final String DFA30_minS =
		"\1\6\31\47\1\uffff\5\47\2\uffff\2\32\62\47";
	static final String DFA30_maxS =
		"\1\u00d1\31\u00dd\1\uffff\5\u00dd\2\uffff\2\u00b8\62\u00dd";
	static final String DFA30_acceptS =
		"\32\uffff\1\2\5\uffff\1\3\1\1\64\uffff";
	static final String DFA30_specialS =
		"\126\uffff}>";
	static final String[] DFA30_transitionS = {
			"\1\32\4\uffff\1\32\10\uffff\1\32\3\uffff\1\32\1\uffff\1\1\1\32\2\uffff"+
			"\1\3\1\uffff\3\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\36\2\3\1\uffff\2\3\1\31\1\10\1\uffff\2\3\1\27\1\11\1\3\3\uffff"+
			"\1\37\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff\2\3\1\uffff"+
			"\1\3\3\uffff\1\15\2\3\1\uffff\1\16\1\3\2\uffff\2\37\1\3\1\uffff\3\3\1"+
			"\uffff\3\3\1\uffff\2\3\1\uffff\2\32\1\3\1\uffff\1\3\1\uffff\1\32\2\uffff"+
			"\2\3\2\uffff\5\3\2\32\2\uffff\2\3\1\uffff\2\3\3\uffff\1\3\1\17\5\3\1"+
			"\20\1\30\1\21\1\26\1\22\1\uffff\1\40\1\3\1\uffff\1\35\3\3\1\uffff\1\3"+
			"\2\uffff\2\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff\1\34\10\uffff\1\33\1"+
			"\2\3\uffff\1\32\2\uffff\1\32\21\uffff\1\32",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"",
			"\1\32\45\uffff\1\32\171\uffff\1\32\1\uffff\2\32\1\uffff\2\32\1\uffff"+
			"\1\43\2\32\6\uffff\3\32\2\uffff\1\32",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\1"+
			"\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\uffff\2\41\1\uffff\2\41\1\uffff"+
			"\1\42\2\41\6\uffff\3\41\2\uffff\1\41",
			"",
			"",
			"\1\44\3\uffff\1\46\1\uffff\3\46\4\uffff\1\46\1\uffff\1\47\3\uffff\1"+
			"\50\1\51\1\52\1\uffff\1\46\1\41\2\46\1\uffff\2\46\1\74\1\53\1\uffff\2"+
			"\46\1\72\1\54\1\46\3\uffff\1\41\1\55\1\uffff\1\56\2\uffff\3\46\1\57\1"+
			"\uffff\1\46\1\uffff\2\46\1\uffff\1\46\3\uffff\1\60\2\46\1\uffff\1\61"+
			"\1\46\2\uffff\2\41\1\46\1\uffff\3\46\1\uffff\3\46\1\uffff\2\46\3\uffff"+
			"\1\46\1\uffff\1\46\4\uffff\2\46\2\uffff\5\46\4\uffff\2\46\1\uffff\2\46"+
			"\3\uffff\1\46\1\62\5\46\1\63\1\73\1\64\1\71\1\65\1\uffff\1\40\1\46\1"+
			"\uffff\1\41\3\46\1\uffff\1\46\2\uffff\2\46\1\uffff\1\66\1\46\1\67\1\70"+
			"\3\uffff\1\41\11\uffff\1\45",
			"\1\75\3\uffff\1\77\1\uffff\3\77\4\uffff\1\77\1\uffff\1\100\3\uffff\1"+
			"\101\1\102\1\103\1\uffff\1\77\1\32\2\77\1\uffff\2\77\1\125\1\104\1\uffff"+
			"\2\77\1\123\1\105\1\77\3\uffff\1\32\1\106\1\uffff\1\107\2\uffff\3\77"+
			"\1\110\1\uffff\1\77\1\uffff\2\77\1\uffff\1\77\3\uffff\1\111\2\77\1\uffff"+
			"\1\112\1\77\2\uffff\2\32\1\77\1\uffff\3\77\1\uffff\3\77\1\uffff\2\77"+
			"\3\uffff\1\77\1\uffff\1\77\4\uffff\2\77\2\uffff\5\77\4\uffff\2\77\1\uffff"+
			"\2\77\3\uffff\1\77\1\113\5\77\1\114\1\124\1\115\1\122\1\116\1\uffff\1"+
			"\40\1\77\1\uffff\1\32\3\77\1\uffff\1\77\2\uffff\2\77\1\uffff\1\117\1"+
			"\77\1\120\1\121\3\uffff\1\32\11\uffff\1\76",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\41\45\uffff\1\41\171\uffff\1\41\1\40\2\41\1\uffff\2\41\1\uffff\3"+
			"\41\6\uffff\3\41\2\uffff\1\41",
			"\1\32\45\uffff\1\32\171\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\45\uffff\1\32\171\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\45\uffff\1\32\171\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\45\uffff\1\32\171\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\45\uffff\1\32\171\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\45\uffff\1\32\171\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\45\uffff\1\32\171\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\45\uffff\1\32\171\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\45\uffff\1\32\171\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\45\uffff\1\32\171\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\45\uffff\1\32\171\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\45\uffff\1\32\171\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\45\uffff\1\32\171\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\45\uffff\1\32\171\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\45\uffff\1\32\171\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\45\uffff\1\32\171\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\45\uffff\1\32\171\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\45\uffff\1\32\171\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\45\uffff\1\32\171\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\45\uffff\1\32\171\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\45\uffff\1\32\171\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\45\uffff\1\32\171\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\45\uffff\1\32\171\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\45\uffff\1\32\171\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32",
			"\1\32\45\uffff\1\32\171\uffff\1\32\1\40\2\32\1\uffff\2\32\1\uffff\3"+
			"\32\6\uffff\3\32\2\uffff\1\32"
	};

	static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
	static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
	static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
	static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
	static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
	static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
	static final short[][] DFA30_transition;

	static {
		int numStates = DFA30_transitionS.length;
		DFA30_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
		}
	}

	protected class DFA30 extends DFA {

		public DFA30(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 30;
			this.eot = DFA30_eot;
			this.eof = DFA30_eof;
			this.min = DFA30_min;
			this.max = DFA30_max;
			this.accept = DFA30_accept;
			this.special = DFA30_special;
			this.transition = DFA30_transition;
		}
		@Override
		public String getDescription() {
			return "410:1: simpleUnaliasedSelector returns [Selectable.Raw s] : (c= sident |l= selectionLiteral |f= selectionFunction );";
		}
	}

	static final String DFA31_eotS =
		"\13\uffff";
	static final String DFA31_eofS =
		"\13\uffff";
	static final String DFA31_minS =
		"\1\32\4\u00c8\1\uffff\1\6\4\uffff";
	static final String DFA31_maxS =
		"\1\u00b8\4\u00cf\1\uffff\1\u00dc\4\uffff";
	static final String DFA31_acceptS =
		"\5\uffff\1\5\1\uffff\1\2\1\3\1\4\1\1";
	static final String DFA31_specialS =
		"\13\uffff}>";
	static final String[] DFA31_transitionS = {
			"\1\5\3\uffff\1\5\1\uffff\3\5\4\uffff\1\5\1\uffff\1\5\3\uffff\3\5\1\uffff"+
			"\1\5\1\4\2\5\1\uffff\2\5\1\1\1\5\1\uffff\5\5\3\uffff\2\5\1\uffff\1\5"+
			"\2\uffff\4\5\1\uffff\1\5\1\uffff\2\5\1\uffff\1\5\3\uffff\3\5\1\uffff"+
			"\2\5\2\uffff\3\5\1\uffff\3\5\1\uffff\3\5\1\uffff\2\5\3\uffff\1\5\1\uffff"+
			"\1\5\4\uffff\2\5\2\uffff\5\5\4\uffff\2\5\1\uffff\2\5\3\uffff\14\5\1\uffff"+
			"\2\5\1\uffff\1\3\3\5\1\uffff\1\5\2\uffff\2\5\1\uffff\4\5\3\uffff\1\2"+
			"\10\uffff\2\5",
			"\1\6\6\uffff\1\5",
			"\1\7\6\uffff\1\5",
			"\1\10\6\uffff\1\5",
			"\1\11\6\uffff\1\5",
			"",
			"\1\5\4\uffff\1\5\10\uffff\1\5\3\uffff\1\5\1\uffff\2\5\2\uffff\1\5\1"+
			"\uffff\3\5\4\uffff\1\5\1\uffff\1\5\3\uffff\3\5\1\uffff\4\5\1\uffff\4"+
			"\5\1\uffff\5\5\3\uffff\2\5\1\uffff\1\5\2\uffff\4\5\1\uffff\1\5\1\uffff"+
			"\2\5\1\uffff\1\5\3\uffff\3\5\1\uffff\2\5\2\uffff\3\5\1\uffff\3\5\1\uffff"+
			"\3\5\1\uffff\2\5\1\uffff\3\5\1\uffff\1\5\1\uffff\1\5\2\uffff\2\5\2\uffff"+
			"\7\5\2\uffff\2\5\1\uffff\2\5\3\uffff\14\5\1\uffff\2\5\1\uffff\4\5\1\uffff"+
			"\1\5\2\uffff\2\5\1\uffff\4\5\3\uffff\1\5\10\uffff\2\5\3\uffff\1\5\2\uffff"+
			"\1\5\10\uffff\2\5\3\uffff\1\5\3\uffff\1\5\6\uffff\1\5\1\12\2\uffff\1"+
			"\5",
			"",
			"",
			"",
			""
	};

	static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
	static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
	static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
	static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
	static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
	static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
	static final short[][] DFA31_transition;

	static {
		int numStates = DFA31_transitionS.length;
		DFA31_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
		}
	}

	protected class DFA31 extends DFA {

		public DFA31(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 31;
			this.eot = DFA31_eot;
			this.eof = DFA31_eof;
			this.min = DFA31_min;
			this.max = DFA31_max;
			this.accept = DFA31_accept;
			this.special = DFA31_special;
			this.transition = DFA31_transition;
		}
		@Override
		public String getDescription() {
			return "416:1: selectionFunction returns [Selectable.Raw s] : ( K_COUNT '(' '\\*' ')' | K_WRITETIME '(' c= sident ')' | K_TTL '(' c= sident ')' | K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')' |f= functionName args= selectionFunctionArgs );";
		}
	}

	static final String DFA61_eotS =
		"\36\uffff";
	static final String DFA61_eofS =
		"\36\uffff";
	static final String DFA61_minS =
		"\1\21\32\115\3\uffff";
	static final String DFA61_maxS =
		"\1\u00b8\32\u00d8\3\uffff";
	static final String DFA61_acceptS =
		"\33\uffff\1\1\1\2\1\3";
	static final String DFA61_specialS =
		"\36\uffff}>";
	static final String[] DFA61_transitionS = {
			"\1\1\10\uffff\1\2\3\uffff\1\4\1\uffff\3\4\4\uffff\1\4\1\uffff\1\5\3\uffff"+
			"\1\6\1\7\1\10\1\uffff\1\4\1\32\2\4\1\uffff\2\4\1\32\1\11\1\uffff\2\4"+
			"\1\30\1\12\1\4\3\uffff\1\32\1\13\1\uffff\1\14\2\uffff\3\4\1\15\1\uffff"+
			"\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\1\16\2\4\1\uffff\1\17\1\4\2\uffff"+
			"\2\32\1\4\1\uffff\3\4\1\uffff\3\4\1\uffff\2\4\3\uffff\1\4\1\uffff\1\4"+
			"\4\uffff\2\4\2\uffff\5\4\4\uffff\2\4\1\uffff\2\4\3\uffff\1\4\1\20\5\4"+
			"\1\21\1\31\1\22\1\27\1\23\2\uffff\1\4\1\uffff\1\32\3\4\1\uffff\1\4\2"+
			"\uffff\2\4\1\uffff\1\24\1\4\1\25\1\26\3\uffff\1\32\11\uffff\1\3",
			"\1\33\176\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\176\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\176\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\176\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\176\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\176\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\176\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\176\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\176\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\176\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\176\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\176\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\176\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\176\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\176\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\176\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\176\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\176\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\176\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\176\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\176\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\176\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\176\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\176\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\176\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"\1\33\176\uffff\1\33\2\uffff\1\35\10\uffff\1\34",
			"",
			"",
			""
	};

	static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
	static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
	static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
	static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
	static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
	static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
	static final short[][] DFA61_transition;

	static {
		int numStates = DFA61_transitionS.length;
		DFA61_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
		}
	}

	protected class DFA61 extends DFA {

		public DFA61(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 61;
			this.eot = DFA61_eot;
			this.eof = DFA61_eof;
			this.min = DFA61_min;
			this.max = DFA61_max;
			this.accept = DFA61_accept;
			this.special = DFA61_special;
			this.transition = DFA61_transition;
		}
		@Override
		public String getDescription() {
			return "597:1: deleteOp returns [Operation.RawDeletion op] : (c= cident |c= cident '[' t= term ']' |c= cident '.' field= fident );";
		}
	}

	static final String DFA146_eotS =
		"\12\uffff";
	static final String DFA146_eofS =
		"\1\uffff\1\2\1\uffff\4\2\3\uffff";
	static final String DFA146_minS =
		"\1\32\1\115\1\uffff\2\32\2\115\3\uffff";
	static final String DFA146_maxS =
		"\1\u00b8\1\u00d2\1\uffff\4\u00d2\3\uffff";
	static final String DFA146_acceptS =
		"\2\uffff\1\1\4\uffff\1\2\1\3\1\4";
	static final String DFA146_specialS =
		"\12\uffff}>";
	static final String[] DFA146_transitionS = {
			"\1\2\3\uffff\1\2\1\uffff\2\2\1\1\4\uffff\1\2\1\uffff\1\2\3\uffff\3\2"+
			"\1\uffff\11\2\1\uffff\5\2\3\uffff\2\2\1\uffff\1\2\2\uffff\4\2\1\uffff"+
			"\1\2\1\uffff\1\4\1\2\1\uffff\1\2\3\uffff\3\2\1\uffff\2\2\2\uffff\7\2"+
			"\1\uffff\3\2\1\uffff\1\5\1\6\3\uffff\1\2\1\uffff\1\2\4\uffff\2\2\2\uffff"+
			"\5\2\4\uffff\2\2\1\uffff\1\3\1\2\3\uffff\14\2\2\uffff\1\2\1\uffff\4\2"+
			"\1\uffff\1\2\2\uffff\2\2\1\uffff\4\2\3\uffff\1\2\10\uffff\2\2",
			"\1\2\3\uffff\1\10\21\uffff\1\2\10\uffff\1\11\4\uffff\1\2\3\uffff\1\2"+
			"\22\uffff\1\7\17\uffff\1\2\66\uffff\1\2\2\uffff\1\2",
			"",
			"\1\7\3\uffff\1\7\1\uffff\3\7\4\uffff\1\7\1\uffff\1\7\3\uffff\3\7\1\uffff"+
			"\4\7\1\uffff\4\7\1\uffff\5\7\3\uffff\2\7\1\uffff\1\7\2\uffff\4\7\1\2"+
			"\1\7\1\uffff\2\7\1\uffff\1\7\3\uffff\3\7\1\uffff\2\7\2\uffff\3\7\1\uffff"+
			"\3\7\1\uffff\3\7\1\uffff\2\7\3\uffff\1\7\1\2\1\7\2\uffff\1\2\1\uffff"+
			"\2\7\2\uffff\5\7\4\uffff\2\7\1\uffff\2\7\3\uffff\14\7\1\2\1\uffff\1\7"+
			"\1\uffff\4\7\1\uffff\1\7\2\uffff\2\7\1\uffff\4\7\3\uffff\1\7\10\uffff"+
			"\2\7\3\uffff\1\7\22\uffff\1\2\2\uffff\1\2",
			"\1\10\3\uffff\1\10\1\uffff\3\10\4\uffff\1\10\1\uffff\1\10\3\uffff\3"+
			"\10\1\uffff\4\10\1\uffff\4\10\1\uffff\5\10\3\uffff\2\10\1\uffff\1\10"+
			"\2\uffff\4\10\1\2\1\10\1\uffff\2\10\1\uffff\1\10\3\uffff\3\10\1\uffff"+
			"\2\10\2\uffff\3\10\1\uffff\3\10\1\uffff\3\10\1\uffff\2\10\3\uffff\1\10"+
			"\1\2\1\10\2\uffff\1\2\1\uffff\2\10\2\uffff\5\10\4\uffff\2\10\1\uffff"+
			"\2\10\3\uffff\14\10\1\2\2\10\1\uffff\4\10\1\uffff\1\10\2\uffff\2\10\1"+
			"\uffff\4\10\3\uffff\1\10\10\uffff\2\10\26\uffff\1\2\2\uffff\1\2",
			"\1\2\43\uffff\1\2\3\uffff\1\2\42\uffff\1\2\43\uffff\1\11\22\uffff\1"+
			"\2\2\uffff\1\2",
			"\1\2\43\uffff\1\2\3\uffff\1\2\42\uffff\1\2\43\uffff\1\11\22\uffff\1"+
			"\2\2\uffff\1\2",
			"",
			"",
			""
	};

	static final short[] DFA146_eot = DFA.unpackEncodedString(DFA146_eotS);
	static final short[] DFA146_eof = DFA.unpackEncodedString(DFA146_eofS);
	static final char[] DFA146_min = DFA.unpackEncodedStringToUnsignedChars(DFA146_minS);
	static final char[] DFA146_max = DFA.unpackEncodedStringToUnsignedChars(DFA146_maxS);
	static final short[] DFA146_accept = DFA.unpackEncodedString(DFA146_acceptS);
	static final short[] DFA146_special = DFA.unpackEncodedString(DFA146_specialS);
	static final short[][] DFA146_transition;

	static {
		int numStates = DFA146_transitionS.length;
		DFA146_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA146_transition[i] = DFA.unpackEncodedString(DFA146_transitionS[i]);
		}
	}

	protected class DFA146 extends DFA {

		public DFA146(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 146;
			this.eot = DFA146_eot;
			this.eof = DFA146_eof;
			this.min = DFA146_min;
			this.max = DFA146_max;
			this.accept = DFA146_accept;
			this.special = DFA146_special;
			this.transition = DFA146_transition;
		}
		@Override
		public String getDescription() {
			return "1111:1: resource returns [IResource res] : (d= dataResource |r= roleResource |f= functionResource |j= jmxResource );";
		}
	}

	static final String DFA175_eotS =
		"\32\uffff";
	static final String DFA175_eofS =
		"\4\uffff\1\20\6\uffff\1\20\1\uffff\1\20\1\uffff\1\20\12\uffff";
	static final String DFA175_minS =
		"\1\32\1\0\1\uffff\1\0\1\142\1\uffff\1\0\3\uffff\1\0\1\32\1\0\1\32\1\0"+
		"\1\32\12\uffff";
	static final String DFA175_maxS =
		"\1\u00b8\1\0\1\uffff\1\0\1\u00d2\1\uffff\1\0\3\uffff\1\0\1\u00d2\1\0\1"+
		"\u00d2\1\0\1\u00d2\12\uffff";
	static final String DFA175_acceptS =
		"\2\uffff\1\2\2\uffff\1\4\1\uffff\1\6\1\7\1\10\6\uffff\1\17\1\1\1\3\1\5"+
		"\1\11\1\12\1\13\1\14\1\15\1\16";
	static final String DFA175_specialS =
		"\1\uffff\1\4\1\uffff\1\5\2\uffff\1\0\3\uffff\1\1\1\uffff\1\2\1\uffff\1"+
		"\3\13\uffff}>";
	static final String[] DFA175_transitionS = {
			"\1\20\3\uffff\1\20\1\uffff\1\17\1\16\1\20\4\uffff\1\20\1\uffff\1\20\3"+
			"\uffff\3\20\1\uffff\2\20\1\1\1\20\1\7\4\20\1\uffff\5\20\3\uffff\2\20"+
			"\1\uffff\1\20\2\uffff\4\20\1\uffff\1\20\1\2\1\15\1\14\1\uffff\1\20\2"+
			"\uffff\1\10\3\20\1\uffff\2\20\2\uffff\3\20\1\5\1\3\2\20\1\uffff\3\20"+
			"\1\11\2\20\3\uffff\1\20\1\uffff\1\20\4\uffff\1\4\1\20\2\uffff\5\20\4"+
			"\uffff\2\20\1\uffff\2\20\1\2\2\uffff\6\20\1\6\5\20\2\uffff\1\20\1\uffff"+
			"\2\20\1\13\1\12\1\uffff\1\20\2\uffff\2\20\1\uffff\4\20\3\uffff\1\20\11"+
			"\uffff\1\20",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\5\112\uffff\1\20\41\uffff\1\20\2\uffff\1\20",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"\1\uffff",
			"\1\25\3\uffff\1\25\1\uffff\3\25\4\uffff\1\25\1\uffff\1\25\3\uffff\3"+
			"\25\1\uffff\4\25\1\uffff\4\25\1\uffff\5\25\3\uffff\2\25\1\uffff\1\25"+
			"\2\uffff\4\25\1\uffff\1\25\1\uffff\2\25\1\uffff\1\25\3\uffff\3\25\1\uffff"+
			"\2\25\2\uffff\3\25\1\uffff\3\25\1\uffff\3\25\1\uffff\2\25\3\uffff\1\25"+
			"\1\uffff\1\25\4\uffff\2\25\2\uffff\5\25\4\uffff\2\25\1\uffff\2\25\3\uffff"+
			"\14\25\2\uffff\1\25\1\uffff\4\25\1\uffff\1\25\2\uffff\2\25\1\uffff\4"+
			"\25\2\uffff\1\20\1\25\11\uffff\1\25\26\uffff\1\20\2\uffff\1\20",
			"\1\uffff",
			"\1\27\3\uffff\1\27\1\uffff\3\27\4\uffff\1\27\1\uffff\1\27\3\uffff\3"+
			"\27\1\uffff\4\27\1\uffff\4\27\1\uffff\5\27\3\uffff\2\27\1\uffff\1\27"+
			"\2\uffff\4\27\1\uffff\1\27\1\uffff\2\27\1\uffff\1\27\3\uffff\3\27\1\uffff"+
			"\2\27\2\uffff\3\27\1\uffff\3\27\1\uffff\3\27\1\uffff\2\27\3\uffff\1\27"+
			"\1\uffff\1\27\4\uffff\2\27\2\uffff\5\27\4\uffff\2\27\1\uffff\2\27\3\uffff"+
			"\14\27\1\uffff\2\27\1\uffff\4\27\1\uffff\1\27\2\uffff\2\27\1\uffff\4"+
			"\27\2\uffff\1\20\1\27\10\uffff\2\27\26\uffff\1\20\2\uffff\1\20",
			"\1\uffff",
			"\1\31\3\uffff\1\31\1\uffff\3\31\4\uffff\1\31\1\uffff\1\31\3\uffff\3"+
			"\31\1\uffff\4\31\1\uffff\4\31\1\uffff\5\31\3\uffff\2\31\1\uffff\1\31"+
			"\2\uffff\4\31\1\uffff\1\31\1\uffff\2\31\1\uffff\1\31\3\uffff\3\31\1\uffff"+
			"\2\31\2\uffff\3\31\1\uffff\3\31\1\uffff\3\31\1\uffff\2\31\3\uffff\1\31"+
			"\1\uffff\1\31\4\uffff\2\31\2\uffff\5\31\4\uffff\2\31\1\uffff\2\31\3\uffff"+
			"\14\31\1\uffff\2\31\1\uffff\4\31\1\uffff\1\31\2\uffff\2\31\1\uffff\4"+
			"\31\2\uffff\1\20\1\31\10\uffff\2\31\26\uffff\1\20\2\uffff\1\20",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA175_eot = DFA.unpackEncodedString(DFA175_eotS);
	static final short[] DFA175_eof = DFA.unpackEncodedString(DFA175_eofS);
	static final char[] DFA175_min = DFA.unpackEncodedStringToUnsignedChars(DFA175_minS);
	static final char[] DFA175_max = DFA.unpackEncodedStringToUnsignedChars(DFA175_maxS);
	static final short[] DFA175_accept = DFA.unpackEncodedString(DFA175_acceptS);
	static final short[] DFA175_special = DFA.unpackEncodedString(DFA175_specialS);
	static final short[][] DFA175_transition;

	static {
		int numStates = DFA175_transitionS.length;
		DFA175_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA175_transition[i] = DFA.unpackEncodedString(DFA175_transitionS[i]);
		}
	}

	protected class DFA175 extends DFA {

		public DFA175(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 175;
			this.eot = DFA175_eot;
			this.eof = DFA175_eof;
			this.min = DFA175_min;
			this.max = DFA175_max;
			this.accept = DFA175_accept;
			this.special = DFA175_special;
			this.transition = DFA175_transition;
		}
		@Override
		public String getDescription() {
			return "1320:5: ( ( K_CLUSTER )=> K_CLUSTER | ( K_FULL )? K_SCHEMA | ( K_KEYSPACES )=> K_KEYSPACES | ( K_ONLY )? K_KEYSPACE (ks= keyspaceName )? | ( K_TABLES )=> K_TABLES | K_COLUMNFAMILY cf= columnFamilyName | K_INDEX idx= columnFamilyName | K_MATERIALIZED K_VIEW view= columnFamilyName | ( K_TYPES )=> K_TYPES | K_TYPE tn= userTypeName | ( K_FUNCTIONS )=> K_FUNCTIONS | K_FUNCTION fn= functionName | ( K_AGGREGATES )=> K_AGGREGATES | K_AGGREGATE ag= functionName | ( (ksT= IDENT |ksT= QUOTED_NAME |ksK= unreserved_keyword ) '.' )? (tT= IDENT |tT= QUOTED_NAME |tK= unreserved_keyword ) )";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA175_6 = input.LA(1);
						 
						int index175_6 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_Parser()) ) {s = 19;}
						else if ( (true) ) {s = 16;}
						 
						input.seek(index175_6);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA175_10 = input.LA(1);
						 
						int index175_10 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred8_Parser()) ) {s = 20;}
						else if ( (true) ) {s = 16;}
						 
						input.seek(index175_10);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA175_12 = input.LA(1);
						 
						int index175_12 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred9_Parser()) ) {s = 22;}
						else if ( (true) ) {s = 16;}
						 
						input.seek(index175_12);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA175_14 = input.LA(1);
						 
						int index175_14 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred10_Parser()) ) {s = 24;}
						else if ( (true) ) {s = 16;}
						 
						input.seek(index175_14);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA175_1 = input.LA(1);
						 
						int index175_1 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred5_Parser()) ) {s = 17;}
						else if ( (true) ) {s = 16;}
						 
						input.seek(index175_1);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA175_3 = input.LA(1);
						 
						int index175_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred6_Parser()) ) {s = 18;}
						else if ( (true) ) {s = 16;}
						 
						input.seek(index175_3);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 175, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA173_eotS =
		"\34\uffff";
	static final String DFA173_eofS =
		"\1\uffff\31\33\2\uffff";
	static final String DFA173_minS =
		"\1\32\31\u00ad\2\uffff";
	static final String DFA173_maxS =
		"\1\u00b8\31\u00d2\2\uffff";
	static final String DFA173_acceptS =
		"\32\uffff\1\1\1\2";
	static final String DFA173_specialS =
		"\34\uffff}>";
	static final String[] DFA173_transitionS = {
			"\1\1\3\uffff\1\3\1\uffff\3\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6"+
			"\1\7\1\uffff\1\3\1\31\2\3\1\uffff\2\3\1\31\1\10\1\uffff\2\3\1\27\1\11"+
			"\1\3\3\uffff\1\31\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff"+
			"\2\3\1\uffff\1\3\3\uffff\1\15\2\3\1\uffff\1\16\1\3\2\uffff\2\31\1\3\1"+
			"\uffff\3\3\1\uffff\3\3\1\uffff\2\3\3\uffff\1\3\1\uffff\1\3\4\uffff\2"+
			"\3\2\uffff\5\3\4\uffff\2\3\1\uffff\2\3\3\uffff\1\3\1\17\5\3\1\20\1\30"+
			"\1\21\1\26\1\22\2\uffff\1\3\1\uffff\1\31\3\3\1\uffff\1\3\2\uffff\2\3"+
			"\1\uffff\1\23\1\3\1\24\1\25\3\uffff\1\31\11\uffff\1\2",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"\1\33\41\uffff\1\32\2\uffff\1\33",
			"",
			""
	};

	static final short[] DFA173_eot = DFA.unpackEncodedString(DFA173_eotS);
	static final short[] DFA173_eof = DFA.unpackEncodedString(DFA173_eofS);
	static final char[] DFA173_min = DFA.unpackEncodedStringToUnsignedChars(DFA173_minS);
	static final char[] DFA173_max = DFA.unpackEncodedStringToUnsignedChars(DFA173_maxS);
	static final short[] DFA173_accept = DFA.unpackEncodedString(DFA173_acceptS);
	static final short[] DFA173_special = DFA.unpackEncodedString(DFA173_specialS);
	static final short[][] DFA173_transition;

	static {
		int numStates = DFA173_transitionS.length;
		DFA173_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA173_transition[i] = DFA.unpackEncodedString(DFA173_transitionS[i]);
		}
	}

	protected class DFA173 extends DFA {

		public DFA173(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 173;
			this.eot = DFA173_eot;
			this.eof = DFA173_eof;
			this.min = DFA173_min;
			this.max = DFA173_max;
			this.accept = DFA173_accept;
			this.special = DFA173_special;
			this.transition = DFA173_transition;
		}
		@Override
		public String getDescription() {
			return "1335:7: ( (ksT= IDENT |ksT= QUOTED_NAME |ksK= unreserved_keyword ) '.' )?";
		}
	}

	static final String DFA181_eotS =
		"\35\uffff";
	static final String DFA181_eofS =
		"\1\uffff\32\34\2\uffff";
	static final String DFA181_minS =
		"\1\32\32\u00cf\2\uffff";
	static final String DFA181_maxS =
		"\1\u00b8\32\u00d2\2\uffff";
	static final String DFA181_acceptS =
		"\33\uffff\1\1\1\2";
	static final String DFA181_specialS =
		"\35\uffff}>";
	static final String[] DFA181_transitionS = {
			"\1\1\3\uffff\1\3\1\uffff\3\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6"+
			"\1\7\1\uffff\1\3\1\31\2\3\1\uffff\2\3\1\31\1\10\1\uffff\2\3\1\27\1\11"+
			"\1\3\3\uffff\1\31\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff"+
			"\2\3\1\uffff\1\3\3\uffff\1\15\2\3\1\uffff\1\16\1\3\2\uffff\2\31\1\3\1"+
			"\uffff\3\3\1\uffff\3\3\1\uffff\2\3\3\uffff\1\3\1\uffff\1\3\4\uffff\2"+
			"\3\2\uffff\5\3\4\uffff\2\3\1\uffff\2\3\3\uffff\1\3\1\17\5\3\1\20\1\30"+
			"\1\21\1\26\1\22\2\uffff\1\3\1\uffff\1\31\3\3\1\uffff\1\3\2\uffff\2\3"+
			"\1\uffff\1\23\1\3\1\24\1\25\3\uffff\1\31\10\uffff\1\32\1\2",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"\1\33\2\uffff\1\34",
			"",
			""
	};

	static final short[] DFA181_eot = DFA.unpackEncodedString(DFA181_eotS);
	static final short[] DFA181_eof = DFA.unpackEncodedString(DFA181_eofS);
	static final char[] DFA181_min = DFA.unpackEncodedStringToUnsignedChars(DFA181_minS);
	static final char[] DFA181_max = DFA.unpackEncodedStringToUnsignedChars(DFA181_maxS);
	static final short[] DFA181_accept = DFA.unpackEncodedString(DFA181_acceptS);
	static final short[] DFA181_special = DFA.unpackEncodedString(DFA181_specialS);
	static final short[][] DFA181_transition;

	static {
		int numStates = DFA181_transitionS.length;
		DFA181_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA181_transition[i] = DFA.unpackEncodedString(DFA181_transitionS[i]);
		}
	}

	protected class DFA181 extends DFA {

		public DFA181(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 181;
			this.eot = DFA181_eot;
			this.eof = DFA181_eof;
			this.min = DFA181_min;
			this.max = DFA181_max;
			this.accept = DFA181_accept;
			this.special = DFA181_special;
			this.transition = DFA181_transition;
		}
		@Override
		public String getDescription() {
			return "1382:7: ( ksName[name] '.' )?";
		}
	}

	static final String DFA182_eotS =
		"\35\uffff";
	static final String DFA182_eofS =
		"\1\uffff\32\34\2\uffff";
	static final String DFA182_minS =
		"\1\32\32\37\2\uffff";
	static final String DFA182_maxS =
		"\1\u00b8\32\u00d2\2\uffff";
	static final String DFA182_acceptS =
		"\33\uffff\1\1\1\2";
	static final String DFA182_specialS =
		"\35\uffff}>";
	static final String[] DFA182_transitionS = {
			"\1\1\3\uffff\1\3\1\uffff\3\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6"+
			"\1\7\1\uffff\1\3\1\31\2\3\1\uffff\2\3\1\31\1\10\1\uffff\2\3\1\27\1\11"+
			"\1\3\3\uffff\1\31\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff"+
			"\2\3\1\uffff\1\3\3\uffff\1\15\2\3\1\uffff\1\16\1\3\2\uffff\2\31\1\3\1"+
			"\uffff\3\3\1\uffff\3\3\1\uffff\2\3\3\uffff\1\3\1\uffff\1\3\4\uffff\2"+
			"\3\2\uffff\5\3\4\uffff\2\3\1\uffff\2\3\3\uffff\1\3\1\17\5\3\1\20\1\30"+
			"\1\21\1\26\1\22\2\uffff\1\3\1\uffff\1\31\3\3\1\uffff\1\3\2\uffff\2\3"+
			"\1\uffff\1\23\1\3\1\24\1\25\3\uffff\1\31\10\uffff\1\32\1\2",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"\1\34\3\uffff\2\34\2\uffff\1\34\35\uffff\1\34\7\uffff\1\34\5\uffff\1"+
			"\34\13\uffff\1\34\6\uffff\1\34\12\uffff\1\34\3\uffff\1\34\4\uffff\1\34"+
			"\2\uffff\1\34\4\uffff\2\34\7\uffff\1\34\14\uffff\1\34\15\uffff\1\34\5"+
			"\uffff\2\34\32\uffff\1\34\6\uffff\1\33\2\uffff\1\34",
			"",
			""
	};

	static final short[] DFA182_eot = DFA.unpackEncodedString(DFA182_eotS);
	static final short[] DFA182_eof = DFA.unpackEncodedString(DFA182_eofS);
	static final char[] DFA182_min = DFA.unpackEncodedStringToUnsignedChars(DFA182_minS);
	static final char[] DFA182_max = DFA.unpackEncodedStringToUnsignedChars(DFA182_maxS);
	static final short[] DFA182_accept = DFA.unpackEncodedString(DFA182_acceptS);
	static final short[] DFA182_special = DFA.unpackEncodedString(DFA182_specialS);
	static final short[][] DFA182_transition;

	static {
		int numStates = DFA182_transitionS.length;
		DFA182_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA182_transition[i] = DFA.unpackEncodedString(DFA182_transitionS[i]);
		}
	}

	protected class DFA182 extends DFA {

		public DFA182(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 182;
			this.eot = DFA182_eot;
			this.eof = DFA182_eof;
			this.min = DFA182_min;
			this.max = DFA182_max;
			this.accept = DFA182_accept;
			this.special = DFA182_special;
			this.transition = DFA182_transition;
		}
		@Override
		public String getDescription() {
			return "1387:7: ( ksName[name] '.' )?";
		}
	}

	static final String DFA200_eotS =
		"\43\uffff";
	static final String DFA200_eofS =
		"\43\uffff";
	static final String DFA200_minS =
		"\1\6\2\uffff\1\6\4\uffff\31\u00c8\1\u00cf\1\uffff";
	static final String DFA200_maxS =
		"\1\u00dc\2\uffff\1\u00dd\4\uffff\32\u00d1\1\uffff";
	static final String DFA200_acceptS =
		"\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\32\uffff\1\3";
	static final String DFA200_specialS =
		"\43\uffff}>";
	static final String[] DFA200_transitionS = {
			"\1\1\4\uffff\1\1\10\uffff\1\1\3\uffff\1\1\2\uffff\1\1\122\uffff\2\1\4"+
			"\uffff\1\5\13\uffff\2\1\65\uffff\1\7\4\uffff\1\1\2\uffff\1\1\10\uffff"+
			"\1\4\10\uffff\1\6\6\uffff\1\2\3\uffff\1\3",
			"",
			"",
			"\1\2\4\uffff\1\2\10\uffff\1\2\3\uffff\1\2\1\uffff\1\10\1\2\2\uffff\1"+
			"\12\1\uffff\3\12\4\uffff\1\12\1\uffff\1\13\3\uffff\1\14\1\15\1\16\1\uffff"+
			"\1\12\1\41\2\12\1\uffff\2\12\1\40\1\17\1\uffff\2\12\1\36\1\20\1\12\3"+
			"\uffff\1\41\1\21\1\uffff\1\22\2\uffff\3\12\1\23\1\uffff\1\12\1\uffff"+
			"\2\12\1\uffff\1\12\3\uffff\1\24\2\12\1\uffff\1\25\1\12\2\uffff\2\41\1"+
			"\12\1\uffff\3\12\1\uffff\3\12\1\uffff\2\12\1\uffff\2\2\1\12\1\uffff\1"+
			"\12\1\uffff\1\2\2\uffff\2\12\2\uffff\5\12\2\2\2\uffff\2\12\1\uffff\2"+
			"\12\3\uffff\1\12\1\26\5\12\1\27\1\37\1\30\1\35\1\31\1\uffff\1\2\1\12"+
			"\1\uffff\1\41\3\12\1\uffff\1\12\2\uffff\2\12\1\uffff\1\32\1\12\1\33\1"+
			"\34\3\uffff\1\41\10\uffff\1\2\1\11\3\uffff\1\2\2\uffff\1\2\10\uffff\1"+
			"\2\4\uffff\1\2\3\uffff\1\2\6\uffff\1\2\3\uffff\2\2",
			"",
			"",
			"",
			"",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\6\uffff\1\2\1\uffff\1\42",
			"\1\2\1\uffff\1\42",
			""
	};

	static final short[] DFA200_eot = DFA.unpackEncodedString(DFA200_eotS);
	static final short[] DFA200_eof = DFA.unpackEncodedString(DFA200_eofS);
	static final char[] DFA200_min = DFA.unpackEncodedStringToUnsignedChars(DFA200_minS);
	static final char[] DFA200_max = DFA.unpackEncodedStringToUnsignedChars(DFA200_maxS);
	static final short[] DFA200_accept = DFA.unpackEncodedString(DFA200_acceptS);
	static final short[] DFA200_special = DFA.unpackEncodedString(DFA200_specialS);
	static final short[][] DFA200_transition;

	static {
		int numStates = DFA200_transitionS.length;
		DFA200_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA200_transition[i] = DFA.unpackEncodedString(DFA200_transitionS[i]);
		}
	}

	protected class DFA200 extends DFA {

		public DFA200(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 200;
			this.eot = DFA200_eot;
			this.eof = DFA200_eof;
			this.min = DFA200_min;
			this.max = DFA200_max;
			this.accept = DFA200_accept;
			this.special = DFA200_special;
			this.transition = DFA200_transition;
		}
		@Override
		public String getDescription() {
			return "1492:1: value returns [Term.Raw value] : (c= constant |l= collectionLiteral |u= usertypeLiteral |t= tupleLiteral | K_NULL | ':' id= noncol_ident | QMARK );";
		}
	}

	static final String DFA202_eotS =
		"\34\uffff";
	static final String DFA202_eofS =
		"\1\uffff\31\33\2\uffff";
	static final String DFA202_minS =
		"\1\32\31\u00ad\2\uffff";
	static final String DFA202_maxS =
		"\1\u00b8\31\u00d2\2\uffff";
	static final String DFA202_acceptS =
		"\32\uffff\1\1\1\2";
	static final String DFA202_specialS =
		"\34\uffff}>";
	static final String[] DFA202_transitionS = {
			"\1\1\3\uffff\1\3\1\uffff\3\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6"+
			"\1\7\1\uffff\1\3\1\32\2\3\1\uffff\2\3\1\31\1\10\1\uffff\2\3\1\27\1\11"+
			"\1\3\3\uffff\1\32\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff"+
			"\2\3\1\uffff\1\3\3\uffff\1\15\2\3\1\uffff\1\16\1\3\2\uffff\2\32\1\3\1"+
			"\uffff\3\3\1\uffff\3\3\1\uffff\2\3\3\uffff\1\3\1\uffff\1\3\4\uffff\2"+
			"\3\2\uffff\5\3\4\uffff\2\3\1\uffff\2\3\3\uffff\1\3\1\17\5\3\1\20\1\30"+
			"\1\21\1\26\1\22\1\uffff\1\33\1\3\1\uffff\1\32\3\3\1\uffff\1\3\2\uffff"+
			"\2\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff\1\32\10\uffff\1\32\1\2",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"\1\33\32\uffff\1\33\6\uffff\1\32\2\uffff\1\33",
			"",
			""
	};

	static final short[] DFA202_eot = DFA.unpackEncodedString(DFA202_eotS);
	static final short[] DFA202_eof = DFA.unpackEncodedString(DFA202_eofS);
	static final char[] DFA202_min = DFA.unpackEncodedStringToUnsignedChars(DFA202_minS);
	static final char[] DFA202_max = DFA.unpackEncodedStringToUnsignedChars(DFA202_maxS);
	static final short[] DFA202_accept = DFA.unpackEncodedString(DFA202_acceptS);
	static final short[] DFA202_special = DFA.unpackEncodedString(DFA202_specialS);
	static final short[][] DFA202_transition;

	static {
		int numStates = DFA202_transitionS.length;
		DFA202_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA202_transition[i] = DFA.unpackEncodedString(DFA202_transitionS[i]);
		}
	}

	protected class DFA202 extends DFA {

		public DFA202(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 202;
			this.eot = DFA202_eot;
			this.eof = DFA202_eof;
			this.min = DFA202_min;
			this.max = DFA202_max;
			this.accept = DFA202_accept;
			this.special = DFA202_special;
			this.transition = DFA202_transition;
		}
		@Override
		public String getDescription() {
			return "1511:7: (ks= keyspaceName '.' )?";
		}
	}

	static final String DFA204_eotS =
		"\72\uffff";
	static final String DFA204_eofS =
		"\72\uffff";
	static final String DFA204_minS =
		"\1\32\31\u00c8\1\u00cf\1\u00c8\1\u00cf\1\32\1\6\31\u00c8\2\uffff";
	static final String DFA204_maxS =
		"\1\u00b8\32\u00cf\1\u00c8\1\u00cf\1\u00b8\1\u00dc\31\u00c8\2\uffff";
	static final String DFA204_acceptS =
		"\70\uffff\1\1\1\2";
	static final String DFA204_specialS =
		"\72\uffff}>";
	static final String[] DFA204_transitionS = {
			"\1\1\3\uffff\1\3\1\uffff\3\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6"+
			"\1\7\1\uffff\1\3\1\34\2\3\1\uffff\2\3\1\31\1\10\1\uffff\2\3\1\27\1\11"+
			"\1\3\3\uffff\1\34\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff"+
			"\2\3\1\uffff\1\3\3\uffff\1\15\2\3\1\uffff\1\16\1\3\2\uffff\2\34\1\3\1"+
			"\uffff\3\3\1\uffff\3\3\1\uffff\2\3\3\uffff\1\3\1\uffff\1\3\4\uffff\2"+
			"\3\2\uffff\5\3\4\uffff\2\3\1\uffff\2\3\3\uffff\1\3\1\17\5\3\1\20\1\30"+
			"\1\21\1\26\1\22\1\uffff\1\33\1\3\1\uffff\1\34\3\3\1\uffff\1\3\2\uffff"+
			"\2\3\1\uffff\1\23\1\3\1\24\1\25\3\uffff\1\34\10\uffff\1\32\1\2",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\36\6\uffff\1\35",
			"\1\35",
			"\1\36",
			"\1\35",
			"\1\37\3\uffff\1\41\1\uffff\3\41\4\uffff\1\41\1\uffff\1\42\3\uffff\1"+
			"\43\1\44\1\45\1\uffff\1\41\1\uffff\2\41\1\uffff\2\41\1\67\1\46\1\uffff"+
			"\2\41\1\65\1\47\1\41\4\uffff\1\50\1\uffff\1\51\2\uffff\3\41\1\52\1\uffff"+
			"\1\41\1\uffff\2\41\1\uffff\1\41\3\uffff\1\53\2\41\1\uffff\1\54\1\41\4"+
			"\uffff\1\41\1\uffff\3\41\1\uffff\3\41\1\uffff\2\41\3\uffff\1\41\1\uffff"+
			"\1\41\4\uffff\2\41\2\uffff\5\41\4\uffff\2\41\1\uffff\2\41\3\uffff\1\41"+
			"\1\55\5\41\1\56\1\66\1\57\1\64\1\60\1\uffff\1\33\1\41\2\uffff\3\41\1"+
			"\uffff\1\41\2\uffff\2\41\1\uffff\1\61\1\41\1\62\1\63\15\uffff\1\40",
			"\1\71\4\uffff\1\71\10\uffff\1\71\3\uffff\1\71\1\uffff\2\71\2\uffff\1"+
			"\71\1\uffff\3\71\4\uffff\1\71\1\uffff\1\71\3\uffff\3\71\1\uffff\4\71"+
			"\1\uffff\4\71\1\uffff\5\71\3\uffff\2\71\1\uffff\1\71\2\uffff\4\71\1\uffff"+
			"\1\71\1\uffff\2\71\1\uffff\1\71\3\uffff\3\71\1\uffff\2\71\2\uffff\3\71"+
			"\1\uffff\3\71\1\uffff\3\71\1\uffff\2\71\1\uffff\3\71\1\uffff\1\71\1\uffff"+
			"\1\71\2\uffff\2\71\2\uffff\7\71\2\uffff\2\71\1\uffff\2\71\3\uffff\14"+
			"\71\1\uffff\2\71\1\uffff\4\71\1\uffff\1\71\2\uffff\2\71\1\uffff\4\71"+
			"\3\uffff\1\71\10\uffff\2\71\3\uffff\1\71\2\uffff\1\71\10\uffff\1\71\1"+
			"\70\3\uffff\1\71\3\uffff\1\71\6\uffff\1\71\3\uffff\1\71",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"\1\36",
			"",
			""
	};

	static final short[] DFA204_eot = DFA.unpackEncodedString(DFA204_eotS);
	static final short[] DFA204_eof = DFA.unpackEncodedString(DFA204_eofS);
	static final char[] DFA204_min = DFA.unpackEncodedStringToUnsignedChars(DFA204_minS);
	static final char[] DFA204_max = DFA.unpackEncodedStringToUnsignedChars(DFA204_maxS);
	static final short[] DFA204_accept = DFA.unpackEncodedString(DFA204_acceptS);
	static final short[] DFA204_special = DFA.unpackEncodedString(DFA204_specialS);
	static final short[][] DFA204_transition;

	static {
		int numStates = DFA204_transitionS.length;
		DFA204_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA204_transition[i] = DFA.unpackEncodedString(DFA204_transitionS[i]);
		}
	}

	protected class DFA204 extends DFA {

		public DFA204(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 204;
			this.eot = DFA204_eot;
			this.eof = DFA204_eof;
			this.min = DFA204_min;
			this.max = DFA204_max;
			this.accept = DFA204_accept;
			this.special = DFA204_special;
			this.transition = DFA204_transition;
		}
		@Override
		public String getDescription() {
			return "1522:1: function returns [Term.Raw t] : (f= functionName '(' ')' |f= functionName '(' args= functionArgs ')' );";
		}
	}

	static final String DFA206_eotS =
		"\37\uffff";
	static final String DFA206_eofS =
		"\1\1\36\uffff";
	static final String DFA206_minS =
		"\1\43\1\uffff\1\6\1\uffff\31\u00ac\1\uffff\1\u00ac";
	static final String DFA206_maxS =
		"\1\u00dd\1\uffff\1\u00dc\1\uffff\31\u00cf\1\uffff\1\u00cf";
	static final String DFA206_acceptS =
		"\1\uffff\1\3\1\uffff\1\2\31\uffff\1\1\1\uffff";
	static final String DFA206_specialS =
		"\37\uffff}>";
	static final String[] DFA206_transitionS = {
			"\1\1\1\uffff\2\1\31\uffff\1\1\22\uffff\2\1\5\uffff\1\1\13\uffff\1\1\23"+
			"\uffff\1\1\2\uffff\1\1\4\uffff\1\1\37\uffff\1\1\11\uffff\1\1\15\uffff"+
			"\1\1\16\uffff\1\1\1\2\1\uffff\1\1\1\3\3\uffff\2\1\7\uffff\1\1\2\uffff"+
			"\1\1",
			"",
			"\1\35\4\uffff\1\35\5\uffff\1\1\2\uffff\1\35\3\uffff\1\35\1\uffff\1\4"+
			"\1\35\2\uffff\1\6\1\uffff\3\6\4\uffff\1\6\1\uffff\1\7\3\uffff\1\10\1"+
			"\11\1\12\1\uffff\1\6\1\36\2\6\1\uffff\2\6\1\34\1\13\1\uffff\2\6\1\32"+
			"\1\14\1\6\3\uffff\1\36\1\15\1\uffff\1\16\2\uffff\3\6\1\17\1\uffff\1\6"+
			"\1\uffff\2\6\1\uffff\1\6\3\uffff\1\20\2\6\1\uffff\1\21\1\6\2\uffff\2"+
			"\36\1\6\1\uffff\3\6\1\uffff\3\6\1\uffff\2\6\1\uffff\2\35\1\6\1\uffff"+
			"\1\6\1\uffff\1\35\2\uffff\2\6\2\uffff\5\6\2\35\2\uffff\2\6\1\uffff\2"+
			"\6\3\uffff\1\6\1\22\5\6\1\23\1\33\1\24\1\31\1\25\1\uffff\1\35\1\6\1\uffff"+
			"\1\36\3\6\1\uffff\1\6\2\uffff\2\6\1\uffff\1\26\1\6\1\27\1\30\3\uffff"+
			"\1\36\10\uffff\1\35\1\5\3\uffff\1\35\2\uffff\1\35\10\uffff\1\35\4\uffff"+
			"\1\35\3\uffff\1\35\6\uffff\1\35\3\uffff\1\35",
			"",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"\1\1\33\uffff\1\35\3\uffff\1\1\2\uffff\1\35",
			"",
			"\1\1\37\uffff\1\1\2\uffff\1\35"
	};

	static final short[] DFA206_eot = DFA.unpackEncodedString(DFA206_eotS);
	static final short[] DFA206_eof = DFA.unpackEncodedString(DFA206_eofS);
	static final char[] DFA206_min = DFA.unpackEncodedStringToUnsignedChars(DFA206_minS);
	static final char[] DFA206_max = DFA.unpackEncodedStringToUnsignedChars(DFA206_maxS);
	static final short[] DFA206_accept = DFA.unpackEncodedString(DFA206_acceptS);
	static final short[] DFA206_special = DFA.unpackEncodedString(DFA206_specialS);
	static final short[][] DFA206_transition;

	static {
		int numStates = DFA206_transitionS.length;
		DFA206_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA206_transition[i] = DFA.unpackEncodedString(DFA206_transitionS[i]);
		}
	}

	protected class DFA206 extends DFA {

		public DFA206(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 206;
			this.eot = DFA206_eot;
			this.eof = DFA206_eof;
			this.min = DFA206_min;
			this.max = DFA206_max;
			this.accept = DFA206_accept;
			this.special = DFA206_special;
			this.transition = DFA206_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 1538:9: ( '+' r= termMultiplication | '-' r= termMultiplication )*";
		}
	}

	static final String DFA209_eotS =
		"\110\uffff";
	static final String DFA209_eofS =
		"\3\uffff\1\1\42\uffff\1\1\7\uffff\32\42";
	static final String DFA209_minS =
		"\1\6\1\uffff\1\6\1\43\1\uffff\1\u00c7\31\u00c8\1\u00c9\2\u00c8\1\uffff"+
		"\1\u00c8\1\u00cf\1\u00c8\1\6\1\32\1\6\1\60\1\173\3\u00c8\32\43";
	static final String DFA209_maxS =
		"\1\u00dc\1\uffff\1\u00dc\1\u00dd\1\uffff\1\u00d9\2\u00cf\1\u00d3\27\u00cf"+
		"\2\u00d3\1\uffff\1\u00d3\2\u00cf\1\u00dd\1\u00b8\1\u00dc\2\u00cf\3\u00c9"+
		"\32\u00dd";
	static final String DFA209_acceptS =
		"\1\uffff\1\1\2\uffff\1\2\35\uffff\1\3\45\uffff";
	static final String DFA209_specialS =
		"\110\uffff}>";
	static final String[] DFA209_transitionS = {
			"\1\1\4\uffff\1\1\10\uffff\1\1\3\uffff\1\1\1\uffff\1\4\1\1\2\uffff\1\4"+
			"\1\uffff\3\4\4\uffff\1\4\1\uffff\1\4\3\uffff\3\4\1\uffff\4\4\1\uffff"+
			"\4\4\1\uffff\5\4\3\uffff\2\4\1\uffff\1\4\2\uffff\4\4\1\uffff\1\4\1\uffff"+
			"\2\4\1\uffff\1\4\3\uffff\3\4\1\uffff\2\4\2\uffff\3\4\1\uffff\3\4\1\uffff"+
			"\3\4\1\uffff\2\4\1\uffff\2\1\1\4\1\uffff\1\4\1\uffff\1\1\2\uffff\2\4"+
			"\2\uffff\5\4\2\1\2\uffff\2\4\1\uffff\2\4\3\uffff\14\4\1\uffff\2\4\1\uffff"+
			"\4\4\1\uffff\1\4\2\uffff\2\4\1\uffff\4\4\3\uffff\1\4\10\uffff\1\3\1\4"+
			"\3\uffff\1\1\2\uffff\1\1\10\uffff\1\2\10\uffff\1\1\6\uffff\1\1\3\uffff"+
			"\1\1",
			"",
			"\1\1\4\uffff\1\1\10\uffff\1\1\3\uffff\1\1\1\uffff\1\6\1\1\2\uffff\1"+
			"\45\1\uffff\3\45\4\uffff\1\45\1\uffff\1\11\3\uffff\1\12\1\13\1\14\1\uffff"+
			"\1\45\1\44\2\45\1\uffff\2\45\1\36\1\15\1\uffff\2\45\1\34\1\16\1\45\3"+
			"\uffff\1\44\1\17\1\uffff\1\20\2\uffff\3\45\1\21\1\uffff\1\43\1\uffff"+
			"\2\45\1\uffff\1\45\3\uffff\1\22\2\45\1\uffff\1\23\1\45\2\uffff\1\44\1"+
			"\37\1\45\1\uffff\3\45\1\uffff\1\40\1\45\1\10\1\uffff\2\45\1\uffff\2\1"+
			"\1\45\1\uffff\1\45\1\uffff\1\1\2\uffff\2\45\2\uffff\5\45\2\1\2\uffff"+
			"\2\45\1\uffff\2\45\2\uffff\1\42\1\45\1\24\5\45\1\25\1\35\1\26\1\33\1"+
			"\27\1\uffff\1\1\1\45\1\uffff\1\44\1\41\2\45\1\uffff\1\45\2\uffff\2\45"+
			"\1\uffff\1\30\1\45\1\31\1\32\3\uffff\1\44\10\uffff\1\1\1\7\3\uffff\1"+
			"\5\2\uffff\1\1\10\uffff\1\1\4\uffff\1\1\3\uffff\1\1\6\uffff\1\1\3\uffff"+
			"\1\1",
			"\1\1\1\uffff\2\1\31\uffff\1\1\22\uffff\2\1\5\uffff\1\1\13\uffff\1\1"+
			"\23\uffff\1\1\2\uffff\1\1\4\uffff\1\1\37\uffff\1\1\11\uffff\1\1\15\uffff"+
			"\1\1\14\uffff\1\1\1\uffff\2\1\1\uffff\2\1\1\uffff\1\4\3\1\6\uffff\2\1"+
			"\2\uffff\1\1",
			"",
			"\1\1\1\uffff\1\46\1\1\1\uffff\2\1\2\uffff\1\1\10\uffff\1\1",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47\3\uffff\1\42",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\1\6\uffff\1\47",
			"\1\42\5\uffff\1\47",
			"\1\1\1\42\5\uffff\1\47\3\uffff\1\42",
			"\1\1\1\42\5\uffff\1\47\3\uffff\1\42",
			"",
			"\1\1\1\42\5\uffff\1\47\3\uffff\1\42",
			"\1\47",
			"\1\1\1\42\5\uffff\1\47",
			"\1\42\4\uffff\1\42\10\uffff\1\42\3\uffff\1\42\1\uffff\2\42\2\uffff\1"+
			"\42\1\uffff\3\42\1\1\1\uffff\2\1\1\42\1\uffff\1\42\3\uffff\3\42\1\uffff"+
			"\4\42\1\uffff\4\42\1\uffff\5\42\1\1\2\uffff\2\42\1\uffff\1\42\2\uffff"+
			"\4\42\1\uffff\1\42\1\uffff\2\42\1\uffff\1\51\1\1\2\uffff\3\42\1\1\2\42"+
			"\2\uffff\3\42\1\uffff\3\42\1\1\3\42\1\uffff\2\42\1\uffff\3\42\1\uffff"+
			"\1\42\1\uffff\1\42\2\uffff\2\42\1\uffff\1\1\2\42\1\52\4\42\1\1\1\uffff"+
			"\2\42\1\uffff\2\42\3\uffff\14\42\1\uffff\2\42\1\uffff\4\42\1\uffff\1"+
			"\42\1\1\1\uffff\2\42\1\uffff\4\42\1\uffff\1\1\1\uffff\1\42\10\uffff\2"+
			"\42\1\uffff\1\1\1\uffff\1\42\2\uffff\1\42\7\uffff\1\1\1\42\2\1\1\uffff"+
			"\2\1\2\uffff\1\1\1\50\1\1\5\uffff\1\42\2\1\1\uffff\1\42\1\1",
			"\1\53\3\uffff\1\55\1\uffff\3\55\4\uffff\1\55\1\uffff\1\1\3\uffff\3\1"+
			"\1\uffff\1\55\1\uffff\2\55\1\uffff\2\55\2\1\1\uffff\2\55\2\1\1\55\4\uffff"+
			"\1\1\1\uffff\1\1\2\uffff\3\55\1\1\1\uffff\1\55\1\uffff\2\55\1\uffff\1"+
			"\55\3\uffff\1\1\2\55\1\uffff\1\1\1\55\3\uffff\1\42\1\55\1\uffff\3\55"+
			"\1\uffff\3\55\1\uffff\2\55\3\uffff\1\55\1\uffff\1\55\4\uffff\2\55\2\uffff"+
			"\5\55\4\uffff\2\55\1\uffff\2\55\3\uffff\1\55\1\1\5\55\5\1\1\uffff\1\1"+
			"\1\55\2\uffff\3\55\1\uffff\1\55\2\uffff\2\55\1\uffff\1\1\1\55\2\1\15"+
			"\uffff\1\54",
			"\1\1\4\uffff\1\1\10\uffff\1\1\3\uffff\1\1\1\uffff\1\56\1\1\2\uffff\1"+
			"\60\1\uffff\3\60\4\uffff\1\60\1\uffff\1\61\3\uffff\1\62\1\63\1\64\1\uffff"+
			"\1\60\1\107\2\60\1\uffff\2\60\1\106\1\65\1\uffff\2\60\1\104\1\66\1\60"+
			"\3\uffff\1\107\1\67\1\uffff\1\70\2\uffff\3\60\1\71\1\uffff\1\60\1\uffff"+
			"\2\60\1\uffff\1\60\3\uffff\1\72\2\60\1\uffff\1\73\1\60\2\uffff\2\107"+
			"\1\60\1\uffff\3\60\1\uffff\3\60\1\uffff\2\60\1\uffff\2\1\1\60\1\uffff"+
			"\1\60\1\uffff\1\1\2\uffff\2\60\2\uffff\5\60\2\1\2\uffff\2\60\1\uffff"+
			"\2\60\3\uffff\1\60\1\74\5\60\1\75\1\105\1\76\1\103\1\77\1\uffff\1\1\1"+
			"\60\1\uffff\1\107\3\60\1\uffff\1\60\2\uffff\2\60\1\uffff\1\100\1\60\1"+
			"\101\1\102\3\uffff\1\107\10\uffff\1\1\1\57\3\uffff\1\1\2\uffff\1\1\10"+
			"\uffff\1\1\4\uffff\1\1\3\uffff\1\1\6\uffff\1\1\3\uffff\1\1",
			"\1\1\u0097\uffff\1\42\6\uffff\1\42",
			"\1\1\114\uffff\1\42\6\uffff\1\42",
			"\1\1\1\42",
			"\1\1\1\42",
			"\1\1\1\42",
			"\1\42\1\uffff\2\42\31\uffff\1\42\22\uffff\2\42\5\uffff\1\42\13\uffff"+
			"\1\42\23\uffff\1\42\2\uffff\1\42\4\uffff\1\42\37\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\31\uffff\1\42\22\uffff\2\42\5\uffff\1\42\13\uffff"+
			"\1\42\23\uffff\1\42\2\uffff\1\42\4\uffff\1\42\37\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\31\uffff\1\42\22\uffff\2\42\5\uffff\1\42\13\uffff"+
			"\1\42\23\uffff\1\42\2\uffff\1\42\4\uffff\1\42\37\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\31\uffff\1\42\22\uffff\2\42\5\uffff\1\42\13\uffff"+
			"\1\42\23\uffff\1\42\2\uffff\1\42\4\uffff\1\42\37\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\31\uffff\1\42\22\uffff\2\42\5\uffff\1\42\13\uffff"+
			"\1\42\23\uffff\1\42\2\uffff\1\42\4\uffff\1\42\37\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\31\uffff\1\42\22\uffff\2\42\5\uffff\1\42\13\uffff"+
			"\1\42\23\uffff\1\42\2\uffff\1\42\4\uffff\1\42\37\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\31\uffff\1\42\22\uffff\2\42\5\uffff\1\42\13\uffff"+
			"\1\42\23\uffff\1\42\2\uffff\1\42\4\uffff\1\42\37\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\31\uffff\1\42\22\uffff\2\42\5\uffff\1\42\13\uffff"+
			"\1\42\23\uffff\1\42\2\uffff\1\42\4\uffff\1\42\37\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\31\uffff\1\42\22\uffff\2\42\5\uffff\1\42\13\uffff"+
			"\1\42\23\uffff\1\42\2\uffff\1\42\4\uffff\1\42\37\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\31\uffff\1\42\22\uffff\2\42\5\uffff\1\42\13\uffff"+
			"\1\42\23\uffff\1\42\2\uffff\1\42\4\uffff\1\42\37\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\31\uffff\1\42\22\uffff\2\42\5\uffff\1\42\13\uffff"+
			"\1\42\23\uffff\1\42\2\uffff\1\42\4\uffff\1\42\37\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\31\uffff\1\42\22\uffff\2\42\5\uffff\1\42\13\uffff"+
			"\1\42\23\uffff\1\42\2\uffff\1\42\4\uffff\1\42\37\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\31\uffff\1\42\22\uffff\2\42\5\uffff\1\42\13\uffff"+
			"\1\42\23\uffff\1\42\2\uffff\1\42\4\uffff\1\42\37\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\31\uffff\1\42\22\uffff\2\42\5\uffff\1\42\13\uffff"+
			"\1\42\23\uffff\1\42\2\uffff\1\42\4\uffff\1\42\37\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\31\uffff\1\42\22\uffff\2\42\5\uffff\1\42\13\uffff"+
			"\1\42\23\uffff\1\42\2\uffff\1\42\4\uffff\1\42\37\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\31\uffff\1\42\22\uffff\2\42\5\uffff\1\42\13\uffff"+
			"\1\42\23\uffff\1\42\2\uffff\1\42\4\uffff\1\42\37\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\31\uffff\1\42\22\uffff\2\42\5\uffff\1\42\13\uffff"+
			"\1\42\23\uffff\1\42\2\uffff\1\42\4\uffff\1\42\37\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\31\uffff\1\42\22\uffff\2\42\5\uffff\1\42\13\uffff"+
			"\1\42\23\uffff\1\42\2\uffff\1\42\4\uffff\1\42\37\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\31\uffff\1\42\22\uffff\2\42\5\uffff\1\42\13\uffff"+
			"\1\42\23\uffff\1\42\2\uffff\1\42\4\uffff\1\42\37\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\31\uffff\1\42\22\uffff\2\42\5\uffff\1\42\13\uffff"+
			"\1\42\23\uffff\1\42\2\uffff\1\42\4\uffff\1\42\37\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\31\uffff\1\42\22\uffff\2\42\5\uffff\1\42\13\uffff"+
			"\1\42\23\uffff\1\42\2\uffff\1\42\4\uffff\1\42\37\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\31\uffff\1\42\22\uffff\2\42\5\uffff\1\42\13\uffff"+
			"\1\42\23\uffff\1\42\2\uffff\1\42\4\uffff\1\42\37\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\31\uffff\1\42\22\uffff\2\42\5\uffff\1\42\13\uffff"+
			"\1\42\23\uffff\1\42\2\uffff\1\42\4\uffff\1\42\37\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\31\uffff\1\42\22\uffff\2\42\5\uffff\1\42\13\uffff"+
			"\1\42\23\uffff\1\42\2\uffff\1\42\4\uffff\1\42\37\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\31\uffff\1\42\22\uffff\2\42\5\uffff\1\42\13\uffff"+
			"\1\42\23\uffff\1\42\2\uffff\1\42\4\uffff\1\42\37\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\1\2\42\1\uffff\2\42\1\uffff\1\1\3"+
			"\42\6\uffff\2\42\2\uffff\1\42",
			"\1\42\1\uffff\2\42\31\uffff\1\42\22\uffff\2\42\5\uffff\1\42\13\uffff"+
			"\1\42\23\uffff\1\42\2\uffff\1\42\4\uffff\1\42\37\uffff\1\42\11\uffff"+
			"\1\42\15\uffff\1\42\14\uffff\1\42\1\uffff\2\42\1\uffff\2\42\1\uffff\1"+
			"\1\3\42\6\uffff\2\42\2\uffff\1\42"
	};

	static final short[] DFA209_eot = DFA.unpackEncodedString(DFA209_eotS);
	static final short[] DFA209_eof = DFA.unpackEncodedString(DFA209_eofS);
	static final char[] DFA209_min = DFA.unpackEncodedStringToUnsignedChars(DFA209_minS);
	static final char[] DFA209_max = DFA.unpackEncodedStringToUnsignedChars(DFA209_maxS);
	static final short[] DFA209_accept = DFA.unpackEncodedString(DFA209_acceptS);
	static final short[] DFA209_special = DFA.unpackEncodedString(DFA209_specialS);
	static final short[][] DFA209_transition;

	static {
		int numStates = DFA209_transitionS.length;
		DFA209_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA209_transition[i] = DFA.unpackEncodedString(DFA209_transitionS[i]);
		}
	}

	protected class DFA209 extends DFA {

		public DFA209(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 209;
			this.eot = DFA209_eot;
			this.eof = DFA209_eof;
			this.min = DFA209_min;
			this.max = DFA209_max;
			this.accept = DFA209_accept;
			this.special = DFA209_special;
			this.transition = DFA209_transition;
		}
		@Override
		public String getDescription() {
			return "1556:1: simpleTerm returns [Term.Raw term] : (v= value |f= function | '(' c= comparatorType ')' t= simpleTerm );";
		}
	}

	static final String DFA212_eotS =
		"\37\uffff";
	static final String DFA212_eofS =
		"\37\uffff";
	static final String DFA212_minS =
		"\1\6\1\uffff\33\33\2\uffff";
	static final String DFA212_maxS =
		"\1\u00dc\1\uffff\32\u00cf\1\u00cd\2\uffff";
	static final String DFA212_acceptS =
		"\1\uffff\1\1\33\uffff\1\2\1\3";
	static final String DFA212_specialS =
		"\37\uffff}>";
	static final String[] DFA212_transitionS = {
			"\1\1\4\uffff\1\1\5\uffff\1\34\2\uffff\1\1\3\uffff\1\1\1\uffff\1\2\1\1"+
			"\2\uffff\1\4\1\uffff\3\4\4\uffff\1\4\1\uffff\1\5\3\uffff\1\6\1\7\1\10"+
			"\1\uffff\1\4\1\33\2\4\1\uffff\2\4\1\32\1\11\1\uffff\2\4\1\30\1\12\1\4"+
			"\3\uffff\1\33\1\13\1\uffff\1\14\2\uffff\3\4\1\15\1\uffff\1\4\1\uffff"+
			"\2\4\1\uffff\1\4\3\uffff\1\16\2\4\1\uffff\1\17\1\4\2\uffff\2\33\1\4\1"+
			"\uffff\3\4\1\uffff\3\4\1\uffff\2\4\1\uffff\2\1\1\4\1\uffff\1\4\1\uffff"+
			"\1\1\2\uffff\2\4\2\uffff\5\4\2\1\2\uffff\2\4\1\uffff\2\4\3\uffff\1\4"+
			"\1\20\5\4\1\21\1\31\1\22\1\27\1\23\1\uffff\1\1\1\4\1\uffff\1\33\3\4\1"+
			"\uffff\1\4\2\uffff\2\4\1\uffff\1\24\1\4\1\25\1\26\3\uffff\1\33\10\uffff"+
			"\1\1\1\3\3\uffff\1\1\2\uffff\1\1\10\uffff\1\1\4\uffff\1\1\3\uffff\1\1"+
			"\6\uffff\1\1\3\uffff\1\1",
			"",
			"\1\36\u00ac\uffff\1\1\1\uffff\1\35\2\uffff\1\35\1\uffff\1\1",
			"\1\36\u00ac\uffff\1\1\1\uffff\1\35\2\uffff\1\35\1\uffff\1\1",
			"\1\36\u00ac\uffff\1\1\1\uffff\1\35\2\uffff\1\35\1\uffff\1\1",
			"\1\36\u00ac\uffff\1\1\1\uffff\1\35\2\uffff\1\35\1\uffff\1\1",
			"\1\36\u00ac\uffff\1\1\1\uffff\1\35\2\uffff\1\35\1\uffff\1\1",
			"\1\36\u00ac\uffff\1\1\1\uffff\1\35\2\uffff\1\35\1\uffff\1\1",
			"\1\36\u00ac\uffff\1\1\1\uffff\1\35\2\uffff\1\35\1\uffff\1\1",
			"\1\36\u00ac\uffff\1\1\1\uffff\1\35\2\uffff\1\35\1\uffff\1\1",
			"\1\36\u00ac\uffff\1\1\1\uffff\1\35\2\uffff\1\35\1\uffff\1\1",
			"\1\36\u00ac\uffff\1\1\1\uffff\1\35\2\uffff\1\35\1\uffff\1\1",
			"\1\36\u00ac\uffff\1\1\1\uffff\1\35\2\uffff\1\35\1\uffff\1\1",
			"\1\36\u00ac\uffff\1\1\1\uffff\1\35\2\uffff\1\35\1\uffff\1\1",
			"\1\36\u00ac\uffff\1\1\1\uffff\1\35\2\uffff\1\35\1\uffff\1\1",
			"\1\36\u00ac\uffff\1\1\1\uffff\1\35\2\uffff\1\35\1\uffff\1\1",
			"\1\36\u00ac\uffff\1\1\1\uffff\1\35\2\uffff\1\35\1\uffff\1\1",
			"\1\36\u00ac\uffff\1\1\1\uffff\1\35\2\uffff\1\35\1\uffff\1\1",
			"\1\36\u00ac\uffff\1\1\1\uffff\1\35\2\uffff\1\35\1\uffff\1\1",
			"\1\36\u00ac\uffff\1\1\1\uffff\1\35\2\uffff\1\35\1\uffff\1\1",
			"\1\36\u00ac\uffff\1\1\1\uffff\1\35\2\uffff\1\35\1\uffff\1\1",
			"\1\36\u00ac\uffff\1\1\1\uffff\1\35\2\uffff\1\35\1\uffff\1\1",
			"\1\36\u00ac\uffff\1\1\1\uffff\1\35\2\uffff\1\35\1\uffff\1\1",
			"\1\36\u00ac\uffff\1\1\1\uffff\1\35\2\uffff\1\35\1\uffff\1\1",
			"\1\36\u00ac\uffff\1\1\1\uffff\1\35\2\uffff\1\35\1\uffff\1\1",
			"\1\36\u00ac\uffff\1\1\1\uffff\1\35\2\uffff\1\35\1\uffff\1\1",
			"\1\36\u00ac\uffff\1\1\1\uffff\1\35\2\uffff\1\35\1\uffff\1\1",
			"\1\36\u00ae\uffff\1\35\2\uffff\1\35\1\uffff\1\1",
			"\1\36\u00ae\uffff\1\35\2\uffff\1\35",
			"",
			""
	};

	static final short[] DFA212_eot = DFA.unpackEncodedString(DFA212_eotS);
	static final short[] DFA212_eof = DFA.unpackEncodedString(DFA212_eofS);
	static final char[] DFA212_min = DFA.unpackEncodedStringToUnsignedChars(DFA212_minS);
	static final char[] DFA212_max = DFA.unpackEncodedStringToUnsignedChars(DFA212_maxS);
	static final short[] DFA212_accept = DFA.unpackEncodedString(DFA212_acceptS);
	static final short[] DFA212_special = DFA.unpackEncodedString(DFA212_specialS);
	static final short[][] DFA212_transition;

	static {
		int numStates = DFA212_transitionS.length;
		DFA212_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA212_transition[i] = DFA.unpackEncodedString(DFA212_transitionS[i]);
		}
	}

	protected class DFA212 extends DFA {

		public DFA212(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 212;
			this.eot = DFA212_eot;
			this.eof = DFA212_eof;
			this.min = DFA212_min;
			this.max = DFA212_max;
			this.accept = DFA212_accept;
			this.special = DFA212_special;
			this.transition = DFA212_transition;
		}
		@Override
		public String getDescription() {
			return "1573:1: normalColumnOperation[List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key] : (t= term ( '+' c= cident )? |c= cident sig= ( '+' | '-' ) t= term |c= cident i= INTEGER );";
		}
	}

	static final String DFA220_eotS =
		"\35\uffff";
	static final String DFA220_eofS =
		"\35\uffff";
	static final String DFA220_minS =
		"\1\32\31\u00d5\1\6\2\uffff";
	static final String DFA220_maxS =
		"\1\u00b8\31\u00d5\1\u00dc\2\uffff";
	static final String DFA220_acceptS =
		"\33\uffff\1\1\1\2";
	static final String DFA220_specialS =
		"\35\uffff}>";
	static final String[] DFA220_transitionS = {
			"\1\1\3\uffff\1\3\1\uffff\3\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6"+
			"\1\7\1\uffff\1\3\1\31\2\3\1\uffff\2\3\1\31\1\10\1\uffff\2\3\1\27\1\11"+
			"\1\3\3\uffff\1\31\1\12\1\uffff\1\13\2\uffff\3\3\1\14\1\uffff\1\3\1\uffff"+
			"\2\3\1\uffff\1\3\3\uffff\1\15\2\3\1\uffff\1\16\1\3\2\uffff\2\31\1\3\1"+
			"\uffff\3\3\1\uffff\3\3\1\uffff\2\3\3\uffff\1\3\1\uffff\1\3\4\uffff\2"+
			"\3\2\uffff\5\3\4\uffff\2\3\1\uffff\2\3\3\uffff\1\3\1\17\5\3\1\20\1\30"+
			"\1\21\1\26\1\22\2\uffff\1\3\1\uffff\1\31\3\3\1\uffff\1\3\2\uffff\2\3"+
			"\1\uffff\1\23\1\3\1\24\1\25\3\uffff\1\31\11\uffff\1\2",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\32",
			"\1\33\4\uffff\1\33\10\uffff\1\33\3\uffff\1\33\2\uffff\1\33\2\uffff\1"+
			"\33\1\uffff\3\33\4\uffff\1\33\1\uffff\1\33\3\uffff\3\33\1\uffff\4\33"+
			"\1\uffff\4\33\1\uffff\5\33\3\uffff\2\33\1\uffff\1\33\2\uffff\4\33\1\uffff"+
			"\1\33\1\uffff\2\33\1\uffff\1\33\3\uffff\3\33\1\uffff\2\33\2\uffff\3\33"+
			"\1\uffff\3\33\1\uffff\3\33\1\uffff\2\33\1\uffff\3\33\1\uffff\1\33\4\uffff"+
			"\2\33\2\uffff\7\33\2\uffff\2\33\1\uffff\2\33\3\uffff\14\33\2\uffff\1"+
			"\33\1\uffff\4\33\1\uffff\1\33\2\uffff\2\33\1\uffff\4\33\3\uffff\1\33"+
			"\15\uffff\1\33\2\uffff\1\33\34\uffff\1\34",
			"",
			""
	};

	static final short[] DFA220_eot = DFA.unpackEncodedString(DFA220_eotS);
	static final short[] DFA220_eof = DFA.unpackEncodedString(DFA220_eofS);
	static final char[] DFA220_min = DFA.unpackEncodedStringToUnsignedChars(DFA220_minS);
	static final char[] DFA220_max = DFA.unpackEncodedStringToUnsignedChars(DFA220_maxS);
	static final short[] DFA220_accept = DFA.unpackEncodedString(DFA220_acceptS);
	static final short[] DFA220_special = DFA.unpackEncodedString(DFA220_specialS);
	static final short[][] DFA220_transition;

	static {
		int numStates = DFA220_transitionS.length;
		DFA220_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA220_transition[i] = DFA.unpackEncodedString(DFA220_transitionS[i]);
		}
	}

	protected class DFA220 extends DFA {

		public DFA220(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 220;
			this.eot = DFA220_eot;
			this.eof = DFA220_eof;
			this.min = DFA220_min;
			this.max = DFA220_max;
			this.accept = DFA220_accept;
			this.special = DFA220_special;
			this.transition = DFA220_transition;
		}
		@Override
		public String getDescription() {
			return "1653:1: property[PropertyDefinitions props] : (k= noncol_ident '=' simple= propertyValue |k= noncol_ident '=' map= fullMapLiteral );";
		}
	}

	static final String DFA225_eotS =
		"\101\uffff";
	static final String DFA225_eofS =
		"\101\uffff";
	static final String DFA225_minS =
		"\1\21\32\67\1\uffff\1\21\3\uffff\1\u00b7\2\uffff\32\67\4\uffff";
	static final String DFA225_maxS =
		"\1\u00c8\32\u00d8\1\uffff\1\u00c8\3\uffff\1\u00d1\2\uffff\32\u00d8\4\uffff";
	static final String DFA225_acceptS =
		"\33\uffff\1\4\1\uffff\1\1\1\2\1\3\1\uffff\1\7\1\10\32\uffff\1\12\1\5\1"+
		"\6\1\11";
	static final String DFA225_specialS =
		"\101\uffff}>";
	static final String[] DFA225_transitionS = {
			"\1\1\10\uffff\1\2\3\uffff\1\4\1\uffff\3\4\4\uffff\1\4\1\uffff\1\5\3\uffff"+
			"\1\6\1\7\1\10\1\uffff\1\4\1\32\2\4\1\uffff\2\4\1\32\1\11\1\uffff\2\4"+
			"\1\30\1\12\1\4\3\uffff\1\32\1\13\1\uffff\1\14\2\uffff\3\4\1\15\1\uffff"+
			"\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\1\16\2\4\1\uffff\1\17\1\4\2\uffff"+
			"\2\32\1\4\1\uffff\3\4\1\uffff\3\4\1\uffff\2\4\3\uffff\1\4\1\uffff\1\4"+
			"\4\uffff\2\4\2\uffff\5\4\4\uffff\2\4\1\uffff\2\4\3\uffff\1\4\1\20\5\4"+
			"\1\21\1\31\1\22\1\27\1\23\1\uffff\1\33\1\4\1\uffff\1\32\3\4\1\uffff\1"+
			"\4\2\uffff\2\4\1\uffff\1\24\1\4\1\25\1\26\3\uffff\1\32\11\uffff\1\3\17"+
			"\uffff\1\34",
			"\1\41\35\uffff\1\40\10\uffff\1\37\6\uffff\1\36\140\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\35\uffff\1\40\10\uffff\1\37\6\uffff\1\36\140\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\35\uffff\1\40\10\uffff\1\37\6\uffff\1\36\140\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\35\uffff\1\40\10\uffff\1\37\6\uffff\1\36\140\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\35\uffff\1\40\10\uffff\1\37\6\uffff\1\36\140\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\35\uffff\1\40\10\uffff\1\37\6\uffff\1\36\140\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\35\uffff\1\40\10\uffff\1\37\6\uffff\1\36\140\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\35\uffff\1\40\10\uffff\1\37\6\uffff\1\36\140\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\35\uffff\1\40\10\uffff\1\37\6\uffff\1\36\140\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\35\uffff\1\40\10\uffff\1\37\6\uffff\1\36\140\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\35\uffff\1\40\10\uffff\1\37\6\uffff\1\36\140\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\35\uffff\1\40\10\uffff\1\37\6\uffff\1\36\140\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\35\uffff\1\40\10\uffff\1\37\6\uffff\1\36\140\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\35\uffff\1\40\10\uffff\1\37\6\uffff\1\36\140\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\35\uffff\1\40\10\uffff\1\37\6\uffff\1\36\140\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\35\uffff\1\40\10\uffff\1\37\6\uffff\1\36\140\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\35\uffff\1\40\10\uffff\1\37\6\uffff\1\36\140\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\35\uffff\1\40\10\uffff\1\37\6\uffff\1\36\140\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\35\uffff\1\40\10\uffff\1\37\6\uffff\1\36\140\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\35\uffff\1\40\10\uffff\1\37\6\uffff\1\36\140\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\35\uffff\1\40\10\uffff\1\37\6\uffff\1\36\140\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\35\uffff\1\40\10\uffff\1\37\6\uffff\1\36\140\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\35\uffff\1\40\10\uffff\1\37\6\uffff\1\36\140\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\35\uffff\1\40\10\uffff\1\37\6\uffff\1\36\140\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\35\uffff\1\40\10\uffff\1\37\6\uffff\1\36\140\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"\1\41\35\uffff\1\40\10\uffff\1\37\6\uffff\1\36\140\uffff\1\35\14\uffff"+
			"\5\35\1\42",
			"",
			"\1\43\10\uffff\1\44\3\uffff\1\46\1\uffff\3\46\4\uffff\1\46\1\uffff\1"+
			"\47\3\uffff\1\50\1\51\1\52\1\uffff\1\46\1\74\2\46\1\uffff\2\46\1\74\1"+
			"\53\1\uffff\2\46\1\72\1\54\1\46\3\uffff\1\74\1\55\1\uffff\1\56\2\uffff"+
			"\3\46\1\57\1\uffff\1\46\1\uffff\2\46\1\uffff\1\46\3\uffff\1\60\2\46\1"+
			"\uffff\1\61\1\46\2\uffff\2\74\1\46\1\uffff\3\46\1\uffff\3\46\1\uffff"+
			"\2\46\3\uffff\1\46\1\uffff\1\46\4\uffff\2\46\2\uffff\5\46\4\uffff\2\46"+
			"\1\uffff\2\46\3\uffff\1\46\1\62\5\46\1\63\1\73\1\64\1\71\1\65\1\uffff"+
			"\1\75\1\46\1\uffff\1\74\3\46\1\uffff\1\46\2\uffff\2\46\1\uffff\1\66\1"+
			"\46\1\67\1\70\3\uffff\1\74\11\uffff\1\45\17\uffff\1\75",
			"",
			"",
			"",
			"\1\76\20\uffff\1\77\10\uffff\1\76",
			"",
			"",
			"\1\75\35\uffff\1\75\10\uffff\1\75\6\uffff\1\75\140\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\35\uffff\1\75\10\uffff\1\75\6\uffff\1\75\140\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\35\uffff\1\75\10\uffff\1\75\6\uffff\1\75\140\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\35\uffff\1\75\10\uffff\1\75\6\uffff\1\75\140\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\35\uffff\1\75\10\uffff\1\75\6\uffff\1\75\140\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\35\uffff\1\75\10\uffff\1\75\6\uffff\1\75\140\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\35\uffff\1\75\10\uffff\1\75\6\uffff\1\75\140\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\35\uffff\1\75\10\uffff\1\75\6\uffff\1\75\140\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\35\uffff\1\75\10\uffff\1\75\6\uffff\1\75\140\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\35\uffff\1\75\10\uffff\1\75\6\uffff\1\75\140\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\35\uffff\1\75\10\uffff\1\75\6\uffff\1\75\140\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\35\uffff\1\75\10\uffff\1\75\6\uffff\1\75\140\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\35\uffff\1\75\10\uffff\1\75\6\uffff\1\75\140\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\35\uffff\1\75\10\uffff\1\75\6\uffff\1\75\140\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\35\uffff\1\75\10\uffff\1\75\6\uffff\1\75\140\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\35\uffff\1\75\10\uffff\1\75\6\uffff\1\75\140\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\35\uffff\1\75\10\uffff\1\75\6\uffff\1\75\140\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\35\uffff\1\75\10\uffff\1\75\6\uffff\1\75\140\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\35\uffff\1\75\10\uffff\1\75\6\uffff\1\75\140\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\35\uffff\1\75\10\uffff\1\75\6\uffff\1\75\140\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\35\uffff\1\75\10\uffff\1\75\6\uffff\1\75\140\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\35\uffff\1\75\10\uffff\1\75\6\uffff\1\75\140\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\35\uffff\1\75\10\uffff\1\75\6\uffff\1\75\140\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\35\uffff\1\75\10\uffff\1\75\6\uffff\1\75\140\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\35\uffff\1\75\10\uffff\1\75\6\uffff\1\75\140\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"\1\75\35\uffff\1\75\10\uffff\1\75\6\uffff\1\75\140\uffff\1\75\2\uffff"+
			"\1\100\2\uffff\1\100\6\uffff\6\75",
			"",
			"",
			"",
			""
	};

	static final short[] DFA225_eot = DFA.unpackEncodedString(DFA225_eotS);
	static final short[] DFA225_eof = DFA.unpackEncodedString(DFA225_eofS);
	static final char[] DFA225_min = DFA.unpackEncodedStringToUnsignedChars(DFA225_minS);
	static final char[] DFA225_max = DFA.unpackEncodedStringToUnsignedChars(DFA225_maxS);
	static final short[] DFA225_accept = DFA.unpackEncodedString(DFA225_acceptS);
	static final short[] DFA225_special = DFA.unpackEncodedString(DFA225_specialS);
	static final short[][] DFA225_transition;

	static {
		int numStates = DFA225_transitionS.length;
		DFA225_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA225_transition[i] = DFA.unpackEncodedString(DFA225_transitionS[i]);
		}
	}

	protected class DFA225 extends DFA {

		public DFA225(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 225;
			this.eot = DFA225_eot;
			this.eof = DFA225_eof;
			this.min = DFA225_min;
			this.max = DFA225_max;
			this.accept = DFA225_accept;
			this.special = DFA225_special;
			this.transition = DFA225_transition;
		}
		@Override
		public String getDescription() {
			return "1672:1: relation[WhereClause.Builder clauses] : (name= cident type= relationType t= term |name= cident K_LIKE t= term |name= cident K_IS K_NOT K_NULL | K_TOKEN l= tupleOfIdentifiers type= relationType t= term |name= cident K_IN marker= inMarker |name= cident K_IN inValues= singleColumnInValues |name= cident rt= containsOperator t= term |name= cident '[' key= term ']' type= relationType t= term |ids= tupleOfIdentifiers ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple ) | '(' relation[$clauses] ')' );";
		}
	}

	static final String DFA224_eotS =
		"\12\uffff";
	static final String DFA224_eofS =
		"\12\uffff";
	static final String DFA224_minS =
		"\1\125\1\uffff\6\u00b7\2\uffff";
	static final String DFA224_maxS =
		"\1\u00d7\1\uffff\6\u00d1\2\uffff";
	static final String DFA224_acceptS =
		"\1\uffff\1\1\6\uffff\1\2\1\3";
	static final String DFA224_specialS =
		"\12\uffff}>";
	static final String[] DFA224_transitionS = {
			"\1\1\160\uffff\1\7\14\uffff\1\3\1\4\1\2\1\5\1\6",
			"",
			"\1\11\20\uffff\1\10\10\uffff\1\11",
			"\1\11\20\uffff\1\10\10\uffff\1\11",
			"\1\11\20\uffff\1\10\10\uffff\1\11",
			"\1\11\20\uffff\1\10\10\uffff\1\11",
			"\1\11\20\uffff\1\10\10\uffff\1\11",
			"\1\11\20\uffff\1\10\10\uffff\1\11",
			"",
			""
	};

	static final short[] DFA224_eot = DFA.unpackEncodedString(DFA224_eotS);
	static final short[] DFA224_eof = DFA.unpackEncodedString(DFA224_eofS);
	static final char[] DFA224_min = DFA.unpackEncodedStringToUnsignedChars(DFA224_minS);
	static final char[] DFA224_max = DFA.unpackEncodedStringToUnsignedChars(DFA224_maxS);
	static final short[] DFA224_accept = DFA.unpackEncodedString(DFA224_acceptS);
	static final short[] DFA224_special = DFA.unpackEncodedString(DFA224_specialS);
	static final short[][] DFA224_transition;

	static {
		int numStates = DFA224_transitionS.length;
		DFA224_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA224_transition[i] = DFA.unpackEncodedString(DFA224_transitionS[i]);
		}
	}

	protected class DFA224 extends DFA {

		public DFA224(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 224;
			this.eot = DFA224_eot;
			this.eof = DFA224_eof;
			this.min = DFA224_min;
			this.max = DFA224_max;
			this.accept = DFA224_accept;
			this.special = DFA224_special;
			this.transition = DFA224_transition;
		}
		@Override
		public String getDescription() {
			return "1685:7: ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple )";
		}
	}

	static final String DFA235_eotS =
		"\40\uffff";
	static final String DFA235_eofS =
		"\1\uffff\25\35\2\32\1\uffff\1\32\1\uffff\1\32\4\uffff";
	static final String DFA235_minS =
		"\1\32\27\113\1\uffff\1\113\1\uffff\1\113\4\uffff";
	static final String DFA235_maxS =
		"\1\u00bc\27\u00d6\1\uffff\1\u00d6\1\uffff\1\u00d6\4\uffff";
	static final String DFA235_acceptS =
		"\30\uffff\1\2\1\uffff\1\4\1\uffff\1\6\1\1\1\3\1\5";
	static final String DFA235_specialS =
		"\40\uffff}>";
	static final String[] DFA235_transitionS = {
			"\1\32\3\uffff\1\32\1\uffff\3\32\4\uffff\1\32\1\uffff\1\1\3\uffff\1\2"+
			"\1\3\1\4\1\uffff\4\32\1\uffff\3\32\1\5\1\uffff\2\32\1\24\1\6\1\32\3\uffff"+
			"\1\32\1\7\1\uffff\1\10\2\uffff\3\32\1\11\1\uffff\1\33\1\uffff\2\32\1"+
			"\uffff\1\32\3\uffff\1\12\2\32\1\uffff\1\13\1\32\2\uffff\3\32\1\uffff"+
			"\3\32\1\uffff\1\27\1\32\1\26\1\uffff\2\32\3\uffff\1\32\1\uffff\1\32\4"+
			"\uffff\2\32\2\uffff\5\32\4\uffff\2\32\1\uffff\2\32\2\uffff\1\30\1\32"+
			"\1\14\5\32\1\15\1\25\1\16\1\23\1\17\2\uffff\1\32\1\uffff\1\32\1\31\2"+
			"\32\1\uffff\1\32\2\uffff\2\32\1\uffff\1\20\1\32\1\21\1\22\3\uffff\1\32"+
			"\11\uffff\1\32\3\uffff\1\34",
			"\1\35\14\uffff\1\35\13\uffff\1\35\35\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\13\uffff\1\35\35\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\13\uffff\1\35\35\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\13\uffff\1\35\35\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\13\uffff\1\35\35\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\13\uffff\1\35\35\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\13\uffff\1\35\35\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\13\uffff\1\35\35\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\13\uffff\1\35\35\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\13\uffff\1\35\35\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\13\uffff\1\35\35\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\13\uffff\1\35\35\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\13\uffff\1\35\35\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\13\uffff\1\35\35\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\13\uffff\1\35\35\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\13\uffff\1\35\35\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\13\uffff\1\35\35\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\13\uffff\1\35\35\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\13\uffff\1\35\35\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\13\uffff\1\35\35\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\35\14\uffff\1\35\13\uffff\1\35\35\uffff\1\35\13\uffff\1\35\72\uffff"+
			"\1\35\2\uffff\1\35\2\uffff\1\32\2\uffff\1\35\3\uffff\1\35",
			"\1\32\14\uffff\1\32\13\uffff\1\32\35\uffff\1\32\13\uffff\1\32\72\uffff"+
			"\1\32\2\uffff\1\32\2\uffff\1\32\2\uffff\1\32\1\30\2\uffff\1\32",
			"\1\32\14\uffff\1\32\13\uffff\1\32\35\uffff\1\32\13\uffff\1\32\72\uffff"+
			"\1\32\2\uffff\1\32\2\uffff\1\32\2\uffff\1\32\1\30\2\uffff\1\32",
			"",
			"\1\32\14\uffff\1\32\13\uffff\1\32\35\uffff\1\32\13\uffff\1\32\72\uffff"+
			"\1\32\2\uffff\1\32\2\uffff\1\32\2\uffff\1\32\1\36\2\uffff\1\32",
			"",
			"\1\32\14\uffff\1\32\13\uffff\1\32\35\uffff\1\32\13\uffff\1\32\72\uffff"+
			"\1\32\2\uffff\1\32\2\uffff\1\32\2\uffff\1\32\1\37\2\uffff\1\32",
			"",
			"",
			"",
			""
	};

	static final short[] DFA235_eot = DFA.unpackEncodedString(DFA235_eotS);
	static final short[] DFA235_eof = DFA.unpackEncodedString(DFA235_eofS);
	static final char[] DFA235_min = DFA.unpackEncodedStringToUnsignedChars(DFA235_minS);
	static final char[] DFA235_max = DFA.unpackEncodedStringToUnsignedChars(DFA235_maxS);
	static final short[] DFA235_accept = DFA.unpackEncodedString(DFA235_acceptS);
	static final short[] DFA235_special = DFA.unpackEncodedString(DFA235_specialS);
	static final short[][] DFA235_transition;

	static {
		int numStates = DFA235_transitionS.length;
		DFA235_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA235_transition[i] = DFA.unpackEncodedString(DFA235_transitionS[i]);
		}
	}

	protected class DFA235 extends DFA {

		public DFA235(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 235;
			this.eot = DFA235_eot;
			this.eof = DFA235_eof;
			this.min = DFA235_min;
			this.max = DFA235_max;
			this.accept = DFA235_accept;
			this.special = DFA235_special;
			this.transition = DFA235_transition;
		}
		@Override
		public String getDescription() {
			return "1746:1: comparatorType returns [CQL3Type.Raw t] : (n= native_type |c= collection_type |tt= tuple_type |id= userTypeName | K_FROZEN '<' f= comparatorType '>' |s= STRING_LITERAL );";
		}
	}

	public static final BitSet FOLLOW_selectStatement_in_cqlStatement59 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insertStatement_in_cqlStatement88 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateStatement_in_cqlStatement117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_batchStatement_in_cqlStatement146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deleteStatement_in_cqlStatement176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_useStatement_in_cqlStatement205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_truncateStatement_in_cqlStatement237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createKeyspaceStatement_in_cqlStatement264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createTableStatement_in_cqlStatement285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createIndexStatement_in_cqlStatement308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropKeyspaceStatement_in_cqlStatement331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropTableStatement_in_cqlStatement353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropIndexStatement_in_cqlStatement378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterTableStatement_in_cqlStatement403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterKeyspaceStatement_in_cqlStatement427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grantPermissionsStatement_in_cqlStatement448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_revokePermissionsStatement_in_cqlStatement466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listPermissionsStatement_in_cqlStatement483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createUserStatement_in_cqlStatement502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterUserStatement_in_cqlStatement526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropUserStatement_in_cqlStatement551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listUsersStatement_in_cqlStatement577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createTriggerStatement_in_cqlStatement602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropTriggerStatement_in_cqlStatement623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createTypeStatement_in_cqlStatement646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterTypeStatement_in_cqlStatement670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropTypeStatement_in_cqlStatement695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createFunctionStatement_in_cqlStatement721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropFunctionStatement_in_cqlStatement741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createAggregateStatement_in_cqlStatement763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropAggregateStatement_in_cqlStatement782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createRoleStatement_in_cqlStatement803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterRoleStatement_in_cqlStatement827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropRoleStatement_in_cqlStatement852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listRolesStatement_in_cqlStatement878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grantRoleStatement_in_cqlStatement903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_revokeRoleStatement_in_cqlStatement928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createMaterializedViewStatement_in_cqlStatement952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropMaterializedViewStatement_in_cqlStatement964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterMaterializedViewStatement_in_cqlStatement978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_describeStatement_in_cqlStatement991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_USE_in_useStatement1030 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_keyspaceName_in_useStatement1034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SELECT_in_selectStatement1068 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000013022100L});
	public static final BitSet FOLLOW_K_JSON_in_selectStatement1094 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000013022100L});
	public static final BitSet FOLLOW_selectClause_in_selectStatement1103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_K_FROM_in_selectStatement1111 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_columnFamilyName_in_selectStatement1115 = new BitSet(new long[]{0x0000000800000002L,0x2400004000080000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_WHERE_in_selectStatement1125 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8B5E58L,0x010047B2F6FFF1B0L,0x0000000008000100L});
	public static final BitSet FOLLOW_whereClause_in_selectStatement1129 = new BitSet(new long[]{0x0000000800000002L,0x2400004000080000L});
	public static final BitSet FOLLOW_K_GROUP_in_selectStatement1142 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_K_BY_in_selectStatement1144 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_groupByClause_in_selectStatement1146 = new BitSet(new long[]{0x0000000800000002L,0x2400004000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_204_in_selectStatement1151 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_groupByClause_in_selectStatement1153 = new BitSet(new long[]{0x0000000800000002L,0x2400004000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_K_ORDER_in_selectStatement1170 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_K_BY_in_selectStatement1172 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_orderByClause_in_selectStatement1174 = new BitSet(new long[]{0x0000000800000002L,0x2000004000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_204_in_selectStatement1179 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_orderByClause_in_selectStatement1181 = new BitSet(new long[]{0x0000000800000002L,0x2000004000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_K_PER_in_selectStatement1198 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_K_PARTITION_in_selectStatement1200 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_K_LIMIT_in_selectStatement1202 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_intValue_in_selectStatement1206 = new BitSet(new long[]{0x0000000800000002L,0x0000004000000000L});
	public static final BitSet FOLLOW_K_LIMIT_in_selectStatement1221 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_intValue_in_selectStatement1225 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_K_ALLOW_in_selectStatement1240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_K_FILTERING_in_selectStatement1242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DISTINCT_in_selectClause1297 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000013022100L});
	public static final BitSet FOLLOW_selectors_in_selectClause1301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectors_in_selectClause1313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selector_in_selectors1338 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_204_in_selectors1343 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_selector_in_selectors1347 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_217_in_selectors1359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selector1392 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_K_AS_in_selector1395 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_noncol_ident_in_selector1399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionAddition_in_unaliasedSelector1428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionMultiplication_in_selectionAddition1455 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000002400L});
	public static final BitSet FOLLOW_202_in_selectionAddition1471 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_selectionMultiplication_in_selectionAddition1475 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000002400L});
	public static final BitSet FOLLOW_205_in_selectionAddition1489 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_selectionMultiplication_in_selectionAddition1493 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000002400L});
	public static final BitSet FOLLOW_selectionGroup_in_selectionMultiplication1531 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000002010080L});
	public static final BitSet FOLLOW_217_in_selectionMultiplication1547 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_selectionGroup_in_selectionMultiplication1551 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000002010080L});
	public static final BitSet FOLLOW_208_in_selectionMultiplication1565 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_selectionGroup_in_selectionMultiplication1569 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000002010080L});
	public static final BitSet FOLLOW_199_in_selectionMultiplication1583 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_selectionGroup_in_selectionMultiplication1587 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000002010080L});
	public static final BitSet FOLLOW_selectionGroupWithField_in_selectionGroup1629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionGroupWithoutField_in_selectionGroup1641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_205_in_selectionGroup1651 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_selectionGroup_in_selectionGroup1655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionGroupWithoutField_in_selectionGroupWithField1680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001008000L});
	public static final BitSet FOLLOW_selectorModifier_in_selectionGroupWithField1684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldSelectorModifier_in_selectorModifier1711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001008000L});
	public static final BitSet FOLLOW_selectorModifier_in_selectorModifier1716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_216_in_selectorModifier1727 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x958047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_collectionSubSelection_in_selectorModifier1731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_218_in_selectorModifier1734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001008000L});
	public static final BitSet FOLLOW_selectorModifier_in_selectorModifier1738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_207_in_fieldSelectorModifier1771 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_fident_in_fieldSelectorModifier1775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_collectionSubSelection1813 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RANGE_in_collectionSubSelection1819 = new BitSet(new long[]{0xFBDEE2874D100842L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_collectionSubSelection1824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RANGE_in_collectionSubSelection1839 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_collectionSubSelection1845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleUnaliasedSelector_in_selectionGroupWithoutField1897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionTypeHint_in_selectionGroupWithoutField1915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionTupleOrNestedSelector_in_selectionGroupWithoutField1927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionList_in_selectionGroupWithoutField1939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionMapOrSet_in_selectionGroupWithoutField1951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_200_in_selectionTypeHint1979 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L});
	public static final BitSet FOLLOW_comparatorType_in_selectionTypeHint1983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_201_in_selectionTypeHint1985 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011020100L});
	public static final BitSet FOLLOW_selectionGroupWithoutField_in_selectionTypeHint1989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_216_in_selectionList2030 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000015022100L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionList2036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004001000L});
	public static final BitSet FOLLOW_204_in_selectionList2042 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionList2046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004001000L});
	public static final BitSet FOLLOW_218_in_selectionList2056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_220_in_selectionMapOrSet2077 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionMapOrSet2081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020021000L});
	public static final BitSet FOLLOW_selectionMap_in_selectionMapOrSet2087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_selectionSet_in_selectionMapOrSet2096 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_221_in_selectionMapOrSet2102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_220_in_selectionMapOrSet2110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_221_in_selectionMapOrSet2112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_209_in_selectionMap2157 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionMap2161 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_204_in_selectionMap2169 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionMap2173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_209_in_selectionMap2175 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionMap2179 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_204_in_selectionSet2231 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionSet2235 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_200_in_selectionTupleOrNestedSelector2281 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionTupleOrNestedSelector2285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_204_in_selectionTupleOrNestedSelector2290 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionTupleOrNestedSelector2294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_201_in_selectionTupleOrNestedSelector2301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sident_in_simpleUnaliasedSelector2326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionLiteral_in_simpleUnaliasedSelector2372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionFunction_in_simpleUnaliasedSelector2408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COUNT_in_selectionFunction2454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_selectionFunction2456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_217_in_selectionFunction2458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_201_in_selectionFunction2460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_WRITETIME_in_selectionFunction2491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_selectionFunction2493 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_sident_in_selectionFunction2497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_201_in_selectionFunction2499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TTL_in_selectionFunction2522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_selectionFunction2530 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_sident_in_selectionFunction2534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_201_in_selectionFunction2536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CAST_in_selectionFunction2559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_selectionFunction2566 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionFunction2570 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_K_AS_in_selectionFunction2572 = new BitSet(new long[]{0x6200E20000000000L,0x0000000008801050L,0x0000068000F82000L});
	public static final BitSet FOLLOW_native_type_in_selectionFunction2576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_201_in_selectionFunction2578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionName_in_selectionFunction2590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_selectionFunctionArgs_in_selectionFunction2594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_selectionLiteral2619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NULL_in_selectionLiteral2649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_209_in_selectionLiteral2683 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_noncol_ident_in_selectionLiteral2687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_selectionLiteral2708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_200_in_selectionFunctionArgs2764 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022300L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionFunctionArgs2769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_204_in_selectionFunctionArgs2785 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionFunctionArgs2789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_201_in_selectionFunctionArgs2804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_sident2827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_sident2852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_sident2871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relationOrExpression_in_whereClause2902 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_K_AND_in_whereClause2906 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8B5E58L,0x010047B2F6FFF1B0L,0x0000000008000100L});
	public static final BitSet FOLLOW_relationOrExpression_in_whereClause2908 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_relation_in_relationOrExpression2930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_customIndexExpression_in_relationOrExpression2939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_219_in_customIndexExpression2967 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_idxName_in_customIndexExpression2969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_204_in_customIndexExpression2972 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_customIndexExpression2976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_201_in_customIndexExpression2978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_orderByClause3008 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_ASC_in_orderByClause3011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DESC_in_orderByClause3015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_groupByClause3041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_INSERT_in_insertStatement3066 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_K_INTO_in_insertStatement3068 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_columnFamilyName_in_insertStatement3072 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_normalInsertStatement_in_insertStatement3086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_JSON_in_insertStatement3101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1080000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_jsonInsertStatement_in_insertStatement3105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_200_in_normalInsertStatement3141 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_cident_in_normalInsertStatement3145 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_204_in_normalInsertStatement3152 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_cident_in_normalInsertStatement3156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_201_in_normalInsertStatement3163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_K_VALUES_in_normalInsertStatement3171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_normalInsertStatement3179 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_normalInsertStatement3183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_204_in_normalInsertStatement3189 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_normalInsertStatement3193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_201_in_normalInsertStatement3200 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L,0x0000004000000000L});
	public static final BitSet FOLLOW_K_IF_in_normalInsertStatement3210 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_normalInsertStatement3212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_EXISTS_in_normalInsertStatement3214 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_usingClause_in_normalInsertStatement3229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jsonValue_in_jsonInsertStatement3275 = new BitSet(new long[]{0x8000000000000002L,0x0000000000100000L,0x0000004000000000L});
	public static final BitSet FOLLOW_K_DEFAULT_in_jsonInsertStatement3285 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_K_NULL_in_jsonInsertStatement3289 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L,0x0000004000000000L});
	public static final BitSet FOLLOW_K_UNSET_in_jsonInsertStatement3297 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L,0x0000004000000000L});
	public static final BitSet FOLLOW_K_IF_in_jsonInsertStatement3313 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_jsonInsertStatement3315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_EXISTS_in_jsonInsertStatement3317 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_usingClause_in_jsonInsertStatement3332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_jsonValue3367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_209_in_jsonValue3377 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_noncol_ident_in_jsonValue3381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_jsonValue3395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_USING_in_usingClause3426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010200000L});
	public static final BitSet FOLLOW_usingClauseObjective_in_usingClause3428 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_K_AND_in_usingClause3433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010200000L});
	public static final BitSet FOLLOW_usingClauseObjective_in_usingClause3435 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_K_TIMESTAMP_in_usingClauseObjective3457 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_intValue_in_usingClauseObjective3461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TTL_in_usingClauseObjective3471 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_intValue_in_usingClauseObjective3475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_UPDATE_in_updateStatement3509 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_columnFamilyName_in_updateStatement3513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000800L});
	public static final BitSet FOLLOW_usingClause_in_updateStatement3523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_SET_in_updateStatement3535 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_columnOperation_in_updateStatement3537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_204_in_updateStatement3541 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_columnOperation_in_updateStatement3543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_K_WHERE_in_updateStatement3554 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8B5E58L,0x010047B2F6FFF1B0L,0x0000000008000100L});
	public static final BitSet FOLLOW_whereClause_in_updateStatement3558 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_K_IF_in_updateStatement3568 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_K_EXISTS_in_updateStatement3572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateConditions_in_updateStatement3580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_columnCondition_in_updateConditions3622 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_K_AND_in_updateConditions3627 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_columnCondition_in_updateConditions3629 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_K_DELETE_in_deleteStatement3666 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8B7E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_deleteSelection_in_deleteStatement3672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_K_FROM_in_deleteStatement3685 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_columnFamilyName_in_deleteStatement3689 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000104000000000L});
	public static final BitSet FOLLOW_usingClauseDelete_in_deleteStatement3699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_WHERE_in_deleteStatement3711 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8B5E58L,0x010047B2F6FFF1B0L,0x0000000008000100L});
	public static final BitSet FOLLOW_whereClause_in_deleteStatement3715 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_K_IF_in_deleteStatement3725 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_K_EXISTS_in_deleteStatement3729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateConditions_in_deleteStatement3737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deleteOp_in_deleteSelection3784 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_204_in_deleteSelection3799 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_deleteOp_in_deleteSelection3803 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_cident_in_deleteOp3830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_deleteOp3857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_216_in_deleteOp3859 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_deleteOp3863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_218_in_deleteOp3865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_deleteOp3877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_207_in_deleteOp3879 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_fident_in_deleteOp3883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_USING_in_usingClauseDelete3903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_TIMESTAMP_in_usingClauseDelete3905 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_intValue_in_usingClauseDelete3909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BEGIN_in_batchStatement3943 = new BitSet(new long[]{0x0200080000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_K_UNLOGGED_in_batchStatement3953 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_K_COUNTER_in_batchStatement3959 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_K_BATCH_in_batchStatement3972 = new BitSet(new long[]{0x0000004000000000L,0x0000000004000001L,0x0000004400000000L});
	public static final BitSet FOLLOW_usingClause_in_batchStatement3976 = new BitSet(new long[]{0x0000004000000000L,0x0000000004000001L,0x0000000400000000L});
	public static final BitSet FOLLOW_batchStatementObjective_in_batchStatement3996 = new BitSet(new long[]{0x0000004000000000L,0x0000000004000001L,0x0000000400000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_210_in_batchStatement3998 = new BitSet(new long[]{0x0000004000000000L,0x0000000004000001L,0x0000000400000000L});
	public static final BitSet FOLLOW_K_APPLY_in_batchStatement4012 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_K_BATCH_in_batchStatement4014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insertStatement_in_batchStatementObjective4045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateStatement_in_batchStatementObjective4058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deleteStatement_in_batchStatementObjective4071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createAggregateStatement4104 = new BitSet(new long[]{0x0000000100000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_K_OR_in_createAggregateStatement4107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_K_REPLACE_in_createAggregateStatement4109 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_K_AGGREGATE_in_createAggregateStatement4121 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B9B5E58L,0x018047B2F6FFF1B0L});
	public static final BitSet FOLLOW_K_IF_in_createAggregateStatement4130 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createAggregateStatement4132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_EXISTS_in_createAggregateStatement4134 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F6FFF1B0L});
	public static final BitSet FOLLOW_functionName_in_createAggregateStatement4148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_createAggregateStatement4156 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L,0x0000000000000200L});
	public static final BitSet FOLLOW_comparatorType_in_createAggregateStatement4180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_204_in_createAggregateStatement4196 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L});
	public static final BitSet FOLLOW_comparatorType_in_createAggregateStatement4200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_201_in_createAggregateStatement4224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_K_SFUNC_in_createAggregateStatement4232 = new BitSet(new long[]{0xFBDAE28744000000L,0xF9851BBA1B8B5E50L,0x010007B2E6FFF1B0L});
	public static final BitSet FOLLOW_allowedFunctionName_in_createAggregateStatement4238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_K_STYPE_in_createAggregateStatement4246 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L});
	public static final BitSet FOLLOW_comparatorType_in_createAggregateStatement4252 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000800L});
	public static final BitSet FOLLOW_K_FINALFUNC_in_createAggregateStatement4270 = new BitSet(new long[]{0xFBDAE28744000000L,0xF9851BBA1B8B5E50L,0x010007B2E6FFF1B0L});
	public static final BitSet FOLLOW_allowedFunctionName_in_createAggregateStatement4276 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_INITCOND_in_createAggregateStatement4303 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_createAggregateStatement4309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropAggregateStatement4356 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_K_AGGREGATE_in_dropAggregateStatement4358 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B9B5E58L,0x018047B2F6FFF1B0L});
	public static final BitSet FOLLOW_K_IF_in_dropAggregateStatement4367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropAggregateStatement4369 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F6FFF1B0L});
	public static final BitSet FOLLOW_functionName_in_dropAggregateStatement4384 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_dropAggregateStatement4402 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L,0x0000000000000200L});
	public static final BitSet FOLLOW_comparatorType_in_dropAggregateStatement4430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_204_in_dropAggregateStatement4448 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L});
	public static final BitSet FOLLOW_comparatorType_in_dropAggregateStatement4452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_201_in_dropAggregateStatement4480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createFunctionStatement4537 = new BitSet(new long[]{0x0000000000000000L,0x0200000000010000L});
	public static final BitSet FOLLOW_K_OR_in_createFunctionStatement4540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_K_REPLACE_in_createFunctionStatement4542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_K_FUNCTION_in_createFunctionStatement4554 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B9B5E58L,0x018047B2F6FFF1B0L});
	public static final BitSet FOLLOW_K_IF_in_createFunctionStatement4563 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createFunctionStatement4565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_EXISTS_in_createFunctionStatement4567 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F6FFF1B0L});
	public static final BitSet FOLLOW_functionName_in_createFunctionStatement4581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_createFunctionStatement4589 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L,0x0000000000000200L});
	public static final BitSet FOLLOW_noncol_ident_in_createFunctionStatement4613 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L});
	public static final BitSet FOLLOW_comparatorType_in_createFunctionStatement4617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_204_in_createFunctionStatement4633 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_noncol_ident_in_createFunctionStatement4637 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L});
	public static final BitSet FOLLOW_comparatorType_in_createFunctionStatement4641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_201_in_createFunctionStatement4665 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_RETURNS_in_createFunctionStatement4676 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_K_NULL_in_createFunctionStatement4678 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_K_CALLED_in_createFunctionStatement4684 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_K_ON_in_createFunctionStatement4690 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_K_NULL_in_createFunctionStatement4692 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_INPUT_in_createFunctionStatement4694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_RETURNS_in_createFunctionStatement4702 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L});
	public static final BitSet FOLLOW_comparatorType_in_createFunctionStatement4708 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_K_LANGUAGE_in_createFunctionStatement4716 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_IDENT_in_createFunctionStatement4722 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_K_AS_in_createFunctionStatement4730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_createFunctionStatement4736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropFunctionStatement4774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_K_FUNCTION_in_dropFunctionStatement4776 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B9B5E58L,0x018047B2F6FFF1B0L});
	public static final BitSet FOLLOW_K_IF_in_dropFunctionStatement4785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropFunctionStatement4787 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F6FFF1B0L});
	public static final BitSet FOLLOW_functionName_in_dropFunctionStatement4802 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_dropFunctionStatement4820 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L,0x0000000000000200L});
	public static final BitSet FOLLOW_comparatorType_in_dropFunctionStatement4848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_204_in_dropFunctionStatement4866 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L});
	public static final BitSet FOLLOW_comparatorType_in_dropFunctionStatement4870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_201_in_dropFunctionStatement4898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createKeyspaceStatement4957 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_createKeyspaceStatement4959 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B9B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_K_IF_in_createKeyspaceStatement4962 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createKeyspaceStatement4964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_EXISTS_in_createKeyspaceStatement4966 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_keyspaceName_in_createKeyspaceStatement4975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_WITH_in_createKeyspaceStatement4983 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_properties_in_createKeyspaceStatement4985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createTableStatement5020 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_createTableStatement5022 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B9B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_K_IF_in_createTableStatement5025 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createTableStatement5027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_EXISTS_in_createTableStatement5029 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_columnFamilyName_in_createTableStatement5044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_tableDefinition_in_createTableStatement5054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_200_in_tableDefinition5073 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B4L});
	public static final BitSet FOLLOW_tableColumns_in_tableDefinition5075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_204_in_tableDefinition5080 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B4L,0x0000000000001200L});
	public static final BitSet FOLLOW_tableColumns_in_tableDefinition5082 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_201_in_tableDefinition5089 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_WITH_in_tableDefinition5099 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_tableProperty_in_tableDefinition5101 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_K_AND_in_tableDefinition5106 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_tableProperty_in_tableDefinition5108 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_ident_in_tableColumns5143 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L});
	public static final BitSet FOLLOW_comparatorType_in_tableColumns5147 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000004004L});
	public static final BitSet FOLLOW_K_STATIC_in_tableColumns5150 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_K_PRIMARY_in_tableColumns5167 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_K_KEY_in_tableColumns5169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_PRIMARY_in_tableColumns5181 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_K_KEY_in_tableColumns5183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_tableColumns5185 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L,0x0000000000000100L});
	public static final BitSet FOLLOW_tablePartitionKey_in_tableColumns5187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_204_in_tableColumns5191 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_ident_in_tableColumns5195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_201_in_tableColumns5202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_tablePartitionKey5239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_200_in_tablePartitionKey5249 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_ident_in_tablePartitionKey5253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_204_in_tablePartitionKey5259 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_ident_in_tablePartitionKey5263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_201_in_tablePartitionKey5270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_property_in_tableProperty5288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COMPACT_in_tableProperty5297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_K_STORAGE_in_tableProperty5299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CLUSTERING_in_tableProperty5309 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_K_ORDER_in_tableProperty5311 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_K_BY_in_tableProperty5313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_tableProperty5315 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_tableClusteringOrder_in_tableProperty5317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_204_in_tableProperty5321 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_tableClusteringOrder_in_tableProperty5323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_201_in_tableProperty5328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_tableClusteringOrder5356 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_ASC_in_tableClusteringOrder5359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DESC_in_tableClusteringOrder5363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createTypeStatement5401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_TYPE_in_createTypeStatement5403 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B9B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_K_IF_in_createTypeStatement5406 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createTypeStatement5408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_EXISTS_in_createTypeStatement5410 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_userTypeName_in_createTypeStatement5428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_createTypeStatement5441 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_typeColumns_in_createTypeStatement5443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_204_in_createTypeStatement5448 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L,0x0000000000001200L});
	public static final BitSet FOLLOW_typeColumns_in_createTypeStatement5450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_201_in_createTypeStatement5457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fident_in_typeColumns5477 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L});
	public static final BitSet FOLLOW_comparatorType_in_typeColumns5481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createIndexStatement5515 = new BitSet(new long[]{0x0800000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_K_CUSTOM_in_createIndexStatement5518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_K_INDEX_in_createIndexStatement5524 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9C51BBB9B9B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_K_IF_in_createIndexStatement5527 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createIndexStatement5529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_EXISTS_in_createIndexStatement5531 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9C51BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_idxName_in_createIndexStatement5547 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_K_ON_in_createIndexStatement5552 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_columnFamilyName_in_createIndexStatement5556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_createIndexStatement5558 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8BDED8L,0x010047B2F4FFF1B0L,0x0000000000000200L});
	public static final BitSet FOLLOW_indexIdent_in_createIndexStatement5561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_204_in_createIndexStatement5565 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8BDED8L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_indexIdent_in_createIndexStatement5567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_201_in_createIndexStatement5574 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000204000000000L});
	public static final BitSet FOLLOW_K_USING_in_createIndexStatement5585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_createIndexStatement5589 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_WITH_in_createIndexStatement5604 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_properties_in_createIndexStatement5606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_indexIdent5638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_VALUES_in_indexIdent5666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_indexIdent5668 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_cident_in_indexIdent5672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_201_in_indexIdent5674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_KEYS_in_indexIdent5685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_indexIdent5687 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_cident_in_indexIdent5691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_201_in_indexIdent5693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ENTRIES_in_indexIdent5706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_indexIdent5708 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_cident_in_indexIdent5712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_201_in_indexIdent5714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FULL_in_indexIdent5724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_indexIdent5726 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_cident_in_indexIdent5730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_201_in_indexIdent5732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createMaterializedViewStatement5769 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_MATERIALIZED_in_createMaterializedViewStatement5771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_K_VIEW_in_createMaterializedViewStatement5773 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B9B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_K_IF_in_createMaterializedViewStatement5776 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createMaterializedViewStatement5778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_EXISTS_in_createMaterializedViewStatement5780 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_columnFamilyName_in_createMaterializedViewStatement5788 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_K_AS_in_createMaterializedViewStatement5790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_K_SELECT_in_createMaterializedViewStatement5800 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000013022100L});
	public static final BitSet FOLLOW_selectors_in_createMaterializedViewStatement5804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_K_FROM_in_createMaterializedViewStatement5806 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_columnFamilyName_in_createMaterializedViewStatement5810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000004L});
	public static final BitSet FOLLOW_K_WHERE_in_createMaterializedViewStatement5821 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8B5E58L,0x010047B2F6FFF1B0L,0x0000000008000100L});
	public static final BitSet FOLLOW_whereClause_in_createMaterializedViewStatement5825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_viewPrimaryKey_in_createMaterializedViewStatement5847 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_WITH_in_createMaterializedViewStatement5860 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_viewProperty_in_createMaterializedViewStatement5862 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_K_AND_in_createMaterializedViewStatement5867 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_viewProperty_in_createMaterializedViewStatement5869 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_K_PRIMARY_in_viewPrimaryKey5893 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_K_KEY_in_viewPrimaryKey5895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_viewPrimaryKey5897 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L,0x0000000000000100L});
	public static final BitSet FOLLOW_viewPartitionKey_in_viewPrimaryKey5899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_204_in_viewPrimaryKey5903 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_ident_in_viewPrimaryKey5907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_201_in_viewPrimaryKey5914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_viewPartitionKey5951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_200_in_viewPartitionKey5961 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_ident_in_viewPartitionKey5965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_204_in_viewPartitionKey5971 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_ident_in_viewPartitionKey5975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_201_in_viewPartitionKey5982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_property_in_viewProperty6000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COMPACT_in_viewProperty6009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_K_STORAGE_in_viewProperty6011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CLUSTERING_in_viewProperty6021 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_K_ORDER_in_viewProperty6023 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_K_BY_in_viewProperty6025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_viewProperty6027 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_viewClusteringOrder_in_viewProperty6029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_204_in_viewProperty6033 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_viewClusteringOrder_in_viewProperty6035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_201_in_viewProperty6040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_viewClusteringOrder6068 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_ASC_in_viewClusteringOrder6071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DESC_in_viewClusteringOrder6075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createTriggerStatement6113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_K_TRIGGER_in_createTriggerStatement6115 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B9B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_K_IF_in_createTriggerStatement6118 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createTriggerStatement6120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_EXISTS_in_createTriggerStatement6122 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_ident_in_createTriggerStatement6132 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_K_ON_in_createTriggerStatement6143 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_columnFamilyName_in_createTriggerStatement6147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_K_USING_in_createTriggerStatement6149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_createTriggerStatement6153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropTriggerStatement6194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_K_TRIGGER_in_dropTriggerStatement6196 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B9B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_K_IF_in_dropTriggerStatement6199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropTriggerStatement6201 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_ident_in_dropTriggerStatement6211 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_K_ON_in_dropTriggerStatement6214 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_columnFamilyName_in_dropTriggerStatement6218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterKeyspaceStatement6258 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_alterKeyspaceStatement6260 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_keyspaceName_in_alterKeyspaceStatement6264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_WITH_in_alterKeyspaceStatement6274 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_properties_in_alterKeyspaceStatement6276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement6302 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_alterTableStatement6304 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_columnFamilyName_in_alterTableStatement6308 = new BitSet(new long[]{0x0000001080000000L,0x0000000000000020L,0x0000200000000008L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement6328 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_cident_in_alterTableStatement6332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_TYPE_in_alterTableStatement6334 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L});
	public static final BitSet FOLLOW_comparatorType_in_alterTableStatement6338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ADD_in_alterTableStatement6351 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L,0x0000000000000100L});
	public static final BitSet FOLLOW_ident_in_alterTableStatement6365 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L});
	public static final BitSet FOLLOW_comparatorType_in_alterTableStatement6370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_isStaticColumn_in_alterTableStatement6375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_200_in_alterTableStatement6397 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_ident_in_alterTableStatement6402 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L});
	public static final BitSet FOLLOW_comparatorType_in_alterTableStatement6406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L,0x0000000000001200L});
	public static final BitSet FOLLOW_isStaticColumn_in_alterTableStatement6410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_204_in_alterTableStatement6433 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_ident_in_alterTableStatement6437 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L});
	public static final BitSet FOLLOW_comparatorType_in_alterTableStatement6441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L,0x0000000000001200L});
	public static final BitSet FOLLOW_isStaticColumn_in_alterTableStatement6445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_201_in_alterTableStatement6452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_alterTableStatement6466 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L,0x0000000000000100L});
	public static final BitSet FOLLOW_ident_in_alterTableStatement6479 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_200_in_alterTableStatement6501 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_ident_in_alterTableStatement6506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_204_in_alterTableStatement6529 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_ident_in_alterTableStatement6533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_201_in_alterTableStatement6540 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_K_USING_in_alterTableStatement6562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_TIMESTAMP_in_alterTableStatement6564 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_INTEGER_in_alterTableStatement6568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_RENAME_in_alterTableStatement6584 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_ident_in_alterTableStatement6588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_TO_in_alterTableStatement6590 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_ident_in_alterTableStatement6594 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_K_AND_in_alterTableStatement6609 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_ident_in_alterTableStatement6613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_TO_in_alterTableStatement6615 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_ident_in_alterTableStatement6619 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_K_DROP_in_alterTableStatement6635 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_K_COMPACT_in_alterTableStatement6637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_K_STORAGE_in_alterTableStatement6639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_WITH_in_alterTableStatement6652 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_properties_in_alterTableStatement6654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_STATIC_in_isStaticColumn6696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterMaterializedViewStatement6732 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_MATERIALIZED_in_alterMaterializedViewStatement6734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_K_VIEW_in_alterMaterializedViewStatement6736 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_columnFamilyName_in_alterMaterializedViewStatement6740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_WITH_in_alterMaterializedViewStatement6752 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_properties_in_alterMaterializedViewStatement6754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTypeStatement6785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_TYPE_in_alterTypeStatement6787 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_userTypeName_in_alterTypeStatement6791 = new BitSet(new long[]{0x0000001080000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTypeStatement6811 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_fident_in_alterTypeStatement6817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_TYPE_in_alterTypeStatement6819 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L});
	public static final BitSet FOLLOW_comparatorType_in_alterTypeStatement6823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ADD_in_alterTypeStatement6836 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_fident_in_alterTypeStatement6844 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L});
	public static final BitSet FOLLOW_comparatorType_in_alterTypeStatement6848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_RENAME_in_alterTypeStatement6868 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_fident_in_alterTypeStatement6872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_TO_in_alterTypeStatement6874 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_fident_in_alterTypeStatement6878 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_K_AND_in_alterTypeStatement6900 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_fident_in_alterTypeStatement6904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_TO_in_alterTypeStatement6906 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_fident_in_alterTypeStatement6910 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropKeyspaceStatement6962 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement6964 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B9B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_K_IF_in_dropKeyspaceStatement6967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropKeyspaceStatement6969 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_keyspaceName_in_dropKeyspaceStatement6978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropTableStatement7012 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dropTableStatement7014 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B9B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_K_IF_in_dropTableStatement7017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropTableStatement7019 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_columnFamilyName_in_dropTableStatement7028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropTypeStatement7062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_TYPE_in_dropTypeStatement7064 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B9B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_K_IF_in_dropTypeStatement7067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropTypeStatement7069 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_userTypeName_in_dropTypeStatement7078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropIndexStatement7112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_K_INDEX_in_dropIndexStatement7114 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B9B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_K_IF_in_dropIndexStatement7117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropIndexStatement7119 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_indexName_in_dropIndexStatement7128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropMaterializedViewStatement7168 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_MATERIALIZED_in_dropMaterializedViewStatement7170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_K_VIEW_in_dropMaterializedViewStatement7172 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B9B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_K_IF_in_dropMaterializedViewStatement7175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropMaterializedViewStatement7177 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_columnFamilyName_in_dropMaterializedViewStatement7186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TRUNCATE_in_truncateStatement7217 = new BitSet(new long[]{0xFBFEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_truncateStatement7220 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_columnFamilyName_in_truncateStatement7226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_GRANT_in_grantPermissionsStatement7251 = new BitSet(new long[]{0x0400041400000000L,0x0000200000000124L,0x0000000000000400L});
	public static final BitSet FOLLOW_permissionOrAll_in_grantPermissionsStatement7263 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_K_ON_in_grantPermissionsStatement7271 = new BitSet(new long[]{0xFBFEE28744000000L,0xF9851BBF9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_resource_in_grantPermissionsStatement7283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_TO_in_grantPermissionsStatement7291 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x118047B2F4FFF1B0L});
	public static final BitSet FOLLOW_userOrRoleName_in_grantPermissionsStatement7305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_REVOKE_in_revokePermissionsStatement7336 = new BitSet(new long[]{0x0400041400000000L,0x0000200000000124L,0x0000000000000400L});
	public static final BitSet FOLLOW_permissionOrAll_in_revokePermissionsStatement7348 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_K_ON_in_revokePermissionsStatement7356 = new BitSet(new long[]{0xFBFEE28744000000L,0xF9851BBF9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_resource_in_revokePermissionsStatement7368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_K_FROM_in_revokePermissionsStatement7376 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x118047B2F4FFF1B0L});
	public static final BitSet FOLLOW_userOrRoleName_in_revokePermissionsStatement7390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_GRANT_in_grantRoleStatement7421 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x118047B2F4FFF1B0L});
	public static final BitSet FOLLOW_userOrRoleName_in_grantRoleStatement7435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_TO_in_grantRoleStatement7443 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x118047B2F4FFF1B0L});
	public static final BitSet FOLLOW_userOrRoleName_in_grantRoleStatement7457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_REVOKE_in_revokeRoleStatement7488 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x118047B2F4FFF1B0L});
	public static final BitSet FOLLOW_userOrRoleName_in_revokeRoleStatement7502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_K_FROM_in_revokeRoleStatement7510 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x118047B2F4FFF1B0L});
	public static final BitSet FOLLOW_userOrRoleName_in_revokeRoleStatement7524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIST_in_listPermissionsStatement7562 = new BitSet(new long[]{0x0400041400000000L,0x0000200000000124L,0x0000000000000400L});
	public static final BitSet FOLLOW_permissionOrAll_in_listPermissionsStatement7574 = new BitSet(new long[]{0x0000000000000002L,0x0062000000000000L});
	public static final BitSet FOLLOW_K_ON_in_listPermissionsStatement7584 = new BitSet(new long[]{0xFBFEE28744000000L,0xF9851BBF9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_resource_in_listPermissionsStatement7586 = new BitSet(new long[]{0x0000000000000002L,0x0022000000000000L});
	public static final BitSet FOLLOW_K_OF_in_listPermissionsStatement7601 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x118047B2F4FFF1B0L});
	public static final BitSet FOLLOW_roleName_in_listPermissionsStatement7603 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
	public static final BitSet FOLLOW_K_NORECURSIVE_in_listPermissionsStatement7617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_permission7653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_permissionOrAll7710 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
	public static final BitSet FOLLOW_K_PERMISSIONS_in_permissionOrAll7714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_permission_in_permissionOrAll7735 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
	public static final BitSet FOLLOW_K_PERMISSION_in_permissionOrAll7739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataResource_in_resource7767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_roleResource_in_resource7779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionResource_in_resource7791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jmxResource_in_resource7803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_dataResource7826 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_K_KEYSPACES_in_dataResource7828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_dataResource7838 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_keyspaceName_in_dataResource7844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dataResource7856 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_columnFamilyName_in_dataResource7865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_jmxResource7894 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_MBEANS_in_jmxResource7896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_MBEAN_in_jmxResource7916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_mbean_in_jmxResource7918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_MBEANS_in_jmxResource7928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_mbean_in_jmxResource7930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_roleResource7953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_K_ROLES_in_roleResource7955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ROLE_in_roleResource7965 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x118047B2F4FFF1B0L});
	public static final BitSet FOLLOW_userOrRoleName_in_roleResource7971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_functionResource8003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_K_FUNCTIONS_in_functionResource8005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_functionResource8015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_K_FUNCTIONS_in_functionResource8017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_IN_in_functionResource8019 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_functionResource8021 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_keyspaceName_in_functionResource8027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FUNCTION_in_functionResource8042 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F6FFF1B0L});
	public static final BitSet FOLLOW_functionName_in_functionResource8046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_functionResource8064 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L,0x0000000000000200L});
	public static final BitSet FOLLOW_comparatorType_in_functionResource8092 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_204_in_functionResource8110 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L});
	public static final BitSet FOLLOW_comparatorType_in_functionResource8114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_201_in_functionResource8142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createUserStatement8190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_K_USER_in_createUserStatement8192 = new BitSet(new long[]{0x0000000004000000L,0x0000000000100000L,0x1100000000000000L});
	public static final BitSet FOLLOW_K_IF_in_createUserStatement8195 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createUserStatement8197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_EXISTS_in_createUserStatement8199 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x1100000000000000L});
	public static final BitSet FOLLOW_username_in_createUserStatement8207 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L,0x0000200000020000L});
	public static final BitSet FOLLOW_K_WITH_in_createUserStatement8219 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_userPassword_in_createUserStatement8221 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_K_SUPERUSER_in_createUserStatement8235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NOSUPERUSER_in_createUserStatement8241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterUserStatement8286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_K_USER_in_alterUserStatement8288 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x1100000000000000L});
	public static final BitSet FOLLOW_username_in_alterUserStatement8292 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L,0x0000200000020000L});
	public static final BitSet FOLLOW_K_WITH_in_alterUserStatement8304 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_userPassword_in_alterUserStatement8306 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_K_SUPERUSER_in_alterUserStatement8320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NOSUPERUSER_in_alterUserStatement8334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropUserStatement8380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_K_USER_in_dropUserStatement8382 = new BitSet(new long[]{0x0000000004000000L,0x0000000000100000L,0x1100000000000000L});
	public static final BitSet FOLLOW_K_IF_in_dropUserStatement8385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropUserStatement8387 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x1100000000000000L});
	public static final BitSet FOLLOW_username_in_dropUserStatement8395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIST_in_listUsersStatement8420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_USERS_in_listUsersStatement8422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createRoleStatement8456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_K_ROLE_in_createRoleStatement8458 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B9B5E58L,0x118047B2F4FFF1B0L});
	public static final BitSet FOLLOW_K_IF_in_createRoleStatement8461 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createRoleStatement8463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_EXISTS_in_createRoleStatement8465 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x118047B2F4FFF1B0L});
	public static final BitSet FOLLOW_userOrRoleName_in_createRoleStatement8473 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_WITH_in_createRoleStatement8483 = new BitSet(new long[]{0x0000000040000000L,0x1100010000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_roleOptions_in_createRoleStatement8485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterRoleStatement8529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_K_ROLE_in_alterRoleStatement8531 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x118047B2F4FFF1B0L});
	public static final BitSet FOLLOW_userOrRoleName_in_alterRoleStatement8535 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_WITH_in_alterRoleStatement8545 = new BitSet(new long[]{0x0000000040000000L,0x1100010000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_roleOptions_in_alterRoleStatement8547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropRoleStatement8591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_K_ROLE_in_dropRoleStatement8593 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B9B5E58L,0x118047B2F4FFF1B0L});
	public static final BitSet FOLLOW_K_IF_in_dropRoleStatement8596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropRoleStatement8598 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x118047B2F4FFF1B0L});
	public static final BitSet FOLLOW_userOrRoleName_in_dropRoleStatement8606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIST_in_listRolesStatement8646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_K_ROLES_in_listRolesStatement8648 = new BitSet(new long[]{0x0000000000000002L,0x0022000000000000L});
	public static final BitSet FOLLOW_K_OF_in_listRolesStatement8658 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x118047B2F4FFF1B0L});
	public static final BitSet FOLLOW_roleName_in_listRolesStatement8660 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
	public static final BitSet FOLLOW_K_NORECURSIVE_in_listRolesStatement8673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_roleOption_in_roleOptions8704 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_K_AND_in_roleOptions8708 = new BitSet(new long[]{0x0000000040000000L,0x1100010000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_roleOption_in_roleOptions8710 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_K_PASSWORD_in_roleOption8732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_213_in_roleOption8734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_roleOption8738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_OPTIONS_in_roleOption8749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_213_in_roleOption8751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_fullMapLiteral_in_roleOption8755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SUPERUSER_in_roleOption8766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_213_in_roleOption8768 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BOOLEAN_in_roleOption8772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LOGIN_in_roleOption8783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_213_in_roleOption8785 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BOOLEAN_in_roleOption8789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ACCESS_in_roleOption8800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_TO_in_roleOption8802 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_K_ALL_in_roleOption8804 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_K_DATACENTERS_in_roleOption8806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ACCESS_in_roleOption8817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_TO_in_roleOption8819 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_K_DATACENTERS_in_roleOption8821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_220_in_roleOption8823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_dcPermission_in_roleOption8825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020001000L});
	public static final BitSet FOLLOW_204_in_roleOption8829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_dcPermission_in_roleOption8831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020001000L});
	public static final BitSet FOLLOW_221_in_roleOption8836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_dcPermission8856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_PASSWORD_in_userPassword8878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_userPassword8882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_describeStatement8916 = new BitSet(new long[]{0xFBFEE28744000000L,0xF9851FBF9BCBDE58L,0x010047B2F4FFF3B0L});
	public static final BitSet FOLLOW_K_CLUSTER_in_describeStatement8937 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_FULL_in_describeStatement8968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_SCHEMA_in_describeStatement8974 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_KEYSPACES_in_describeStatement8993 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_ONLY_in_describeStatement9020 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_describeStatement9026 = new BitSet(new long[]{0xFBDEE28744000002L,0xF9851BBB9B8B5E58L,0x018067B2F4FFF1B0L});
	public static final BitSet FOLLOW_keyspaceName_in_describeStatement9032 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_TABLES_in_describeStatement9101 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_describeStatement9132 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_columnFamilyName_in_describeStatement9136 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_INDEX_in_describeStatement9155 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_columnFamilyName_in_describeStatement9159 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_MATERIALIZED_in_describeStatement9184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_K_VIEW_in_describeStatement9186 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_columnFamilyName_in_describeStatement9190 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_TYPES_in_describeStatement9206 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_TYPE_in_describeStatement9239 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_userTypeName_in_describeStatement9243 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_FUNCTIONS_in_describeStatement9280 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_FUNCTION_in_describeStatement9305 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F6FFF1B0L});
	public static final BitSet FOLLOW_functionName_in_describeStatement9309 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_AGGREGATES_in_describeStatement9342 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_AGGREGATE_in_describeStatement9365 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F6FFF1B0L});
	public static final BitSet FOLLOW_functionName_in_describeStatement9369 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_IDENT_in_describeStatement9401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_describeStatement9441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_unreserved_keyword_in_describeStatement9475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_207_in_describeStatement9490 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_IDENT_in_describeStatement9507 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_describeStatement9548 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_unreserved_keyword_in_describeStatement9583 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_WITH_in_describeStatement9667 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_K_INTERNALS_in_describeStatement9669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMPTY_QUOTED_NAME_in_cident9700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_cident9715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_ident9753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_ident9778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_ident9797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_fident9822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_fident9847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_fident9866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_noncol_ident9892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_noncol_ident9917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_noncol_ident9936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ksName_in_keyspaceName9969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ksName_in_indexName10003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_207_in_indexName10006 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_idxName_in_indexName10010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ksName_in_columnFamilyName10042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_207_in_columnFamilyName10045 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x018047B2F4FFF1B0L});
	public static final BitSet FOLLOW_cfName_in_columnFamilyName10049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_noncol_ident_in_userTypeName10074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_207_in_userTypeName10076 = new BitSet(new long[]{0x98DA008744000000L,0xF9851BBB130B4E00L,0x01000132E407D1B0L});
	public static final BitSet FOLLOW_non_type_ident_in_userTypeName10082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_roleName_in_userOrRoleName10114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_ksName10137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_ksName10162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_ksName10181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_ksName10191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_cfName10213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_cfName10238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_cfName10257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_cfName10267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_idxName10289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_idxName10314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_idxName10333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_idxName10343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_roleName10365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_roleName10390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_roleName10406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_roleName10425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_roleName10435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_constant10460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_constant10472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_constant10491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_constant10512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DURATION_in_constant10531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UUID_in_constant10549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEXNUMBER_in_constant10571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_constant10587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_POSITIVE_INFINITY_in_constant10607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NEGATIVE_INFINITY_in_constant10622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_220_in_fullMapLiteral10663 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000031022100L});
	public static final BitSet FOLLOW_term_in_fullMapLiteral10669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_209_in_fullMapLiteral10671 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_fullMapLiteral10675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020001000L});
	public static final BitSet FOLLOW_204_in_fullMapLiteral10681 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_fullMapLiteral10685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_209_in_fullMapLiteral10687 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_fullMapLiteral10691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020001000L});
	public static final BitSet FOLLOW_221_in_fullMapLiteral10707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mapLiteral_in_setOrMapLiteral10731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_setLiteral_in_setOrMapLiteral10744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_204_in_setLiteral10789 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_setLiteral10793 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_209_in_mapLiteral10838 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_mapLiteral10842 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_204_in_mapLiteral10848 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_mapLiteral10852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_209_in_mapLiteral10854 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_mapLiteral10858 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_listLiteral_in_collectionLiteral10886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_220_in_collectionLiteral10896 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_collectionLiteral10900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000021000L});
	public static final BitSet FOLLOW_setOrMapLiteral_in_collectionLiteral10904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_221_in_collectionLiteral10909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_220_in_collectionLiteral10927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_221_in_collectionLiteral10929 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_216_in_listLiteral10970 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000015022100L});
	public static final BitSet FOLLOW_term_in_listLiteral10976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004001000L});
	public static final BitSet FOLLOW_204_in_listLiteral10982 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_listLiteral10986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004001000L});
	public static final BitSet FOLLOW_218_in_listLiteral10996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_220_in_usertypeLiteral11040 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_fident_in_usertypeLiteral11044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_209_in_usertypeLiteral11046 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_usertypeLiteral11050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020001000L});
	public static final BitSet FOLLOW_204_in_usertypeLiteral11056 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_fident_in_usertypeLiteral11060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_209_in_usertypeLiteral11062 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_usertypeLiteral11066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020001000L});
	public static final BitSet FOLLOW_221_in_usertypeLiteral11073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_200_in_tupleLiteral11110 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_tupleLiteral11114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_204_in_tupleLiteral11120 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_tupleLiteral11124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_201_in_tupleLiteral11131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_value11154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionLiteral_in_value11176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_usertypeLiteral_in_value11189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleLiteral_in_value11204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NULL_in_value11220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_209_in_value11244 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_noncol_ident_in_value11248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_value11259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_intValue11299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_209_in_intValue11313 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_noncol_ident_in_intValue11317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_intValue11328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_keyspaceName_in_functionName11374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_207_in_functionName11376 = new BitSet(new long[]{0xFBDAE28744000000L,0xF9851BBA1B8B5E50L,0x010007B2E6FFF1B0L});
	public static final BitSet FOLLOW_allowedFunctionName_in_functionName11382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_allowedFunctionName11409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_allowedFunctionName11443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_function_keyword_in_allowedFunctionName11471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TOKEN_in_allowedFunctionName11481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COUNT_in_allowedFunctionName11513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionName_in_function11560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_function11562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_201_in_function11564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionName_in_function11594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_200_in_function11596 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_functionArgs_in_function11600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_201_in_function11602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_functionArgs11635 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_204_in_functionArgs11641 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_functionArgs11645 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_termAddition_in_term11673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_termMultiplication_in_termAddition11725 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000002400L});
	public static final BitSet FOLLOW_202_in_termAddition11741 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_termMultiplication_in_termAddition11745 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000002400L});
	public static final BitSet FOLLOW_205_in_termAddition11759 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_termMultiplication_in_termAddition11763 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000002400L});
	public static final BitSet FOLLOW_termGroup_in_termMultiplication11801 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000002010080L});
	public static final BitSet FOLLOW_217_in_termMultiplication11817 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_termGroup_in_termMultiplication11821 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000002010080L});
	public static final BitSet FOLLOW_208_in_termMultiplication11835 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_termGroup_in_termMultiplication11839 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000002010080L});
	public static final BitSet FOLLOW_199_in_termMultiplication11853 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_termGroup_in_termMultiplication11857 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000002010080L});
	public static final BitSet FOLLOW_simpleTerm_in_termGroup11893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_205_in_termGroup11916 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011020100L});
	public static final BitSet FOLLOW_simpleTerm_in_termGroup11921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_simpleTerm11954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_simpleTerm11998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_200_in_simpleTerm12037 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L});
	public static final BitSet FOLLOW_comparatorType_in_simpleTerm12041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_201_in_simpleTerm12043 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011020100L});
	public static final BitSet FOLLOW_simpleTerm_in_simpleTerm12047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_columnOperation12071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000120C800L});
	public static final BitSet FOLLOW_columnOperationDifferentiator_in_columnOperation12073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_213_in_columnOperationDifferentiator12092 = new BitSet(new long[]{0xFBDEE2874D120840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_normalColumnOperation_in_columnOperationDifferentiator12094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_shorthandColumnOperation_in_columnOperationDifferentiator12103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_216_in_columnOperationDifferentiator12112 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_columnOperationDifferentiator12116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_218_in_columnOperationDifferentiator12118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_collectionColumnOperation_in_columnOperationDifferentiator12120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_207_in_columnOperationDifferentiator12129 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_fident_in_columnOperationDifferentiator12133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_udtColumnOperation_in_columnOperationDifferentiator12135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_normalColumnOperation12156 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_202_in_normalColumnOperation12159 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_cident_in_normalColumnOperation12163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_normalColumnOperation12184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002400L});
	public static final BitSet FOLLOW_set_in_normalColumnOperation12188 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_normalColumnOperation12198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_normalColumnOperation12216 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_INTEGER_in_normalColumnOperation12220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_shorthandColumnOperation12248 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_shorthandColumnOperation12258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_213_in_collectionColumnOperation12284 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_collectionColumnOperation12288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_213_in_udtColumnOperation12314 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_udtColumnOperation12318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_columnCondition12351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000001F88040L});
	public static final BitSet FOLLOW_relationType_in_columnCondition12365 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_columnCondition12369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_IN_in_columnCondition12383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000020100L});
	public static final BitSet FOLLOW_singleColumnInValues_in_columnCondition12401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inMarker_in_columnCondition12421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_216_in_columnCondition12449 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_columnCondition12453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_218_in_columnCondition12455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000F80040L});
	public static final BitSet FOLLOW_relationType_in_columnCondition12473 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_columnCondition12477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_IN_in_columnCondition12495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000020100L});
	public static final BitSet FOLLOW_singleColumnInValues_in_columnCondition12517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inMarker_in_columnCondition12541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_207_in_columnCondition12587 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_fident_in_columnCondition12591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000F80040L});
	public static final BitSet FOLLOW_relationType_in_columnCondition12609 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_columnCondition12613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_IN_in_columnCondition12631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000020100L});
	public static final BitSet FOLLOW_singleColumnInValues_in_columnCondition12653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inMarker_in_columnCondition12677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_property_in_properties12739 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_K_AND_in_properties12743 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_property_in_properties12745 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_noncol_ident_in_property12768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_213_in_property12770 = new BitSet(new long[]{0xFBDEE28749100840L,0xF985DBBB9B8B5E58L,0x900047B2F4FFF1B3L});
	public static final BitSet FOLLOW_propertyValue_in_property12774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_noncol_ident_in_property12786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_213_in_property12788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_fullMapLiteral_in_property12792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_propertyValue12817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_propertyValue12839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_213_in_relationType12862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_211_in_relationType12873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_212_in_relationType12884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_214_in_relationType12894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_215_in_relationType12905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_198_in_relationType12915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation12937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000F80040L});
	public static final BitSet FOLLOW_relationType_in_relation12941 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_relation12945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation12957 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_LIKE_in_relation12959 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_relation12963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation12975 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_IS_in_relation12977 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_K_NOT_in_relation12979 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_K_NULL_in_relation12981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TOKEN_in_relation12991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_tupleOfIdentifiers_in_relation12995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000F80040L});
	public static final BitSet FOLLOW_relationType_in_relation12999 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_relation13003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation13023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_IN_in_relation13025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_inMarker_in_relation13029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation13049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_IN_in_relation13051 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_singleColumnInValues_in_relation13055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation13075 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_containsOperator_in_relation13079 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_relation13083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation13095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_216_in_relation13097 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_relation13101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_218_in_relation13103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000F80040L});
	public static final BitSet FOLLOW_relationType_in_relation13107 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_relation13111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleOfIdentifiers_in_relation13123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000F80040L});
	public static final BitSet FOLLOW_K_IN_in_relation13133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000020100L});
	public static final BitSet FOLLOW_200_in_relation13147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_201_in_relation13149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inMarkerForTuple_in_relation13181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleOfTupleLiterals_in_relation13215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleOfMarkersForTuples_in_relation13249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relationType_in_relation13291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_tupleLiteral_in_relation13295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relationType_in_relation13321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_markerForTuple_in_relation13325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_200_in_relation13355 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8B5E58L,0x010047B2F6FFF1B0L,0x0000000000000100L});
	public static final BitSet FOLLOW_relation_in_relation13357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_201_in_relation13360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CONTAINS_in_containsOperator13381 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
	public static final BitSet FOLLOW_K_KEY_in_containsOperator13386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_inMarker13411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_209_in_inMarker13421 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_noncol_ident_in_inMarker13425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_200_in_tupleOfIdentifiers13457 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_cident_in_tupleOfIdentifiers13461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_204_in_tupleOfIdentifiers13466 = new BitSet(new long[]{0xFBDEE28744020000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_cident_in_tupleOfIdentifiers13470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_201_in_tupleOfIdentifiers13476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_200_in_singleColumnInValues13506 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022300L});
	public static final BitSet FOLLOW_term_in_singleColumnInValues13514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_204_in_singleColumnInValues13519 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000011022100L});
	public static final BitSet FOLLOW_term_in_singleColumnInValues13523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_201_in_singleColumnInValues13532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_200_in_tupleOfTupleLiterals13562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_tupleLiteral_in_tupleOfTupleLiterals13566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_204_in_tupleOfTupleLiterals13571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_tupleLiteral_in_tupleOfTupleLiterals13575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_201_in_tupleOfTupleLiterals13581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_markerForTuple13602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_209_in_markerForTuple13612 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_noncol_ident_in_markerForTuple13616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_200_in_tupleOfMarkersForTuples13648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_markerForTuple_in_tupleOfMarkersForTuples13652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_204_in_tupleOfMarkersForTuples13657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_markerForTuple_in_tupleOfMarkersForTuples13661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
	public static final BitSet FOLLOW_201_in_tupleOfMarkersForTuples13667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_inMarkerForTuple13688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_209_in_inMarkerForTuple13698 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x010047B2F4FFF1B0L});
	public static final BitSet FOLLOW_noncol_ident_in_inMarkerForTuple13702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_native_type_in_comparatorType13727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collection_type_in_comparatorType13743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tuple_type_in_comparatorType13755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_userTypeName_in_comparatorType13771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FROZEN_in_comparatorType13783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_211_in_comparatorType13785 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L});
	public static final BitSet FOLLOW_comparatorType_in_comparatorType13789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_214_in_comparatorType13791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_comparatorType13809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ASCII_in_native_type13838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BIGINT_in_native_type13852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BLOB_in_native_type13865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BOOLEAN_in_native_type13880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COUNTER_in_native_type13892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DECIMAL_in_native_type13904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DOUBLE_in_native_type13916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DURATION_in_native_type13929 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FLOAT_in_native_type13942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_INET_in_native_type13956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_INT_in_native_type13971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SMALLINT_in_native_type13987 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TEXT_in_native_type13998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TIMESTAMP_in_native_type14013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TINYINT_in_native_type14023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_UUID_in_native_type14035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_VARCHAR_in_native_type14050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_VARINT_in_native_type14062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TIMEUUID_in_native_type14075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DATE_in_native_type14086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TIME_in_native_type14101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_MAP_in_collection_type14129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_211_in_collection_type14132 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L});
	public static final BitSet FOLLOW_comparatorType_in_collection_type14136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_204_in_collection_type14138 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L});
	public static final BitSet FOLLOW_comparatorType_in_collection_type14142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_214_in_collection_type14144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIST_in_collection_type14162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_211_in_collection_type14164 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L});
	public static final BitSet FOLLOW_comparatorType_in_collection_type14168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_214_in_collection_type14170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SET_in_collection_type14188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_211_in_collection_type14191 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L});
	public static final BitSet FOLLOW_comparatorType_in_collection_type14195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_214_in_collection_type14197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TUPLE_in_tuple_type14246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_211_in_tuple_type14248 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L});
	public static final BitSet FOLLOW_comparatorType_in_tuple_type14252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000401000L});
	public static final BitSet FOLLOW_204_in_tuple_type14257 = new BitSet(new long[]{0xFBDEE28744000000L,0xF9851BBB9B8B5E58L,0x110047B2F4FFF9B0L});
	public static final BitSet FOLLOW_comparatorType_in_tuple_type14261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000401000L});
	public static final BitSet FOLLOW_214_in_tuple_type14267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_username14284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_username14292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_username14300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_mbean14319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_non_type_ident14344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_non_type_ident14375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basic_unreserved_keyword_in_non_type_ident14400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_KEY_in_non_type_ident14412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_function_keyword_in_unreserved_keyword14455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_unreserved_keyword14471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basic_unreserved_keyword_in_unreserved_function_keyword14522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_native_type_in_unreserved_function_keyword14534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_basic_unreserved_keyword14572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_JSON_in_synpred1_Parser1088 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000013022100L});
	public static final BitSet FOLLOW_selectClause_in_synpred1_Parser1090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DISTINCT_in_synpred2_Parser1291 = new BitSet(new long[]{0xFBDEE2874D100840L,0xF995DBBB9B8B5E58L,0x918047B2F6FFF1B3L,0x0000000013022100L});
	public static final BitSet FOLLOW_selectors_in_synpred2_Parser1293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionGroupWithField_in_synpred3_Parser1622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectionTypeHint_in_synpred4_Parser1909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CLUSTER_in_synpred5_Parser8933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_KEYSPACES_in_synpred6_Parser8989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TABLES_in_synpred7_Parser9096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TYPES_in_synpred8_Parser9201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FUNCTIONS_in_synpred9_Parser9275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_AGGREGATES_in_synpred10_Parser9337 = new BitSet(new long[]{0x0000000000000002L});
}
