// DO NOT EDIT
// Generated by JFlex 1.9.0 http://jflex.de/
// source: src/DataForge_/Lexer.jflex

// ------------  Paquete e importaciones ------------
package DataForge_; 

import java_cup.runtime.*;



@SuppressWarnings("fallthrough")
public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\4\u0200\1\u0300\1\u0400\1\u0200\5\u0500\1\u0600"+
    "\1\u0700\1\u0800\6\u0200\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00"+
    "\1\u0e00\3\u0200\1\u0f00\205\u0200\1\u0700\1\u0200\1\u1000\1\u1100"+
    "\1\u1200\1\u1300\54\u0200\10\u1400\37\u0200\1\u0a00\4\u0200\1\u1500"+
    "\10\u0200\1\u1600\2\u0200\1\u1700\1\u1800\1\u1300\1\u0200\1\u0600"+
    "\1\u0200\1\u1900\1\u1600\1\u0900\3\u0200\1\u1200\1\u1a00\114\u0200"+
    "\1\u1b00\1\u1200\153\u0200\1\u1c00\11\u0200\1\u1d00\1\u1300\6\u0200"+
    "\1\u1200\u0f16\u0200";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\2\1\22\0\1\1\1\4"+
    "\1\5\5\0\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\0\12\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\0\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\31\1\36\1\37\1\40"+
    "\1\41\1\42\1\31\1\43\1\44\1\45\1\46\1\47"+
    "\1\31\1\50\1\51\1\52\1\53\1\0\1\54\1\0"+
    "\1\55\1\0\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\31\1\36\1\37\1\40"+
    "\1\41\1\42\1\31\1\43\1\44\1\45\1\46\1\47"+
    "\1\31\1\50\1\51\1\52\12\0\1\3\252\0\2\56"+
    "\115\0\1\57\u01e0\0\12\60\206\0\12\60\306\0\12\60"+
    "\234\0\12\60\166\0\12\60\140\0\12\60\166\0\12\60"+
    "\106\0\12\60\u0116\0\12\60\106\0\12\60\u0146\0\12\60"+
    "\46\0\12\60\u012c\0\12\60\200\0\12\60\246\0\12\60"+
    "\6\0\12\60\266\0\12\60\126\0\12\60\206\0\12\60"+
    "\6\0\12\60\316\0\2\3\u01a6\0\12\60\46\0\12\60"+
    "\306\0\12\60\26\0\12\60\126\0\12\60\u0196\0\12\60"+
    "\6\0\u0100\3\240\0\12\60\206\0\12\60\u012c\0\12\60"+
    "\200\0\12\60\74\0\12\60\220\0\12\60\166\0\12\60"+
    "\146\0\12\60\206\0\12\60\106\0\12\60\266\0\12\60"+
    "\u0164\0\62\60\100\0\12\60\266\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[7680];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\16\21\1\22\1\23\2\1\1\0\1\24"+
    "\3\0\5\21\1\0\5\21\1\0\6\21\1\0\4\21"+
    "\1\0\1\21\1\0\1\25\1\0\1\26\3\21\1\27"+
    "\1\21\1\27\1\21\1\30\3\21\1\0\1\21\1\31"+
    "\1\21\1\32\1\33\1\21\1\0\1\34\1\32\2\21"+
    "\1\0\2\35\1\36\1\21\1\0\1\21\1\37\1\36"+
    "\2\0\1\3\1\40\2\21\1\0\1\21\1\41\1\42"+
    "\1\43\2\21\1\0\2\21\1\0\1\44\1\21\1\0"+
    "\2\21\1\0\1\21\1\0\2\21\2\0\1\3\2\21"+
    "\1\0\6\21\1\0\1\45\2\46\1\21\1\0\1\47"+
    "\1\21\1\47\1\21\1\0\2\21\1\0\1\50\1\21"+
    "\1\0\1\51\5\21\1\0\1\21\1\0\1\21\1\0"+
    "\1\21\1\0\1\21\1\0\1\21\2\52\2\53\1\21"+
    "\1\0\2\54\1\55\2\21\1\0\1\21\1\0\1\21"+
    "\1\0\2\56\1\21\1\0\2\57\2\60\1\61\1\62"+
    "\1\63\1\62\1\63\1\21\1\0\1\64\1\21\1\0"+
    "\2\65\2\66\1\21\1\0\2\67\2\70\2\71";

  private static int [] zzUnpackAction() {
    int [] result = new int[220];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\61\0\61\0\142\0\223\0\61\0\61\0\61"+
    "\0\61\0\61\0\61\0\304\0\61\0\61\0\365\0\61"+
    "\0\61\0\61\0\u0126\0\u0157\0\u0188\0\u01b9\0\u01ea\0\u021b"+
    "\0\u024c\0\u027d\0\u02ae\0\u02df\0\u0310\0\u0341\0\u0372\0\u03a3"+
    "\0\61\0\61\0\u03d4\0\u0405\0\223\0\61\0\u0436\0\u0405"+
    "\0\u0467\0\u0498\0\u04c9\0\u04fa\0\u052b\0\u055c\0\u058d\0\u05be"+
    "\0\u05ef\0\u0620\0\u0651\0\u0682\0\u06b3\0\u06e4\0\u0715\0\u0746"+
    "\0\u0777\0\u07a8\0\u07d9\0\u080a\0\u083b\0\u086c\0\u089d\0\u08ce"+
    "\0\u08ff\0\u0930\0\u0961\0\u0436\0\u0992\0\u0157\0\u09c3\0\u09f4"+
    "\0\u0a25\0\u0157\0\u0a56\0\61\0\u0a87\0\u0157\0\u0ab8\0\u0ae9"+
    "\0\u0b1a\0\u0b4b\0\u0b7c\0\u0157\0\u0bad\0\u0157\0\u0bde\0\u0c0f"+
    "\0\u0c40\0\u0157\0\61\0\u0c71\0\u0ca2\0\u0cd3\0\u0157\0\61"+
    "\0\u0157\0\u0d04\0\u0d35\0\u0d66\0\u0d97\0\61\0\u0dc8\0\u0df9"+
    "\0\61\0\u0157\0\u0e2a\0\u0e5b\0\u0e8c\0\u0ebd\0\u0157\0\u0157"+
    "\0\u0157\0\u0eee\0\u0f1f\0\u0f50\0\u0f81\0\u0fb2\0\u0fe3\0\u0157"+
    "\0\u1014\0\u1045\0\u1076\0\u10a7\0\u10d8\0\u1109\0\u113a\0\u116b"+
    "\0\u119c\0\u11cd\0\u11fe\0\u0dc8\0\u122f\0\u1260\0\u1291\0\u12c2"+
    "\0\u12f3\0\u1324\0\u1355\0\u1386\0\u13b7\0\u13e8\0\u0157\0\u1419"+
    "\0\u144a\0\u147b\0\u14ac\0\u0157\0\u14dd\0\61\0\u150e\0\u153f"+
    "\0\u1570\0\u15a1\0\u15d2\0\u0157\0\u1603\0\u1634\0\u0157\0\u1665"+
    "\0\u1696\0\u16c7\0\u16f8\0\u1729\0\u175a\0\u178b\0\u17bc\0\u17ed"+
    "\0\u181e\0\u184f\0\u1880\0\u18b1\0\u18e2\0\u1913\0\u1944\0\u1975"+
    "\0\u0157\0\61\0\u19a6\0\u19d7\0\u0157\0\61\0\u0157\0\u1a08"+
    "\0\u1a39\0\u1a6a\0\u1a9b\0\u1acc\0\u1afd\0\u1b2e\0\u0157\0\61"+
    "\0\u1b5f\0\u1b90\0\u0157\0\61\0\u0157\0\61\0\u0157\0\u0157"+
    "\0\u0157\0\61\0\61\0\u1bc1\0\u1bf2\0\u0157\0\u1c23\0\u1c54"+
    "\0\u0157\0\61\0\u0157\0\61\0\u1c85\0\u1cb6\0\u0157\0\61"+
    "\0\u0157\0\61\0\u0157\0\61";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[220];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\0\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\2\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\24\1\30\1\31\2\24\1\32\1\33\2\24\1\34"+
    "\1\35\1\36\1\37\1\24\1\40\3\24\1\41\1\42"+
    "\2\2\1\43\1\44\61\0\2\4\1\0\56\4\2\45"+
    "\1\0\2\45\1\46\53\45\14\0\1\47\1\14\42\0"+
    "\1\50\4\0\1\51\71\0\1\24\6\0\17\24\1\52"+
    "\7\24\2\0\1\24\20\0\1\24\6\0\27\24\2\0"+
    "\1\24\20\0\1\24\6\0\7\24\1\53\5\24\1\54"+
    "\11\24\2\0\1\24\20\0\1\24\6\0\10\24\1\55"+
    "\4\24\1\56\11\24\2\0\1\24\1\57\17\0\1\24"+
    "\6\0\11\24\1\60\2\24\1\61\7\24\1\62\2\24"+
    "\2\0\1\24\20\0\1\24\6\0\17\24\1\63\7\24"+
    "\2\0\1\24\20\0\1\24\6\0\10\24\1\64\16\24"+
    "\2\0\1\24\1\65\17\0\1\24\6\0\1\66\26\24"+
    "\2\0\1\24\20\0\1\24\6\0\1\67\3\24\1\70"+
    "\3\24\1\71\4\24\1\72\4\24\1\73\4\24\2\0"+
    "\1\24\1\74\17\0\1\24\6\0\17\24\1\75\7\24"+
    "\2\0\1\24\20\0\1\24\6\0\4\24\1\76\22\24"+
    "\2\0\1\24\20\0\1\24\6\0\22\24\1\77\4\24"+
    "\2\0\1\24\20\0\1\24\6\0\10\24\1\100\16\24"+
    "\2\0\1\24\1\101\17\0\1\24\6\0\1\102\26\24"+
    "\2\0\1\24\51\0\1\103\26\0\1\47\1\50\42\0"+
    "\1\50\15\0\1\104\42\0\1\104\4\51\1\105\54\51"+
    "\15\0\1\24\6\0\17\24\1\106\7\24\2\0\1\24"+
    "\20\0\1\24\6\0\1\107\26\24\2\0\1\24\20\0"+
    "\1\24\6\0\12\24\1\110\1\24\1\111\12\24\2\0"+
    "\1\24\20\0\1\24\6\0\23\24\1\112\3\24\2\0"+
    "\1\24\20\0\1\24\6\0\22\24\1\113\4\24\2\0"+
    "\1\24\52\0\1\114\26\0\1\24\6\0\4\24\1\115"+
    "\22\24\2\0\1\24\20\0\1\24\6\0\3\24\1\116"+
    "\23\24\2\0\1\24\20\0\1\24\6\0\4\24\1\117"+
    "\22\24\2\0\1\24\20\0\1\24\6\0\1\120\26\24"+
    "\2\0\1\24\20\0\1\24\6\0\20\24\1\121\6\24"+
    "\2\0\1\24\1\0\1\122\45\0\1\122\12\0\1\122"+
    "\16\0\1\24\6\0\1\24\1\123\25\24\2\0\1\24"+
    "\20\0\1\24\6\0\24\24\1\124\2\24\2\0\1\24"+
    "\20\0\1\24\6\0\3\24\1\125\23\24\2\0\1\24"+
    "\20\0\1\24\6\0\14\24\1\126\12\24\2\0\1\24"+
    "\20\0\1\24\6\0\3\24\1\127\14\24\1\130\6\24"+
    "\2\0\1\24\1\0\1\131\16\0\1\24\6\0\12\24"+
    "\1\132\14\24\2\0\1\24\43\0\1\133\35\0\1\24"+
    "\6\0\10\24\1\134\4\24\1\135\11\24\2\0\1\24"+
    "\1\136\17\0\1\24\6\0\20\24\1\137\6\24\2\0"+
    "\1\24\1\0\1\140\16\0\1\24\6\0\13\24\1\141"+
    "\13\24\2\0\1\24\20\0\1\24\6\0\21\24\1\142"+
    "\5\24\2\0\1\24\50\0\1\143\30\0\1\24\6\0"+
    "\12\24\1\144\4\24\1\145\7\24\2\0\1\24\42\0"+
    "\1\146\21\0\4\147\1\150\3\147\1\0\11\147\1\151"+
    "\36\147\15\0\1\24\6\0\17\24\1\152\7\24\2\0"+
    "\1\24\20\0\1\24\6\0\22\24\1\153\4\24\2\0"+
    "\1\24\20\0\1\24\6\0\20\24\1\154\6\24\2\0"+
    "\1\24\1\0\1\155\16\0\1\24\6\0\1\24\1\156"+
    "\25\24\2\0\1\24\20\0\1\24\6\0\24\24\1\157"+
    "\1\160\1\24\2\0\1\24\20\0\1\24\6\0\2\24"+
    "\1\161\24\24\2\0\1\24\20\0\1\24\6\0\16\24"+
    "\1\162\10\24\2\0\1\24\20\0\1\24\6\0\21\24"+
    "\1\163\5\24\2\0\1\24\50\0\1\164\30\0\1\24"+
    "\6\0\4\24\1\165\22\24\2\0\1\24\20\0\1\24"+
    "\6\0\10\24\1\166\16\24\2\0\1\24\1\167\17\0"+
    "\1\24\6\0\1\170\26\24\2\0\1\24\20\0\1\24"+
    "\6\0\21\24\1\171\5\24\2\0\1\24\50\0\1\172"+
    "\30\0\1\24\6\0\14\24\1\173\12\24\2\0\1\24"+
    "\20\0\1\24\6\0\6\24\1\174\20\24\2\0\1\24"+
    "\43\0\1\175\35\0\1\24\6\0\22\24\1\176\4\24"+
    "\2\0\1\24\51\0\1\177\27\0\1\24\6\0\22\24"+
    "\1\200\4\24\2\0\1\24\20\0\1\24\6\0\10\24"+
    "\1\201\16\24\2\0\1\24\1\202\2\0\4\147\1\0"+
    "\3\147\1\203\54\147\1\150\3\147\1\203\11\147\1\204"+
    "\36\147\15\0\1\24\6\0\13\24\1\205\13\24\2\0"+
    "\1\24\20\0\1\24\6\0\15\24\1\206\11\24\2\0"+
    "\1\24\44\0\1\207\34\0\1\24\6\0\12\24\1\210"+
    "\14\24\2\0\1\24\20\0\1\24\6\0\1\24\1\211"+
    "\5\24\1\212\2\24\1\213\3\24\1\214\10\24\2\0"+
    "\1\24\20\0\1\24\6\0\15\24\1\215\11\24\2\0"+
    "\1\24\44\0\1\216\34\0\1\24\6\0\12\24\1\217"+
    "\14\24\2\0\1\24\20\0\1\24\6\0\1\220\26\24"+
    "\2\0\1\24\27\0\1\221\51\0\1\24\6\0\17\24"+
    "\1\222\7\24\2\0\1\24\46\0\1\223\32\0\1\24"+
    "\6\0\21\24\1\224\5\24\2\0\1\24\20\0\1\24"+
    "\6\0\17\24\1\225\7\24\2\0\1\24\50\0\1\226"+
    "\30\0\1\24\6\0\12\24\1\227\14\24\2\0\1\24"+
    "\41\0\1\230\37\0\1\24\6\0\4\24\1\231\22\24"+
    "\2\0\1\24\20\0\1\24\6\0\1\232\26\24\2\0"+
    "\1\24\27\0\1\233\34\0\10\147\1\203\11\147\1\204"+
    "\36\147\15\0\1\24\6\0\14\24\1\234\12\24\2\0"+
    "\1\24\20\0\1\24\6\0\12\24\1\235\14\24\2\0"+
    "\1\24\41\0\1\236\37\0\1\24\6\0\4\24\1\237"+
    "\22\24\2\0\1\24\20\0\1\24\6\0\1\240\26\24"+
    "\2\0\1\24\20\0\1\24\6\0\1\24\1\241\10\24"+
    "\1\242\3\24\1\243\10\24\2\0\1\24\20\0\1\24"+
    "\6\0\10\24\1\244\16\24\2\0\1\24\1\245\17\0"+
    "\1\24\6\0\10\24\1\246\16\24\2\0\1\24\1\247"+
    "\17\0\1\24\6\0\6\24\1\250\20\24\2\0\1\24"+
    "\35\0\1\251\43\0\1\24\6\0\14\24\1\252\12\24"+
    "\2\0\1\24\43\0\1\253\35\0\1\24\6\0\1\254"+
    "\26\24\2\0\1\24\27\0\1\255\51\0\1\24\6\0"+
    "\1\256\26\24\2\0\1\24\20\0\1\24\6\0\15\24"+
    "\1\257\11\24\2\0\1\24\44\0\1\260\34\0\1\24"+
    "\6\0\20\24\1\261\6\24\2\0\1\24\1\0\1\262"+
    "\16\0\1\24\6\0\14\24\1\263\12\24\2\0\1\24"+
    "\43\0\1\264\35\0\1\24\6\0\4\24\1\265\22\24"+
    "\2\0\1\24\33\0\1\266\45\0\1\24\6\0\17\24"+
    "\1\267\7\24\2\0\1\24\20\0\1\24\6\0\1\270"+
    "\26\24\2\0\1\24\20\0\1\24\6\0\10\24\1\271"+
    "\16\24\2\0\1\24\1\272\17\0\1\24\6\0\10\24"+
    "\1\273\16\24\2\0\1\24\1\274\17\0\1\24\6\0"+
    "\14\24\1\275\12\24\2\0\1\24\43\0\1\276\35\0"+
    "\1\24\6\0\4\24\1\277\22\24\2\0\1\24\33\0"+
    "\1\300\45\0\1\24\6\0\17\24\1\301\7\24\2\0"+
    "\1\24\46\0\1\302\32\0\1\24\6\0\1\303\26\24"+
    "\2\0\1\24\27\0\1\304\51\0\1\24\6\0\17\24"+
    "\1\305\7\24\2\0\1\24\46\0\1\306\32\0\1\24"+
    "\6\0\13\24\1\307\13\24\2\0\1\24\20\0\1\24"+
    "\6\0\24\24\1\310\1\311\1\24\2\0\1\24\53\0"+
    "\1\312\1\313\24\0\1\24\6\0\26\24\1\314\2\0"+
    "\1\24\55\0\1\315\23\0\1\24\6\0\17\24\1\316"+
    "\7\24\2\0\1\24\20\0\1\24\6\0\14\24\1\317"+
    "\12\24\2\0\1\24\43\0\1\320\35\0\1\24\6\0"+
    "\4\24\1\321\22\24\2\0\1\24\33\0\1\322\45\0"+
    "\1\24\6\0\4\24\1\323\22\24\2\0\1\24\33\0"+
    "\1\324\45\0\1\24\6\0\1\325\26\24\2\0\1\24"+
    "\27\0\1\326\51\0\1\24\6\0\1\327\26\24\2\0"+
    "\1\24\27\0\1\330\51\0\1\24\6\0\4\24\1\331"+
    "\22\24\2\0\1\24\33\0\1\332\45\0\1\24\6\0"+
    "\13\24\1\333\13\24\2\0\1\24\42\0\1\334\21\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[7399];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\2\1\6\11\1\1\2\11\1\1\3\11"+
    "\16\1\2\11\2\1\1\0\1\11\3\0\5\1\1\0"+
    "\5\1\1\0\6\1\1\0\4\1\1\0\1\1\1\0"+
    "\1\1\1\0\6\1\1\11\5\1\1\0\6\1\1\0"+
    "\1\1\1\11\2\1\1\0\1\1\1\11\2\1\1\0"+
    "\2\1\1\11\2\0\1\11\3\1\1\0\6\1\1\0"+
    "\2\1\1\0\2\1\1\0\2\1\1\0\1\1\1\0"+
    "\2\1\2\0\3\1\1\0\6\1\1\0\4\1\1\0"+
    "\2\1\1\11\1\1\1\0\2\1\1\0\2\1\1\0"+
    "\6\1\1\0\1\1\1\0\1\1\1\0\1\1\1\0"+
    "\1\1\1\0\4\1\1\11\1\1\1\0\1\1\1\11"+
    "\3\1\1\0\1\1\1\0\1\1\1\0\1\1\1\11"+
    "\1\1\1\0\1\1\1\11\1\1\1\11\3\1\2\11"+
    "\1\1\1\0\2\1\1\0\1\1\1\11\1\1\1\11"+
    "\1\1\1\0\1\1\1\11\1\1\1\11\1\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[220];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
      yyline = 1;
    yycolumn =1;
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { funciones.reportes.TablaErroresDF(yytext(), "Error Léxico", yyline, yycolumn);
                 System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn);
            }
          // fall through
          case 58: break;
          case 2:
            { /* Espacios en blanco se ignoran */
            }
          // fall through
          case 59: break;
          case 3:
            { 
            }
          // fall through
          case 60: break;
          case 4:
            { return new Symbol(sym.PARENTESIS_A, yycolumn, yyline, yytext());
            }
          // fall through
          case 61: break;
          case 5:
            { return new Symbol(sym.PARENTESIS_C, yycolumn, yyline, yytext());
            }
          // fall through
          case 62: break;
          case 6:
            { return new Symbol(sym.POR, yycolumn, yyline, yytext());
            }
          // fall through
          case 63: break;
          case 7:
            { return new Symbol(sym.MAS, yycolumn, yyline, yytext());
            }
          // fall through
          case 64: break;
          case 8:
            { return new Symbol(sym.COMA, yycolumn, yyline, yytext());
            }
          // fall through
          case 65: break;
          case 9:
            { return new Symbol(sym.GUION, yycolumn, yyline, yytext());
            }
          // fall through
          case 66: break;
          case 10:
            { return new Symbol(sym.ENTERO, yycolumn, yyline, yytext());
            }
          // fall through
          case 67: break;
          case 11:
            { return new Symbol(sym.DOSPUNTOS, yycolumn, yyline, yytext());
            }
          // fall through
          case 68: break;
          case 12:
            { return new Symbol(sym.PUNTOYCOMA, yycolumn, yyline, yytext());
            }
          // fall through
          case 69: break;
          case 13:
            { return new Symbol(sym.MENORQUE, yycolumn, yyline, yytext());
            }
          // fall through
          case 70: break;
          case 14:
            { return new Symbol(sym.IGUAL, yycolumn, yyline, yytext());
            }
          // fall through
          case 71: break;
          case 15:
            { return new Symbol(sym.MAYORQUE, yycolumn, yyline, yytext());
            }
          // fall through
          case 72: break;
          case 16:
            { return new Symbol(sym.ARROBA, yycolumn, yyline, yytext());
            }
          // fall through
          case 73: break;
          case 17:
            { return new Symbol(sym.IDENTIFICADOR, yycolumn, yyline, yytext());
            }
          // fall through
          case 74: break;
          case 18:
            { return new Symbol(sym.CORCHETE_ABRE, yycolumn, yyline, yytext());
            }
          // fall through
          case 75: break;
          case 19:
            { return new Symbol(sym.CORCHETE_CIERRA, yycolumn, yyline, yytext());
            }
          // fall through
          case 76: break;
          case 20:
            { return new Symbol(sym.CADENA, yycolumn, yyline, yytext());
            }
          // fall through
          case 77: break;
          case 21:
            { return new Symbol(sym.DECIMAL, yycolumn, yyline, yytext());
            }
          // fall through
          case 78: break;
          case 22:
            { return new Symbol(sym.ARR, yycolumn, yyline, yytext());
            }
          // fall through
          case 79: break;
          case 23:
            { return new Symbol(sym.DIV, yycolumn, yyline, yytext());
            }
          // fall through
          case 80: break;
          case 24:
            { return new Symbol(sym.END, yycolumn, yyline, yytext());
            }
          // fall through
          case 81: break;
          case 25:
            { return new Symbol(sym.MAX, yycolumn, yyline, yytext());
            }
          // fall through
          case 82: break;
          case 26:
            { return new Symbol(sym.MIN, yycolumn, yyline, yytext());
            }
          // fall through
          case 83: break;
          case 27:
            { return new Symbol(sym.MOD, yycolumn, yyline, yytext());
            }
          // fall through
          case 84: break;
          case 28:
            { return new Symbol(sym.MUL, yycolumn, yyline, yytext());
            }
          // fall through
          case 85: break;
          case 29:
            { return new Symbol(sym.RES, yycolumn, yyline, yytext());
            }
          // fall through
          case 86: break;
          case 30:
            { return new Symbol(sym.SUM, yycolumn, yyline, yytext());
            }
          // fall through
          case 87: break;
          case 31:
            { return new Symbol(sym.VAR, yycolumn, yyline, yytext());
            }
          // fall through
          case 88: break;
          case 32:
            { return new Symbol(sym.R_CHAR, yycolumn, yyline, yytext());
            }
          // fall through
          case 89: break;
          case 33:
            { return new Symbol(sym.EJEX, yycolumn, yyline, yytext());
            }
          // fall through
          case 90: break;
          case 34:
            { return new Symbol(sym.EJEY, yycolumn, yyline, yytext());
            }
          // fall through
          case 91: break;
          case 35:
            { return new Symbol(sym.EXEC, yycolumn, yyline, yytext());
            }
          // fall through
          case 92: break;
          case 36:
            { return new Symbol(sym.MODA, yycolumn, yyline, yytext());
            }
          // fall through
          case 93: break;
          case 37:
            { return new Symbol(sym.LABEL, yycolumn, yyline, yytext());
            }
          // fall through
          case 94: break;
          case 38:
            { return new Symbol(sym.MEDIA, yycolumn, yyline, yytext());
            }
          // fall through
          case 95: break;
          case 39:
            { return new Symbol(sym.PRINT, yycolumn, yyline, yytext());
            }
          // fall through
          case 96: break;
          case 40:
            { return new Symbol(sym.COLUMN, yycolumn, yyline, yytext());
            }
          // fall through
          case 97: break;
          case 41:
            { return new Symbol(sym.R_DOUBLE, yycolumn, yyline, yytext());
            }
          // fall through
          case 98: break;
          case 42:
            { return new Symbol(sym.TITULO, yycolumn, yyline, yytext());
            }
          // fall through
          case 99: break;
          case 43:
            { return new Symbol(sym.VALUES, yycolumn, yyline, yytext());
            }
          // fall through
          case 100: break;
          case 44:
            { return new Symbol(sym.CONSOLE, yycolumn, yyline, yytext());
            }
          // fall through
          case 101: break;
          case 45:
            { return new Symbol(sym.GRAPBAR, yycolumn, yyline, yytext());
            }
          // fall through
          case 102: break;
          case 46:
            { return new Symbol(sym.GRAPPIE, yycolumn, yyline, yytext());
            }
          // fall through
          case 103: break;
          case 47:
            { return new Symbol(sym.MEDIANA, yycolumn, yyline, yytext());
            }
          // fall through
          case 104: break;
          case 48:
            { return new Symbol(sym.R_MOSTRAR, yycolumn, yyline, yytext());
            }
          // fall through
          case 105: break;
          case 49:
            { return new Symbol(sym.PROGRAM, yycolumn, yyline, yytext());
            }
          // fall through
          case 106: break;
          case 50:
            { return new Symbol(sym.TITULOX, yycolumn, yyline, yytext());
            }
          // fall through
          case 107: break;
          case 51:
            { return new Symbol(sym.TITULOY, yycolumn, yyline, yytext());
            }
          // fall through
          case 108: break;
          case 52:
            { return new Symbol(sym.GRAPHBAR, yycolumn, yyline, yytext());
            }
          // fall through
          case 109: break;
          case 53:
            { return new Symbol(sym.GRAPHPIE, yycolumn, yyline, yytext());
            }
          // fall through
          case 110: break;
          case 54:
            { return new Symbol(sym.GRAPLINE, yycolumn, yyline, yytext());
            }
          // fall through
          case 111: break;
          case 55:
            { return new Symbol(sym.VARIANZA, yycolumn, yyline, yytext());
            }
          // fall through
          case 112: break;
          case 56:
            { return new Symbol(sym.GRAPHLINE, yycolumn, yyline, yytext());
            }
          // fall through
          case 113: break;
          case 57:
            { return new Symbol(sym.HISTOGRAM, yycolumn, yyline, yytext());
            }
          // fall through
          case 114: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
