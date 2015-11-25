<?php
/**
 * Problem: Line Them Up
 * https://open.kattis.com/problems/lineup
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */


$numOfTestCases = stream_get_line(STDIN, 1024, PHP_EOL);

$names = [];

for ($i = 0; $i < $numOfTestCases; $i++) {
	$names[$i] = stream_get_line(STDIN, 1024, PHP_EOL);
}

$increasing = true;
$decreasing = true;

for ($i = 0; $i < $numOfTestCases-1; $i++) {
	if (strcmp($names[$i], $names[$i+1]) < 0) $decreasing = false;
	if (strcmp($names[$i], $names[$i+1]) > 0) $increasing = false;
}

if ($increasing && !$decreasing) fwrite(STDOUT, "INCREASING");
else if (!$increasing && $decreasing) fwrite(STDOUT, "DECREASING");
else fwrite(STDOUT, "NEITHER");

?>