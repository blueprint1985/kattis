<?php
/**
 * Problem: Tri
 * https://open.kattis.com/problems/tri
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

$inputString = stream_get_line(STDIN, 1024, PHP_EOL);

$inputArr = explode(" ", $inputString);

$first = $inputArr[0];
$second = $inputArr[1];
$third = $inputArr[2];

$answer = "";

if (($first + $second) == $third) {
	$answer .= $inputArr[0] . "+" . $inputArr[1] . "=" . $inputArr[2];
} else if (($first - $second) == $third) {
	$answer .= $inputArr[0] . "-" . $inputArr[1] . "=" . $inputArr[2];
} else if (($first * $second) == $third) {
	$answer .= $inputArr[0] . "*" . $inputArr[1] . "=" . $inputArr[2];
} else if (($first / $second) == $third) {
	$answer .= $inputArr[0] . "/" . $inputArr[1] . "=" . $inputArr[2];
} else if ($first == ($second + $third)) {
	$answer .= $inputArr[0] . "=" . $inputArr[1] . "+" . $inputArr[2];
} else if ($first == ($second - $third)) {
	$answer .= $inputArr[0] . "=" . $inputArr[1] . "-" . $inputArr[2];
} else if ($first == ($second * $third)) {
	$answer .= $inputArr[0] . "=" . $inputArr[1] . "*" . $inputArr[2];
} else if ($first == ($second / $third)) {
	$answer .= $inputArr[0] . "=" . $inputArr[1] . "/" . $inputArr[2];
} else {
	$answer .= "none";
}

fwrite(STDOUT, $answer);

?>