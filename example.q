$[1b;42;9*6]
// ------------------if false--------------------
$[0b;42;9*6]

$[1b;a:42;a:43]
// ------------------if false--------------------
$[0b;a:42;a:43]

z:0
$[z=0;1.1;-1.1]
$[z;1.1;-1.1] //equivalent to previous

v:0N
$[v;`isnull;`notnull]
$[null v;`isnull;`notnull]

v:42
$[v=42;[a:6;b:7;`Everything];[a:`Life;b:`the;c:`Universe;a,b,c]]