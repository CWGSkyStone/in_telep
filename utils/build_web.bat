@echo off

echo Generating webpage ...

echo generating: body.html
pandoc ../doc/user_doc.md -o body.html

echo copying into index.html: header.txt 
type header.txt > ../docs/index.html

echo copying into index.html: body.html
type body.html >> ../docs/index.html

echo copying into index.html: footer.txt
type footer.txt >> ../docs/index.html

echo copying: style.css
type style.css > ../docs/style.css

echo Deleting: body.html
del body.html

echo Done.

pause