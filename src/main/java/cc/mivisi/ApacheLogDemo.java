package cc.mivisi;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *  基于common-logging的运行方式
 */
/**
 * 
 * 基于common-logging的运行方式
 * (1).common-logging首先在CLASSPATH中查找commons-logging.properties文件。这个属性文件至少定义org.apache.commons.
 * logging.Log属性，它的值应该是上述任意Log接口实现的完整限定名称。如果找到
 * org.apache.commons.logging.Log属相，则使用该属相对应的日志组件。结束发现过程。
 * (2).如果上面的步骤失败（文件不存在或属相不存在），common-logging接着检查系统属性org.apache.commons.logging.Log。如果找到org.apache.
 * commons.logging.Log系统属性，则使用该系统属性对应的日志组件。结束发现过程。
 * (3).如果找不到org.apache.commons.logging.Log系统属性，common-logging接着在CLASSPATH中寻找log4j的类。
 * 如果找到了就假定应用要使用的是log4j。不过这时log4j本身的属性仍要通过log4j.properties文件正确配置。结束发现过程。 (4).如果上述查找均不能找到适当的Logging
 * API，但应用程序正运行在JRE 1.4或更高版本上，则默认使用JRE 1.4的日志记录功能。结束发现过程。 (5).最后，如果上述操作都失败（JRE
 * 版本也低于1.4），则应用将使用内建的SimpleLog。SimpleLog把所有日志信息直接输出到System.err。结束发现过程。
 * 
 * 为了简化配置 commons-logging ，一般不使用 commons-logging 的配置文件，也不设置与 commons-logging 相关的系统环境变量，而只需将 Log4j 的
 * Jar 包放置到 classpash 中就可以了。这样就很简单地完成了 commons-logging 与 Log4j 的融合。
 * 
 * 根据不同的性质，日志信息通常被分成不同的级别，从低到高依次是：“调试（ DEBUG ）”“信息（ INFO ）”“警告（ WARN ）”“错误（ERROR ）”“致命错误（ FATAL ）”
 */
public class ApacheLogDemo {
    public static Log log = LogFactory.getLog(ApacheLogDemo.class);
    //根据顺序，可以读到log4j.properties的配置
    public static void test() {
        log.debug("111");
        log.info("125");
        log.warn("485");
        log.error("error");

    }

    public static void main(String[] a) {
        ApacheLogDemo.test();
    }
}
