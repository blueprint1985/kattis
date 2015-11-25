<?php
/**
 * Problem: Reversed Binary Numbers
 * https://open.kattis.com/problems/reversebinary
 *
 * @author   Martin Björling
 * @email    martinbjorling@gmail.com
 * @version  1.0
 * @since    2015-11-24
 */

$inputString = stream_get_line(STDIN, 1024, PHP_EOL);

$bin_num = decbin($inputString);
$bin_num_rev = strrev($bin_num);

$answer = bindec($bin_num_rev);

fwrite(STDOUT, $answer);


?>
