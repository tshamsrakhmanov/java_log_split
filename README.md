Артефакт 1 - ИПР 1 - Java

Прога для сплита лог-файла на несколько частей

```
JAVA_LOG_SPLIT
Usage: java -jar <jar filename> [PATH1] [PATH2] [SPLIT]
[PATH1]     {mandatory}
    Path to log file which is taken for splitting operation
[PATH2]     {mandatory}
    Path to folder + template name of a split. Ex.: C:/<name template>
    By this in 'C:/' will be created <name template>1, <name template>2, ... etc
    Standard notation of pieces is 1, 2, 3, ... etc
    Use /normal/ slash in path declaration
[SPLIT]     {optional}
    Number of pieces to split log file to
    base value: 5
            please don't try more than 10, facilitation of such files are not so good :(
 
// Author: Timur Shamsrakhmanov //
// Autumn 2024                  //
```